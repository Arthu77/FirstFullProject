package com.example.littlelservice.entity;

import java.util.Date;

public class Checkin {
    String Checkin_ID;
    String Std_ID;
    String Class_ID;
    String Checkin_Content;
    Date Checkin_Date;

    public String getCheckin_ID() {
        return Checkin_ID;
    }

    public void setCheckin_ID(String checkin_ID) {
        Checkin_ID = checkin_ID;
    }

    public String getStd_ID() {
        return Std_ID;
    }

    public void setStd_ID(String std_ID) {
        Std_ID = std_ID;
    }

    public String getClass_ID() {
        return Class_ID;
    }

    public void setClass_ID(String class_ID) {
        Class_ID = class_ID;
    }

    public String getCheckin_Content() {
        return Checkin_Content;
    }

    public void setCheckin_Content(String checkin_Content) {
        Checkin_Content = checkin_Content;
    }

    public Date getCheckin_Date() {
        return Checkin_Date;
    }

    public void setCheckin_Date(Date checkin_Date) {
        Checkin_Date = checkin_Date;
    }
}
