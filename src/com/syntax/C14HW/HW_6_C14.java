package com.syntax.C14HW;

public class HW_6_C14 {

	public static void main(String[] args) {
		// How would you check if String is palindrome or not?
		
		String str1="Civic";
		String str2="";
		
		for(int i=str1.length()-1; i>=0; i--) {
			str2+=str1.charAt(i);
			
		}
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
		


	}

}
