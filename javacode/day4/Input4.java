package day4;
import java.util.Scanner;

public class Input3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input score = ");
		int score = sc.nextInt();
		// 1.verify score between 0 ~ 100
		/*
		if(score < 0 || score > 100) {
			System.out.println("Error");
			return; // method end
		}
		*/
		if (!(score >= 0 && score <= 100)) {
			System.out.println("Error");
			return; // method end
		}

		// 2.get level
		if(score >= 90) {
			System.out.println("A");
		} else if(score >= 80 && score < 90) {
			System.out.println("B");
		} else if(score >= 70 && score < 80) {
			System.out.println("C");
		} else if(score >= 60 && score < 70) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}
	}

}