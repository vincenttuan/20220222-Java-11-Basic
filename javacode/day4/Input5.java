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

		// if-else 判斷男女
		if(sex == '1') {
			System.out.println("男性");
		} else if(sex == '2') {
			System.out.println("女性");
		} else {
			System.out.println("性別錯誤");
		}

		// switch-case 判斷男女
		switch(sex) {
			case '1':
				System.out.println("男性");
				break;
			case '2':
				System.out.println("女性");
				break;
			default:
				System.out.println("性別錯誤");			
		}

		// switcg-case 判斷第三碼 area
		// 0~5  其他
		// 6    取得國籍之外國人
		// 7    無戶籍國民
		// 8    港澳居民
		// 9    大陸地區人民
		switch(area) {
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
				System.out.println("其他");
				break;
			case '6':
				System.out.println("取得國籍之外國人");
				break;	
			case '7':
				System.out.println("無戶籍國民");
				break;	
			case '8':
				System.out.println("港澳居民");
				break;	
			case '9':
				System.out.println("大陸地區人民");
				break;
			default:
				System.out.println("area 錯誤");	
		}

	}
}
