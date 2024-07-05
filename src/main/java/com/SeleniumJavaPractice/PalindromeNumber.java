package com.SeleniumJavaPractice;

//  Java program to check if a number is a palindrome:

public class PalindromeNumber {
	public static boolean isPalindrome(int Number) {
		int originalNumber = Number;
		int reversedNumber = 0;
		while(Number!=0) {
			int digit = Number%10;
			reversedNumber = reversedNumber*10 + digit;
			Number/= 10;
		}
		return originalNumber == reversedNumber;
		
		
	}

	public static void main(String[] args) {
		int palindromeNumber = 97679;
		int notPalindromeNumber = 9779;
		
		System.out.println(palindromeNumber + " is Palindrome " + isPalindrome (palindromeNumber));
		System.out.println(notPalindromeNumber + " is Palindrome " + isPalindrome (notPalindromeNumber));
		
	}
	
}
