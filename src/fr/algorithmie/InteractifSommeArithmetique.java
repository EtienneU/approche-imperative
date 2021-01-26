package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int nb = -1;
		while (nb < 0) {
			System.out.print("Saisir un entier positif : ");
			nb = scanner.nextInt();
		}
		
		int somme = nb;
		for (int i = nb - 1; i > 0; i--) {
			somme += i;
		}
		
		System.out.println("Somme arithmetique de " + nb + " vaut " + somme + ".");
	}
}
