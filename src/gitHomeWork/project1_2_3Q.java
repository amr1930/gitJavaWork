package gitHomeWork;

public class project1_2_3Q {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of all numbers.
		 
		

		int[][] inValues= {
				{12,5,9,28},
				{20,8,11,24}
		};
		int sum=0;
		for(int[] values:inValues) {
			for(int x:values) {
				sum=sum+x;
								
			}
			
		}
		System.out.println("The sum of integer values is: "+sum);
		
		System.out.println("----------------------------------------------------------");
		
		/* Create a 2D array or integer type where you will store odd and even numbers. 
		*  Develop a program which will identify/print the even numbers only.
		*/
		
		
		for(int[] num:inValues) {
			for(int x:num) {
				if (x%2==0) {
					System.out.println("The even number is: "+x);
				}
			}
		}
		
		System.out.println("----------------------------------------------------------");
		
		
		/* Create a 2D array of integers.
		 *  Develop a program which will calculate the sum of  even and odd numbers for that array.
		 */
		int eSum=0;
		int oSum=0;
		for(int[] num:inValues) {
			for(int x:num) {
				if (x%2==0) {
					eSum=eSum+x;
									
				}else {
					oSum=oSum+x;
				}
			}		
		}
		System.out.println("The sum of even numbers is: "+eSum);
		System.out.println("The sum of odd numbers is: "+oSum);
		
		System.out.println("----------------------------------------------------------");
		
		
	}

}
