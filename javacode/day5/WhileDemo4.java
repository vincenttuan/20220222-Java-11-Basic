package day5;

public class WhileDemo4 {
	public static void main(String[] args) {
		// run 3 times
		int m = 3;	
		while(m > 0) {
			// print 5 stars ---------
			int n = 5;
			while(n > 0) {
				System.out.print("*");
				n--;
			}
			//------------------------
			System.out.println();
			m--;
		}
	}
}