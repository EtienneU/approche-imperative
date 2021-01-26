package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		System.out.print("Elements >= 3 de array : [ ");
		int i = 0;
		while (i < array.length) {
			if (array[i] >= 3) { // inclue la valeur 3
				System.out.print(array[i] + " ");
			}
			i++;
		}
		System.out.println("]");
		
		System.out.print("Elements pairs de array : [ ");
		i = 0;
		while (i < array.length) {
			if (array[i] % 2 == 0) { // inclue les entiers négatifs
				System.out.print(array[i] + " ");
			}
			i++;
		}
		System.out.println("]");
		
		System.out.print("Elements dont l'index est pair : ");
		i = 0;
		while (i < array.length) {
			if (i % 2 == 0) { // inclue les entiers négatifs
				System.out.print(array[i] + "(i=" + i + ") ");
			}
			i++;
		}
		System.out.println("");
		
		System.out.print("Elements impairs de array : [ ");
		i = 0;
		while (i < array.length) {
			if (array[i] % 2 != 0) { // inclue les entiers négatifs
				System.out.print(array[i] + " ");
			}
			i++;
		}
		System.out.println("]");
	}
}
