package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

// create Java config class to perfomr IoC and DI with KartingCoach and
@Component
public class PracticeSportConfig {

    // define bean for our SingleFortuneService
    @Bean
    public FortuneService singleFortuneService() {
        return new SingleFortuneService();
    }

    // define bean for out coach implementation
    @Bean
    public Coach kartingCoach() {
        KartingCoach kartingCoach = new KartingCoach(singleFortuneService());

        return kartingCoach;
    }
}
