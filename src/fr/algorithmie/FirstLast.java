package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {

		int[] array = new int[] { -4, 5, 6, 6, 23, -3, -4 };

		boolean firstLast = false; // valeur par défaut

		if (array.length >= 1 && (array[0] == array[array.length - 1])) {
			firstLast = true;
		}
		
		System.out.println("FirstLast = " + firstLast);
	}
}
