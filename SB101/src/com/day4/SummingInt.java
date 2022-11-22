package com.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.day3.assignment.question2.Student;

public class SummingInt {

	
	public static void main(String[] args) {
		

		List<Student> students= new ArrayList<>();
		
		
		students.add(new Student(10, "N1",500));
		students.add(new Student(12, "N2",400));
		students.add(new Student(13, "N3",420));
		students.add(new Student(14, "N4",440));
		students.add(new Student(15, "N5",600));
		students.add(new Student(16, "N6",380));
		
		int x= students.stream().collect(Collectors.summingInt(s -> s.getMarks()));
		
		System.out.println(x);
			
		
	}
}
