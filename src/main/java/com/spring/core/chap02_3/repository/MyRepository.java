package com.spring.core.chap02_3.repository;

import com.spring.core.chap02_3.model.MyModel;

// 데이터베이스에 접근해서 데이터를 CRUD하는 역할
public class MyRepository {

    public MyRepository() {
        System.out.println("MyRepository 객체 생성!");
    }

    // 데이터 조회
    public MyModel findData() {
        return new MyModel("DB에서 조회한 데이터입니다.");
    }
}