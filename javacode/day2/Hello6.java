package day2;

public class Hello6 {
	public static void main(String[] args) {
		int r = 59;
		final double pi = 3.14;
		double area = r * r * pi;
		System.out.printf("area = %,.1f\n", area);
		double volume = 4/3.0 * pi * r * r * r;
		System.out.printf("volume = %,.1f\n", volume);
		//--------------------------------------------
		double area2 = Math.pow(r, 2) * Math.PI;
		double volume2 = 4/3.0 * Math.PI * Math.pow(r, 3);
		System.out.printf("area2 = %,.1f\n", area2);
		System.out.printf("volume2 = %,.1f\n", volume2);
		System.out.println(Math.PI);
		System.out.println(4/3);
		System.out.println(4/3.0);
		System.out.println(4.0/3);
		System.out.println(4.0/3.0);
		System.out.println(1/2);
		System.out.println(1/2.0);
	}
}