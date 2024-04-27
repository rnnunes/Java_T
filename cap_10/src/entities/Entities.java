package entities;

public class Entities {

	private String name;
	private double price;
	
	//consutrutor
	public Entities(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//getters and seters (encapsulamento)
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setName(double price) {
		this.price = price;
	}
}
