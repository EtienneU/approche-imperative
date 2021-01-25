package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int nb = -1;
		while (nb < 1 || nb > 10) {
			System.out.println("Saisir un entier entre 1 et 10 : ");
			nb = scanner.nextInt();
		}
		System.out.println("Très bien, votre saisie est " + nb);
	}
}
