package pojos;
// Generated 01-Nov-2018 14:35:47 by Hibernate Tools 4.3.1



/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private String id;
     private String password;

    public User() {
    }

	
    public User(String id) {
        this.id = id;
    }
    public User(String id, String password) {
       this.id = id;
       this.password = password;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}


