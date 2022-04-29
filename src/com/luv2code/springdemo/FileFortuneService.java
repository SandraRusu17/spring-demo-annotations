package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FileFortuneService implements FortuneService {

    private String fileName = "C:\\Users\\srusu\\Personal Usage\\spring-demo-annotations\\src\\fortune-data.txt";
    private List<String> theFortunes;

    private Random random = new Random();

    public FileFortuneService() {
        System.out.println(" >>> Inside FileFortuneService constructor");
        }

    @PostConstruct
    private void loadFortunesFromFile() {

        System.out.println(" >>> Inside loadFortunesFromFile");

        File theFile = new File(fileName);

        System.out.println("Reading fortunes from file ->" + theFile);
        System.out.println("File exists ->" + theFile.exists());

        // initialize the array list
        theFortunes = new ArrayList<String>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String tempLine;

            while ((tempLine = br.readLine()) != null) {
                theFortunes.add(tempLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getFortune() {
        int index = random.nextInt(theFortunes.size());

        String tempFortune = theFortunes.get(index);

        return tempFortune;
    }
}
