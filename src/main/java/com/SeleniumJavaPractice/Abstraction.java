package com.SeleniumJavaPractice;


abstract class Truck {
	void start() {
		System.out.println("Starting");
	}
	
	abstract void getNoWheels();
}

class Carld extends Truck {
	void getNoWheels() {
		System.out.println("No of Wheels is 4");
	}
}

public class Abstraction {
	public static void main(String[] arg) {

	Carld c = new Carld();
	
		c.getNoWheels();
		c.start();
	}
}


