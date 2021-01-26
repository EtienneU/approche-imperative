package fr.algorithmie;

public class ComparaisonTableau {

	public static void main(String[] args) {
		
		int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
		
		int[] bigTab = array1;
		int[] smallTab = array2;
		if (array1.length < array2.length) {
			bigTab = array2;
			smallTab = array1;
		}
		
		int count = 0; // nombre d'éléments en commun dans mes deux tableaux
		
		for (int i = 0; i < bigTab.length; i++) {
			for (int j = 0; j < smallTab.length; j++) {
				if (bigTab[i] == smallTab[j]) {
					count++;
				}
			}
		}
		if (count <= 1) {
			System.out.println("Les 2 tableaux présentent " + count + " élement commun.");
		} else {
			System.out.println("Les 2 tableaux présentent " + count + " élements communs.");
		}
	}
}
