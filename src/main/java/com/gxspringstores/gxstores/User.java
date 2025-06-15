package com.gxspringstores.gxstores;

public class User implements Client {
    public final Admin admin = new Admin();

    public String info() {
        return admin.info();
    }
    public boolean isAdmin() {
        return admin.isAdmin();
    }
}
