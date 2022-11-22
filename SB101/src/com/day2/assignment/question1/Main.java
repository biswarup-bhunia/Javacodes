package com.day2.assignment.question1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	

	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Kolkata","Mumbai",
				"Delhi","Hydrabad","Bangalore");
		//Normal way
		Collections.sort(cities);
		Collections.reverse(cities);
		System.out.println(cities); 
		
		//Lamda Function way
		cities.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s)); //
		
	}
}
