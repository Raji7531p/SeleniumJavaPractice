package com.SeleniumJavaPractice;

import dev.failsafe.internal.util.Maths;

// Check if a number is prime:

public class CheckPrimeNumber {
	public static boolean isPrime(int Num) {
		if(Num<=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(Num); i++) {
			if(Num % i == 0) {
				return false;
			}
			
			
		}
		
		return true;
		
		
	}
	
	


	public static void main(String[] args) {
		int number = 31;
		System.out.println(number + " is Prime? " + isPrime(number));
		
		
	}

}
