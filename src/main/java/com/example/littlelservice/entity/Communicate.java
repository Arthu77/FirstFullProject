package com.example.littlelservice.entity;

import java.util.Date;

public class Communicate {
    String Communuicate_ID;
    String Class_ID;
    String Teacher_ID;
    String Communicate_Conten;
    Date Communicate_Time;

    public Communicate(String classID, String teacherID, String conten) {
        this.Class_ID=classID;
        this.Teacher_ID=teacherID;
        this.Communicate_Conten=conten;
    }

    public String getCommunuicate_ID() {
        return Communuicate_ID;
    }

    public void setCommunuicate_ID(String communuicate_ID) {
        Communuicate_ID = communuicate_ID;
    }

    public String getClass_ID() {
        return Class_ID;
    }

    public void setClass_ID(String class_ID) {
        Class_ID = class_ID;
    }

    public String getTeacher_ID() {
        return Teacher_ID;
    }

    public void setTeacher_ID(String teacher_ID) {
        Teacher_ID = teacher_ID;
    }

    public String getCommunicate_Conten() {
        return Communicate_Conten;
    }

    public void setCommunicate_Conten(String communicate_Conten) {
        Communicate_Conten = communicate_Conten;
    }

    public Date getCommunicate_Time() {
        return Communicate_Time;
    }

    public void setCommunicate_Time(Date communicate_Time) {
        Communicate_Time = communicate_Time;
    }
}
