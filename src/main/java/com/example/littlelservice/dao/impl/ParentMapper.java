package com.example.littlelservice.dao.impl;

import com.example.littlelservice.entity.Parent;
import com.example.littlelservice.dao.IParentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
@Repository
public class ParentMapper implements IParentMapper {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Map<String, Object> Select(Parent parent) {
        String sql ="select * from jxt_parent where Parent_ID = '"+parent.getParent_ID()+"' and Parent_Pwd = '"+parent.getParent_Pwd()+"'";
        try{
            return jdbcTemplate.queryForMap(sql);
        } catch (DataAccessException e) {
            return null;
        }
    }

    public Map<String,Object> RegisterSelect(Parent register){
        String sql = "select Parent_Tel from jxt_student where Parent_Tel='"+register.getParent_ID()+"'";
        try{
            return jdbcTemplate.queryForMap(sql);
        } catch (DataAccessException e) {
            return null;
        }
    }
    @Override
    public Object Register(Parent register) {
        String sql1= "insert into jxt_parent values('"+register.getParent_ID()+"','"+register.getStd_ID()+"','"+register.getParent_Name()+"','"+register.getParent_Pwd()+"')";
        try{if (RegisterSelect(register)!=null) {
            jdbcTemplate.update(sql1);
        }
        } catch (DataAccessException e) {
        }
        return RegisterSelect(register);
    }

    @Override
    public Object ClassINfor(Parent parent) {
        String sql= "select Std_Name,Parent_Name,Class_ID from jxt_student,jxt_parent where jxt_student.Parent_Tel ='"+parent.getParent_ID()+"' and jxt_parent.Parent_ID='"+parent.getParent_ID()+"'";
        return jdbcTemplate.queryForMap(sql);

    }

    @Override
    public Object Checkin(String ID) {
        SimpleDateFormat date=new SimpleDateFormat();
        date.applyPattern("yyyy-MM-dd");
        Date time=new Date();
        String sql ="select Std_Name as Name,Checkin_Content as Conten  from jxt_student,jxt_checkin where jxt_student.Std_ID=(select Std_ID from jxt_student where Parent_Tel='"+ID+"') and jxt_checkin.Std_ID=(select Std_ID from jxt_student where Parent_Tel='"+ID+"') and Checkin_Date='"+date.format(time)+"'";
        return jdbcTemplate.queryForList(sql);
    }
}
