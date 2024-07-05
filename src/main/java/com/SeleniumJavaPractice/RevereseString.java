package com.SeleniumJavaPractice;

public class RevereseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
        String reversed = reverseString(str);
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversed);
    }
    
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
   
        

	}

}
