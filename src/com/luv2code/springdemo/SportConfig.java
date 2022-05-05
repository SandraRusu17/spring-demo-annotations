package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    // define bean for our fortune service
    @Bean
    private FortuneService sadFortuneService() {
         return new SadFortuneService();
    }

    // define bean for our swim coach AND inject dependency
    @Bean
    private Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }
}
