package com.example.littlelservice.entity;

import java.util.Date;

public class Homework {
    String Homework_ID;
    String Class_ID;
    Date Homework_Time;
    String Homework_Conten;

    public String getHomework_ID() {
        return Homework_ID;
    }

    public void setHomework_ID(String homework_ID) {
        Homework_ID = homework_ID;
    }

    public String getClass_ID() {
        return Class_ID;
    }

    public void setClass_ID(String class_ID) {
        Class_ID = class_ID;
    }

    public Date getHomework_Time() {
        return Homework_Time;
    }

    public void setHomework_Time(Date homework_Time) {
        Homework_Time = homework_Time;
    }

    public String getHomework_Conten() {
        return Homework_Conten;
    }

    public void setHomework_Conten(String homework_Conten) {
        Homework_Conten = homework_Conten;
    }
}
