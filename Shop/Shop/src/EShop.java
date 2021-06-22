import java.util.List;

import bib.local.domain.exceptions.BuchExistiertBereitsException;
import bib.local.valueobjects.Buch;

public class EShop {

private String datei = "";
	
	private ItemManagement myItems;
	public EShop(String datei) throws IOException {
		this.datei = datei;
		
		myItems = new ItemManagement();
		myItems.readInformation(datei+"_B.txt");
	}
	
	public List<Item> showAllItems() {
		// einfach delegieren an BuecherVerwaltung meineBuecher
		return myItems.getAvailability();
	}
	
	public List<Item> searchItemWithName(String titel) {
		// einfach delegieren an BuecherVerwaltung meineBuecher
		return myItems.searchItems(titel); 
	}
	
	public Item fuegeBuchEin(String titel, int nummer) throws BuchExistiertBereitsException {
		Buch b = new Buch(titel, nummer);
		meineBuecher.einfuegen(b);
		return b;
}
