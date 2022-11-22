package com.day3.assignment.question3;

import java.util.HashMap;
import java.util.Map;

import com.day3.assignment.question2.Student;

public class Main {
	
//	public Map<String, Student> sortMapUsingStudentName(Map<String, Student>
//	originalMap){
//		
//		originalMap.entrySet().stream().sorted((o1,o2)->o1.g)
//	}
	
	public static void main(String[] args) {
		Map<String, Student> studentDetailes = new HashMap<>();
		
		studentDetailes.put("Gopiballavpur", new Student(2, "Biswarup", 1204));
		studentDetailes.put("Ballavpur", new Student(3, "Warup", 1203));
		studentDetailes.put("Piballavpur", new Student(5, "Arup", 1202));
		studentDetailes.put("Opiballavpur", new Student(2, "Swarup", 1201));
		studentDetailes.put("Llavpur", new Student(8, "Iswarup", 1209));
		studentDetailes.put("Lavpur", new Student(3, "Rup", 1207));
		
		
		studentDetailes.forEach((k,v)-> System.out.println(k+"-----------"+v));
		
		
		
		
		
		
		
		
	}

	
}
