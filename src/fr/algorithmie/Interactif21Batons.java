package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interactif21Batons {

	public static void main(String[] args) {
		
		// fixation des règles initiales
		int nb_tot_batons = 21;
		int nb_max_retrait = 3;
		int nb_rest = nb_tot_batons; 
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random(); // importe de la classe Random de java.util

		System.out.println(" JEU DES BATONS ");
		
		// turn true = c'est au tour de l'utilisateur, sinon (turn false) c'est au PC de jouer
		// premier joueur désigné aléatoirement
		boolean turn = true; 
		int random_turn = rand.nextInt((2 - 1) + 1) + 1;
		if (random_turn == 2) {
			turn = false;
		}
		
		boolean game = true; // le jeu s'arrête lorsque game = false
		
		while (game) {

			System.out.println(	"...........................................\n"
					+         	"             " + nb_rest + " bâtons        \n"
					+         	"...........................................\n");
	
			int my_remove = 1;
			if (turn) { // mon tour
				System.out.print("Je retire 1, 2 ou 3 bâtons ? ");
				my_remove = scanner.nextInt();
				while (my_remove != 1 && my_remove != 2 && my_remove != 3) {
					System.out.print("Vous devez retirer 1, 2 ou 3 bâtons : ");
					my_remove = scanner.nextInt();
				}
				while (nb_rest - my_remove <= 0) {
					System.out.println("Actuellement, vous ne pouvez pas retirer plus de " + (nb_rest - 1) + " bâton(s) : ");
					my_remove = scanner.nextInt();
				}
				nb_rest -= my_remove;
				turn = !turn;
			} else { // le tour tu PC
//				int pc_remove = rand.nextInt((3 - 1) + 1) + 1;
				int pc_remove = 4 - my_remove;
				System.out.println(pc_remove);
				while (nb_rest - pc_remove <= 0) {
					System.out.println("Le PC ne peut pas retirer plus de " + (nb_rest - 1) + " bâton(s)");
//					pc_remove = rand.nextInt((3 - 1) + 1) + 1;
					pc_remove = 4 - my_remove;
				}
				System.out.println("Le PC vient de retirer " + pc_remove + " bâton(s)");
				nb_rest -= pc_remove;
				turn = !turn;
			}

			if (nb_rest <= 1) {
				System.out.print("FIN DU JEU --> ");
				game = !game;
				if (!turn) {
					System.out.println("*** BRAVO, vous avez gagné contre le PC ! ***");
				} else {
					System.out.println("Dommage, vous avez perdu contre le PC. Try again.");
				}
			}
		}	
	}
}
