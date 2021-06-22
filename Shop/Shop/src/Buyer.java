
public class Buyer extends User {
    //Attribute
	public String street;
	public int homenumber;
	public int postcode;
	
	public Buyer(String firstname, String surname, int id, String loginname, String password, String street, int homenumber, int postcode) {
		super(firstname, surname, id, loginname, password);
		this.street = street;
		this.homenumber = homenumber;
		this.postcode = postcode;
	}

	
}
