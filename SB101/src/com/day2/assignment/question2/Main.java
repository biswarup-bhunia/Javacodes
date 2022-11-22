package com.day2.assignment.question2;

public class Main {
	
	public static void main(String[] args) {
		
		String x = "200";
		//Normal Lambda Expression
		X num = s -> Integer.parseInt(s);
		
		
		//Method Reference
//		X num = Integer::parseInt;
		
		System.out.println(num.convetStringToNumber(x));
		
	}
}
