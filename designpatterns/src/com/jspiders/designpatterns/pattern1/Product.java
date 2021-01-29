package com.jspiders.designpatterns.pattern1;

public class Product {
	
	private static Product product = null;
	
	String name = "Smart Watch";
	double price = 1000.50;
	
	private Product()
	{
		System.out.println("Object Created.....");
	}
	
	public static Product getInstance()
	{
		if(product==null)
		{
			 product = new Product();	
		}
		return product;
	}
	
}
