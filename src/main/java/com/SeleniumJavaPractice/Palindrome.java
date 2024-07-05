package com.SeleniumJavaPractice;

//Check if a String is a Palindrome:

public class Palindrome {
	public static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length()-1;
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
		left++;
		right--;
		
		}
		return true;
			
	}

	public static void main(String[] args) {
		String palindrome = "rotator";
		String notPalindrome = "It's New";
		System.out.println(palindrome + " is Palindrome " +  isPalindrome (palindrome));
		System.out.println(notPalindrome + " is Palindrome " +  isPalindrome (notPalindrome));

	}

}
