package com.day4;

import com.day3.assignment.question2.Student;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class MapMethod {
	
	public static void main(String[] args) {
	
	List<Student> students = Arrays.asList(
			
			new Student(10, "N1",500),
			new Student(20, "N5",600),
			new Student(30, "N4",400),
			new Student(40, "N3",300),
			new Student(50, "N2",700)
			
			
			
			
			
			);
			
	
	// from the above list give the 50 grace marks to all the students
	//and get the another list of updated students.
	
	
	//Stream<Student> str1= students.stream();
	
//	Stream<Student> str2= str1.map(s -> {
//		
//					Student s2 = new Student(s.getRoll(), s.getName(), s.getMarks()+50);
//					return s2;
//		
//	});
	
	
	//Stream<Student> str2= str1.map(s -> new Student(s.getRoll(), s.getName(), s.getMarks()+50));
	
	
	//List<Student> modifiedStudents= str2.collect(Collectors.toList());
	
//	
//	List<Student> modifiedStudents= students
//										.stream()
//										.map(s -> new Student(s.getRoll(), s.getName(), s.getMarks()+50))
//										.collect(Collectors.toList());
//	
	
	
	
List<Student> modifiedStudents= students
										.stream()
										.filter(s -> s.getMarks() < 500)
										.map(s -> new Student(s.getRoll(),s.getName(),s.getMarks()+50))
										.collect(Collectors.toList());	
										
	
modifiedStudents.forEach(s -> System.out.println(s));	
			
}
}
