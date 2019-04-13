package com.example.demo.Service;

import com.example.demo.Entity.StudentInfoEntity;
import com.example.demo.Mapper.StudentInfoMapper;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    StudentInfoMapper studentInfoMapper;

    public void add(StudentInfoEntity studentInfoEntity){
        studentInfoMapper.add(studentInfoEntity);
    }





}
