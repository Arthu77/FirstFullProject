package com.example.littlelservice.dao;


public interface IMessageMapper {
    Object Select();
    Object ActivitySelect(String activity);
    Object CommunicateSelect(String ID);
    Object ClassSelect(String ID);
    Object Homework(String ID);
    Object MessageInfor(String Title);

}
