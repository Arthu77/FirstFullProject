package com.example.littlelservice.service;

import com.example.littlelservice.entity.Message;

public interface IMessageService {
    Object Select();
    Object ActivitySelect(String activity);
    Object CommunicateSelect(String ID);
    Object ClassSelect(String ID);
    Object Homework(String ID);
    Object MessageInfor(String Title);
}
