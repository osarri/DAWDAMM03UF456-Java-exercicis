import java.util.*;

/**
 * Classe que representa una Factura. Utilitza la ordenaci� de col�leccions
 * per diversos criteris mitjan�ant la utilitzaci� de la interf�cie Comparator
 * 
 * @author sergi grau
 * @version 1.0, 06.03.2010
 */

public class Factura {

	private int codi;
	private String Client;
	private Date data;
	private double importFactura;

	/**
	 * M�tode principal que executa un joc de proves
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Factura> factures = new ArrayList<Factura>();
		factures.add(new Factura(1, "alpha", new GregorianCalendar(2010, 0, 20)
				.getTime(), 1000));
		factures.add(new Factura(2, "beta", new GregorianCalendar(2008, 0, 10)
				.getTime(), 3000));
		factures.add(new Factura(3, "gamma", new GregorianCalendar(2009, 0, 5)
				.getTime(), 2000));

		ComparadorFacturaImport comparadorFacturaImport = new ComparadorFacturaImport();

		Collections.sort(factures, comparadorFacturaImport);
		System.out.println(factures);
		ComparadorFacturaDate comparadorFacturaData = new ComparadorFacturaDate();
		Collections.sort(factures, comparadorFacturaData);
		System.out.println(factures);

	}

	/**
	 * Constructor amb quatre par�metres
	 * 
	 * @param codi
	 * @param client
	 * @param data
	 * @param importFactura
	 */
	public Factura(int codi, String client, Date data, double importFactura) {
		super();
		this.codi = codi;
		Client = client;
		this.data = data;
		this.importFactura = importFactura;
	}

	public int getCodi() {
		return codi;
	}

	public void setCodi(int codi) {
		this.codi = codi;
	}

	public String getClient() {
		return Client;
	}

	public void setClient(String client) {
		Client = client;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getImportFactura() {
		return importFactura;
	}

	public void setImportFactura(double importFactura) {
		this.importFactura = importFactura;
	}

	public String toString() {
		return getCodi() + "/" + getClient() + "/" + getData() + "/"
				+ getImportFactura();

	}

	/**
	 * classe interna est�tica que implementa la interf�cie Comparator per poder
	 * realitzar la ordenaci� en funci� de l'import
	 * 
	 * @author sergi grau
	 * @version 1.0, 06.03.2010
	 * 
	 */
	public static class ComparadorFacturaImport implements Comparator<Factura> {

		public int compare(Factura facturaA, Factura facturaB) {

			//alternativament return facturaA.getImportFactura() - facturaB.getImportFactura();
			if (facturaA.getImportFactura() < facturaB.getImportFactura()) {
				return -1;

			} else if (facturaA.getImportFactura() > facturaB
					.getImportFactura()) {
				return 1;

			} else {
				return 0;
			}
		}
	}

	/**
	 * classe interna est�tica que implementa la interf�cie Comparator per poder
	 * realitzar la ordenaci� en funci� de la Data
	 * 
	 * @author sergi grau
	 * @version 1.0, 06.03.2010
	 * 
	 */
	public static class ComparadorFacturaDate implements Comparator<Factura> {

		public int compare(Factura facturaA, Factura facturaB) {

			return (facturaA.getData().compareTo(facturaB.getData()));
		}
	}

}
