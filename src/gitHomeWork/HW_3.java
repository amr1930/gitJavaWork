package gitHomeWork;

public class HW_3 {

	public static void main(String[] args) {
		// Create an array to store double values and then print those in reverse order

		double[] dValue = {99.55,88.44,77.33,66.22,55.11};
		for(int i=dValue.length-1; i>=0; i--) {
			System.out.print(dValue[i]+"  ");
		}
	}

}
