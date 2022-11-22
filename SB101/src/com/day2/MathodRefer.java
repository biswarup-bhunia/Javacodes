package com.day2;

public class MathodRefer {

	public static void fun1(String s, int i) {
		System.out.println(s+i);
	}
	
	
	public static void main(String[] args) {
		Intr i1 =  MathodRefer::fun1;
		
		i1.sayHello("Bisarup", 20);
	}
	
	
	
}
