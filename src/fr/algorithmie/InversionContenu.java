package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		int[] arrayCopy = new int[array.length];

		int i = 0;
		while (i < arrayCopy.length) {
			arrayCopy[i] = array[array.length - 1 - i];
			i++;
		}
		
		// Affichage des éléments de mes 2 tableaux :
		System.out.print("\narray     = [");
		for (int j = 0; j < array.length; j++) {
			if (j == array.length - 1) {
				System.out.print(array[j] + "]");
			} else {
				System.out.print(array[j] + ", ");
			}
		}
			

		System.out.print("\narrayCopy = [");
		for (int j = 0; j < arrayCopy.length; j++) {
			if (j == arrayCopy.length - 1) {
				System.out.print(arrayCopy[j] + "]");
			} else {
				System.out.print(arrayCopy[j] + ", ");
			}
		}
	}
}
