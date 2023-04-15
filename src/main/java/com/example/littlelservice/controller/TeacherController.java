package com.example.littlelservice.controller;

import com.example.littlelservice.entity.Activity;
import com.example.littlelservice.entity.Class;
import com.example.littlelservice.entity.Communicate;
import com.example.littlelservice.entity.Teacher;
import com.example.littlelservice.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/Teacher")
public class TeacherController {
    @Autowired
    private ITeacherService iTeacherService;

    @RequestMapping(value = "/teacherlogin",method = RequestMethod.POST)
    public Object Select(String TeacherID,String TeacherPwd){
        Teacher teacher=new Teacher(TeacherID,TeacherPwd);
        if(iTeacherService.Select(teacher)!=null){
            return "success";
        }else{
            return "false";
        }
    }

    @RequestMapping(value = "/mine",method = RequestMethod.POST)
    public Object ClassInfor(String TeacherID){
        Teacher teacher=new Teacher(TeacherID);
        return iTeacherService.ClassInfor(teacher);
    }

    @RequestMapping(value = "/checkin",method = RequestMethod.POST)
    public Object StudentInfo(String ID){
        return iTeacherService.StudentInfor(ID);
    }

    @RequestMapping(value = "/checkininsert",method = RequestMethod.POST)
    public Object CheckinInsert(String ID,String Conten){
        iTeacherService.CheckinInsert(ID,Conten);
        return "修改成功";
    }

    @RequestMapping(value = "/homeworkinsert",method = RequestMethod.POST)
    public Object HomeworkInsert(String ID,String Conten){
        iTeacherService.HomeworkInsert(ID,Conten);
        return "作业提交成功";
    }

    @RequestMapping(value = "/activityinsert",method = RequestMethod.POST)
    public Object ActivityInsert(String ID,String Conten,String Title){
        Activity activity=new Activity(ID,Conten,Title);
        iTeacherService.ActivityInsert(activity);
        return "提交成功";
    }

    @RequestMapping(value = "/communicateinsert",method = RequestMethod.POST)
    public Object CommunicateInsert(String ClassID,String TeacherID,String Conten){
        Communicate communicate=new Communicate(ClassID,TeacherID,Conten);
        iTeacherService.CommunicateInsert(communicate);
        return "提交成功";
    }

    @RequestMapping(value = "/activitydelete",method = RequestMethod.POST)
    public Object ActivityDelete(String Title){
        iTeacherService.ActivityDelete(Title);
        return "删除成功";
    }

    @RequestMapping(value = "/communicatedelete",method = RequestMethod.POST)
    public Object CommunicateDelete(String Conten){
        iTeacherService.CommunicateDelete(Conten);
        return "删除成功";
    }

    @RequestMapping(value = "/gradeselect",method = RequestMethod.POST)
    public Object GradeSelect(String ID){
        return iTeacherService.GradeSelect(ID);
    }

    @RequestMapping(value = "/commentselect",method = RequestMethod.POST)
    public Object CommmentSelect(String ID){
        return iTeacherService.CommentSelect(ID);
    }

}
