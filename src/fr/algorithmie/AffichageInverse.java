package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		int i = 0;
		System.out.print("Ordre normal  : array = " );
		while (i < array.length) {
			System.out.print(array[i++] + " ");
		}
		
		System.out.print("\nOrdre inversé : array = " );
		i = array.length-1;
		while (i >= 0) {
			System.out.print(array[i--] + " ");
		}
		
		int[] arrayCopy = new int[array.length];
		for (i = 0; i < arrayCopy.length; i++) {
			arrayCopy[i] = array[i];
		}
		// vérification en affichant les éléments de arrayCopy: 
//		System.out.print("\narrayCopy = " );
//		int j = 0;
//		while (j < arrayCopy.length) {
//			System.out.print(array[j++] + " ");
//		}
	}
}
