package com.example.jsonexample;


import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@Data
public class RFID extends Test {
    public RFID(float rssi) {
        this.rssi = rssi;
    }

//    public RFID(float rssi)
//    {
//        this.rssi = rssi;
//
//    }


}
