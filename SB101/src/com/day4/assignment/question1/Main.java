package com.day4.assignment.question1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.day2.assignment.question4.Product;

public class Main {

	public static void main(String[] args) {
		List<Product> products = Arrays.asList(
				
				new Product(1, "p1", 5, 10),
				new Product(5, "p5", 2, 40),
				new Product(4, "p4", 3, 50),
				new Product(3, "p6", 7, 30),
				new Product(2, "p3", 11, 20)
				
				);
		
	List<Product> filterProducts = products.stream().filter(s -> s.getQuantity()<10).collect(Collectors.toList());
	
	filterProducts.forEach(System.out :: println);
	
	
	
	
	
	
	}
	
	
	
	
}
