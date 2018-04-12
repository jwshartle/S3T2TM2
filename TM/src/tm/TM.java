/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tm;

import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author ehaddy
 */
public class TM 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        TM taskManager = new TM();
        taskManager.run(1);
    }
    
    protected void run(int inUserID)
    {
          
       SwingUtilities.invokeLater(new Runnable()
        {
        @Override
            public void run()
            {
                try
                {
                    String sUsername = "";
                    BusinessLogic bl = new BusinessLogic();
                    ResultSet user = bl.getUser(inUserID);
                    
                    if (user.next())
                    {
                        sUsername = user.getString("Username");
                    }
                    //pass in username to show on app
                    JFrame frame = new TMApplication(sUsername);
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    //frame.getContentPane().add(new TMMain());
                    //test username change on login
                    frame.pack();
                    frame.setVisible(true);
                }
                catch (Exception err)
                {
                    
                }
            }
    });
       
      
        
    }
    
}
