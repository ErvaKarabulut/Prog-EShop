
public abstract class User extends UserManagement {
	//Attribute
	public String firstname; //Name der Person
	public String surname; //Nachname der Person
	public int id; //persoenlicher Nummer
	public String loginname; //Login Name der Person
	public String password; //Passwort der Person
	
	public User(String firstname, String surname, int id, String loginname, String password) {
		this.firstname = firstname;
		this.surname = surname;
		this.id = id;
		this.loginname = loginname;
		this.password = password;
	}
	
	//Konstruktor
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getLoginname() {
		return loginname;
	}
	
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
