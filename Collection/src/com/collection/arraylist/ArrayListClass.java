package com.collection.arraylist;

import java.util.ArrayList;

public class ArrayListClass {

    public static void main(String[] args) {

        ArrayList a1 = new ArrayList();

        System.out.println(a1); // []

        System.out.println(a1.size()); // Size is method of collection

        a1.add(new Student(20,"biswarup",250)); // add and get is the method of list.
        a1.add(new Student(22,"Rup",250));
        a1.add(20);
        a1.add("Biswarup");

        Student s1 =  (Student)a1.get(0); // Downcast to student object because the return type is Object Class.

        System.out.println(s1);
        System.out.println(a1.get(1));
        System.out.println(a1.get(0));
        System.out.println(a1.size());









    }




}
