package com.day6.assignment.Question3;

public class Main {

	/*
	 * Create two threads, one thread to display all even numbers between 1 & 20, another to
		display odd numbers
		between 1 & 20.
		Note: Display all even numbers followed by odd numbers from the main method.
		Hint: use join
	 * 
	 */
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
