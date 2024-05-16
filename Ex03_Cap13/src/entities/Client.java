package entities;

import java.util.Date;

public class Client {

	// atributos
	private String name;
	private String email;
	private Date birthDate;

	// construtores
	public Client() {
		// TODO Auto-generated constructor stub
	}

	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;

	}

	// encapsulamento
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

}
