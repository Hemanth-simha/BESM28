package com.jspiders.solidprinciples.ocp;

public class Mainclass {

	public static void main(String[] args) {
		
		Customer customer = new VehicleLoanCustomer();
		
		double discount = DiscountCaculator.caculate(customer);
		
		System.out.println(discount);
		
	}

}
