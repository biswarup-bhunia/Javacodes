package com.day4;

import com.day3.assignment.question2.Student;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class FilterMethod {
	public static void main(String[] args) {
		

		List<Student> students= new ArrayList<>();
		
		
		students.add(new Student(10, "N1",500));
		students.add(new Student(12, "N2",400));
		students.add(new Student(13, "N3",420));
		students.add(new Student(14, "N4",440));
		students.add(new Student(15, "N5",600));
		students.add(new Student(16, "N6",380));
		
		
		//from the above list get another list of students whose marks is less than 500.
		
//		Stream<Student> str1= students.stream();
//		
//		
//		Stream<Student> str2= str1.filter(s -> s.getMarks() < 500);
//		
//		str2.forEach(s -> System.out.println(s));
		
		students.stream()
				.filter(s -> s.getMarks() < 500)
				.forEach(s -> System.out.println(s));
		
			
	}
}
