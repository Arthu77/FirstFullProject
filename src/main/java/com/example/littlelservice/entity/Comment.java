package com.example.littlelservice.entity;

public class Comment {
    String Cmt_ID;
    String Teacher_ID;
    String Std_ID;
    String Cmt_Content;

    public String getCmt_ID() {
        return Cmt_ID;
    }

    public void setCmt_ID(String cmt_ID) {
        Cmt_ID = cmt_ID;
    }

    public String getTeacher_ID() {
        return Teacher_ID;
    }

    public void setTeacher_ID(String teacher_ID) {
        Teacher_ID = teacher_ID;
    }

    public String getStd_ID() {
        return Std_ID;
    }

    public void setStd_ID(String std_ID) {
        Std_ID = std_ID;
    }

    public String getCmt_Content() {
        return Cmt_Content;
    }

    public void setCmt_Content(String cmt_Content) {
        Cmt_Content = cmt_Content;
    }
}
