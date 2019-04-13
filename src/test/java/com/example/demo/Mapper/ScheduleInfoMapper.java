package com.example.demo.Mapper;

import com.example.demo.Entity.ScheduleInfoEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface ScheduleInfoMapper {

    @Insert("INSERT INTI schedule_info(class_num,student_id) VALUES(#{class_num},#{student_id})")
    @Options(useGeneratedKeys = true,keyProperty = "schedule_info_id",keyColumn = "schedule_info_id")
    void add (ScheduleInfoEntity scheduleInfoEntity);
}
