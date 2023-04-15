package com.example.littlelservice.dao.impl;

import com.example.littlelservice.dao.IMessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.Date;


@Repository
public class MessageMapper implements IMessageMapper {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Object Select() {
        String sql="select Msg_Title from jxt_message order by Msg_Time desc";
        return jdbcTemplate.queryForList(sql);
    }

    @Override
    public Object ActivitySelect(String activity) {
        String sql ="select Activity_Title,Activiity_Details,Activity_Time from jxt_class_activity where Class_ID=(select Class_ID from jxt_student where Std_ID='"+activity+"' or Parent_Tel='"+activity+"') or Class_ID=(select Class_ID from jxt_classes where Teacher_ID='"+activity+"') order by Activity_Time desc";
        return jdbcTemplate.queryForList(sql);
    }

    @Override
    public Object CommunicateSelect(String ID) {
        String sql ="select Communicate_Content,Communicate_Time from jxt_communicate where Class_ID=(select Class_ID from jxt_student where Std_ID='"+ID+"' or Parent_Tel='"+ID+"') or Class_ID=(select Class_ID from jxt_classes where Teacher_ID='"+ID+"') order by Communicate_Time desc";
        return jdbcTemplate.queryForList(sql);
    }

    @Override
    public Object ClassSelect(String ID) {
        String sql ="select Class_ID,Teacher_Name from jxt_classes where Class_ID=(select Class_ID from jxt_student where Std_ID='"+ID+"' or Parent_Tel='"+ID+"') or Teacher_ID='"+ID+"'";
        return jdbcTemplate.queryForMap(sql);
    }

    @Override
    public Object Homework(String ID) {
        SimpleDateFormat date=new SimpleDateFormat();
        date.applyPattern("yyyy-MM-dd");
        Date time=new Date();
        String sql="select Homework_Content as Conten from jxt_homework where Class_ID='"+ID+"' and Homework_Time='"+date.format(time)+"'";
        return jdbcTemplate.queryForList(sql);
    }

    @Override
    public Object MessageInfor(String Title) {
        String sql ="select Msg_Content as Conten from jxt_message where Msg_Title='"+Title+"'";
        return jdbcTemplate.queryForMap(sql);
    }


}
