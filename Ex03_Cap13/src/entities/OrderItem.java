package entities;

public class OrderItem {
	
	//atribuições
	private Integer quant;
	private Double price;


	//consutrutores
	public OrderItem() {
		// TODO Auto-generated constructor stub
	}
	
	public OrderItem(Integer quant, Double price) {
		this.quant = quant;
		this.price = price;
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
	
	//metodos
	
	public double subTotal(int quant, double price) {
		return quant * price;
	}
}
