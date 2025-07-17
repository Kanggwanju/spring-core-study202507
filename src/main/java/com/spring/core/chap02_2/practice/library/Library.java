package com.spring.core.chap02_2.practice.library;

import java.util.List;

public class Library {
    
    // 의존 객체 설정
    private final List<Book> bookList;

    // 생성자 주입
    public Library(List<Book> books) {
        this.bookList = books;
    }

    public void listBooks() {

        System.out.println("책 종류: " + bookList);

    }
}
