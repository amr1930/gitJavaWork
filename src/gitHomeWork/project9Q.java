package gitHomeWork;

public class project9Q {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?

		int[] anArray= {27,109,74,15,200,9};
		
		// assigning
		int max=anArray[0];
		int min=anArray[0];
		
		for (int i=1; i<anArray.length; i++) {
			if(max<anArray[i]) {
				max=anArray[i];
				
			}else if (min>anArray[i]) {
				min=anArray[i];
			}
		}
		System.out.println("The Maximum number is  "+max+" and the Minimum number is "+min);
	}

}
