package com.example.littlelservice.dao;

import com.example.littlelservice.entity.Student;

import java.util.Map;

public interface IStudentMapper {
    Map<String,Object>  Select(Student student);
    Object ClassInfor(Student student);
    Object Checkin(String ID);
    Object CommentSelect(String ID);
    Object GradeSelct(String ID);
}
