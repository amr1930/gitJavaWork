package com.syntax.C14HW;

public class HW_2_C14 {

	public static void main(String[] args) {
		// Create a String that should be combination of letters, numbers and special characters.
		// Find out how many alpha characters are there in the String.

		String str="ABCDEFGfghijk1234567&*^%$!@#$%";
		
		String str1;
		str1=str.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(str1.length());
		
		
	}

}
