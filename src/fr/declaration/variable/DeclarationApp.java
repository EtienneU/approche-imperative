/**
 * 
 */
package fr.declaration.variable;

/**
 * @author EtienneURBANO
 *
 */
public class DeclarationApp {

	/**
	 * Methode principale - test d'usage et d'affichage de mes variables de
	 * diff�rents types
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("- Je ne suis pas un h�ro ! ");
		System.out.println("- Mais alors, qui �tes-vous ? ");
		System.out.println("- Un mec lambda. Et vous ? \n- Un dev qui vous veut du bien =)");

		byte a = 16;
		short b = 213;
		int c = 1234;
		long d = 1234L;
		float e = 1234f;
		e *= 3.141592;
		e -= b * d;
		double f = 1234e34;
		char g = '\\';
		boolean h = 666 > c;
		String i = "Qui est-ce ? --> " + g;
		System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
		System.out.println("e = " + e + ", f = " + f + ", g = " + g + ", h = " + h + ", i = " + i);
		System.out.println("Etat d'avancement du projet :\n9 t�ches sur 10 sont termin�es");
	}

}
