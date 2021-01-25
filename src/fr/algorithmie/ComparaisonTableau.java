package fr.algorithmie;

public class ComparaisonTableau {

	public static void main(String[] args) {
		
		int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
		
		// r�cuperation des deux longueurs de tableau
//		int maxLength = (array1.length > array2.length) ? array1.length : array2.length;
//		int minLength = (array1.length > array2.length) ? array2.length : array1.length;
		
		int[] bigTab = array1;
		int[] smallTab = array2;
		if (array1.length < array2.length) {
			bigTab = array2;
			smallTab = array1;
		}
		
		int count = 0; // nombre d'�l�ments en commun dans mes deux tableaux
		
		for (int i = 0; i < bigTab.length; i++) {
			for (int j = 0; j < smallTab.length; j++) {
				if (bigTab[i] == smallTab[j]) {
					count++;
				}
			}
		}
		
		System.out.println("Nombre d'�l�ments communs � mes 2 tableaux : " + count);
	}
}
