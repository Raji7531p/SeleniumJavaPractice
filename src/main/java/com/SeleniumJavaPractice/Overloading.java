package com.SeleniumJavaPractice;

class Shape {
	

	double findArea(double r) {
		double a = 3.14 * r * r; // Assuming Pi as 3.14 for circle area calculation
		return a;
	}
	
	int findArea(int l, int b) {
		int a = l * b;
		return a;
	}
}


public class Overloading {

	public static void main(String[] args) {
		Shape s = new Shape();
	double circleArea =	s.findArea(4);
		System.out.println("Area of the Circle :" + circleArea);
		
		int rectangularArea = s.findArea(11,89);
		System.out.println("Area of the Rectangle :" + rectangularArea);
		 

	}

}
