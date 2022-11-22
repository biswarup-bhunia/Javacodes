package com.day4;

import com.day3.assignment.question2.Student;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AllMatch {

	public static void main(String[] args) {
		

		List<Student> students= new ArrayList<>();
		
		
		students.add(new Student(10, "N1",500));
		students.add(new Student(12, "N2",400));
		students.add(new Student(13, "N3",420));
		students.add(new Student(14, "N4",440));
		students.add(new Student(15, "N5",600));

		
		boolean b= students.stream().anyMatch(s -> s.getMarks() < 500);		
		
		
		 System.out.println(b);
			
		
	}
	
}
