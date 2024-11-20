package lops;

public class ForEachLoop {

	public static void main(String[] args) {
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for(String i : cars) {
			System.out.println(i);
		}
		
		String[] names = {"Sansão", "Narete", "Sana", "Sandro", "Neth"};
		
		for(String name : names) {
			System.out.println("\n" + name);
		}

	}

}
