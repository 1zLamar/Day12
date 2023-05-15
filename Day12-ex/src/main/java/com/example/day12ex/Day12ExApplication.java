package com.example.day12ex;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Day12ExApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day12ExApplication.class, args);
    }

    @Bean
    @Qualifier("1")
    public String getMessage1(){
        System.out.println("hey from message 1");
        return "1";
    }
    @Bean
    @Qualifier("2")
    public String getMessage2(@Qualifier("3") String data) {
        System.out.println("hey from message 2");
        return data;
    }

    @Bean
    @Qualifier("3")
    public String getMessage3(){
        System.out.println("hey from message 3");
        return "3";
    }
}
