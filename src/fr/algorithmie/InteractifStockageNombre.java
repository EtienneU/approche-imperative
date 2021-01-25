package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {


		String menu = 		"--------------  M E N U  ---------------\n"
				+         	"|                                      |\n"
				+         	"|  Choisir une option :                |\n"
				+         	"|                                      |\n"
				+ 			"|  1- Ajouter un nombre                |\n"
				+           "|  2- Afficher les nombres existants   |\n"
				+         	"|______________________________________|\n";
		
		System.out.println(menu);

		Scanner scanner = new Scanner(System.in);
		int choix = scanner.nextInt();
		// switch (1 ou 2, sinon recommencer à choisir 1 ou 2)
		
		
//		while (saisie != findMe) {
//			if (saisie > maxBound || saisie < minBound) {
//				System.out.println("/!\\ x se situe entre " + minBound + " et " + maxBound);
//			}
//			System.out.print("Essai n°" + round + " : ");
//			saisie = scanner.nextInt();
//			if (saisie < findMe) {
//				System.out.println("x est PLUS GRAND que " + saisie);
//				round++;
//			} else if (saisie > findMe) {
//				System.out.println("x est PLUS PETIT que " + saisie);
//				round++;
//			} else {
//				System.out.println("BRAVO, vous avez trouvé en " + round + " coup(s) ! x = " + findMe);
//			}
//		}
	}
}
