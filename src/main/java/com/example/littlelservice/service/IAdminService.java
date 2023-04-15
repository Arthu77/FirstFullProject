package com.example.littlelservice.service;

import com.example.littlelservice.entity.Admin;
import com.example.littlelservice.entity.Message;
import com.example.littlelservice.entity.Student;
import com.example.littlelservice.entity.Teacher;

import java.util.Map;

public interface IAdminService {
    Map<String, Object> Select(Admin admin);
    Object StudentInsert(Student student);
    Object TeacherInsert(Teacher teacher);
    Object MessageInsert(Message message);
}
