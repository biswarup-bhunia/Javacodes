package com.collection.everything;

import com.collection.arraylist.Student;
import com.collection.arraylist.StudentSortByName;

import java.util.*;

public class StudentManagementSystem {

    public static void main(String[] args) {
        List <Student> students = new ArrayList<>();

        students.add(new Student(20,"Biswarup",1204));
        students.add(new Student(21,"up",1221));
        students.add(new Student(1,"warup",1415));
        students.add(new Student(3,"swarup",1452));
        students.add(new Student(8,"rup",1448));

        Collections.sort(students);

        for (Student std: students
             ) {
            System.out.println(std);
            System.out.println("=================================");
        }

    }

}