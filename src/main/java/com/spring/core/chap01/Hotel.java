package com.spring.core.chap01;

// 호텔의 설계도
public class Hotel {

    // 레스토랑 입점
    private Restaurant restaurant;

    // 헤드쉐프 고용
//    private JannChef headChef;
    private Chef headChef;

    // 생성자

    public Hotel() {
        this.restaurant = new WesternRestaurant();
//        this.headChef = new StephaneChef(); // DIP 위반
        this.headChef = new StephaneChef();
    }

    // 레스토랑 예약 기능
    public void reserve() {
        System.out.println("레스토랑을 예약합니다.");
        restaurant.order();
    }

}
