package gitHomeWork;

public class project5Q {

	public static void main(String[] args) {
		// Create an array of countries. While retrieving all values from an array print capital for each country. (use 2 different loops).


		String[][] countries= {
				{"Iraq   ","   UAE      ","USA      ","   England","Afghanistan"},
				{"Baghdad","Abu Dhabi","Washington, DC"," London"," Kabul"}
		};
		// Enhanced loop
		
		for(String[] country:countries) {
			for(String x:country) {
				System.out.print(x+"  ");
			}
			System.out.println();
		}
		
		// Regular loop
		
		for(int i=0; i<countries.length; i++) {
			for(int j=0; j<countries[i].length; j++) {
				System.out.print(countries[i][j]+"  ");
			}
			System.out.println();
		}
		
	}

}
