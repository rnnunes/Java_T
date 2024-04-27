package entities;

public class Product {

	// Atributos
	private String name;
	private double price;
	private int qtd;

	// Construtores
	public Product(String name, double price, int qtd) {
		this.name = name;
		this.price = price;
		this.qtd = qtd;
	}

	// (Encapsulamento)
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getQtd() {
		return qtd;
	}

	// Metodos
	public double totalValueInStock() {
		return price * qtd;
	}

	public void AddProducts(int qtd) {
		this.qtd += qtd;
	}

	public void removeProducts(int qtd) {
		this.qtd -= qtd;
	}

	public String toString() {
		return name 
				+ ", $" 
				+ String.format("%.2f", price)
				+ ", "
				+ qtd 
				+ " Units, Total: $ "
				+ String.format("%.2f",totalValueInStock());
	}

}
