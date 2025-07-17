package com.spring.core.chap01;

import com.spring.core.chap01.manage.HotelManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    // 테스트 메서드
    @Test
    void hotel() {

        // 호텔에 예약
        HotelManager manager = new HotelManager();
        Hotel hotel = manager.hotel();
        hotel.reserve();
    }

}