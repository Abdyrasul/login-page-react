package com.abdiresul.LoginPage.EntityClasses;

public class Personnel {
    private String Name;
    private Integer ID;
    private String Password;
    private String Role;

    public Personnel(Integer id,String name, String password) {
        Name = name;
        Password = password;
        ID = id;
    }

    public String getName() {
        return Name;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    @Override
    public String toString() {
        return "Personnel{" +
                "Name='" + Name + '\'' +
                ", Password='" + Password + '\'' +
                ", Role='" + Role + '\'' +
                '}';
    }
}
