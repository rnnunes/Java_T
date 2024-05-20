package entities;

public class Product {

	// atributos
	private String name;
	protected Double price;

	//construtores
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	//encapsulamento
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		
	}
	
	//metodos
	
	public String priceTag() {
		return name + " $ " + price; 
	}
	
	
	
	
}
