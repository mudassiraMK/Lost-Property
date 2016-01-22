package example;
import static java.lang.System.out;
import java.sql.*;
import java.util.*;

public class category 
{

     ArrayList<emp> emplist=new ArrayList<emp>();
     Connection con;
    Statement stmt;
    ResultSet rs=null;
    private String sql,ctgr,msg,btninsert,item;
    private int cid,mid;
    String url="jdbc:mysql://localhost:3306/lostproperty";
     String un="root";
    String up="azeem";
    Scanner sc=new Scanner(System.in);


    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
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

    
    
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getCtgr() {
        return ctgr;
    }

    public void setCtgr(String ctgr) {
        this.ctgr = ctgr;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public category() 
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
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

    public category(String sql, String ctgr, String msg, String btninsert, String item, int cid, int mid) {
        this.sql = sql;
        this.ctgr = ctgr;
        this.msg = msg;
        this.btninsert = btninsert;
        this.item = item;
        this.cid = cid;
        this.mid = mid;
    }

    

    public String insert()
    {
        
        
            try
            {
                System.out.println(cid+""+ctgr);
                sql="insert into itemcategory values('"+cid+"','"+ctgr+"') ";
                out.println(sql);
                int r=stmt.executeUpdate(sql);
                out.println("inserted");
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        
        return "inserted";
    }
    
    public String iteminsert()
    {
        
        
            try
            {
                System.out.println(mid+""+item);
                sql="insert into itemmaster values('"+mid+"','"+item+"') ";
                out.println(sql);
                int r=stmt.executeUpdate(sql);
                out.println("inserted");
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        
        return "iteminserted";
    }
}
