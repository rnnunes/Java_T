package entities;

public class Entities_ex03 {

	private String name;
	private String email;
	
	//construtor
	public Entities_ex03(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	//encapsulameento
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	//metodos
	public String toString() {
		return name + ", " + email;
	}
	
	
	
}
