package com.example.littlelservice.service;

import com.example.littlelservice.entity.Student;

import java.util.Map;

public interface IStudentService {
    Map<String,Object> Select(Student student);
    Object ClassInfor(Student student);
    Object Checkin(String ID);
    Object GradeSelct(String ID);
    Object CommentSelect(String ID);
}
