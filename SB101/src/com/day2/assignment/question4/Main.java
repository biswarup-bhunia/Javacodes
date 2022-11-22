package com.day2.assignment.question4;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {


		List<Product> products = Arrays.asList(
				
				new Product(15, "Sampoo", 5, 850),
				new Product(14, "Towel", 2, 1650),
				new Product(12, "Soap", 10, 250),
				new Product(11, "Chai", 10, 100),
				new Product(10, "Biscut", 20, 300)
				
				
				);

		products.stream().sorted(new SortThroughPrice()).forEach(s -> System.out.println(s));
	}

}
