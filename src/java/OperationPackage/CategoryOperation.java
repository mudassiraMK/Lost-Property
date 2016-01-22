
package OperationPackage;
import ActionPackage.Category;
import java.sql.*;

public class CategoryOperation 
{
    String msg, sql;
    Connection con;
    DBConnection dbcon=new DBConnection();
    Statement stmt=dbcon.getStatement();
    
    public String insertCategory(Category category)
    {
        try
        {
            sql="insert into itemcategory values("+category.getCid()+",'"+category.getCtgr()+"')";
            dbcon.closeConnection();
            return "data inserted";
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
       return "inserted"; 
    }
    
}
