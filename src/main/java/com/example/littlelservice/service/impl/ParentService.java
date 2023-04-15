package com.example.littlelservice.service.impl;

import com.example.littlelservice.entity.Parent;
import com.example.littlelservice.dao.IParentMapper;
import com.example.littlelservice.service.IParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class ParentService implements IParentService {
    @Autowired
    private IParentMapper iParentMapper;

    @Override
    public Map<String, Object> Select(Parent parent) {
        return iParentMapper.Select(parent);
    }

    @Override
    public Object Register(Parent register) {
        return iParentMapper.Register(register);
    }

    @Override
    public Object ClassInfor(Parent parent) {
        return iParentMapper.ClassINfor(parent);
    }

    @Override
    public Object Checkin(String ID) {
        return iParentMapper.Checkin(ID);
    }
}
