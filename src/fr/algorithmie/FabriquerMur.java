package fr.algorithmie;
/**
 * Créer une méthode fabriquerMur() qui prend trois paramètres : le nombre de briques de longueur 1,
 * le nombre de briques de longueur 5, et la longueur exigée. la méthode retourne un booléen : vrai ou faux
 * selon la possibilité ou non de fabriquer un mur de cette longueur exigée avec le nbr de briques passés en paramètres
 *
 * Exemples :
 * -----> Si j’ai 2 briques de longueur 1 et 2 briques de longueur 5, est-il possible de créer un mur de 11m ?
 * Oui car il suffit de prendre 2 briques de 5 et une brique de 1.
 * -----> Si j’ai 3 briques de longueur 1 et 1 brique de longueur 5, est-il possible de créer mur de 9m ? Non.
 *
 * L’exécution des méthodes verifier() permettent de dire si oui ou non l'algorithme fonctionne.*/
public class FabriquerMur {

	public static void main(String[] args) {

		// Tests de vérification
		verifier(3, 1, 8, true);
		verifier(3, 1, 9, false);
		verifier(3, 2, 10, true);
		verifier(3, 2, 8, true);
		verifier(3, 2, 9, false);
		verifier(6, 1, 11, true);
		verifier(6, 0, 11, false);
		verifier(1, 4, 11, true);
		verifier(0, 3, 10, true);
		verifier(1, 4, 12, false);
		verifier(3, 1, 7, true);
		verifier(1, 1, 7, false);
		verifier(7, 0, 6, true);
		verifier(7, 0, 7, true);
	}

	static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
		System.out.println("Construire un mur de longueur " + longueur + "");
		boolean resultat = false;
		if (longueur > (5 * nbBig + nbSmall)) {
			System.out.println("C'est mort : je ne dispose pas d'assez de briques pour cette longueur");
		} else {
			// je récupère la quantité de Big dont j'ai besoin
			int qBig = longueur / 5; // quotient (division euclidienne)
			int reste = longueur % 5;
			if (qBig <= nbBig) {
				System.out.println("reste = " + reste + " Small briques à récupérer."
						+ " Mon stock : " + nbSmall + " Small briques.");
				if (reste == 0 || nbSmall >= reste) {
					resultat = true;
					System.out.println("Nickel, il est possible de construire le mur.\n");
				}
			} else { // si j'ai moins de Big briques que ce que j'aimerais
				reste = longueur - (5 * nbBig);
				System.out.println("reste = " + reste);
				if (reste == 0 || nbSmall >= reste) {
					resultat = true;
					System.out.println("C'est ok, je peux construire le mur.");
				}
			}
		}
		return resultat;
	}

	private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
		if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
			System.err.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") NON passant.");
		}
	}
}
