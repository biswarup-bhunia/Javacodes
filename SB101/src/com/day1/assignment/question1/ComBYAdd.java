package com.day1.assignment.question1;

import java.util.Comparator;

public class ComBYAdd implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getAddress().compareTo(o2.getAddress());
	}

	
	
}
