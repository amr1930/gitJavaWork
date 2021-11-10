package com.syntax.C14HW;

public class HW_4_C14 {

	public static void main(String[] args) {
		// How would you reverse a String character by character?

		String a="I like programming";
		String b="";
		for(int i=a.length()-1; i>=0; i--) {
			b+=a.charAt(i);
			
		}
		System.out.println(b);
	}

}
