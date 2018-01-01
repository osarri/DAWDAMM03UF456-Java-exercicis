import java.util.Scanner;

/**
 * Classe principal que llegeix per l'entrada est�ndard i llen�a diverses
 * objectes excepcio de classes creades especificament per al seu control.
 * 
 * @author sergi grau
 * @version 1.0, 28.01.2010
 * 
 */
public class Excepcions {

	public static void main(String[] args) {
		boolean problema = false;
		do {
			problema = false;
			try {
				System.out.println(llegirEntrada());
			} catch (catch (ExcepcioCampDNIBuit |  ExcepcioNombreDigitsDNIIncorrecte | ExcepcioFormatDNIIncorrecte e)
) {
				problema = true;
				System.out.println(e.getMessage());
			} 
		} while (problema);

	}

	/**
	 * m�tode de classe que retorna la cadena llegida
	 * 
	 * @return
	 */
	public static String llegirEntrada() throws ExcepcioCampDNIBuit,
			ExcepcioNombreDigitsDNIIncorrecte, ExcepcioFormatDNIIncorrecte {
		Scanner entrada = new Scanner(System.in);

		String campDNI = entrada.nextLine();
		// si el camp �s buit
		if (campDNI.length() == 0) {
			throw new ExcepcioCampDNIBuit();
		}
		// comprova nombre de d�gits
		if (campDNI.length() != 8) {
			throw new ExcepcioNombreDigitsDNIIncorrecte();
		}
		// tradueix el dni a long i fa saltar la NumberFormatException
		long dni = Long.parseLong(campDNI);

		// comprova nombre de d�gits
		if (campDNI.length() != 8) {
			throw new ExcepcioNombreDigitsDNIIncorrecte();
		}
		// comprova si cont� zeros al davant
		if (dni < 10000000) {
			throw new ExcepcioFormatDNIIncorrecte();
		}

		return campDNI;
	}

}

/**
 * Classe que hereta de Exception i que representa una excepci� com a
 * consequencia d'un camp buit.
 * 
 * @author sergi grau
 * @version 1.0, 28.01.2010
 * 
 */
class ExcepcioCampDNIBuit extends Exception {
	String missatge = "Camp buit. Introdueix de nou un DNI";

	public String getMessage() {
		return missatge;
	}
}

/**
 * Classe que hereta de Exception i que representa una excepci� com a
 * consequencia de que el format del DNI no �s correcte
 * 
 * @author sergi grau
 * @version 1.0, 28.01.2010
 * 
 */
class ExcepcioFormatDNIIncorrecte extends Exception {
	String missatge = "DNI no v�lid, cont� zeros al davant";

	public String getMessage() {
		return missatge;
	}
}

/**
 * Classe que hereta de Exception i que representa una excepci� com a
 * consequencia de que el nombre de digits no �s correcte
 * 
 * @author sergi grau
 * @version 1.0, 28.01.2010
 * 
 */

class ExcepcioNombreDigitsDNIIncorrecte extends Exception {
	String missatge = "DNI no v�lid, nombre d�gits incorrecte";

	public String getMessage() {
		return missatge;
	}
}