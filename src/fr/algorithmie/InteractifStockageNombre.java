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
		
		int[] array = new int[3];
		int index = 0;
		
		while (choix != 0) {
					
			// gestion de l'agrandissement du tableau s'il est complet
			if (index >= array.length - 1) {
				int[] array_temp = new int[array.length + 3]; 
				for (int i = 0; i < array.length; i++) {
					array_temp[i] = array[i];
				}
				array = array_temp; // je passe la référence de mon tableau temporaire à ma variable array
			}
			
			// gestion des actions en fonction du choix saisi
			//  Le programme demande un nombre à l'utilisateur puis l'ajoute à un tableau.
			if (choix == 1) {
				System.out.print("Saisir un nombre entier à stocker : ");
				int nb = scanner.nextInt();
				array[index++] = nb; 
				// j'incrémente l'index du dernier ajout --> contrôle sur l'agrandissement du tableau 
				System.out.println("Choisir une action (1 ou 2) : ");
			} else if (choix == 2) {
				// le programme affiche les nombres stockés
				System.out.print("Votre tableau d'entiers : ");
				for (int i = 0; i < index; i++) { // si j'affiche plus loin que index, je vois les 0 par défaut
					if (i == index - 1) {
						System.out.println(array[i] + ".");
					} else {
						System.out.print(array[i] + ", ");
					}
				}
				System.out.println("Choisir une action (1 ou 2) : ");
			} else {
				String sortie = 	"................  FIN  ......................\n"
						+         	"|                                           |\n"
						+         	"|  Quitter le programme ?                   |\n"
						+         	"|                                           |\n"
						+ 			"|  0- Oui, quitter                          |\n"
						+           "|  1- Non --> Ajouter un nombre             |\n"
						+           "|  2- Non --> Afficher les nombres stockés  |\n"
						+         	"|...........................................|\n";
				
				System.out.println(sortie);
			}
			choix = scanner.nextInt();
		}
		System.out.println("*** Fin. Merci, au revoir. ***");
	}
}
