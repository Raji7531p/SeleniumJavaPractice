package com.SeleniumJavaPractice;

//Reverse a String:

public class ReverseString {
	public static String reverse(String str) {
		StringBuilder s = new StringBuilder(str);
		return s.reverse().toString();
		
				}
	
	public static void main(String[] arg) {
		String original = "Need to be Change";
		String reverse = reverse(original);
		System.out.println("Original String: " + original);
		System.out.println("Reversed String: " + reverse);
	}
}
