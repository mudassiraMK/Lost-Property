package ActionPackage;

import OperationPackage.CategoryOperation;
import com.opensymphony.xwork2.*;


public class CategoryAction extends ActionSupport implements ModelDriven<Object>, Preparable 
{
    private Category category;
    String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    
    public Object getModel()
    {
        return category;
    }
    
    public void prepare() throws Exception
    {
        category=new Category();
    }
    
    CategoryOperation CO=new CategoryOperation();
    
    public String saveCategory()
    {
        msg=CO.insertCategory(category);
        return SUCCESS;
    }
    
}
