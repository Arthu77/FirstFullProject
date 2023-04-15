package com.example.littlelservice.service.impl;

import com.example.littlelservice.entity.Activity;
import com.example.littlelservice.entity.Communicate;
import com.example.littlelservice.entity.Teacher;
import com.example.littlelservice.dao.ITeacherMapper;
import com.example.littlelservice.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Map;
@Service
public class TeacherService implements ITeacherService {
    @Autowired
    private ITeacherMapper iTeacherMapper;


    @Override
    public Map<String, Object> Select(Teacher teacher) {
        return iTeacherMapper.Select(teacher);
    }

    @Override
    public Object ClassInfor(Teacher teacher) {
        return iTeacherMapper.ClassInfor(teacher);
    }

    @Override
    public Object StudentInfor(String ID) {
        return iTeacherMapper.StudentInfor(ID);
    }

    @Override
    public Object CheckinInsert(String ID, String Conten) {
        return iTeacherMapper.CheckinInsert(ID,Conten);
    }

    @Override
    public Object HomeworkInsert(String ID, String Conten) {
        return iTeacherMapper.HomeworkInsert(ID,Conten);
    }

    @Override
    public Object ActivityInsert(Activity activity) {
        return iTeacherMapper.ActivityInsert(activity);
    }

    @Override
    public Object CommunicateInsert(Communicate cummunicate) {
        return iTeacherMapper.CommunicateInsert(cummunicate);
    }

    @Override
    public Object ActivityDelete(String Title) {
        return iTeacherMapper.ActivityDelete(Title);
    }

    @Override
    public Object CommunicateDelete(String Conten) {
        return iTeacherMapper.CommunicateDelete(Conten);
    }

    @Override
    public Object ActivityID(String Title) {
        return iTeacherMapper.ActivityID(Title);
    }

    @Override
    public Object ActivityUpdate(String Conten,String Title,String ID) {
        return iTeacherMapper.ActivityUpdate(Conten,Title,ID);
    }

    @Override
    public Object GradeSelect(String ID) {
        return iTeacherMapper.GradeSelect(ID);
    }

    @Override
    public Object CommentSelect(String ID) {
        return iTeacherMapper.CommentSelect(ID);
    }


}
