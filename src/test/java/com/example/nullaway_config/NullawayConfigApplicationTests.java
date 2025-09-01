package com.example.nullaway_config;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NullawayConfigApplicationTests {

    @Test
    void contextLoads() {
        String string = null;
        call(string);
    }

    private void call(String string) {
        System.out.println(string);
    }

}
