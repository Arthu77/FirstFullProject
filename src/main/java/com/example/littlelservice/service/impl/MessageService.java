package com.example.littlelservice.service.impl;

import com.example.littlelservice.dao.IMessageMapper;
import com.example.littlelservice.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService implements IMessageService {
    @Autowired
    private IMessageMapper iMessageMapper;
    @Override
    public Object Select() {
        return iMessageMapper.Select();
    }

    @Override
    public Object ActivitySelect(String activity) {
        return iMessageMapper.ActivitySelect(activity);
    }

    @Override
    public Object CommunicateSelect(String ID) {
        return iMessageMapper.CommunicateSelect(ID);
    }

    @Override
    public Object ClassSelect(String ID) {
        return iMessageMapper.ClassSelect(ID);
    }

    @Override
    public Object Homework(String ID) {
        return iMessageMapper.Homework(ID);
    }

    @Override
    public Object MessageInfor(String Title) {
        return iMessageMapper.MessageInfor(Title);
    }


}
