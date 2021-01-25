package fr.algorithmie;

public class SommeDeTableaux {

	public static void main(String[] args) {
		int[] tab1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] tab2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
		int[] tabSom = new int[tab1.length];
		
		for (int i = 0; i < tabSom.length; i++) {
			tabSom[i] = tab1[i] + tab2[i];
		}
		
		// vérification par l'affichage : 
		System.out.print("Somme des éléments de mes deux tableaux : ");
		for (int i = 0; i < tabSom.length; i++) {
			System.out.print(tabSom[i] + " ");
		}
	}
}
