package com.day2.assignment.question3;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Kolkata","Mumbai",
				"Delhi","Hydrabad","Bangalore");
		
		PrintList showCity = city ->{
			
			for(String c : city) {
				System.out.println(c);
			}
		};
		
		showCity.display(cities);
		
	}
}
