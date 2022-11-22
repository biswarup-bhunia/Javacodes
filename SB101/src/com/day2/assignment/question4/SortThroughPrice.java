package com.day2.assignment.question4;

import java.util.Comparator;

public class SortThroughPrice implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getPrice()>o2.getPrice() ? 1 : -1;
	}

}
