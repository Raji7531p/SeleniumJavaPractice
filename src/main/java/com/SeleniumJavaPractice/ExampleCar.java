package com.SeleniumJavaPractice;

 class Car {
	 
 
	 public String color;
	 public int weight;
	 public int size;
	 
	 Car(String color,int weight, int siz){
		 
		 this.color = "color";
		 this.weight = weight;
		 this.size = size;
		 
		 System.out.println("Creating Car");
	 }
	 
	 Car(Car copy){
		 this.weight =copy.weight;
	 }
	
	public void startCar() {
		System.out.println("Start the Car");
		
	}
	
	public void stopCar() {
		System.out.println("Stop the Car");
		
	}
	
 }
	
	public class ExampleCar {
		
	
	public static void main(String[] args) {
	Car innovaCar = new Car("Orange",100,200); //Constructors
//			innovaCar.color = "Red";
//			innovaCar.weight = 1000;
//			innovaCar.size = 1000;
			
		System.out.println("innovaCar weight :" + innovaCar.weight);
			innovaCar.startCar();
			
			Car benZCar = new Car(innovaCar);
			System.out.println("benZCar weight :" + benZCar.weight);

	}
	}
	
	
	
	

