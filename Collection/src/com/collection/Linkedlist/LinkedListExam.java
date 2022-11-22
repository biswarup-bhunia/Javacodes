package com.collection.Linkedlist;

import java.util.LinkedList;

public class LinkedListExam {
//It is use only when we need to add or delete data from middle.
    public static void main(String[] args) {
        LinkedList <Integer> ll = new LinkedList<>();

        ll.add(100);
        ll.add(10);
        ll.add(54);


        ll.add(null);

        System.out.println(ll.get(0));
    }
}
