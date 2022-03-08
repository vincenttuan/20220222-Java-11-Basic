package day5;

import java.util.Scanner;
import java.util.Random;

public class DoWhileDemo2 {
	public static void main(String[] args) {
		int ans = new Random().nextInt(99)+1;
		int min = 0;
		int max = 100;
		do {
			System.out.printf("使用者 %d ~ %d 之間猜一數字:", min, max);
			Scanner scanner = new Scanner(System.in);
			// 使用者猜
			int userGuess = scanner.nextInt();
			// 確認範圍是否合法
			if(userGuess <= min || userGuess >= max) {
				System.out.println("資料範圍不正確, 請重猜!");
				continue;
			}
			// 判斷使用者是否猜對 ?
			if(userGuess < ans) { // 若猜的比答案小
				min = userGuess;
			} else if(userGuess > ans) { // 若猜的比答案大
				max = userGuess;
			} else { // 答對(若猜的與答案相等)
				System.out.println("恭喜使用者答對了");
				break; // 離開迴圈(Game over)
			}
			//--------------------------------------------------
			// pc 猜
			System.out.printf("電腦 %d ~ %d 之間猜一數字:", min, max);
			Random random = new Random();
			int pcGuess = random.nextInt(max-min-1) + 1 + min;
			System.out.println(pcGuess);
			// 判斷pc是否猜對 ?
			if(pcGuess < ans) { // 若猜的比答案小
				min = pcGuess;
			} else if(pcGuess > ans) { // 若猜的比答案大
				max = pcGuess;
			} else { // 答對(若猜的與答案相等)
				System.out.println("恭喜電腦答對了");
				break; // 離開迴圈(Game over)
			}

		} while(true);


	}
}
