package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] saisies = new int[10];
		
		System.out.println("Saisir 10 entiers relatifs : ");
		
		// je choisis d'affecter la plus petite valeur de type int (MIN_VALUE statique de ma classe Integer)
		int max = Integer.MIN_VALUE;
		int i = 1;
		while (i <= 10) {
			System.out.print("saisie n°" + i + " : ");
			int nb = scanner.nextInt();
			saisies[i-1] = nb;
			if (nb > max) {
				max = nb;
			}
			i++;
		}

		System.out.print("Vos saisies en tableau : ");
		for (int j = 1; j < saisies.length ; j++) {
			System.out.print(saisies[j] + " ");
		}

		System.out.println("\nPlus grande valeur : " + max);
	}
}
