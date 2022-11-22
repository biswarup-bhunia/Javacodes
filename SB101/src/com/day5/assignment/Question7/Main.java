package com.day5.assignment.Question7;

public class Main {

	public static void main(String[] args) {
		
		Thread1 th = new Thread1();
		
		Thread tr = new Thread(th);
		
		tr.setName("Dhoni");
		
		tr.setPriority(8);
		
		
		
		Thread2 th2 = new Thread2();
		
		Thread tr2 = new Thread(th2);
		
		tr2.setName("Kohli");
		
		tr2.setPriority(10);
		
		
		tr.start();
		
		tr2.start();
	}
}
