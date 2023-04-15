package com.example.littlelservice.entity;

public class Parent {
     String Parent_ID;
     String Std_ID;
     String Parent_Name;
     String Parent_Pwd;

    public Parent(String parentID, String parentPwd) {
        this.Parent_ID=parentID;
        this.Parent_Pwd=parentPwd;
    }

    public Parent(String parentID, String stdID, String parentName, String parentPwd) {
        this.Parent_ID=parentID;
        this.Std_ID=stdID;
        this.Parent_Name=parentName;
        this.Parent_Pwd=parentPwd;
    }

    public Parent(String parentID) {
        this.Parent_ID=parentID;
    }

    public String getParent_ID() {
        return Parent_ID;
    }

    public void setParent_ID(String parent_ID) {
        Parent_ID = parent_ID;
    }

    public String getStd_ID() {
        return Std_ID;
    }

    public void setStd_ID(String std_ID) {
        Std_ID = std_ID;
    }

    public String getParent_Name() {
        return Parent_Name;
    }

    public void setParent_Name(String parent_Name) {
        Parent_Name = parent_Name;
    }

    public String getParent_Pwd() {
        return Parent_Pwd;
    }

    public void setParent_Pwd(String parent_Pwd) {
        Parent_Pwd = parent_Pwd;
    }
}
