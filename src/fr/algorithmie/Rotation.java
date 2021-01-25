package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {

		int[] array = new int[] { -9, 45, 6, 23, -74 };
		int[] rotatedArray = new int[array.length];

		rotatedArray[0] = array[array.length - 1];
		int i = 1;
		while (i < rotatedArray.length) {
			rotatedArray[i] = array[i - 1];
			i++;
		}

		// v�rification par l'affichage :
		System.out.print("Tableau initial :      array = ");
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}
		System.out.print("\nTableau final : rotatedArray = ");
		for (int j = 0; j < rotatedArray.length; j++) {
			System.out.print(rotatedArray[j] + " ");
		}
	}
}