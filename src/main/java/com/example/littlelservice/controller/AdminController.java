package com.example.littlelservice.controller;

import com.example.littlelservice.entity.Admin;
import com.example.littlelservice.entity.Message;
import com.example.littlelservice.entity.Student;
import com.example.littlelservice.entity.Teacher;
import com.example.littlelservice.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping( "/Admin")
public class AdminController {
    @Autowired
    private IAdminService iAdminService;

    @RequestMapping(  "/login")
    public Object login1(String AdminAccount,String AdminPwd){
        Admin admin=new Admin(AdminAccount,AdminPwd);
            if(iAdminService.Select(admin)!=null){
                return "home";
            }else{
                return "login";
            }
    }

    @RequestMapping("/student")
    public String  Insert(String StdID,String ClassID,String StdName,String StdGender,String ParentTel,String StdPwd){
        Student student=new Student(StdID,ClassID,StdName,StdGender,ParentTel,StdPwd);
        iAdminService.StudentInsert(student);
            return "student";
    }

    @RequestMapping("/management")
    public String Insert(String TeacherID, String TeacherName, String TeacherTel, String TeacherPwd){
        Teacher teacher=new Teacher(TeacherID,TeacherName,TeacherTel,TeacherPwd);
            iAdminService.TeacherInsert(teacher);
            return "management";
    }

    @RequestMapping("/message")
    public Object MessageInsert(String ID,String Title,String Content){
        Message message=new Message(ID,Title,Content);
        iAdminService.MessageInsert(message);
        return "message";
    }

}
