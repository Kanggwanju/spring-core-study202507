package com.spring.core.chap02_2.practice.music;

public class MusicPlayer {

    private Speaker speaker;

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public void playMusic() {
        System.out.println("음악을 재생합니다.");
        speaker.playSound();
    }
}
