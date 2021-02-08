package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		int i = 0;
		System.out.print("Ordre normal  : array = [" );
		while (i < array.length) {
			if (i == array.length - 1) {
				System.out.println(array[i] + "]");
			} else {
				System.out.print(array[i] + ", ");
			}
			i++;
		}
		
		i = array.length - 1;
		System.out.print("\nOrdre inversé : array = [" );
		while (i >= 0) {
			if (i == 0) {
				System.out.println(array[i] + "]");
			} else {
				System.out.print(array[i] + ", ");
			}
			i--;
		}
		
		int[] arrayCopy = new int[array.length];
		for (i = 0; i < arrayCopy.length; i++) {
			arrayCopy[i] = array[i];
		}
		
		// vérification de la copie en affichant ses éléments: 
//		int j = 0;
//		System.out.print("\narrayCopy = [" );
//		while (j < arrayCopy.length) {
//			if (j == arrayCopy.length - 1) {
//				System.out.print(array[j] + "]");
//			} else {
//				System.out.print(array[j] + ", ");
//			}
//			j++;
//		}
	}
}
