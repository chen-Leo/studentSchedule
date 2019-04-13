package com.example.demo.Service;

import com.example.demo.Entity.ClassInfoEntity;
import com.example.demo.Mapper.ClassInfoMapper;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClassService {

    ClassInfoMapper classInfoMapper;

    public void add(ClassInfoEntity classInfoEntity) {
        classInfoMapper.add(classInfoEntity);
    }

    /**
     * 查找是否存在已经添加了的课程
     * @param class_num
     * @return true(不存在) or false(存在)
     */
    public boolean selectNotExist(String class_num, String time, String place) {
        ArrayList<ClassInfoEntity> result = classInfoMapper.select(class_num);
        if (result == null) return true;
        else {
            for (ClassInfoEntity classInfoEntity :
                    result) {
                if (classInfoEntity.getPlace() != place || classInfoEntity.getClassTime() != time) return false;
            }
            return true;
        }
    }
}
