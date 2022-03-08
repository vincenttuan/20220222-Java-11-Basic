package day5;

public class WhileDemo5 {

	public static void main(String[] args) {
		
		int m = 1;
		while(m <= 5) {
			int n = m;
			while(n > 0) {
				System.out.print("*");	
				n--;
			}
			System.out.println();
			m++;
		}


	}

}