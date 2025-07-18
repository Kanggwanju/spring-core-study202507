package com.spring.core.chap02_4.repository;

import com.spring.core.chap02_4.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

// 학생 정보를 메모리에다가 관리
@Repository("smr")
public class StudentMemoryRepository implements StudentRepository {
    @Override
    public void save(Student student) {
        // ... 생략
    }

    @Override
    public List<Student> findAll() {
        System.out.println("# 학생 정보를 메모리에서 로딩합니다.");
        return List.of(
                new Student("001", "뽀로로", "F")
                , new Student("002", "푸바오", "C")
                , new Student("003", "우사기", "A")
        );
    }
}
