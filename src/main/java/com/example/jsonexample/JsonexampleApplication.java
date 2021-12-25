package com.example.jsonexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@SpringBootApplication
public class JsonexampleApplication {


    public static void main(String[] args) {
        SpringApplication.run(JsonexampleApplication.class, args);
        List<Test> testlist = new ArrayList<>();
        testlist.add(new Tag(1));
        testlist.get(0).list.add(new RFID(1));
        testlist.get(0).list.add(new RFID(66));

        testlist.add(new Tag(2));
        testlist.get(1).list.add(new RFID(2));
        testlist.get(1).list.add(new RFID(77));

        for (Test test : testlist) {
            System.out.println("[" + test.getTag_id() + ", [" + test.getList().stream().map(i -> String.valueOf(i)).collect(Collectors.joining(", ")) + "]]");
        }
    }

}
