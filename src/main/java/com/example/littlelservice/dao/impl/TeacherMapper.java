package com.example.littlelservice.dao.impl;

import com.example.littlelservice.entity.Activity;
import com.example.littlelservice.entity.Communicate;
import com.example.littlelservice.entity.Teacher;
import com.example.littlelservice.dao.ITeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
@Repository
public class TeacherMapper implements ITeacherMapper {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public Map<String, Object> Select(Teacher teacher) {
        String sql = "select * from jxt_teacher where Teacher_ID='"+teacher.getTeacher_ID()+"' and Teacher_Pwd ='"+teacher.getTeacher_Pwd()+"'";
        try{
            return jdbcTemplate.queryForMap(sql);
        } catch (DataAccessException e) {
            return null;
        }
    }

    @Override
    public Object ClassInfor(Teacher teacher) {
        String sql = "select Class_ID,Teacher_Name from jxt_classes where Teacher_ID = '" + teacher.getTeacher_ID() + "'  ";
        return jdbcTemplate.queryForMap(sql);
    }

    @Override
    public Object StudentInfor(String ID) {
        SimpleDateFormat date=new SimpleDateFormat();
        date.applyPattern("yyyy-MM-dd");
        Date time=new Date();
        String sql ="select Std_Name as Name,Checkin_Content as Conten,jxt_student.Class_ID as ClassID,jxt_student.Std_ID as StdID  from jxt_student,jxt_checkin where jxt_student.Class_ID=(select Class_ID from jxt_classes where Teacher_ID='"+ID+"') and jxt_checkin.Class_ID=(select Class_ID from jxt_classes where Teacher_ID='"+ID+"') and Checkin_Date='"+date.format(time)+"' and jxt_student.Std_ID=jxt_checkin.Std_ID " ;
        return jdbcTemplate.queryForList(sql);
    }

    @Override
    public Object CheckinInsert(String ID, String Conten) {
        String sql ="update jxt_checkin set Checkin_Content='"+Conten+"' where Std_ID='"+ID+"'";
        return jdbcTemplate.update(sql);
    }

    @Override
    public Object HomeworkInsert(String ID, String Conten) {
        SimpleDateFormat date=new SimpleDateFormat();
        date.applyPattern("yyyy-MM-dd");
        Date time=new Date();
        String sql ="update jxt_homework set Homework_Time='"+date.format(time)+"',Homework_Content='"+Conten+"' where Class_ID='"+ID+"'";
        return jdbcTemplate.update(sql);
    }

    @Override
    public Object ActivityInsert(Activity activity) {
        SimpleDateFormat date=new SimpleDateFormat();
        date.applyPattern("yyyy-MM-dd");
        Date time=new Date();
        String sql="insert into jxt_class_activity values (null,'"+activity.getClass_ID()+"','"+activity.getActivity_Details()+"','"+date.format(time)+"','"+activity.getActivity_Title()+"')";
        return jdbcTemplate.update(sql);
    }

    @Override
    public Object CommunicateInsert(Communicate cummunicate) {
        SimpleDateFormat date=new SimpleDateFormat();
        date.applyPattern("yyyy-MM-dd");
        Date time=new Date();
        String sql ="insert into jxt_communicate values ('"+cummunicate.getClass_ID()+"','"+cummunicate.getTeacher_ID()+"','"+cummunicate.getCommunicate_Conten()+"','"+date.format(time)+"')";
        return jdbcTemplate.update(sql);
    }

    @Override
    public Object ActivityDelete(String Title) {
        String sql ="delete from jxt_class_activity where Activity_Title='"+Title+"'";
        return jdbcTemplate.update(sql);
    }

    @Override
    public Object CommunicateDelete(String Conten) {
        String sql="delete from jxt_communicate where Communicate_Content='"+Conten+"'";
        return jdbcTemplate.update(sql);
    }

    @Override
    public Object ActivityID(String Title) {
        String sql="select Activity_ID as ID from jxt_class_activity where Activity_Title='"+Title+"'";
        return jdbcTemplate.queryForMap(sql);
    }

    @Override
    public Object ActivityUpdate(String Conten,String Title,String ID) {
        SimpleDateFormat date=new SimpleDateFormat();
        date.applyPattern("yyyy-MM-dd");
        Date time=new Date();
        String sql="update jxt_class_activity set Activity_Details='"+Conten+"',Activity_Time='"+date.format(time)+"',Activity_Title='"+Title+"' where Activity_ID='"+ID+"'";
        return jdbcTemplate.update(sql);
    }

    @Override
    public Object GradeSelect(String ID) {
        String sql="select Std_Name as Name,Class_ID as ClassID,jxt_student.Std_ID as ID,Grade from jxt_student,jxt_grade where jxt_student.Std_ID=jxt_grade.Std_ID and Class_ID='"+ID+"'";
        return jdbcTemplate.queryForList(sql);
    }

    @Override
    public Object CommentSelect(String ID) {
        String sql="select Std_Name as Name,Class_ID as ClassID,jxt_student.Std_ID as ID,Cmt_Content as Conten from jxt_student,jxt_std_comment where jxt_student.Std_ID=jxt_std_comment.Std_ID and jxt_std_comment.Teacher_ID='"+ID+"'";
        return jdbcTemplate.queryForList(sql);
    }

}
