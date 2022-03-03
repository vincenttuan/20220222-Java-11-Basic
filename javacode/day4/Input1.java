package day4;
import java.util.Scanner;

public class Input1 {

	public static void main(String[] args) {
		System.out.print("Please input r = ");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double area = Math.pow(r ,2) * Math.PI;
		double volume = 4/3.0 * Math.pow(r ,3) * Math.PI;
		System.out.printf("area = %.1f volume = %.1f\n", area, volume);
	}

}
