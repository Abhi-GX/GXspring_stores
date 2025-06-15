package com.gxspringstores.gxstores;

public class Admin implements Client {
    String name;
    public int id;
    public String email;
    String password;

    public Admin() {
    }

    public String info() {
        return "name:" + name + "\n" + "id:" + id + "\n email:" + email + "\n";
    }

    public boolean isAdmin() {
        return true;
    }
}