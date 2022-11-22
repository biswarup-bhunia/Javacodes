package com.day1.assignment.question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		List<Student> student = Arrays.asList(
				
				new Student(2, "Biswarup", "Khariparia", 3),
				new Student(2, "Biswarup", "Khariparia", 3),
				new Student(3, "Warup", "paria", 1),
				new Student(4, "Arup", "iparia", 3),
				new Student(5, "Rup", "ariparia", 10)
				);
				
		
		Set<Student> stds = new HashSet<>(student);
		
		List<Student> students = new ArrayList<>(stds);
		
		Collections.sort(students, new SortByMarks());
		
		for(Student std : students) {
			System.out.println(std);
		}
	}
}
