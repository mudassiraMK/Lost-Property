package example;

public class emp 
{
    private String uid,name,email,city,bdate,gender,password,role;

    public emp() {
    }

    public emp(String uid, String name, String email, String city, String bdate, String gender, String password, String role) {
        this.uid = uid;
        this.name = name;
        this.email = email;
        this.city = city;
        this.bdate = bdate;
        this.gender = gender;
        this.password = password;
        this.role = role;
    }

    emp(int uid, String name, String email, String city, String bdate, String gender, String password, String role) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
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
    
    
}