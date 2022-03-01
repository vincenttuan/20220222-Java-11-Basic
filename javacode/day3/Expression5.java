package day3;

public class Expression5 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		boolean check = a > 10 & ++b > 10;
		System.out.printf("check = %b\n", check);
		System.out.printf("a = %d\n", a);
		System.out.printf("b = %d\n", b);
	}

}
