package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
public class BodyDataDTO {
    private int i;
    private String str;

    public BodyDataDTO(){
        i = 10;
        str = "from backend";
    }
//    public BodyData(int i, String str){
//        this.i = i;
//        this.str = str;
//    }
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

}
