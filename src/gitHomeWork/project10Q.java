package gitHomeWork;

public class project10Q {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?

		int[] ary= {41,15,40,43,33,88,77,100};
		int temp1=0;
		int secLarg=0;
		int larg=ary[0];
		
		for(int i=1; i<ary.length; i++) {
			temp1=ary[i];
			if (temp1>larg) {
				secLarg=larg;
				larg=temp1;
			}else if (temp1>secLarg) {
				secLarg=temp1;
			}
			
		}
		
		System.out.println("The second largest number is "+secLarg);
		
		
		
			
		
	}

}
