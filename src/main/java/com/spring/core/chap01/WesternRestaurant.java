package com.spring.core.chap01;

// 서양식 레스토랑
public class WesternRestaurant implements Restaurant {
    
    // 메인 쉐프 고용
    private Chef mainChef;
    
    // 요리 코스 구성
    private Course course;

    public WesternRestaurant() {
        this.mainChef = new JannChef();
        this.course = new FrenchCourse();
    }

    // 주문 기능
    public void order() {
        System.out.println("서양 요리를 주문합니다.");
        course.combineMenu();
        mainChef.cook();
    }
}
