package com.example.littlelservice.entity;

public class Teacher {
    String Teacher_ID;
    String Teacher_Name;
    String Teacher_Tel;
    String Teacher_Pwd;

    public Teacher(String teacherID, String teacherPwd) {
        this.Teacher_ID=teacherID;
        this.Teacher_Pwd=teacherPwd;
    }
    public Teacher(String teacherID){
        this.Teacher_ID=teacherID;
    }

    public Teacher(String teacherID, String teacherName, String teacherTel, String teacherPwd) {
        this.Teacher_ID=teacherID;
        this.Teacher_Name=teacherName;
        this.Teacher_Tel=teacherTel;
        this.Teacher_Pwd=teacherPwd;
    }

    public String getTeacher_Name() {
        return Teacher_Name;
    }

    public void setTeacher_Name(String teacher_Name) {
        Teacher_Name = teacher_Name;
    }

    public String getTeacher_Tel() {
        return Teacher_Tel;
    }

    public void setTeacher_Tel(String teacher_Tel) {
        Teacher_Tel = teacher_Tel;
    }

    public String getTeacher_ID() {
        return Teacher_ID;
    }

    public void setTeacher_ID(String teacher_ID) {
        Teacher_ID = teacher_ID;
    }


    public String getTeacher_Pwd() {
        return Teacher_Pwd;
    }

    public void setTeacher_Pwd(String teacher_Pwd) {
        Teacher_Pwd = teacher_Pwd;
    }
}
