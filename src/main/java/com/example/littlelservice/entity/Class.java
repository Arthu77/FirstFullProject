package com.example.littlelservice.entity;

public class Class {
    String Class_ID;
    String Teacher_ID;

    public Class(String teacherID) {
        this.Teacher_ID=teacherID;
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
}
