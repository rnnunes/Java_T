package course;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Progam {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Entre com os dados do Produto: %nNome:");
		String name = sc.nextLine();

		System.out.print("Preço: ");
		double price = sc.nextDouble();

		System.out.print("Quantidade em Estoque: ");
		int qtd = sc.nextInt();
		
		Product product = new Product(name, price, qtd);
		
		System.out.println("Dados do Produto: " + product);

		System.out.printf("%nEntre com a quantidade a ser adicionada no Estoque: ");
		qtd = sc.nextInt();
		product.AddProducts(qtd);
		System.out.println("Dados Alterados: " + product);

		System.out.printf("%nEntre com o numero de produtos a serem removidos do estoque: ");
		qtd = sc.nextInt();
		product.removeProducts(qtd);
		System.out.println("Dados Alterados: " + product);
		
		sc.close();
	}

}
