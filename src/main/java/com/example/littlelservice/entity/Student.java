package com.example.littlelservice.entity;

public class Student {
    String Std_ID;
    String Class_ID;
    String Std_Name;
    String Std_Gender;
    String Parent_Tel;
    String Std_Pwd;

    public Student(String std_account, String std_pwd) {
        this.Std_ID=std_account;
        this.Std_Pwd=std_pwd;
    }
    public Student(String stdID){
        this.Std_ID=stdID;
    }

    public Student(String stdID, String classID, String stdName, String stdGender, String parentTel, String stdPwd) {
        this.Std_ID=stdID;
        this.Class_ID=classID;
        this.Std_Name=stdName;
        this.Std_Gender=stdGender;
        this.Parent_Tel=parentTel;
        this.Std_Pwd=stdPwd;
    }

    public String getStd_Name() {
        return Std_Name;
    }

    public void setStd_Name(String std_Name) {
        Std_Name = std_Name;
    }

    public String getClass_ID() {
        return Class_ID;
    }

    public void setClass_ID(String class_ID) {
        Class_ID = class_ID;
    }

    public String getStd_Gender() {
        return Std_Gender;
    }

    public void setStd_Gender(String std_Gender) {
        Std_Gender = std_Gender;
    }

    public String getParent_Tel() {
        return Parent_Tel;
    }

    public void setParent_Tel(String parent_Tel) {
        Parent_Tel = parent_Tel;
    }


    public String getStd_ID() {
        return Std_ID;
    }

    public void setStd_ID(String std_ID) {
        Std_ID = std_ID;
    }


    public String getStd_Pwd() {
        return Std_Pwd;
    }

    public void setStd_Pwd(String std_Pwd) {
        Std_Pwd = std_Pwd;
    }
}
