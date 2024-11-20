package get.start;

public class TernaryOperatorShortHand {

	public static void main(String[] args) {
		// Instead of writing:

		int time = 20;
		if (time < 18) {
			System.out.println("Good day.");
		} else {
			System.out.println("Good evening.");
		}

		// You can simply write:
		int time2 = 20;
		String result = (time2 < 18) ? "\nGood day." : "\nGood evening.";
		System.out.println(result);
		
		int time3 = 20;
		String result2 = (time3 < 18) ? "Good day" : "Good evening";
		System.out.println(result2);
	}

}
