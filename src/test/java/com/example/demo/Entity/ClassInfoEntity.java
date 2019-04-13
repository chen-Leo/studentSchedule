package com.example.demo.Entity;

import lombok.Data;

/**
 * 课程信息
 */
@Data
public class ClassInfoEntity {
    private int class_info_id;

    private String classNum;//教学班号--->主键,在课表中加入课也是以此为准
    private String classTeachKind; //教学性质分类
    private String className;//课程名
    private String classKind;//必修还其他什么
    private String classTime;//描述性上课时间->用来区分同一节课的不同时间与地点
    private String teacher;//教师名
    private String week;//星期数
    private String jointNum;//节数
    private String weekAll;//上课周数
    private String classStatue;//选课状态
    private String place;//地点


    public ClassInfoEntity() {
    }

    public ClassInfoEntity(String classNum, String classTeachKind,
                           String className, String classKind, String classTime, String teacher,
                           String week, String jointNum, String weekAll,
                           String classStatue, String place) {
        this.classNum = classNum;
        this.classKind = classKind;
        this.classTeachKind = classTeachKind;
        this.className = className;
        this.classTime = classTime;
        this.teacher = teacher;
        this.week = week;
        this.jointNum = jointNum;
        this.weekAll = weekAll;
        this.classStatue = classStatue;
        this.place = place;


    }
//    private String classTeachKind; //教学性质,,分类
//    private String classKind;//必修还其他什么
//    private String classTime;//描述性上课时间
//    private String teacher;//教师名

}


