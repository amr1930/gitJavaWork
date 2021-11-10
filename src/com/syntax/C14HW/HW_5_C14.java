package com.syntax.C14HW;

public class HW_5_C14 {

	public static void main(String[] args) {
		// How would you reverse a String word by word?

		String stra="Walking in the rain can be difficult";
		String strb="";
		String[] temp=stra.split(" ");
		for(int i=temp.length-1; i>=0; i--) {
			strb+=temp[i]+" ";
		}
		System.out.println(strb);
		
		
		
		
	}

}
