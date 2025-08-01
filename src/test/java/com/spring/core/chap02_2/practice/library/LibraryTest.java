package com.spring.core.chap02_2.practice.library;

import com.spring.core.chap02_2.config.CarConfig;
import com.spring.core.chap02_2.practice.config.LibraryConfig;
import com.spring.core.chap02_2.vehicle.Car;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void test1() {

        ApplicationContext context
            = new AnnotationConfigApplicationContext(LibraryConfig.class);

        Library library = context.getBean(Library.class);
        library.listBooks();

    }

}