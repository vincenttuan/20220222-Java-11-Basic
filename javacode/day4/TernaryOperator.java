package day4;

public class TernaryOperator {
	public static void main(String[] args) {
		int score = 85;
		String result = (score >= 60) ? "Pass" : "Fail";
		System.out.printf("score: %d result: %s\n", score, result);

		double bmi = 14.5; // 25.5 or 22.1 or 14.5
		// range -> (18 < bmi <= 23)
		// bmi: 25.5 message: Fat
		// bmi: 22.1 message: OK 
		// bmi: 14.5 message: Thin
		// only use ?: (TernaryOperator)
		String message = (bmi > 23) ? "Fat" : (bmi <= 18) ? "Thin" : "OK" ;
		System.out.printf("bmi: %.1f message: %s\n", bmi, message);		
	}
}