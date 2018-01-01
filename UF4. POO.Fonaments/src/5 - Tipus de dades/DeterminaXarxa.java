import java.util.*;

/**
 * Classe que calcula la informaci� m�s important d'una xarxa 
 * a partir de l'adre�a d'una m�quina i la m�scara de xarxa que t� associada.
 * @author sergi grau. etpc 2007
 *
 */
public class DeterminaXarxa {
	private static short[] bytesIP; 
	public static void main(String[] args){
		//descartem el byte que va de +- 2^7-1
		bytesIP= new short[4];
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("IP:");
		bytesIP= estreuBytesAdre�aIP(entrada.nextLine());
		System.out.println("classe " + classeXarxa(bytesIP[0]));
	}
	
	private static short[] estreuBytesAdre�aIP(String adre�aIP){
		short[] taula=new short[4];
		String[] cadena= adre�aIP.split("\\D"); //D expressi� reg per no digits"
		for(int i=0; i<4;i++){
			taula[i]=Short.parseShort(cadena[i]);
		}
		return taula;
	}
	
	private static String classeXarxa(short primerByte){
		if (primerByte<128){
			return "A";
		}
		else if (primerByte<192){
			return "B";
		}
		else{
			return "C";
		}
	}

}
