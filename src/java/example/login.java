/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;
import java.sql.*;
/**
 *
 * @author MUDASSIRA
 */
public class login extends lproperty
{
    private String uname, msg, password,sql,uid,sql1;

    public login() {
    }

    public login(String uname, String msg, String password, String sql,String sql1) {
        this.uname = uname;
        this.msg = msg;
        this.password = password;
        this.sql = sql;
        this.sql1=sql1;
    }

   
    
    public String login() throws Exception
    {
        
        sql="select* from user";
        stmt.executeUpdate(sql);
        sql1="insert into login,contactno values(login.uname,login.password,contactno.contactno) where uid='"+uid+"'";
        stmt.executeUpdate(sql1);
        return "inserted";
    }
    
    
}
