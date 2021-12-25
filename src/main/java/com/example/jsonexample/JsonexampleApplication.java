package com.example.jsonexample;

import org.slf4j.MDC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@SpringBootApplication
public class JsonexampleApplication {


    public static void main(String[] args) {
        SpringApplication.run(JsonexampleApplication.class, args);
        List<RFID> rfidList = new ArrayList<>();
        List<Tag> taglist = new ArrayList<>();

        rfidList.add(new RFID(1));
        taglist.add(new Tag(1));
        List<Test> testlist = new ArrayList<>();
        testlist.add(new Tag(1));
        testlist.add(new RFID(1));
//        new Test<>().add(new RFID(1),new Tag(1));
//        for (int i = 0; i < rfidList.size(); i++)
//        {
//            System.out.println(rfidList.get(i).getRssi());
//            System.out.println(taglist.get(i).getTag_id());
//
//        }
//        System.out.println(testlist.get(0).getTag_id());
//        System.out.println(testlist.get(1).getRssi());
//        System.out.println(Arrays.toString(Arrays.stream(testlist.toArray()).toArray()));
////        System.out.println(hList.get(0));
        for (Test test : testlist) {
            System.out.println("[" + test.getTag_id() + ", [" + test.getList().stream().map(i -> String.valueOf(i)).collect(Collectors.joining(", ")) + "]]");
        }
    }

}
