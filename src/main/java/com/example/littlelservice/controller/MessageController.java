package com.example.littlelservice.controller;

import com.example.littlelservice.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Message")
public class MessageController {
    @Autowired
    private IMessageService iMessageService;

    @RequestMapping(value = "/select",method = RequestMethod.POST)
    public Object Select(){
        return iMessageService.Select();
    }

    @RequestMapping(value = "/activity",method = RequestMethod.POST)
    public Object ActivitySelect(String ID){
        return iMessageService.ActivitySelect(ID);
    }

    @RequestMapping(value = "/communicate",method = RequestMethod.POST)
    public Object CommunicateSelect(String ID){
        return iMessageService.CommunicateSelect(ID);
    }

    @RequestMapping(value = "/class",method = RequestMethod.POST)
    public Object ClassSelect(String ID){
        return iMessageService.ClassSelect(ID);
    }

    @RequestMapping(value = "/homework",method = RequestMethod.POST)
    public Object Homework(String ID){
        return iMessageService.Homework(ID);
    }

    @RequestMapping(value = "/messageinfor",method = RequestMethod.POST)
    public Object MessageInfor(String Title){
        return iMessageService.MessageInfor(Title);
    }
}
