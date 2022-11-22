package com.day2;

public class FunctionProgramming {
	
	public static void main(String[] args) {
		//This is using external class
//		Intr i1 = new InterImpl();
//		i1.sayHello("Bisawrup");
//		
//		
//		//THis is the anonymous inner class
//		Intr i2 = new Intr() {
//			
//			@Override
//			public void sayHello(String s) {
//				// TODO Auto-generated method stub
//				System.out.println("Welcome "+s);
//			}
//		};
//		
//		i2.sayHello("Rup");
		
		
		//Lambda expression
		Intr i3 = (n,a) -> System.out.println("Lamda expression "+n+" Age is "+a);
		
		i3.sayHello("Biswarup ",20);
		
	}

}
