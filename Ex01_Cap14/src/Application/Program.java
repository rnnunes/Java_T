package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

//		testes
//		Product product1 = new Product("Radio", 450.00);
//		Product product = new ImportedProduct("TV", 1000.00, 20.00);
//		Product product0 = new UsedProduct("Bike", 300.00, sdf.parse("17/05/1900"));
		
		List<Product> list = new ArrayList<Product>();
		
		System.out.print("Entre com o numero de produtos: ");
		int n = sc.nextInt();
		
		for (int i = 1; i < n; i++) {
			System.out.printf("Dados do #%d Produto: %n", i);
			System.out.print("Comum, Usado ou Importado (c/u/i): ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Preço: ");
			double price = sc.nextDouble();
			
			if (ch == 'i') {
				
				System.out.print("Taxa da Alfandega: ");
				double tx = sc.nextDouble();
				Product prductImport = new ImportedProduct(name, price, tx);
				list.add(prductImport);
				
			} else if (ch == 'u') {
				
				System.out.print("Data de Fabricação (DD/MM/YYYY): ");
				Date fab = sdf.parse(sc.next());
				Product prodcutUsed = new UsedProduct(name, price, fab);
				list.add(prodcutUsed);
				
			} else {
				
				list.add(new Product(name, price));
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for (Product produt : list) {
			System.out.println(produt.priceTag());
		}
		
		sc.close();
	}

}
