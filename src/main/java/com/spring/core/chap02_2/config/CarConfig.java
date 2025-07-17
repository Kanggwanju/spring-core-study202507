package com.spring.core.chap02_2.config;

import com.spring.core.chap02_2.vehicle.Car;
import com.spring.core.chap02_2.vehicle.Engine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 스프링에게 관리할 객체를 알려주는 클래스
@Configuration // 이거는 자바클래스가 아니라 사실 설정파일임
public class CarConfig {

    // 스프링아 나 대신 엔진좀 만들어라
    @Bean
    public Engine engine() {
        return new Engine();
    }

    // 스프링아 나 대신 차좀 만들어 대신 그때 엔진을 결합해
    @Bean
    public Car car() {
        return new Car(engine()); // 생성자 주입
    }

}
