package com.day2;

@FunctionalInterface //This annotation tel l me that my fp is right or not.
public interface Intr {
	// A FP have only one abstract method.
	
//	public abstract void fun1();
//	public default void fun2() {
//		
//	};
//	public static void fun3() {
//		
//	};
	
	void sayHello(String s, int age);
	
	
	
	

}
