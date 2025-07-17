package com.spring.core.chap02_2.practice.config;

import com.spring.core.chap02_2.practice.library.Book;
import com.spring.core.chap02_2.practice.library.Library;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class LibraryConfig {

    @Bean
    public List<Book> bookList() {
        List<Book> books = new ArrayList<>(List.of(
            new Book(2007, "해리포터", "판타지"),
            new Book(1999, "그대라는 시", "일상"),
            new Book(2018, "한강", "시")
        ));
        return books;
    }

    @Bean
    public Library library() {
        return new Library(bookList());
    }
}
