package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int nb = -1;
		while (nb < 1 || nb > 10) {
			System.out.print("Saisir un entier entre 1 et 10 pour afficher sa table de multiplication : ");
			nb = scanner.nextInt();
		}
		
		System.out.println("Table de " + nb + " : ");
		for (int i = 1; i <= 10 ; i++) {
			System.out.println(nb + " x " + i + " = " + nb * i);
		}
	}
}
