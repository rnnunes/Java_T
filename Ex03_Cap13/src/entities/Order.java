package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	// atributos
	private Date moment;
	private OrderStatus status;

	// Associações
	private Client client;
	private List<OrderItem> ordens = new ArrayList<OrderItem>();

	// construtores
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
	}

	// encapsulamento

	public Date getMoment() {
		return moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	// metodos

	public void addItem(OrderItem item) {
		ordens.add(item);
	}

	public void removeItem(OrderItem item) {
		ordens.remove(item);
	}

	public double total() {
		double sum = 0.0;
		for (OrderItem it : ordens) {
			sum += it.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Resumo de Ordem: \n");
		sb.append("Momento do Pedido: " + sdf.format(moment) + "\n");
		sb.append("Status do Pedido: " + status);
		sb.append(client + "\n");
		sb.append("Itens do Pedido: \n");
		
		for (OrderItem item : ordens) {
			sb.append(item + "\n");
		}
		
		sb.append("Total Valor: $");
		sb.append(String.format("%.2f", total()));
		
		return sb.toString();
	}

}
