package fr.algorithmie;

public class RechercheMin {

	public static void main(String[] args) {
		
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		int min = array[0];
		int index_min = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] <= min) {
				min = array[i];
				index_min = i;
			}
		}
		System.out.println("Min de array = " + min + " (index = " + index_min + ")");
	}
}
