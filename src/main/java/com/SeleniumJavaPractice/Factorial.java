package com.SeleniumJavaPractice;

//Factorial of a number:

public class Factorial {
	public static int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
			
		}
        return n*factorial(n-1);
	}

	public static void main(String[] arg) {
		int number = 8;
		int fact = factorial(number);
		
		System.out.println("Factorial of " + number + " is : " + fact);
	}
	
	
}
