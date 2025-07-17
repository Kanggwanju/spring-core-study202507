package com.spring.core.chap02_2.practice.config;

import com.spring.core.chap02_2.practice.music.MusicPlayer;
import com.spring.core.chap02_2.practice.music.Speaker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MusicPlayerConfig {

    @Bean
    public Speaker speaker() {
        Speaker speaker1 = new Speaker();
        speaker1.setMusic("붉은노을");
        speaker1.setPower(88);

        return speaker1;
    }

    @Bean
    public MusicPlayer musicPlayer() {
        MusicPlayer musicPlayer1 = new MusicPlayer();
        musicPlayer1.setSpeaker(speaker());
        return musicPlayer1;
    }
}
