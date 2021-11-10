package com.syntax.C14HW;

public class HW_7_C14 {

	public static void main(String[] args) {
		// How would you swap  2 strings without a temporary variable?
		
		String a="Java";
		String b="Batch 11";
		System.out.println(a+" "+b);
		a=a+b;
		b=a.substring(0,(a.length()-b.length()));
		a=a.substring(b.length());
		System.out.println(a+" "+b);

		
	}

}
