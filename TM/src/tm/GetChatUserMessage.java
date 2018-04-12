/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tm;

import java.awt.Color;
import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author ehaddy
 */
public class GetChatUserMessage extends Thread
{
    StyledDocument mDoc;
    protected String mUserIDSent;
    protected String mUserIDReceived;
    public GetChatUserMessage(StyledDocument inDocument, String inUserIDSent, String inUserIDReceived)
    {
        mDoc = inDocument;
        mUserIDSent = inUserIDSent;
        mUserIDReceived = inUserIDReceived;
        getPastChatMessages();
    }
    
    protected void getPastChatMessages()
    {
        BusinessLogic bl = new BusinessLogic();
        Calendar cal = Calendar.getInstance(); 
        cal.add(Calendar.DAY_OF_YEAR, -7);
        java.util.Date dSentDate = new java.util.Date();
        dSentDate.setTime( cal.getTime().getTime() );
        ResultSet results = bl.getPastChatMessages(dSentDate.getTime());
        
        writeMessage(results);
    }
    protected boolean getNewChatMessages()
    {
        
        ResultSet results = null;
        return writeMessage(results);
    }
    
    protected boolean showMessage(String inUserIDReceived, String inUserIDSent)
    {
        boolean bShowMsg = false;
        if ((inUserIDReceived.equals(mUserIDSent) || inUserIDReceived.equals(mUserIDReceived)) && 
                inUserIDSent.equals(mUserIDSent) || inUserIDSent.equals(mUserIDReceived))
            return true;
        return false;
    }
    
    protected boolean writeMessage(ResultSet inResults)
    {
        boolean bHasRows = false;
        try
        {
            while(inResults.next())
            {
                if (bHasRows == false)
                    bHasRows = true;
               String sUsername = inResults.getString("Username");
               String sUserIDReceived = inResults.getString("UserIDReceived");
               String sUserIDSent = inResults.getString("UserIDSent");
               String sMessage = inResults.getString("Message");
               
               if (showMessage(sUserIDReceived, sUserIDSent) == false)
                   return false;                   
               
               SimpleAttributeSet attribute = new SimpleAttributeSet();
               if (sUserIDSent.equals(mUserIDSent)) //message sent from user
               {
                   StyleConstants.setAlignment(attribute, StyleConstants.ALIGN_RIGHT);
                   StyleConstants.setForeground(attribute, Color.red);
               }
               else if (sUserIDReceived.equals(mUserIDReceived))
               {
                   StyleConstants.setAlignment(attribute, StyleConstants.ALIGN_LEFT);
                   StyleConstants.setForeground(attribute, Color.blue);
               }
               else
                   continue;
               int nLength = mDoc.getLength();
               String sDisplayMsg = sUsername + ": " + sMessage + "\n";
               mDoc.insertString(mDoc.getLength(), sDisplayMsg, null); 
               mDoc.setParagraphAttributes(nLength+1, nLength, attribute, true);
               
            }
        }
        catch (Exception err)
        {
            bHasRows = false;
        }
        
        return bHasRows;
    }
    
    @Override
        public void run()
        {
            while (true)
            {
                getNewChatMessages();
            }
        }
    
}
