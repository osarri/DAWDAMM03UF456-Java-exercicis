/**
 * Classe CalendarTest. Mostra un calendari del mes actual
 * prof. Sergi Grau. ETPC. DAI-2. basat en codi de Cay S. Horstmann, Gary Cornell
 */
import java.util.*;

public class CalendarTest {
	public static void main(String[] args) {
		// inst�nciem un objecte d de tipus GregorianCalendar 
		// amb la data i hora actual
		GregorianCalendar d = new GregorianCalendar();

		
		int avui = d.get(Calendar.DAY_OF_MONTH);
		int mes = d.get(Calendar.MONTH);

		// assignem el primer dia del mes
		d.set(Calendar.DAY_OF_MONTH, 1);

		int diaSetmana = d.get(Calendar.DAY_OF_WEEK);

		// imprimim capa�alera
		System.out.println("Dg  Dl  Dm  Dc  Dj  Dv  Ds ");

		// calculem identaci� de la primera l�nia del calendari
		for (int i = Calendar.SUNDAY; i < diaSetmana; i++)
			System.out.print("    ");

		do {
			// printem dia
			int day = d.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%3d", day);

			// marquem el dia actual amb *
			if (day == avui)
				System.out.print("*");
			else
				System.out.print(" ");

			// iniciem una nova l�nia despr�s de diumenge
			if (diaSetmana == Calendar.SATURDAY)
				System.out.println();

			// augmentem d al seg�ent dia del mes
			d.add(Calendar.DAY_OF_MONTH, 1);
			diaSetmana = d.get(Calendar.DAY_OF_WEEK);
		} while (d.get(Calendar.MONTH) == mes);
		// fins que trobem el dia 1 del seg�ent mes

		// l�nia final si es necessaria
		if (diaSetmana != Calendar.SUNDAY)
			System.out.println();
	}
}
