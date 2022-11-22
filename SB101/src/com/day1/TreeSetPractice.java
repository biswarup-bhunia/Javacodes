package com.day1;

import java.util.TreeSet;

public class TreeSetPractice {

	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<>();
		
		ts.add(new Student(10, 1405, "Biswarup"));
		ts.add(new Student(10, 1405, "Biswarup"));
		ts.add(new Student(20, 1455, "rup"));
		ts.add(new Student(30, 1444, "swarup"));
		
		System.out.println(ts.size());
	}
}
