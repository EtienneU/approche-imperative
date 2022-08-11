package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interactif21Batons {

	public static void main(String[] args) {
		System.out.println("\n\tJEU DES BATONS --> 2 joueurs : le PC et vous. Celui qui retire LE DERNIER BATON perd la partie \n");

		// fixation des conditions initiales
		short nb_depart = 21;      // Nombre initial de bâtons
		short nb_max_retrait = 3;  // Nombre max de bâtons que l'on peut retirer par tour
		short nb_rest = nb_depart; // Nombre de bâtons restant au début de chaque tour
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		boolean turn = rand.nextBoolean();// premier joueur tiré aléatoirement : si turn vaut false alors c'est au tour du PC
		int my_remove = 0;	// retrait du joueur humain
		int pc_remove = 0;	// retraits du bot (pc)
		int n = 0;			// nombre de paquets de (nb_max_retrait + 1) bâtons (sans le bâton final)

		if (turn) {
			System.out.println("Vous commencez la partie.\n");
		} else {
			System.out.println("Le premier tour revient au PC.\n");
		}

		boolean game = true; // le jeu s'arrête lorsque game = false
		while (game) {

			for (int i = 0; i < nb_rest; i++) {
				System.out.print(" | ");
			}
			System.out.println(" " + nb_rest + " bâtons \n");
			
			if (turn) { // mon tour
				
				System.out.print("Votre tour. Combien de bâtons retirez-vous ? : ");
				my_remove = scanner.nextShort();
				while (my_remove <= 0 || my_remove > nb_max_retrait) {
					System.out.print("Vous devez retirer entre 1 et " + nb_max_retrait + " bâtons : ");
					my_remove = scanner.nextShort();
				}
				while (nb_rest - my_remove <= 0) {
					System.out.println("Actuellement, vous ne pouvez pas retirer plus de " + (nb_rest - 1) + " bâton(s) : ");
					my_remove = scanner.nextShort();
				}
				nb_rest -= my_remove;
				turn = !turn;
				
			} else { // le tour tu PC
				
				n = (nb_rest - 1) / (nb_max_retrait + 1); // nombre de paquets de 4 bâtons (sans le bâton final)
				// Si le PC joue le 1er tour
				if ((nb_rest - 1) % 4 == 0) {
					pc_remove = rand.nextInt((3 - 1) + 1) + 1;
				} else {
					pc_remove = (short) (nb_rest - 1 - 4 * n);
					if (nb_rest <= nb_max_retrait + 1) {
						pc_remove = nb_rest - 1; 
					}
					while (nb_rest - pc_remove <= 0) {
						pc_remove = nb_rest - 1 - 4 * n; // Pour que le pc gagne à coup sûr lorsqu'il est premier joueur
					}
				}
				if (pc_remove == 1) {
					System.out.println("Le PC vient de retirer " + pc_remove + " bâton");
				} else {
					System.out.println("Le PC vient de retirer " + pc_remove + " bâtons");
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
					System.out.println("GAME OVER...Dommage, vous avez perdu contre le PC. Try again !");
				}
			}
		}	
	}
}
