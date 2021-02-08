package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Suite de Fibonacci - Choisir un rang n : ");
		int n = scanner.nextInt(); // n est mon rang
		
		// initialisation de mes variables
		float f_n_2 = 0f; // 1er  terme de la suite de Fibonacci (rang n = 0)
		float f_n_1 = 1f; // 2eme terme de la suite de Fibonacci (rang n = 1)
		float f_n = f_n_2 + f_n_1;	   // 3eme terme de la suite (rang n = 2)
		
		int i = 0; 
		while (i <= n - 2) { // Je décale de 2 car les 2 premiers rangs initialisaient mes variables
			if (n == 0) {
				f_n = 0;
			} else if (n == 1) {
				f_n = 1;
			} else {
				f_n = f_n_2 + f_n_1;
				f_n_2 = f_n_1;
				f_n_1 = f_n;
				i++;
			}
		}
		
		System.out.println("Nombre de rang " + n + " : " + f_n);
	}
}
