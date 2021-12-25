package com.example.jsonexample;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Data
public class Test<T> {

    public int tag_id;

    public float rssi;

    public List<T> list = new ArrayList<>();

    public Test() {

    }

//    public void add(RFID rfid, Tag tag) {
//        list.add((T) rfid);
//    }
}
