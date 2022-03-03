package day4;
import java.util.Scanner;

public class Input6 {
	public static void main(String[] args) {
		// input score and 
		// print level:
		// 90~100: A
		// 80~<90: B
		// 70~<80: C
		// 60~<70: D
		// 0~<60 : E
		// only use switch-case
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input score = ");
		int score = sc.nextInt();
		int level = score / 10;
		switch(level) {
			case 10:
			case 9:	
				System.out.println("A");
				break;
			case 8:	
				System.out.println("B");
				break;
			case 7:	
				System.out.println("C");
				break;
			case 6:	
				System.out.println("D");
				break;
			default:	
				System.out.println("E");
		}


	}
}