
/**
 * Klasse zur Repraesentation der einzelnen Mitarbeiter.
 * 
 * @author ervak
 */
public class Mitarbeiter {
	
	private int mitarbeiterId;
	private String name;
	private String loginname;
	private String passwort;
	
	public Mitarbeiter(int id, String name, String loginname, String passwort) {
		this.mitarbeiterId = id;
		this.name = name;
		this.loginname = loginname;
		this.passwort = passwort;
	}
	
	// Methoden zum Setzen und Lesen der Mitarbeiter-Eigenschaften,
		// z.B. getName() und setName()
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public int getMitarbeiterId() {
			return mitarbeiterId;
		}
		
		public void setMitarbeiterId (int id) {
			this.mitarbeiterId = id;
		}

		public String getLoginname() {
			return loginname;
		}

		public void setLoginname(String loginname) {
			this.loginname = loginname;
		}

		public String getPasswort() {
			return passwort;
		}

		public void setPasswort(String passwort) {
			this.passwort = passwort;
		}
}