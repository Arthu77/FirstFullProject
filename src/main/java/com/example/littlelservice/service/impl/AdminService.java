package com.example.littlelservice.service.impl;

import com.example.littlelservice.entity.Admin;
import com.example.littlelservice.entity.Message;
import com.example.littlelservice.entity.Student;
import com.example.littlelservice.dao.IAdminMapper;
import com.example.littlelservice.entity.Teacher;
import com.example.littlelservice.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AdminService implements IAdminService {
    @Autowired
    private IAdminMapper iAdminMapper;


    @Override
    public Map<String, Object> Select(Admin admin) {
        return iAdminMapper.Select(admin);
    }

    @Override
    public Object StudentInsert(Student student) {
        return iAdminMapper.StudentInsert(student);
    }

    @Override
    public Object TeacherInsert(Teacher teacher) {
        return iAdminMapper.TeacherInsert(teacher);
    }

    @Override
    public Object MessageInsert(Message message) {
        return iAdminMapper.MessageInsert(message);
    }
}
