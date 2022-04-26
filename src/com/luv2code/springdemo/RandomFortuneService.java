package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    // create an array of strings
    private String arr[] = {" first string", " second string", "third string"};

    // create a random number generator
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(arr.length);

        String theFortune = arr[index];

        return theFortune;
    }
}
