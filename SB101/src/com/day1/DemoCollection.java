package com.day1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DemoCollection {

	public static void main(String[] args) {
		
		List<Student> students = Arrays.asList(
				new Student(10, 1405, "Biswarup"),
				new Student(20, 1455, "rup"),
				new Student(30, 1444, "swarup"),
				new Student(10, 1405, "Biswarup")
				
				);
	Set<Student> studentSet = new LinkedHashSet<>(students);	
		
		
		System.out.print(studentSet.size());
	}
	
	
	
	
}
