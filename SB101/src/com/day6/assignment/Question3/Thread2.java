package com.day6.assignment.Question3;

public class Thread2 implements Runnable{

	@Override
	public void run() {


		
		String name = Thread.currentThread().getName();
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(name);
		}
		
	}

}
