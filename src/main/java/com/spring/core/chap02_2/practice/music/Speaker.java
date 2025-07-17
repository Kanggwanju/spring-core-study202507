package com.spring.core.chap02_2.practice.music;

public class Speaker {

    private int power; // 음량
    private String music; // 스피커에서 나오는 음악

    public void setPower(int power) {
        this.power = power;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public void playSound() {
        System.out.println("노래 제목: " + this.music);
        System.out.println("음량: " + this.power);
    }


}
