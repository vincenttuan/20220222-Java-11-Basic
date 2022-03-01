package day3;

public class BitExpression1 {
	public static void main(String[] args) {
		int slot = 0b10010;
		System.out.print(slot);
		System.out.print(" ==> ");
		System.out.println(Integer.toBinaryString(slot));
		int n = Integer.parseInt(args[0]);
		int park = (int)Math.pow(2, n);
		System.out.print(park);
		System.out.print(" ==> ");
		System.out.println(Integer.toBinaryString(park));
		int check = slot & park;
		if(check == 0) {
			System.out.println("Parking available");
			slot = slot + park;
			System.out.print(slot);
			System.out.print(" ==> ");
			System.out.println(Integer.toBinaryString(slot));
		} else {
			System.out.println("No Parking");
		}

	}
}