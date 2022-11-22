package com.collection.map;

import com.collection.arraylist.Student;

import java.util.*;

public class Toppers {

    public static void main(String[] args) {
        Map<String, Student> hm = new HashMap<>();

        hm.put("Mumbai",new Student(10,"Biswarup",1045));
        hm.put("Chenni",new Student(12,"arup",105));
        hm.put("Lolkja",new Student(15,"earup",145));
        hm.put("kolkata",new Student(1,"warup",10));
        hm.put("bangalore",new Student(14,"swarup",104));
        //geting all the state
//        Set<String> ss = hm.keySet();
//        for (String st:ss){
//            System.out.println(st);
//        }
////getting all the student;
//        Collection<Student> csl = hm.values();
//
//        List<Student> students = new ArrayList<>(csl);
//            Collections.sort(students);
//        for (Student student:students){
//            System.out.println(student.getName());
//        }
//getting student as well as state/Means key with value pair.

       Set<Map.Entry<String,Student>> kvpair =  hm.entrySet();
       for (Map.Entry<String,Student> std : kvpair){
           System.out.println(std.getKey());

           Student sc = std.getValue();
           System.out.println(sc);
        }





    }



}
