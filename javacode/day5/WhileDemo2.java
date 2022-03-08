package day5;
import java.util.Random;

public class WhileDemo2 {
	public static void main(String[] args) {
		Random random = new Random();

		while(true) {
			// get random score
			int score = random.nextInt(101); // 0~100

			if(score == 0) {
				break;
			} else if(score < 60) {
				continue;
			}

			// print score
			System.out.println(score);
		}
	}
}