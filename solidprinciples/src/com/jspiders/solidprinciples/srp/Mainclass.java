package com.jspiders.solidprinciples.srp;

public class Mainclass {

	public static void main(String[] args) {
		
		
		Employee emp = new Employee(101,"king",34000.70);
		
		new EmployeeInsert().insert();
		new EmployeeRead().read();
		new EmployeeUpdate().update();
		new EmployeeDelete().delete();
	}

}
