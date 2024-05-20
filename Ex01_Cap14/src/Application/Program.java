package Application;

import entities.ImportedProduct;
import entities.Product;

public class Program {

	public static void main(String[] args) {

		Product product1 = new Product("Radio", 450.00);
		Product product = new ImportedProduct("TV", 1000.00, 20.00);

		
		System.out.println(product.priceTag());
		
	}

}
