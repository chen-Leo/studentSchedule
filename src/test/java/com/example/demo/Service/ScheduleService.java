package com.example.demo.Service;

import com.example.demo.Entity.ScheduleInfoEntity;
import com.example.demo.Mapper.ScheduleInfoMapper;

import org.springframework.stereotype.Service;

@Service
public class ScheduleService {

    ScheduleInfoMapper scheduleInfoMapper;

    public void add(ScheduleInfoEntity scheduleInfoEntity){
        scheduleInfoMapper.add(scheduleInfoEntity);
    }


}
