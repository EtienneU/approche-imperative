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
		System.out.println("- Je ne suis pas un h�ro ! \n- Mais alors, qui �tes-vous ? ");
		System.out.println("- Un mec lambda. Et vous ? \n- ...Un dev qui vous veut du bien =)\n");

		byte 	a = 53;
		short 	b = 213;
		int 	c = 1234;
		long 	d = 1234L;
		float 	e = 1234f;
		e *= 3.141592;
		e -= b * d; 	// e devient n�gatif
		double 	f = 1234e34;
		char 	g = '\\';
		boolean h = 666 > c;
		String 	i = "Qui est l� ? --> " + g + ". C'est Slash. Ses " + c 
				+ " clones sont r�partis dans ton code. C'est pas " + h + ".";
	
		System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
		System.out.println("e = " + e + ", f = " + f + ", g = " + g + ", h = " + h + ",\ni = \"" + i + "\"");
		System.out.println("\nEtat d'avancement du projet :\n9 t�ches sur 10 sont termin�es");
	}

}
