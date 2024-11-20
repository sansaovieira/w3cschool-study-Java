package get.start;

import java.util.Scanner;

public class Syntaxe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int age;
		double height;
		
		
		System.out.println("\nEnter with your name: ");
		name = scanner.nextLine();
		
		System.out.println("\nEnter with your age: ");
		age = scanner.nextInt();
		
		System.out.println("\nEnter with your height: ");
		height = scanner.nextDouble();
		
		System.out.println("\nHello, " + name + " welcome here! Your age is " + age + " and your height is " + height + " right?" );
		
		System.out.println("\nHello, world!");
		
		/* Print Text 
		  	We use println to print the line in our screen
		*/
		
		System.out.println("\nI am learning Java!");
		
		scanner.close();
		
	}

}
