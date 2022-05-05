package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class KartingCoach implements Coach{

    private FortuneService fortuneService;

    public KartingCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
