package com.spring.project.contentcalenderv.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {


    @Profile("!dev")
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello");

    }




    }
