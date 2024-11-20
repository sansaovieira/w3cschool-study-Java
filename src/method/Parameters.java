package method;

public class Parameters {

	static void myMethod(String fname) {
		System.out.println(fname + " Vieira");
	}

	// Multiples parameters:

	static void person(String name, int age, float weigth, float f) {
		System.out.println("\nMy name is: " + name + " I've " + age + " and my weight is " + weigth);
	}

	// Using if and else statements with method:

	static void checkAge(int age) {
		if(age < 18) {
			System.out.println("\nAccess denied - You are not old enough!");
		} else {
			System.out.println("\nAccess granted - You are old enough!");
		}
	}

	public static void main(String[] args) {
		myMethod("Sansão");
		myMethod("Domingos");
		myMethod("Adriano");

		person("Sansão", 26, 66, 6);
		
		checkAge(12);
		checkAge(19);
	}

}
