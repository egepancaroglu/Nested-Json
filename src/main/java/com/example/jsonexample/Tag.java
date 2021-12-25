package com.example.jsonexample;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Tag extends Test {


    public Tag(int tag_id) {
        this.tag_id = tag_id;
    }


//    public Tag() {
//
//    }
//
}
