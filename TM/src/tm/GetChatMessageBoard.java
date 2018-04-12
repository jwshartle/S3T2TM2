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
public class GetChatMessageBoard extends Thread
{
    protected StyledDocument mDoc;
    protected String mUserID;
    public GetChatMessageBoard(StyledDocument inDocument, String inUserID)
    {
        mDoc = inDocument;
        mUserID = inUserID;
        getPastMessageChatMB();
    }
    
   
    protected void getPastMessageChatMB()
    {
        BusinessLogic bl = new BusinessLogic();
        Calendar cal = Calendar.getInstance(); 
        cal.add(Calendar.DAY_OF_YEAR, -7);
        java.util.Date dSentDate = new java.util.Date();
        dSentDate.setTime( cal.getTime().getTime() );
        ResultSet results = bl.getPastMessageChatMB(dSentDate.getTime());
        
        getMessageChatMB(results);
    }
    
    protected boolean getNewMessageChatMB()
    {
        BusinessLogic bl = new BusinessLogic();
        ResultSet results = bl.getNewMessageChatMB(mUserID);
        return getMessageChatMB(results);
    }

    protected boolean getMessageChatMB(ResultSet inResults)
    {
        boolean bHasRows = false;
        try
        {
            while(inResults.next())
            {
               if (bHasRows == false)
                    bHasRows = true;
               String sUsername = inResults.getString("Username");
               String sUserID = inResults.getString("UserID");
               String sMessage = inResults.getString("Message");
               
               SimpleAttributeSet attribute = new SimpleAttributeSet();
               if (sUserID.equals(mUserID)) //message sent from user
               {
                   StyleConstants.setAlignment(attribute, StyleConstants.ALIGN_RIGHT);
                   StyleConstants.setForeground(attribute, Color.red);
               }
               else
               {
                   StyleConstants.setAlignment(attribute, StyleConstants.ALIGN_LEFT);
                   StyleConstants.setForeground(attribute, Color.blue);
               }
               int nLength = mDoc.getLength();
               String sDisplayMsg = sUsername + ": " + sMessage + "\n";
               mDoc.insertString(mDoc.getLength(), sDisplayMsg, null); 
               mDoc.setParagraphAttributes(nLength+1, nLength, attribute, true);
            }
        }
        catch (Exception err)
        {
        }
        
        return bHasRows;
    }
    
    protected void moveMessageChatMB()
    {
        try
        {
            BusinessLogic bl = new BusinessLogic();
            bl.moveMessageChatMB();
        }
        catch (Exception err)
        {
        }
    }
    @Override
        public void run()
        {
            while (true)
            {
                if (getNewMessageChatMB()) //check for new message
                    moveMessageChatMB(); //move message out of queue
            }
        }
}
