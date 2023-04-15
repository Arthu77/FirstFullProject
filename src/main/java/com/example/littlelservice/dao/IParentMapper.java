package com.example.littlelservice.dao;

import com.example.littlelservice.entity.Parent;

import java.util.Map;

public interface IParentMapper {
    Map<String,Object> Select(Parent parent);
    Object Register(Parent register);
    Object ClassINfor(Parent parent);
    Object Checkin(String ID);
}
