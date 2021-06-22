
public class Artikel {
	//Attribute
	public String name; //persoenliche Bezeichnung des Artikels
	public int id; //persoenliche Artikelnummer
	public boolean availability; //persoenlicher Bestand des Artikels
	public int stock; //persoenliche Menge des Artikels
	
	//Konstruktor
	public Artikel(String name, int id, boolean availability, int stock) {
		this.name = name;
		this.id = id;
		this.availability = availability;
		this.stock = stock;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public boolean getAvailability() {
		return availability;
	}
	
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
}
