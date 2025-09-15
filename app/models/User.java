package models;

public class User {
   public String name;
   public String role;

    public User(String name, String role){
        this.setName(name);
        this.setRole(role);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
