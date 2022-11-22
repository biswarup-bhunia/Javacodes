package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class AddStudentApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList <Student> students = new ArrayList<>(1000); // This is called hemogenius/ same type of array list.

        int count = 1;

        while (true) {
            System.out.println("Please Enter Student Details No:- "+ count++);

            System.out.println("Enter Student Name : ");

            String s1 = sc.next();
            sc.nextLine();
            System.out.println("Enter Student roll : ");

            int roll1 = sc.nextInt();

            System.out.println("Enter Student Marks : ");

            int mark = sc.nextInt();

            students.add(new Student(roll1,s1,mark));

            System.out.println("Store more Student y/n");

            String choice = sc.next();

            if (choice.equalsIgnoreCase("n"))
                break;
        }

        for (Student student: students
             ) {
            System.out.println(student);
            System.out.println("=======================================");
        }

    }

}
