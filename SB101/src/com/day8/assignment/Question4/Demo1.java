package com.day8.assignment.Question4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		
		List<Student> students = Arrays.asList(
				
				new Student(1, "swarup", 24, new Address("West Benagl", "Kolkata", 700014)),
				new Student(2, "Biarup", 25, new Address("West Benagl", "Kolkata", 700094)),
				new Student(3, "swarup", 26, new Address("West Benagl", "Kolkata", 700054)),
				new Student(4, "iswarup", 27, new Address("West Benagl", "Kolkata", 700024)),
				new Student(5, "Bwarup", 28, new Address("West Benagl", "Kolkata", 700074))
				
				);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("studentData.txt"));
		
		oos.writeObject(students);
		
		System.out.println("Selaization Done");
		
		
		
	}
}
