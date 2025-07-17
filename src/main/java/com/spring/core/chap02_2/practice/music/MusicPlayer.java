package com.spring.core.chap02_2.practice.music;

public class MusicPlayer {

    private Speaker speaker;

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public void playMusic() {
        if (speaker == null) {
            System.out.println("스피커가 세팅되지 않았습니다.");
            return;
        }
        System.out.println("음악을 재생합니다.");
        speaker.playSound();
    }
}
