import java.io.IOException;
import java.util.List;
import java.util.Vector;

public class ItemManagement {
	private List<Item> itemAvailability = new Vector<Item>();
	
	public void readInformation(String datei) throws IOException {
		// PersistenzManager für Lesevorgänge öffnen
		pm.openForReading(datei);

		Item oneItem;
		do {
			// Buch-Objekt einlesen
			oneItem = pm.ladeBuch();
			if (oneItem != null) {
				// Buch in Liste einfügen
				try {
					einfuegen(einBuch);
				} catch (BuchExistiertBereitsException e1) {
					// Kann hier eigentlich nicht auftreten,
					// daher auch keine Fehlerbehandlung...
				}
			}
		} while (einBuch != null);

		// Persistenz-Schnittstelle wieder schließen
		pm.close();
}
