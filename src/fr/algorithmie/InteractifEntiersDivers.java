package fr.algorithmie;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Créer un programme qui invite l'utilisateur à saisir un entier relatif entre -10 et 10
 * Créer une méthode qui affiche les n entiers suivant l'entier saisi
 * Créer une méthode affichant la table de multiplication de l'entier saisi
 *
 * */
public class InteractifEntiersDivers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nb = Integer.MIN_VALUE;

        try {
            while (nb < -10 || nb > 10) {
                System.out.print("Saisir un entier relatif entre -10 et 10 pour afficher sa table de multiplication : ");
                nb = scanner.nextInt();
            }
            System.out.println("Vous avez saisi " + nb);
            chiffresSuivants(nb, 10);
            tableMultiplication(nb);
            sommeArithmetique(nb);
        } catch(InputMismatchException ime) {
            System.out.println("Mauvaise saisie. Un entier entre -10 et 10 était attendu...");
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void chiffresSuivants(int x, int n) {
        System.out.print("Les " + n + " entiers suivants " + x + " : ");
        for (int i = x + 1; i <= x + n; i++) {
            if (i == x + n) {
                System.out.println(i + ".");
            } else {
                System.out.print(i + ", ");
            }
        }
    }

    private static void tableMultiplication(int x) {
        System.out.println("Table de multiplication de " + x);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + x + " = " + i * x);
        }
    }

    private static void sommeArithmetique(int nb) {
        int somme = nb;
        for (int i = nb - 1; i > 0; i--) {
            somme += i;
        }
        System.out.println("Somme arithmetique de " + nb + " = " + somme);
    }
}
