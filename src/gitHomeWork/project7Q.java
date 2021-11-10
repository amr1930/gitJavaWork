package gitHomeWork;

import java.util.Scanner;

public class project7Q {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?

		Scanner input=new Scanner(System.in);
		System.out.println(" Enter your number");
		
		boolean isPrime=true;
		int x =input.nextInt();
		if(x>1) {
		for(int i=2; i<x; i++) {
			if(x%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(x+" is a prime number");
		}else {
			System.out.println(x+" is not a prime number");
		}
		}
	}

}
