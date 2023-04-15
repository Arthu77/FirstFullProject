package com.example.littlelservice.controller;

import com.example.littlelservice.entity.Parent;
import com.example.littlelservice.service.IParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Parent")
public class ParentController {
    @Autowired
    private IParentService iParentService;

    @RequestMapping(value = "/parentlogin",method = RequestMethod.POST)
    public Object Select(String ParentID,String ParentPwd){
        Parent parent=new Parent(ParentID,ParentPwd);
        if(iParentService.Select(parent)!=null){
            return iParentService.Select(parent);
        }else {
            return iParentService.Select(parent);
        }
    }

    @RequestMapping(value = "/parentregister",method = RequestMethod.POST)
    public Object Register(String ParentID,String StdID,String ParentName,String ParentPwd){
        Parent parent=new Parent(ParentID,StdID,ParentName,ParentPwd);
        if(iParentService.Register(parent)!=null){
            return "success";
        }else{
            return "false";
        }
    }

    @RequestMapping(value = "/mine",method = RequestMethod.POST)
    public Object ClassInfor(String ParentID){
        Parent parent=new Parent(ParentID);
        return iParentService.ClassInfor(parent);
    }

    @RequestMapping(value = "/checkin",method = RequestMethod.POST)
    public Object Checkin(String ID){
        return iParentService.Checkin(ID);
    }
}
