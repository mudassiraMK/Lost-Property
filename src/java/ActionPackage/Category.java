package ActionPackage;

public class Category 
{
    String ctgr,sql,msg;
    int cid;

    public String getCtgr() {
        return ctgr;
    }

    public void setCtgr(String ctgr) {
        this.ctgr = ctgr;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
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

    public Category() {
    }

    public Category(String ctgr, String sql, String msg, int cid) {
        this.ctgr = ctgr;
        this.sql = sql;
        this.msg = msg;
        this.cid = cid;
    }
    
    
    
}
