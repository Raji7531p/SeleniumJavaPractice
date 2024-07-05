package com.SeleniumJavaPractice;

class Vehicle {
	 int noWheels;
	 String mode;
	 
	 public void start() {
		 System.out.println("Starting the car");
	 }
	
	 public void stop() {
		 System.out.println("Stopping the car");
	 }
}

class Cars extends Vehicle {
	 int mileage;
	 
	 public void applyBrake() {
		 System.out.println("Applying Brake");
	 }
}

public class Inheritance {
	public static void main(String[] args) {
		Cars car1 = new Cars();
		car1.noWheels = 4;
		System.out.println("No of Wheels: " + car1.noWheels);
		car1.start();
		car1.applyBrake();
		car1.stop(); // Optional, if you want to demonstrate stopping the car as well
	}
}
