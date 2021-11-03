package gitHomeWork;

public class HW_1 {

	public static void main(String[] args) {
		// Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
		// First

		
		String[] cars= {"Lexus","RangeRover","Audi","BMW","Lamborghini","Mercedes"};
		for(int i=0; i<cars.length; i++) {
		System.out.print(cars[i]+" / ");
		}
		System.out.println();
		System.out.println("********************************************************************");
		// Second
		
		for(String x : cars) {
			System.out.print(x+" : ");
		}
		
	}

}
