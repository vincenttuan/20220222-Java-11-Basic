package day5;

public class ForLoopDemo1 {
	public static void main(String[] args) {
		// print 1~10 and sum
		int sum = 0;
		myloop:
		for(int i = 1;i<=10;i++) {
			sum += i; // sum = sum + i;
			System.out.printf("i=%d sum=%d\n", i, sum);
		}
	}
}