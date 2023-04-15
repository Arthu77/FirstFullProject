package com.example.littlelservice.entity;

public class Admin {
    private String Admin_Account;

    private String Admin_Pwd;

    public Admin(String admin_account, String admin_pwd) {
        this.Admin_Account=admin_account;
        this.Admin_Pwd=admin_pwd;
    }

    public String getAdmin_Account() {
        return Admin_Account;
    }

    public void setAdmin_Account(String admin_Account) {
        Admin_Account = admin_Account;
    }

    public String getAdmin_Pwd() {
        return Admin_Pwd;
    }

    public void setAdmin_Pwd(String admin_Pwd) {
        Admin_Pwd = admin_Pwd;
    }
}
