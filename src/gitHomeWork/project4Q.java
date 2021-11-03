package gitHomeWork;

import java.util.Scanner;

public class project4Q {

	public static void main(String[] args) {
		// Create an array of double values using scanner and calculate the sum of all stored elements in that array

			

				Scanner scan=new Scanner(System.in);
				System.out.println("Please enter how many elements do you want to store inside array of double numbers");

				int size=scan.nextInt();

				double[] dnum=new double[size];

					for(int i=0; i<dnum.length; i++) {
					System.out.println("Please enter your double number");
					dnum[i]=scan.nextDouble();
				}
					double dSum=0;
					for(double num:dnum) {
						dSum=dSum+num;
					
				}

					System.out.print("The sum of all double numbers in array is: "+dSum+" ");
		
	}

}
