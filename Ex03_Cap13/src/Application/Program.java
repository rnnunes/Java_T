package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// testes
//		Product p = new Product("TV", 1000.0);
//		OrderItem order1 = new OrderItem(2, 1000.0, p);
//		Client cliente = new Client("Didi", "didi@gmail.com", sdf.parse("17/05/1900"));
//		Order order = new Order(data, PERNDING_PAYMENT, cliente);

		System.out.println("Entre com os dados do Cliente: ");
		System.out.print("Nome: ");
		String name = sc.next();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data de Nacimento: ");
		Date nasc = sdf.parse(sc.next());

		Client client = new Client(name, email, nasc);

		System.out.println("Entre com os dados do Pedido: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());

		Order order = new Order(new Date(), status, client);

		System.out.print("Quantos items são neste pedido? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.printf("Entre com os dados do #%d Item: \n", i + 1);
			System.out.print("Nome do Produto: ");
			String productName = sc.next();
			System.out.print("Preço do Produto: ");
			double productPrice = sc.nextDouble();
			System.out.printf("Quantidade: ");
			int qtd = sc.nextInt();
			System.out.println();

			Product product = new Product(productName, productPrice);
			OrderItem item = new OrderItem(qtd, productPrice, product);
			
			order.addItem(item);
			
		}

		System.out.println(order);

		sc.close();
	}

}
