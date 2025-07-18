package com.spring.core.chap02_3_practice.repository;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    public String getProduct() {
        return "DB에서 찾은 물건입니다.";
    }
}
