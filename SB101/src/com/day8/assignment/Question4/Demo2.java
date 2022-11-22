package com.day8.assignment.Question4;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class Demo2 {

	
	public static void main(String[] args) throws Exception {
		
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("studentData.txt"));
		
		List<Student> std = (List<Student>)ois.readObject();
		
		std.forEach(System.out::println);
		
	}
}
