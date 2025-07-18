package com.spring.core.chap02_3.controller;

import com.spring.core.chap02_3.service.MyService;

// 클라이언트의 요청을 처리하는 클래스
public class MyController {

    private MyService service;

    public MyController(MyService service) {
        System.out.println("MyController객체 생성!");
        this.service = service;
        System.out.println("Service 의존성이 Controller에 주입됨!");
    }

    // 정제된 데이터를 응답해주세요!
    public void handleRequest() {
        System.out.println("정제된 데이터를 응답 -> " + service.processData());
    }
}