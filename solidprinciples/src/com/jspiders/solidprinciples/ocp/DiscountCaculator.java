package com.jspiders.solidprinciples.ocp;

public class DiscountCaculator {

	static double discount = 20.0;
	
	public static double caculate(Customer customer)
	{
		if(customer.isCustomerLoyal())
		{
			discount = discount * 1.5;
		}
		return discount;
	}
	
}
