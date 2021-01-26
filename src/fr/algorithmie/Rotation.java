package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {

		int[] array = new int[] { -9, 45, 0, -54, 19, 6, 23, -74 };
		int[] rotatedArray = new int[array.length];

		rotatedArray[0] = array[array.length - 1];
		int i = 1;
		while (i < rotatedArray.length) {
			rotatedArray[i] = array[i - 1];
			i++;
		}

		// vérification par l'affichage :
		System.out.print("Tableau initial :      array = [");
		for (int j = 0; j < array.length; j++) {
			if (j == array.length - 1) {
				System.out.print(array[j] + "]");
			} else {
				System.out.print(array[j] + ", ");
			}
		}
		System.out.print("\nTableau final : rotatedArray = [");
		for (int j = 0; j < rotatedArray.length; j++) {
			if (j == rotatedArray.length - 1) {
				System.out.print(rotatedArray[j] + "]");
			} else {
				System.out.print(rotatedArray[j] + ", ");
			}		}
	}
}
