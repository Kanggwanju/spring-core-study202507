package com.spring.core.chap02_2.practice.library;

import java.util.Objects;

public class Book {
    private int year; // 출간 연도
    private String title; // 책 제목
    private String genre; // 책 장르

    public Book(int year, String title, String genre) {
        this.year = year;
        this.title = title;
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book book)) return false;
        return year == book.year && Objects.equals(title, book.title) && Objects.equals(genre, book.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, title, genre);
    }

    @Override
    public String toString() {
        return "Book{" +
            "year=" + year +
            ", title='" + title + '\'' +
            ", genre='" + genre + '\'' +
            '}';
    }
}
