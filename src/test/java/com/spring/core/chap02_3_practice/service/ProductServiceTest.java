package com.spring.core.chap02_3_practice.service;

import com.spring.core.SpringCore202507Application;
import com.spring.core.chap02_3.config.MyModelConfig;
import com.spring.core.chap02_3.controller.MyController;
import com.spring.core.chap02_3_practice.config.ProductConfig;
import com.spring.core.chap02_3_practice.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    @Test
    void test() {

        /*
        ApplicationContext context
            = new AnnotationConfigApplicationContext(ProductConfig.class);
        ProductService service = context.getBean(ProductService.class);
        service.findProduct();
        */

        // Config 파일 안 만들어도 됨
        ApplicationContext context
            = new AnnotationConfigApplicationContext(SpringCore202507Application.class);
        ProductService service = context.getBean(ProductService.class);
        String product = service.findProduct();
        System.out.println("product = " + product);

    }

}