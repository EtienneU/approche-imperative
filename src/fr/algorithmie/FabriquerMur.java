package fr.algorithmie;

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
		boolean resultat = false;
		if (longueur > (5 * nbBig + nbSmall)) {
			System.out.println("C'est mort : je ne dispose pas d'assez de briques pour cette longueur");
		} else {
			// je récupère la quantité de Big dont j'ai besoin
			int qBig = longueur / 5; // quotient (division euclidienne)
			int reste = longueur - (5 * qBig);
			if (qBig <= nbBig) {
				System.out.println("reste = " + reste + " Small briques à récupérer."
						+ " Mon stock : " + nbSmall + " Small briques.");
				if (reste == 0 || nbSmall >= reste) {
					resultat = true;
					System.out.println("Nickel, il est possible de construire le mur.");
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
