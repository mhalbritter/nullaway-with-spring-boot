package com.example.nullaway_config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Moritz Halbritter
 */
@Component
class MyCLR implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        String string = "foo";
        call(string);
    }

    private void call(String string) {
        System.out.println(string);
    }
}
