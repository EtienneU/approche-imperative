package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Suite de Fibonacci - Choisir un rang n : ");
		int n = scanner.nextInt(); // n est mon rang
		
		// initialisation de mes variables
		int f_n_2 = 0; // 1er  terme de la suite de Fibonacci (rang n = 0)
		int f_n_1 = 1; // 2eme terme de la suite de Fibonacci (rang n = 1)
		int f_n = f_n_2 + f_n_1; // 3eme terme de la suite (rang n = 2)
		
		int i = 2; // Je commence au rang 2 car les pr�c�dents rangs �taient d�ja effect�s � mes variables
		while (i <= n) {
			f_n = f_n_2 + f_n_1;
			f_n_2 = f_n_1;
			f_n_1 = f_n;
			i++;
		}
		
		if (n == 0) {
			f_n = 0;
		}
		else {
			System.out.println("Nombre de rang " + n + " : " + f_n);
		}
	}
}