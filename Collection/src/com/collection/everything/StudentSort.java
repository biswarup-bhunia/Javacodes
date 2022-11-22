package com.collection.everything;

import com.collection.arraylist.Student;

import java.util.Comparator;

public class StudentSort implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getRoll() > o2.getRoll()) return 1;
        else if (o1.getRoll() < o2.getRoll()) {
            return -1;
        }
        else return 0;
    }
}
