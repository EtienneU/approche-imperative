package fr.algorithmie;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Uniquement à partir de tableaux, créer une méthode qui :
 * - prend un tableau d'entiers et un entier en paramètres et qui retourne le tableau composé des éléments supérieurs
 * 		(ou égaux) au 2eme paramètre
 * - renvoie un tableau composé des entiers pairs du tableau passé en paramètre
 * - renvoie le tableau passé en paramètre avec ses éléments dans l'ordre inverse
 * - prend un tableau d'entiers en paramètre et retourne la moyenne
 * - retourne le tableau composé des nombres premiers du tableau passé en paramètre
 * - retourne le tableau constitué des éléments communs à 2 tableaux (passés en paramètres)
 *
 * */
public class AffichagePartiel {

	public static void main(String[] args) {
		
		Integer[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4, 17};
		afficheTableau("Tableau initial :               ", array1);
		afficheTableau("Tab trié avec elements >= 4 :   ", filterTabSup(array1, 4));
		afficheTableau("Tab trié avec elements pairs :  ", filterTabPairs(array1));
		afficheTableau("Tab inversé :                   ", reverseTab(array1));
		System.out.println("Moyenne des valeurs = " + moyenne(array1));
		afficheTableau("Tab des nbres positifs premiers ", filterTabPremiers(array1));

		Integer[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
		afficheTableau("Tab des éléments communs à mes 2 tableaux : ", findElementsCommuns(array1, array2));
	}

	private static void afficheTableau(String messageInit, Object[] array) {
		int tailleTab = array.length;
		String res = "[ ";
		for (int i = 0; i < tailleTab - 1; i++) {
			res += array[i] + ", ";
		}
		res += array[tailleTab - 1] + " ]";
		System.out.println(messageInit.concat(res));
	}

	private static Integer[] filterTabSup(Integer[] array, int i) {
		int length = array.length;
		int[] filteredTab = new int[length];
		int j = 0;
		int count = 0;
		for (int idx = 0; idx < length; idx++) {
			if (array[idx] >= i) {
				count ++;
				filteredTab[j++] = array[idx];
			}
		}
		Integer[] filteredTabRes = new Integer[count];
		for (int k = 0; k < count; k++) {
			filteredTabRes[k] = filteredTab[k];
		}
		return filteredTabRes;
	}

	private static Integer[] filterTabPairs(Integer[] array) {
		int length = array.length;
		int count = 0;
		for (int element : array) {
			count += element % 2 == 0 ? 1 : 0;
		}
		Integer[] tabPairs = new Integer[count];
		int j = 0;
		for (int i = 0; i < length; i++) {
			if (array[i] % 2 == 0) {
				tabPairs[j++] = array[i];
			}
		}
		return tabPairs;
	}

	private static Integer[] reverseTab(Integer[] array) {
		int length = array.length;
		Integer[] res = new Integer[length];
		int i = length - 1;
		while (i >= 0) {
			res[length - i - 1]= array[i];
			i--;
		}
		return res;
	}

	private static float moyenne(Integer[] array) {
		int l = array.length;
		if (l == 0) {
			return 0;
		} else {
			float somme = 0;
			for(int elmt : array) {
				somme += elmt;
			}
			return somme / array.length;
		}
	}

	private static Integer[] filterTabPremiers(Integer[] array) {
		int length = array.length;
		int count = 0;
		int[] temp = new int[length];
		int i = 0;
		while (i < length) {
			int diviseur = array[i] - 1;
			boolean estPremier = true;
			while (diviseur > 1) {
				if (array[i] % diviseur == 0) {
					estPremier = false;
				}
				diviseur--;
			}
			if (estPremier && array[i] > 0) {
				temp[count] = array[i];
				count++;
			}
			i++;
		}
		Integer[] res = new Integer[count];
		for (int j = 0; j < count; j++) {
			res[j] = temp[j];
		}
		return res;
	}

	private static Object[] findElementsCommuns(Integer[] arr1, Integer[] arr2) {
		int l1 = arr1.length;
		int l2 = arr2.length;
		Integer[] bigTab = l1 > l2 ? arr1 : arr2;
		Integer[] smallTab = l1 < l2 ? arr1 : arr2;

		int count = 0; // Nombre d'éléments communs entre les 2 tableaux
		int[] arrayStock = new int[] {};

		for (int i = 0; i < bigTab.length; i++) {
			for (int j = 0; j < smallTab.length; j++) {
				if (bigTab[i] == smallTab[j]) {
					// processus d'agrandissement du tableau qui stocke les valeurs communes
					int[] arrayTemp = new int[count + 1];
					for (int k = 0; k < arrayStock.length; k++) {
						arrayTemp[k] = arrayStock[k];
					}
					arrayStock = arrayTemp;
					arrayStock[count] = smallTab[j];
					count++;
				}
			}
		}

		if (count == 0) {
			System.out.println("Les 2 tableaux ne présentent aucun élément commun.");
		} else if (count == 1) {
			System.out.println("Les 2 tableaux présentent " + count + " élement commun.");
		} else {
			System.out.println("Les 2 tableaux présentent " + count + " élements communs.");
		}

		Arrays.sort(arrayStock);
		// je triche, j'utilise un Set pour supprimer tous les doublons
		Set<Integer> set = new HashSet<Integer>();
		for (int n : arrayStock) {
			set.add(n);
		}
		return set.toArray();
	}
}
