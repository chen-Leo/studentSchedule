package com.example.demo.Entity;

import lombok.Data;

/**
 * 学生课表详细信息
 */
@Data
public class ScheduleInfoEntity {

    private int schedule_info_id;

    private String classNum;//教学班号--->主键,在课表中加入课也是以此为准
    private String studentId;


    public ScheduleInfoEntity(){

    }

    public  ScheduleInfoEntity(String classNum,String studentId)
                              {

        this.classNum = classNum;
        this.studentId = studentId;

    }
 }
