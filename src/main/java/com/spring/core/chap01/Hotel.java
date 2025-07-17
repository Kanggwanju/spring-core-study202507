package com.spring.core.chap01;

// 호텔의 설계도
public class Hotel {

    // 레스토랑 입점
    private final Restaurant restaurant;

    // 헤드쉐프 고용
//    private JannChef headChef; // DIP 위반
    private final Chef headChef;

    // 생성자

    public Hotel(Restaurant restaurant, Chef chef) {
        // OCP 위반, 셰프만 변경되어도 레스토랑,
        // 레스토랑 내부의 헤드셰프를 전부 변경해야함(코드 수정).
//        this.restaurant = new WesternRestaurant();
//        this.headChef = new StephaneChef(); // DIP 위반
//        this.headChef = new JannChef();

        // 제어의 역전, 객체 생성의 제어권을 넘김.
        this.restaurant = restaurant;
        this.headChef = chef;
    }

    // 레스토랑 예약 기능
    public void reserve() {
        System.out.println("레스토랑을 예약합니다.");
        System.out.println("헤드 셰프명: " + headChef.getClass().getSimpleName());
        restaurant.order();
    }

}
