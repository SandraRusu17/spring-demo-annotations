package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeConfigJavaDemoApp {

    public static void main(String[] args) {

        // read java spring config class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PracticeSportConfig.class);


        // get the bean from spring container
        Coach theCoach = context.getBean("kartingCoach", Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call a method on the bean
        System.out.println(theCoach.getDailyFortune());

        context.close();

    }



}
