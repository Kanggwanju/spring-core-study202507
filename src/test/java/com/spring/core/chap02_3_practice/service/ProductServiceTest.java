package com.spring.core.chap02_3_practice.service;

import com.spring.core.chap02_3.config.MyModelConfig;
import com.spring.core.chap02_3.controller.MyController;
import com.spring.core.chap02_3_practice.config.ProductConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    @Test
    void test() {

        ApplicationContext context
            = new AnnotationConfigApplicationContext(ProductConfig.class);

//        MyController controller = new MyController(new MyService(new MyRepository()));
        ProductService service = context.getBean(ProductService.class);

        service.findProduct();

    }

}