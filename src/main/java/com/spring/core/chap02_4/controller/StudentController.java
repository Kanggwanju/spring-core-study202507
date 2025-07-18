package com.spring.core.chap02_4.controller;

import com.spring.core.chap02_4.model.Student;
import com.spring.core.chap02_4.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

// 학생 조회 요청, 생성 요청을 처리
@Controller
@Scope("prototype")
public class StudentController {

    private StudentRepository repository;

    public StudentController(@Qualifier("smr") StudentRepository repository) {
        this.repository = repository;
    }

    // 조회 요청을 처리
    public void showStudents() {
        List<Student> studentList = repository.findAll();
        System.out.println("------ 학생 목록 출력 ------");
        studentList.forEach(System.out::println);
    }
}
