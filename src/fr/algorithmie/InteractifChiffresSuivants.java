package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisir un entier relatif (positif ou n�gatif): ");
		int nb = scanner.nextInt();

		for (int i = nb + 1; i <= nb + 10; i++) {
			if (i == nb + 10) {
				System.out.println(i + ".");
			} else {
				System.out.print(i + ", ");
			}
		}
	}
}