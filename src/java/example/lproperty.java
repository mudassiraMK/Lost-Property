package example;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import static java.lang.System.out;
import java.sql.*;
import java.util.*;

public class lproperty 
{
    ArrayList<emp> emplist=new ArrayList<emp>();
     Connection con;
    Statement stmt;
    ResultSet rs=null;
    private String sql,msg,uid,uname,email,city,gender,password,role,btninsert,sql1;
    private int r,birthdate;
    private long contactno;
    String url="jdbc:mysql://localhost:3306/lostproperty";
     String un="root";
    String up="azeem";
    Scanner sc=new Scanner(System.in);

    public long getContactno() {
        return contactno;
    }

    public void setContactno(long contactno) {
        this.contactno = contactno;
    }
    
    public String getBtninsert() {
        return btninsert;
    }

    public void setBtninsert(String btninsert) {
        this.btninsert = btninsert;
    }

    public ArrayList<emp> getEmplist() {
        return emplist;
    }

    public void setEmplist(ArrayList<emp> emplist) {
        this.emplist = emplist;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getSql1() {
        return sql1;
    }

    public void setSql1(String sql1) {
        this.sql1 = sql1;
    }

   
    
    public lproperty() 
    {
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");
            con=DriverManager.getConnection(url,un,up);
            System.out.println("connected");
            stmt=con.createStatement();
            System.out.println("Wrapper created");
         }
          catch(ClassNotFoundException cnfe)
        {
            System.out.println("driverName wrong"+cnfe.getMessage());
        }
         
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public lproperty(String sql,String sql1, String msg, String uid, String uname, String email, String city, String gender, String password, String role, String btninsert, int r, int birthdate, long contactno) {
        this.sql = sql;
        this.sql1= sql1;
        this.msg = msg;
        this.uid = uid;
        this.uname = uname;
        this.email = email;
        this.city = city;
        this.gender = gender;
        this.password = password;
        this.role = role;
        this.btninsert = btninsert;
        this.r = r;
        this.birthdate = birthdate;
        this.contactno = contactno;
    }

    
    public String print()
    {
        
        
        return "success";
    }
    public String user() throws Exception
    {
        
           System.out.println(uid+" "+uname+" "+email+" "+city+" "+birthdate+" "+gender+" "+password+" "+role+" "+contactno);
           sql="insert into user values('"+uid+"','"+uname+"','"+email+"','"+city+"','"+birthdate+"','"+gender+"','"+password+"','"+role+"','"+contactno+"')" ;
           out.println(sql);
           try
           {
           stmt.executeUpdate(sql);
           msg="inserted";
           
           rs=stmt.executeQuery("select * from user");
			while(rs.next())
			{
			uid=rs.getString(1);
			uname=rs.getString(2);
			password=rs.getString("password");
			contactno=rs.getLong("contactno");
                        
                        
			System.out.println(uid+" "+uname+" "+password+" "+contactno);
			String sql="insert into contactno values('"+contactno+"','"+uid+"')";
			System.out.println(sql);
			r=stmt.executeUpdate(sql);
                        
                        sql="insert into login values('"+uname+"','"+password+"')";
			System.out.println(sql);
			r=stmt.executeUpdate(sql);
                        
                        if(role.equals("Mislayer"))
                        {
                            r=stmt.executeUpdate("insert into mislayer values('"+uid+"','"+uname+"'");
                        }
                        if(role.equals("Property founder"))
                        {
                            r=stmt.executeUpdate("insert into PropertyFounder values('"+uid+"','"+uname+"'");
                        }
                        }
             
        }
        catch(Exception e)
        {
            msg=e.getMessage();
            System.out.println("---------"+e.getMessage());
        }
        
        return "inserted";
    }
    public String userView()
    {
         try
    {
        rs=stmt.executeQuery("select * from user");
        while(rs.next())
        {
           
            
             
             
                           
           
           
        }
    }
    catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    return "success";    
    }
    
}
