package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DanceCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Dance for 2 hours";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
