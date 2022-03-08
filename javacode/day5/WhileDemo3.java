package day5;
import java.util.Random;

public class WhileDemo3 {
	public static void main(String[] args) {
		Random random = new Random();
		int amount = 4;
		while(amount > 0) {
			int n = random.nextInt(10);
			System.out.printf("%d -> %d\n", amount, n);
			amount--;
		}
		/*
		int n1 = random.nextInt(10);
		int n2 = random.nextInt(10);
		int n3 = random.nextInt(10);

		System.out.print(n1);
		System.out.print(n2);
		System.out.print(n3);
		*/
	}
}