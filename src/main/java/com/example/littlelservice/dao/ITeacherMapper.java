package com.example.littlelservice.dao;

import com.example.littlelservice.entity.Activity;
import com.example.littlelservice.entity.Communicate;
import com.example.littlelservice.entity.Teacher;

import java.util.Map;

public interface ITeacherMapper {
    Map<String,Object> Select(Teacher teacher);
    Object ClassInfor(Teacher teacher);
    Object StudentInfor(String ID);
    Object CheckinInsert(String ID,String Conten);
    Object HomeworkInsert(String ID,String Conten);
    Object ActivityInsert(Activity activity);
    Object CommunicateInsert(Communicate cummunicate);
    Object ActivityDelete(String Title);
    Object CommunicateDelete(String Conten);
    Object ActivityID(String Title);
    Object ActivityUpdate(String Conten,String Title,String ID);
    Object GradeSelect(String ID);
    Object CommentSelect(String ID);


}
