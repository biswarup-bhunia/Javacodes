package com.day3.assignment.question2;

import java.util.function.Supplier;

public class SupplierExmp {

	
public static int getANumber() {
		
		return 1000;
	}

public static void main(String[] args) {
	Supplier<Integer> s4 = SupplierExmp::getANumber;
	System.out.println(s4.get());
}
}
