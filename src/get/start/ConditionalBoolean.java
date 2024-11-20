package get.start;

import java.util.Scanner;

public class ConditionalBoolean {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int age, votingAge = 18;
		
		System.out.println("Enter with your age");
		age = scanner.nextInt();
		
		if(age >= votingAge) {
			System.out.println("\nOld enough to vote!");
		} else {
			System.out.println("\nNot old enough to vote.");
		}
		
		scanner.close();

	}

}
