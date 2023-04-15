package com.example.littlelservice.dao.impl;

import com.example.littlelservice.entity.Admin;
import com.example.littlelservice.entity.Message;
import com.example.littlelservice.entity.Student;
import com.example.littlelservice.dao.IAdminMapper;
import com.example.littlelservice.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;


@Repository
public class AdminMapper implements IAdminMapper {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Map<String, Object> Select(Admin admin) {
        String sql="select * from jxt_admin where Admin_Account='"+admin.getAdmin_Account()+"' and Admin_Pwd='"+admin.getAdmin_Pwd()+"' ";
        try{
            return jdbcTemplate.queryForMap(sql);
        } catch (DataAccessException e) {
            return null;
        }
    }

    @Override
    public Object StudentInsert(Student student) {
        String sql ="insert into jxt_student values ('"+student.getStd_ID()+"','"+student.getClass_ID()+"','"+student.getStd_Name()+"','"+student.getStd_Gender()+"','"+student.getParent_Tel()+"','"+student.getStd_Pwd()+"'";
        return jdbcTemplate.update(sql);
    }

    @Override
    public Object TeacherInsert(Teacher teacher) {
        String sql="insert into jxt_teacher values('"+teacher.getTeacher_ID()+"','"+teacher.getTeacher_Name()+"','"+teacher.getTeacher_Tel()+"','"+teacher.getTeacher_Pwd()+"'";
        return jdbcTemplate.update(sql);
    }

    @Override
    public Object MessageInsert(Message message) {
        SimpleDateFormat date=new SimpleDateFormat();
        date.applyPattern("yyyy-MM-dd");
        Date time=new Date();
        String sql ="insret into jxt_message values ('"+message.getMsg_ID()+"','"+message.getMsg_Title()+"','"+message.getMsg_Content()+"','"+date.format(time)+"'";
        return jdbcTemplate.update(sql);
    }
}
