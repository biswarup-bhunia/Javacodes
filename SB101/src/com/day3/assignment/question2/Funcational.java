package com.day3.assignment.question2;

import java.util.function.Function;

public class Funcational {

	public static void main(String[] args) {
		
		
		Function<Student, String> f2 = s -> s.getMarks() > 500 ? "Pass" : "Fail";

		System.out.println(f2.apply(new Student(20, "Amit", 900)));		
		
	}
}
