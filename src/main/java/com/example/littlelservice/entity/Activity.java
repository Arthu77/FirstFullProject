package com.example.littlelservice.entity;

import java.util.Date;

public class Activity {
    String Activity_ID;
    String Class_ID;
    String Activity_Details;
    Date Activity_Time;
    String Activity_Title;

    public Activity(String id, String conten, String title) {
        this.Class_ID=id;
        this.Activity_Details=conten;
        this.Activity_Title=title;
    }

    public String getActivity_Title() {
        return Activity_Title;
    }

    public void setActivity_Title(String activity_Title) {
        Activity_Title = activity_Title;
    }

    public String getActivity_ID() {
        return Activity_ID;
    }

    public void setActivity_ID(String activity_ID) {
        Activity_ID = activity_ID;
    }

    public String getClass_ID() {
        return Class_ID;
    }

    public void setClass_ID(String class_ID) {
        Class_ID = class_ID;
    }

    public String getActivity_Details() {
        return Activity_Details;
    }

    public void setActivity_Details(String activity_Details) {
        Activity_Details = activity_Details;
    }

    public Date getActivity_Time() {
        return Activity_Time;
    }

    public void setActivity_Time(Date activity_Time) {
        Activity_Time = activity_Time;
    }
}
