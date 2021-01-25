package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		float som = 0;
		
		int i = 0;
		while (i<array.length) {
			som += array[i++];
		}
		
		float moy = som;
		moy /= array.length;
		System.out.println("Moyenne des éléments de array : " + moy);
	}

}
