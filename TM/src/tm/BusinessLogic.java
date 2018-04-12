/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tm;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author ehaddy
 */
public class BusinessLogic 
{
    //be used to connect to database 
    protected Connection db;
    Connection cin=null;
    public BusinessLogic()
    {
        //Set ConnectionString
        buildConnection();
    }
    
    protected void buildConnection()
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbConnection = "jdbc:sqlserver://group2db.canzauk9ftb3.us-west-1.rds.amazonaws.com:1433;databaseName=dbMaster";
            db = DriverManager.getConnection(dbConnection, "ehaddy", "SacState$01");
        }
        catch (Exception err)
        {
            System.out.println(err.toString());
        }    
                
    }
    
    
    public String buildConnectionString()
    {
       
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
            // line below needs to be modified to include the database name, user, and password (if any)
            Connection con = DriverManager.getConnection("jdbc:sqlserver://ec2-13-58-47-139.us-east-2.compute.amazonaws.com:1433;databaseName=dbinstance;user=group2;password=SacStateGroup$01;");

            System.out.println("Connected to database !");

         }
         catch(SQLException sqle) 
         {
             System.out.println("Sql Exception :"+sqle.getMessage());
         }
         catch(ClassNotFoundException e) 
         {
             System.out.println("Class Not Found Exception :" + e.getMessage());
         }
        
        return "";
    }
    
    public static Connection buildConnectionDB(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://group2db.canzauk9ftb3.us-west-1.rds.amazonaws.com:1433;databaseName=dbMaster;user=ehaddy;password=SacState$01;");
            return con;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
            
        }
    }

    protected ResultSet getPastMessageChatMB(long inDate)
    {
        try
        {
            CallableStatement statement = db.prepareCall("{call pr_PGetPastMessageBoardMessages(?)}");
            statement.setTimestamp(1, new java.sql.Timestamp(inDate));
            ResultSet results = statement.executeQuery();
            return results;
        }
        catch (Exception err)
        {
            System.out.println(err.toString());
            return null;
        }
    }
    
    protected ResultSet getNewMessageChatMB(String inUserID)
    {
        try
        {
            CallableStatement statement = db.prepareCall("{call pr_PGetNewMessageBoardMessages(?)}");
            int nUserID = Integer.parseInt(inUserID);
            statement.setInt(1, nUserID);
            ResultSet results = statement.executeQuery();
            return results;
        }
        catch (Exception err)
        {
            System.out.println(err.toString());
            return null;
        }
    }
    
    protected void moveMessageChatMB()
    {
        try
        {
            CallableStatement statement = db.prepareCall("{call pr_PMoveChatMessageBoard()}");
            statement.executeQuery();
        }
        catch (Exception err)
        {
            System.out.println(err.toString());
        }
    }
    
    public void sendMessageChatMB(String inUsername, long inDate, String inMessage)
    {
        try
        {
            ResultSet results = getUser(inUsername);
            if (results.next())
            {
                int nUserID = Integer.parseInt(results.getString("UserID"));
                CallableStatement statement = db.prepareCall("{call pr_PSetMessageBoard(?,?,?,?)}");
                statement.setInt(1, nUserID);
                statement.setString(2, inUsername);
                statement.setTimestamp(3, new java.sql.Timestamp(inDate));
                statement.setString(4, inMessage);
                statement.executeQuery();
            }
        }
        catch (Exception err)
        {
            System.out.println(err.toString());
        }
    }
    
    protected ResultSet getUser(String inUsername)
    {
        try
        {
            Statement stmt = db.createStatement();
            return stmt.executeQuery("SELECT * FROM TUsers WHERE Username = '" + inUsername + "'");
        }
        catch (Exception err)
        {
            return null;
        }
    }
    
    protected ResultSet getUser(int inUserID)
    {
        try
        {
            Statement stmt = db.createStatement();
            return stmt.executeQuery("SELECT * FROM TUsers WHERE UserID = '" + inUserID + "'");
        }
        catch (Exception err)
        {
            return null;
        }
    }
    
    public ResultSet getUsers()
    {
        try
        {
            Statement stmt = db.createStatement();
            return stmt.executeQuery("SELECT * FROM TUsers");
        }
        catch (Exception err)
        {
            return null;
        }
    }
    
    public String getUserID(String inUsername)
    {
        try
        {
            ResultSet user = getUser(inUsername);
            if (user.next())
                return user.getString("UserID");
            return null;
        }
        catch (Exception err)
        {
            return null;
        }   
    }
    
    protected ResultSet getNewChatMessages(String inUserID)
    {
        try
        {
            CallableStatement statement = db.prepareCall("{call pr_PGetNewChatMessages(?)}");
            int nUserID = Integer.parseInt(inUserID);
            statement.setInt(1, nUserID);
            ResultSet results = statement.executeQuery();
            return results;
        }
        catch (Exception err)
        {
            System.out.println(err.toString());
            return null;
        }
    }
    
    protected ResultSet getPastChatMessages(long inDate)
    {
         try
        {
            CallableStatement statement = db.prepareCall("{call pr_PGetPastChatMessages(?)}");
            statement.setTimestamp(1, new java.sql.Timestamp(inDate));
            ResultSet results = statement.executeQuery();
            return results;
        }
        catch (Exception err)
        {
            System.out.println(err.toString());
            return null;
        }
    }
    
    protected void moveChatMessages()
    {
        try
        {
            CallableStatement statement = db.prepareCall("{call pr_PMoveChatMessages()}");
            statement.executeQuery();
        }
        catch (Exception err)
        {
            System.out.println(err.toString());
        }
    }
}
