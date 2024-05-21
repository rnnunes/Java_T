package entities;

public class ImportedProduct extends Product {

	// atributors
	private Double customsFee;

	// construtor
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	public Double totalPrice() {
		return price += customsFee;
	}

	// metodos
	@Override
	public String priceTag() {
		return getName() 
			   + " $ " 
			   + totalPrice() 
			   + String.format("(Taxa da Alfandega: $ %.2f)", getCustomsFee());
	}

}
