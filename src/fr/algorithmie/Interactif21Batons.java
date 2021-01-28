package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interactif21Batons {

	public static void main(String[] args) {
		
		// fixation des r�gles initiales
		short nb_depart = 21; // Nombre initla de b�tons
		short nb_max_retrait = 3; // Nombre max de b�tons que l'on peut retirer par tour
		short nb_rest = nb_depart;
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random(); // importe de la classe Random de java.util
		
		
		// premier joueur tir� al�atoirement
		boolean turn = rand.nextBoolean(); // je viens de voir que cette m�thode existe, c'est parfait !
				
		int my_remove = 0;	// retrait du joueur humain
		int pc_remove = 0;	// retraits du bot (pc)
		int n = 0;			// nombre de paquets de (nb_max_retrait + 1) b�tons (sans le b�ton final)
		
		System.out.println("\tJEU DES BATONS --> celui qui retire le dernier b�ton perd la partie \n");

		boolean game = true; // le jeu s'arr�te lorsque game = false
		
		while (game) {

			for (int i = 0; i < nb_rest; i++) {
				System.out.print(" | ");
			}
			System.out.println(" " + nb_rest + " b�tons demeurent \n");
			
			if (turn) { // mon tour
				
				System.out.print("Vous retirez combien de b�tons ? : ");
				my_remove = scanner.nextShort();
				while (my_remove <= 0 || my_remove > nb_max_retrait) {
					System.out.print("Vous devez retirer entre 1 et " + nb_max_retrait + " b�tons : ");
					my_remove = scanner.nextShort();
				}
				while (nb_rest - my_remove <= 0) {
					System.out.println("Actuellement, vous ne pouvez pas retirer plus de " + (nb_rest - 1) + " b�ton(s) : ");
					my_remove = scanner.nextShort();
				}
				nb_rest -= my_remove;
				turn = !turn;
				
			} else { // le tour tu PC
				
				n = (nb_rest - 1) / (nb_max_retrait + 1); // nombre de paquets de 4 b�tons (sans le b�ton final)
				// Si le PC joue le 1er tour
				if ((nb_rest - 1) % 4 == 0) {
					pc_remove = rand.nextInt((3 - 1) + 1) + 1;
				} else {
					pc_remove = (short) (nb_rest - 1 - 4 * n);
					if (nb_rest <= nb_max_retrait + 1) {
						pc_remove = nb_rest - 1; 
					}
					while (nb_rest - pc_remove <= 0) {
						pc_remove = nb_rest - 1 - 4 * n; // Pour que le pc gagne � coup s�r lorsqu'il est premier joueur
					}
				}
				if (pc_remove == 1) {
					System.out.println("Le PC vient de retirer " + pc_remove + " b�ton");
				} else {
					System.out.println("Le PC vient de retirer " + pc_remove + " b�tons");
				}
				nb_rest -= pc_remove;
				turn = !turn;
				
			}

			if (nb_rest <= 1) {
				System.out.print(" | Il n'en reste plus qu'un... FIN DU JEU --> ");
				game = false;
				if (!turn) {
					System.out.println("*** BRAVO, VOUS AVEZ GAGNE CONTRE LE PC ! ***");
				} else {
					System.out.println("Dommage, vous avez perdu contre le PC. Try again.");
				}
			}
		}	
	}
}
