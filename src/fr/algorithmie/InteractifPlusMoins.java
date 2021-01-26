package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Génération de l'entier aléatoire, compris entre minBound et maxBound :
		int minBound = 1;
		int maxBound = 100;
		Random rand = new Random(); // importe de la classe Random de java.util
		int findMe = rand.nextInt((maxBound - minBound) + 1) + minBound;

		System.out.println("TROUVER L'ENTIER MYSTERE x");

		// nombre de tours
		int round = 1;

		int saisie = Integer.MIN_VALUE;
		// début de la partie 
		while (saisie != findMe) {
			if (saisie > maxBound || saisie < minBound) {
				System.out.println("/!\\ x se situe entre " + minBound + " et " + maxBound);
			}
			System.out.print("Essai n°" + round + " : ");
			saisie = scanner.nextInt();
			if (saisie < findMe) {
				System.out.println("x est PLUS GRAND que " + saisie);
				round++;
			} else if (saisie > findMe) {
				System.out.println("x est PLUS PETIT que " + saisie);
				round++;
			} else {
				if (round == 1) {
					System.out.println("BRAVO, vous avez trouvé du premier coup ! x = " + findMe);
				} else {
					System.out.println("BRAVO, vous avez trouvé en " + round + " coups ! x = " + findMe);
				}
			}
		} // fin de la partie
	}
}
