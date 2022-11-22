package com.collection.Genaric;

public class MapCLass {

    public static <K , V> void  mapNum(K k , V v){
        System.out.println(k+"============="+v);
    }



    public static void main(String[] args) {
        mapNum(10,"Stre");
    }

}
