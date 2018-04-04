/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ehaddy
 */
public class BusinessLogic 
{
    //be used to connect to database 
    protected String mConnectionString = "";
    Connection cin=null;
    
    public  BusinessLogic()
    {
        //Set ConnectionString
        buildConnectionString();
        
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
            Connection con = DriverManager.getConnection("jdbc:sqlserver://ec2-13-58-47-139.us-east-2.compute.amazonaws.com:1433;databaseName=dbinstance;user=group2;password=SacStateGroup$01;");
            return con;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
            
        }
    }


    
}
