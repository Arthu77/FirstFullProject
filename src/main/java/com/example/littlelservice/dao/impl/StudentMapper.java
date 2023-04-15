package com.example.littlelservice.dao.impl;

import com.example.littlelservice.entity.Student;
import com.example.littlelservice.dao.IStudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
@Repository
public class StudentMapper implements IStudentMapper {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Map<String, Object> Select(Student student) {
        String sql = "select * from jxt_student where Std_ID = '"+student.getStd_ID()+"' and Std_Pwd = '"+student.getStd_Pwd()+"'";
        try{
            return jdbcTemplate.queryForMap(sql);
        } catch (DataAccessException e) {
            return null;
        }
    }

    @Override
    public Object ClassInfor(Student student) {
        String sql ="select Class_ID,Std_Name from jxt_student where Std_ID ='"+student.getStd_ID()+"'";
        return jdbcTemplate.queryForMap(sql);
    }

    @Override
    public Object Checkin(String ID) {
        SimpleDateFormat date=new SimpleDateFormat();
        date.applyPattern("yyyy-MM-dd");
        Date time=new Date();
        String sql ="select Std_Name as Name,Checkin_Content as Conten  from jxt_student,jxt_checkin where jxt_student.Std_ID='"+ID+"' and jxt_checkin.Std_ID='"+ID+"' and Checkin_Date='"+date.format(time)+"'";
        return jdbcTemplate.queryForList(sql);
    }

    @Override
    public Object CommentSelect(String ID) {
        String sql="select Std_Name as Name,Cmt_Content as Conten from jxt_student,jxt_std_comment where jxt_student.Std_ID=jxt_std_comment.Std_ID and jxt_std_comment.Std_ID='"+ID+"'";
        return jdbcTemplate.queryForList(sql);
    }

    @Override
    public Object GradeSelct(String ID) {
        String sql="select Std_Name as Name,Grade  from jxt_student,jxt_grade where jxt_student.Std_ID=jxt_grade.Std_ID and jxt_grade.Std_ID='"+ID+"'";
        return jdbcTemplate.queryForList(sql);
    }
}
