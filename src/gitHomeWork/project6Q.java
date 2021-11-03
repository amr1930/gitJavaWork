package gitHomeWork;

public class project6Q {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable?

		int x=20;
		int y=30;
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("The values of  x after swaping is: "+x);
		System.out.println("The values of  y after swaping is: "+y);
		
		System.out.println("---------------------------------------------");
		// Another way
		x=10;
		y=20;
		
		x=x*y;
		y=x/y;
		x=x/y;
		
		System.out.println("The values of  x after swaping is: "+x);
		System.out.println("The values of  y after swaping is: "+y);
		
	}

}
