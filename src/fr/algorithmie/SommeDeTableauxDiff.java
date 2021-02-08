package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {

		int[] array1 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] array2 = { -1, 12, 17, 14, 5, -9, 0, 18 };

		int[] bigTab = array1;
		int[] smallTab = array2;
		// petite méthode permettant de récupérer la référence du plus grand tab et
		// celle du plus court
		if (array1.length < array2.length) {
			bigTab = array2;
			smallTab = array1;
		}

		// déclaration de mon tableau final qui recevra les sommes de chaque élément de
		// tab1 et tab2
		int[] arraySom = new int[bigTab.length];

		for (int i = 0; i < arraySom.length; i++) {
			if (i <= smallTab.length - 1) {
				arraySom[i] = bigTab[i] + smallTab[i];
			} else {
				arraySom[i] = bigTab[i];
			}
		}

		// vérification par l'affichage :
		System.out.print("Somme des éléments de mes deux tableaux : [");
		for (int i = 0; i < arraySom.length; i++) {
			if (i == arraySom.length - 1) {
				System.out.println(arraySom[i] + "]");
			} else {
				System.out.print(arraySom[i] + ", ");
			}
		}
	}
}
