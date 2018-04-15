/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tm.Panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.ListModel;
import javax.swing.text.DefaultCaret;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import tm.BusinessLogic;
import tm.GetChatMessageBoard;
import tm.GetChatUserMessage;



/**
 *
 * @author ehaddy
 */
public class pnlChatbox extends javax.swing.JPanel 
{
    /**
     * Creates new form pnlChatbox
     */
    LinkedList<String> tabNames = new LinkedList<String>();
    String mUsername = "";
    Thread threadMB;
    Thread threadUser;
    public pnlChatbox() 
    {
        initComponents();
        //run();
    }
    
    public pnlChatbox(String inUsername)
    {
        initComponents();
        mUsername = inUsername;
        runMB();
        initializeUsers();
    }
    
    protected void runMB()
    {
        /*
        StyledDocument doc = txtDisplayMessage.getStyledDocument();
        GetChatMessageBoard chatMsg = new GetChatMessageBoard(doc, "1");
        threadMB = new Thread(chatMsg);
        threadMB.start(); 
        */
    }
    protected void runUser(String inUserIDReceived)
    {
        /*BusinessLogic bl = new BusinessLogic();
        String sUserID = bl.getUserID(mUsername);
        StyledDocument doc = txtDisplayMessage.getStyledDocument();
        GetChatUserMessage chat = new GetChatUserMessage(doc, sUserID, inUserIDReceived);
        threadUser = new Thread(chat);
        threadUser.start();
        
        */
        
    }
    protected boolean addTab(String inUser)
    {
        boolean bAddTab = true;
        for(String tabName: tabNames)
        {
            if (tabName.equals(inUser))
                bAddTab = false;
        }
        return bAddTab;
    }
    
    protected void createTab(String inUser, String inMessage)
    {
        if (addTab(inUser) == false)
            return;
        tabNames.add(inUser);
        
        JTextPane txtPane = new JTextPane();
        txtPane.setEditable(false);
        txtPane.setMinimumSize(new Dimension(10,10));
        txtPane.setPreferredSize(new Dimension(250,145));
        
        txtPane.setText(inMessage);
        tabMain.addTab(inUser,txtPane);
    }
    protected void initializeUsers() 
    {
        try
        {
            btnMessageBoard.setVisible(false);
            BusinessLogic bl = new BusinessLogic();
            ResultSet users = bl.getUsers();
            DefaultListModel list = new DefaultListModel();
            while (users.next())
            {
                String sUsername = users.getString("Username");
                if (sUsername.equals(mUsername))
                    continue;
                String sUserID = users.getString("UserID");
                String sFullName = users.getString("FullName");
                list.addElement(sUserID + ": " + sFullName);
            }
            lstUsers.setModel(list);
        }
        catch (Exception err)
        {
            
        }
                
    }
    
    protected void sendMessage()
    {
       /* try
        {
            String sText = mUsername + ": " + txtMessage.getText() + "\n";
            StyledDocument doc = txtDisplayMessage.getStyledDocument();
            SimpleAttributeSet right = new SimpleAttributeSet();
            StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT);
            StyleConstants.setForeground(right, Color.red);
            int length = doc.getLength();
            doc.insertString(length, sText, null); 
            doc.setParagraphAttributes(length+1, length,right , true);
            
            BusinessLogic bl = new BusinessLogic();
            Date dNow = new Date();
            long d = dNow.getTime();
            bl.sendMessageChatMB(mUsername, dNow.getTime(), txtMessage.getText());
        }
        catch(Exception e) 
        { 
            System.out.println(e);
        }
        */
    }
    
    
    protected String selectUser(JList inList)
    {
        String sUser = inList.getSelectedValue().toString();
        String sUserID = "";
        String sFullName = "";
        if (sUser.contains(":"))
        {
            int nIndex = sUser.indexOf(":");
            sUserID = sUser.substring(0, nIndex);
            sFullName = sUser.substring(nIndex+1);
        }
        
        //txtDisplayMessage.setText("");
        lblChat.setText(sFullName);
        return sUserID;
    }
    
    protected void startPersonalIM(JList inList)
    {
        btnMessageBoard.setVisible(true);
        //threadMB.stop();
        String sUserID = selectUser(inList);  
        //runUser(sUserID);
        createTab(sUserID, "");
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLayout = new javax.swing.JPanel();
        pnlUsers = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstUsers = new javax.swing.JList<>();
        btnMessageBoard = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblChat = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextPane();
        btnSend = new javax.swing.JButton();
        tabMain = new javax.swing.JTabbedPane();

        pnlLayout.setBackground(new java.awt.Color(255, 255, 255));

        pnlUsers.setBackground(new java.awt.Color(0, 153, 204));

        lstUsers.setBackground(new java.awt.Color(153, 153, 153));
        lstUsers.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        lstUsers.setForeground(new java.awt.Color(255, 255, 255));
        lstUsers.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstUsers.setSelectionBackground(new java.awt.Color(0, 153, 204));
        lstUsers.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstUsersValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lstUsers);

        btnMessageBoard.setBackground(new java.awt.Color(153, 153, 153));
        btnMessageBoard.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        btnMessageBoard.setForeground(new java.awt.Color(255, 255, 255));
        btnMessageBoard.setText("Back To Message Board");
        btnMessageBoard.setBorder(null);
        btnMessageBoard.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMessageBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMessageBoardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUsersLayout = new javax.swing.GroupLayout(pnlUsers);
        pnlUsers.setLayout(pnlUsersLayout);
        pnlUsersLayout.setHorizontalGroup(
            pnlUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
            .addComponent(btnMessageBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlUsersLayout.setVerticalGroup(
            pnlUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsersLayout.createSequentialGroup()
                .addComponent(btnMessageBoard)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(654, 57));

        lblChat.setBackground(new java.awt.Color(255, 255, 255));
        lblChat.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblChat.setForeground(new java.awt.Color(255, 255, 255));
        lblChat.setText("Message Board");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(lblChat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(lblChat)
                .addGap(17, 17, 17))
        );

        txtMessage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMessageKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMessageKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(txtMessage);

        btnSend.setBackground(new java.awt.Color(255, 255, 255));
        btnSend.setForeground(new java.awt.Color(0, 204, 204));
        btnSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tm/Images/icons8-sent.png"))); // NOI18N
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        btnSend.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSendKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnlLayoutLayout = new javax.swing.GroupLayout(pnlLayout);
        pnlLayout.setLayout(pnlLayoutLayout);
        pnlLayoutLayout.setHorizontalGroup(
            pnlLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayoutLayout.createSequentialGroup()
                .addGroup(pnlLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                    .addGroup(pnlLayoutLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLayoutLayout.createSequentialGroup()
                        .addComponent(tabMain, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(pnlUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlLayoutLayout.setVerticalGroup(
            pnlLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayoutLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tabMain, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(pnlLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(pnlLayoutLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addComponent(pnlUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnlLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        sendMessage();   
        txtMessage.setText("");
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnSendKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSendKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnSendKeyPressed

    private void txtMessageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMessageKeyPressed
       
    }//GEN-LAST:event_txtMessageKeyPressed

    private void txtMessageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMessageKeyReleased
        // TODO dadd your handling code here:
         // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) 
        {
            sendMessage();   
            txtMessage.setText("");
            txtMessage.setCaretPosition(0);
        }
    }//GEN-LAST:event_txtMessageKeyReleased
    
    private void lstUsersValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstUsersValueChanged
        // TODO add your handling code here:
        JList source = (JList)evt.getSource();
        startPersonalIM(source);
        
    }//GEN-LAST:event_lstUsersValueChanged

    private void btnMessageBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMessageBoardActionPerformed
        // TODO add your handling code here:
        if (lblChat.getText().equals("Message Board") == false)
        {
            btnMessageBoard.setVisible(false);
            lblChat.setText("Message Board");
            //txtDisplayMessage.setText("");
            runMB();
            lstUsers.setSelectedIndex(0);
        }
        
    }//GEN-LAST:event_btnMessageBoardActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMessageBoard;
    private javax.swing.JButton btnSend;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblChat;
    private javax.swing.JList<String> lstUsers;
    private javax.swing.JPanel pnlLayout;
    private javax.swing.JPanel pnlUsers;
    private javax.swing.JTabbedPane tabMain;
    private javax.swing.JTextPane txtMessage;
    // End of variables declaration//GEN-END:variables
}
