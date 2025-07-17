package com.spring.core.chap01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    // 테스트 메서드
    @Test
    void hotel() {

        // 호텔에 예약
        Hotel hotel = new Hotel();
        hotel.reserve();
    }


}