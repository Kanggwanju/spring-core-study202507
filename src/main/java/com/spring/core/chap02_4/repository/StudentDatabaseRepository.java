package com.spring.core.chap02_4.repository;

import com.spring.core.chap02_4.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

// 학생 정보를 데이터베이스에 관리
@Repository("sdr")
public class StudentDatabaseRepository implements StudentRepository {
    @Override
    public void save(Student student) {
        // ... 생략
    }

    @Override
    public List<Student> findAll() {
        System.out.println("------ 데이터베이스로부터 학생 정보 조회 ------");
        return List.of(
                new Student("2025001", "쿠로미", "B")
                , new Student("2025002", "하치와레", "C")
                , new Student("2025003", "그로밋", "D")
        );
    }
}
