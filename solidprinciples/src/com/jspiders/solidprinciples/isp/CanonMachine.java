package com.jspiders.solidprinciples.isp;

public class CanonMachine 
				implements ScanMachine, PrintMachine {

	@Override
	public void scan() {
		System.out.println("Scanning by.....CanonMachine");

	}

	@Override
	public void print() {
		System.out.println("Printing by.....CanonMachine");

	}
}
