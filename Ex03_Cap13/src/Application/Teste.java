package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Teste {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyu");
	
		Product p = new Product("TV", 1000.0);
		OrderItem order1 = new OrderItem(2, 1000.0, p);
		Client cliente = new Client("Didi", "didi@gmail.com", sdf.parse("17/05/1900"));
		Order order = new Order(new Date(), OrderStatus.PROCESSING, cliente);

		
		
		System.out.println(order);

	}

}
