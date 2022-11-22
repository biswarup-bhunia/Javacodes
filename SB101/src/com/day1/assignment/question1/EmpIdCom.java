package com.day1.assignment.question1;

import java.util.Comparator;

public class EmpIdCom implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {

		return o1.getEmpId() > o2.getEmpId() ? 1 : -1;
	}

}
