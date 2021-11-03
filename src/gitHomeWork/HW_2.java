package gitHomeWork;

public class HW_2 {

	public static void main(String[] args) {
		//Create an array of animals and store 6 elements into it. Using 2 different loops print all elements from the array.

		// First

		
				String[] animals= {"Dog","Cat","Tiger","Lion","Wolf","Fox"};
				for(int i=0; i<animals.length; i++) {
				System.out.print(animals[i]+" / ");
				}
				System.out.println();
				System.out.println("********************************************************************");
				
				// Second
				
				for(String x :animals ) {
					System.out.print(x+" : ");
				}


	}

}
