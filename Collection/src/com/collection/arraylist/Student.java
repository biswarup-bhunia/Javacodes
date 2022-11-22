package com.collection.arraylist;

import java.util.Objects;

public class Student implements Comparable <Student>{

    private int roll;
    private String name;
    private int marks;

    public Student() {
    }

    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getRoll() == student.getRoll() && getMarks() == student.getMarks() && getName().equals(student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRoll(), getName(), getMarks());
    }

    public int compareTo(Student o) {
        if(this.roll > o.roll) return 1;
        else if (this.roll < o.roll) {
            return -1;
        }
        else return 0;
    }
}
