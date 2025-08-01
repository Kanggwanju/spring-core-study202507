package com.spring.core.chap02_4.controller;

import com.spring.core.chap02_4.config.StudentConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class StudentControllerTest {

    @Test
    void test() {
        ApplicationContext context
                    = new AnnotationConfigApplicationContext(StudentConfig.class);

        // 스프링은 빈을 관리할 때 단일 인스턴스를 유지함. -> 싱글톤 스코프
        StudentController controller1 = context.getBean(StudentController.class);
        StudentController controller2 = context.getBean(StudentController.class);
        System.out.println("controller1 = " + controller1);
        System.out.println("controller2 = " + controller2);
        controller1.showStudents();

    }

}