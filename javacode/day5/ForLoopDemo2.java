package day5;

public class ForLoopDemo2 {
	public static void main(String[] args) {
		
		outerloop:
		for(int i=1;i<=10;i++) {
			innerloop:
			for(int k=1;k<=10;k++) {
				if(k == 5) {
					break; // break innerloop;
				}
				if(i == 8) {
					break outerloop;
				}
				System.out.printf("i=%d k=%d\n", i, k);
			}

		}

	}
}