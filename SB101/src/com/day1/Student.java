package com.day1;

import java.util.Objects;

public class Student implements Comparable<Student>{
	private int roll;
	private int marks;
	private String name;
	
	
	public Student() {
		super();
	}


	public Student(int roll, int marks, String name) {
		super();
		this.roll = roll;
		this.marks = marks;
		this.name = name;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", marks=" + marks + ", name=" + name + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(marks, name, roll);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return marks == other.marks && Objects.equals(name, other.name) && roll == other.roll;
	}


	@Override
	public int compareTo(Student o) {
		
		if(this.marks > o.marks) return 1;
		else if(this.marks < o.marks) return -1;
		else return 0;
		
		
	}
	
	
	
	
	
}
