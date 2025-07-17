package com.spring.core.chap02_2.practice.music;

import com.spring.core.chap02_2.practice.config.LibraryConfig;
import com.spring.core.chap02_2.practice.config.MusicPlayerConfig;
import com.spring.core.chap02_2.practice.library.Library;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class MusicPlayerTest {

    @Test
    void test1() {

        ApplicationContext context
            = new AnnotationConfigApplicationContext(MusicPlayerConfig.class);

        MusicPlayer MusicPlayer = context.getBean(MusicPlayer.class);
        MusicPlayer.playMusic();

    }

}