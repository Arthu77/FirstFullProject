package com.example.littlelservice.controller;

import com.example.littlelservice.entity.Student;
import com.example.littlelservice.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Student")
public class StudentController {
    @Autowired
    private IStudentService iStudentService;

    @RequestMapping(value = "/studentlogin",method = RequestMethod.POST)
    public Object Select(String StudentID,String StudentPwd){
        Student student=new Student(StudentID,StudentPwd);
        if(iStudentService.Select(student)!=null){
            return "success";
        }else {
            return "false";
        }
    }

    @RequestMapping(value = "/mine",method = RequestMethod.POST)
    public Object ClassInfor(String StdID){
        Student student=new Student(StdID);
        return iStudentService.ClassInfor(student);
    }

    @RequestMapping(value = "/checkin",method = RequestMethod.POST)
    public Object Checkin(String ID){
        return iStudentService.Checkin(ID);
    }

    @RequestMapping(value = "/commentselect",method = RequestMethod.POST)
    public Object CommentSelect(String ID){
        return iStudentService.CommentSelect(ID);
    }

    @RequestMapping(value = "/gradetselect",method = RequestMethod.POST)
    public Object GradeSelect(String ID){
        return iStudentService.GradeSelct(ID);
    }
}
