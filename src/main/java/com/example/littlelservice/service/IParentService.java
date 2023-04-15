package com.example.littlelservice.service;

import com.example.littlelservice.entity.Parent;

import java.util.Map;

public interface IParentService {
    Map<String,Object> Select(Parent parent);
    Object Register(Parent register);
    Object ClassInfor(Parent parent);
    Object Checkin(String ID);
}
