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
	 * différents types
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("- Je ne suis pas un héro ! ");
		System.out.println("- Mais alors, qui êtes-vous ? ");
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
		System.out.println("Etat d'avancement du projet :\n9 tâches sur 10 sont terminées");
	}

}
