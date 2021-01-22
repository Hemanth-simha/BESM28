package com.jspiders.solidprinciples.isp;

public class Mainclass {

	public static void main(String[] args) {

		HpMachine hp = new HpMachine();
		hp.scan();

		CanonMachine canon = new CanonMachine();
		canon.scan();
		canon.print();

		EpsonMachine epson = new EpsonMachine();
		epson.scan();
		epson.print();
		epson.fax();
	}

}
