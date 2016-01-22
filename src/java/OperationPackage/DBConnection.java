
package OperationPackage;
import java.sql.*;
import java.util.*;

public class DBConnection 
{
    Connection con=null;
    Statement stmt=null;
    ResultSet rs=null;
    
    private String url="jdbc:mysql://localhost:3306/lostproperty";
    private String userName="root";
    private String userPassword="azeem";

    public DBConnection() {
    }
    
    public Connection getConnection()
    {
        try
        {
             Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");
            con=DriverManager.getConnection(url,userName,userPassword);
            System.out.println("connected");
        }
         catch(ClassNotFoundException cnfe)
        {
            System.out.println("driverName wrong"+cnfe.getMessage());
        }
         
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return con;
    }
    
    public Statement getStatement()
    {
        try
        {
            con=getConnection();
            stmt=con.createStatement();
        }
         
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return stmt;
    }
    
    public void closeConnection()
    {
        try
        {
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
