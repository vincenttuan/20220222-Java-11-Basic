package day3;

public class Expression4 {
	public static void main(String[] args) {
		int x = 1;
		int y = 1;

		boolean check = x++ > --y;
		System.out.printf("check = %b\n", check);
		System.out.printf("x = %d\n", x);
		System.out.printf("y = %d\n", y);
	}
}