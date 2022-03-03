package day4;
import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// calc bmi
		System.out.print("Please input height = ");
		double h = sc.nextDouble();
		System.out.print("Please input weight = ");
		double w = sc.nextDouble();
		double bmi = w / Math.pow(h/100, 2);
		System.out.printf("bmi = %.2f\n", bmi);
		// if - else
		if (bmi > 23) {
			System.out.print("Fat");
		} else if (bmi <= 18) {
			System.out.print("Thin");
		} else {
			System.out.print("OK");
		}

	}
}