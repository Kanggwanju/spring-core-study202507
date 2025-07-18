package com.spring.core.chap02_3_practice.service;

import com.spring.core.chap02_3_practice.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        System.out.println("ProductService 객체 생성!");
        this.repository = repository;
        System.out.println("ProductRepository 의존성이 ProductService 주입됨!");
    }

    public String findProduct() {
        return "데이터정제: " + repository.getProduct();
    }
}
