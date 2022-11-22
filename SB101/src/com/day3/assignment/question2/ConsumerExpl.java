package com.day3.assignment.question2;

import java.util.ArrayList;
import java.util.List;

public class ConsumerExpl {
	public static void main(String[] args) {
		
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(10, "N1", 780));
		students.add(new Student(12, "N2", 480));
		students.add(new Student(13, "N3", 380));
		students.add(new Student(14, "N4", 880));
		students.add(new Student(15, "N5", 680));
		students.add(new Student(16, "N6", 720));
		
		
		students.forEach(s -> {
			
			System.out.println("Roll is :"+s.getRoll());
			System.out.println("Name is :"+s.getName());
			System.out.println("Marks is :"+s.getMarks());
			
			System.out.println("============================");
			
		});	
		
		
	}
}
