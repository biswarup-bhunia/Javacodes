package com.collection.Genaric;

import java.util.Arrays;
import java.util.List;

public class Lowerbound {
    static void ug(List<? super Integer> ls){
        for(Object i : ls) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        List <Integer> ils = Arrays.asList(10,20,512);

        List<String> sls = Arrays.asList("Ram","Sam","Jam");

        ug(ils);
//        ug(sls);
    }
}
