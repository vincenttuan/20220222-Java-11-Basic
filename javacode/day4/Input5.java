package day4;
import java.util.Scanner;
public class Input5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入身分證字號:");
		String id = sc.next();
		// 取得字串 id 的長度
		int length = id.length();
		System.out.printf("id length = %d\n", length);

		// 取得第二碼
		char sex = id.charAt(1);
		System.out.printf("sex = %c\n", sex);

		// 取得第三碼
		char area = id.charAt(2);
		System.out.printf("area = %c\n", area);

	}
}
