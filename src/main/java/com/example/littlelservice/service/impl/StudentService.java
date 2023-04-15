package com.example.littlelservice.service.impl;

import com.example.littlelservice.entity.Student;
import com.example.littlelservice.dao.IStudentMapper;
import com.example.littlelservice.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudentMapper iStudentMapper;
    @Override
    public Map<String, Object> Select(Student student) {
        return iStudentMapper.Select(student);
    }

    @Override
    public Object ClassInfor(Student student) {
        return iStudentMapper.ClassInfor(student);
    }

    @Override
    public Object Checkin(String ID) {
        return iStudentMapper.Checkin(ID);
    }


    @Override
    public Object CommentSelect(String ID) {
        return iStudentMapper.CommentSelect(ID);
    }

    @Override
    public Object GradeSelct(String ID) {
        return iStudentMapper.GradeSelct(ID);
    }

}
