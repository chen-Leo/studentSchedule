package com.example.demo.Entity;

import lombok.Data;

@Data
public class StudentInfoEntity {
    private int student_info_id;
    private String student_id;
    private String student_name;

    public StudentInfoEntity() {
    }


    public StudentInfoEntity(String student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
    }
}
