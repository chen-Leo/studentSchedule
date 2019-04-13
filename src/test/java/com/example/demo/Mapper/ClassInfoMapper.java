package com.example.demo.Mapper;

import com.example.demo.Entity.ClassInfoEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;


@Mapper
public interface ClassInfoMapper {

    //    private int class_info_id;
//
//    private String classNum;//教学班号--->主键,在课表中加入课也是以此为准
//    private String classTeachKind; //教学性质分类
//    private String className;//课程名
//    private String classKind;//必修还其他什么
//    private String classTime;//描述性上课时间
//    private String teacher;//教师名
//    private String week;//星期数
//    private String jointNum;//节数
//    private String weekAll;//上课周数
//    private String classStatue;//选课状态
//    private String place;//地点
    @Insert("INSERT INTO class_info (class_num,class_teach_kind,class_name," +
            "class_kind,class_time,teacher,week,joinNum,weekAll,classStatue,place) VALUES(#{class_num),#{class_teach_kind},#{class_name}.#{class_kind},#{class_time},#{teacher},#{week}," +
            "#{joinNum},#{weekAll},#{classStatue},#{place})")
    @Options(useGeneratedKeys = true, keyProperty = "class_info_id", keyColumn = "class_info_id")
    void add(ClassInfoEntity classInfoEntity);

    @Select("SELECT * FROM class_info WHERE class_num = #{class_num}")
    ArrayList<ClassInfoEntity> select(String class_num);





}
