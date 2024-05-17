package entities;

public class OrderItem {
	
	//atribuições
	private Integer quant;
	private Double price;
	
	
	// Associações
	private Product product;

	//consutrutores
	public OrderItem() {
		// TODO Auto-generated constructor stub
	}
	
	public OrderItem(Integer quant, Double price, Product product) {
		this.quant = quant;
		this.price = price;
		this.product = product;
	}
	
	//encapsulamneto
	public Integer getQuant() {
		return quant;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setQuant(Integer quant) {
		this.quant = quant;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	//metodos
	
	public double subTotal() {
		return quant * price;
	}
	
	public String toString() {
		return product.getName() + ", $" + 
			   String.format("%.2f", price)
			    + ", Quantity: " +
			   quant + ", Subtotal: $" + 
			   String.format("%.2f", subTotal());
	}
}
