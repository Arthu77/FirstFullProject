package com.example.littlelservice.entity;

import java.util.Date;

public class Message {
    String Msg_ID;
    String Msg_Title;
    String Msg_Content;
    Date Msg_Time;

    public Message(String id, String title, String content) {
        this.Msg_ID=id;
        this.Msg_Title=title;
        this.Msg_Content=content;
    }

    public String getMsg_ID() {
        return Msg_ID;
    }

    public void setMsg_ID(String msg_ID) {
        Msg_ID = msg_ID;
    }

    public String getMsg_Title() {
        return Msg_Title;
    }

    public void setMsg_Title(String msg_Title) {
        Msg_Title = msg_Title;
    }

    public String getMsg_Content() {
        return Msg_Content;
    }

    public void setMsg_Content(String msg_Content) {
        Msg_Content = msg_Content;
    }

    public Date getMsg_Time() {
        return Msg_Time;
    }

    public void setMsg_Time(Date msg_Time) {
        Msg_Time = msg_Time;
    }
}
