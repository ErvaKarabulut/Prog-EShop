
/**
 * Klasse zur Repraesentation der einzelnen Kunden.
 * 
 * @author ervak
 */
public class Kunde {
	
	private int kundenNr;
	
	private String name;
	private String strasse = "";
	private String plz = "";
	private String wohnort = "";
	
	public Kunde(int nr, String name) {
		kundenNr = nr;
		this.name = name;
	}
	
	// Methoden zum Setzen und Lesen der Kunden-Eigenschaften,
		// z.B. getStrasse() und setStrasse()
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		
		public String getPlz() {
			return plz;
		}

		public void setPlz(String plz) {
			this.plz = plz;
		}

		public String getStrasse() {
			return strasse;
		}

		public void setStrasse(String strasse) {
			this.strasse = strasse;
		}

		public String getWohnort() {
			return wohnort;
		}

		public void setWohnort(String wohnort) {
			this.wohnort = wohnort;
		}

		public int getKundenNr() {
			return kundenNr;
		}
}