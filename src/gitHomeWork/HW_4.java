package gitHomeWork;

public class HW_4 {

	public static void main(String[] args) {
		// Create an array of integers and calculate the sum of all elements in an array
		int sum=0;
		
		int[] nums= {2,3,5,21,7,9};
		for(int i=0; i<nums.length; i++) {
			sum +=nums[i]; 
		}
		System.out.println(sum);
	}

}
