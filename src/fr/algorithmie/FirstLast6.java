package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {

		int[] array = new int[] { 6, 5, 6, 6, 23, -3, 4 };

		boolean firstLast6 = false; // valeur par défaut

		if (array.length >= 1 && (array[0] == 6 || array[array.length - 1] == 6)) {
			firstLast6 = true;
		}
		
		System.out.println("FirstLast6 = " + firstLast6);
	}
}
