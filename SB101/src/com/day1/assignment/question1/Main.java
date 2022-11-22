package com.day1.assignment.question1;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	
	public static void main(String[] args) {
		
		TreeSet<Employee> employees = null;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Chooise between 1,2,3 ");
		
		int chs = sc.nextInt();
		
		if(chs == 1) {
			
			employees = new TreeSet<>(new EmpIdCom()); 
			
			
		}
		else if(chs == 2) {
			employees = new TreeSet<>(new ComBYAdd());
		}

		else if(chs == 3) {
			employees = new TreeSet<>(new SortBySalary());
		}
	

		employees.add(new Employee(1, "Biswarup", "West Bengal", 24000));
		employees.add(new Employee(2, "Arup", "Bengal", 254000));
		employees.add(new Employee(3, "Birup", "Kolkata", 41000));
		employees.add(new Employee(4, "Swarup", "Chennai", 84000));
		employees.add(new Employee(5, "Iswarup", "Rajasathan", 44000));
		employees.add(new Employee(6, "Rup", "Jharkhand", 24000));
		
		for(Employee emlp : employees) {
			System.out.println(emlp);
		}
		
		sc.close();
		
	}
}
