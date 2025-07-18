package com.spring.core.chap02_3.service;

import com.spring.core.SpringCore202507Application;
import com.spring.core.chap02_3_practice.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class MyServiceTest {


    @Test
    void test() {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(SpringCore202507Application.class);
        MyService service = context.getBean(MyService.class);
        System.out.println("ProcessData = " + service.processData());
    }

}