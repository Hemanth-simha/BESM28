package com.jspiders.solidprinciples.isp;

public class EpsonMachine
		implements ScanMachine, PrintMachine, FaxMachine {

	@Override
	public void scan() {
		System.out.println("Scanning by.....EpsonMachine");

	}

	@Override
	public void print() {
		System.out.println("Printing by......EpsonMachine");

	}

	@Override
	public void fax() {
		System.out.println("Faxing by.....EpsonMachine");

	}

}
