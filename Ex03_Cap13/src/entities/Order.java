package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {

	//atributos
	private Date moment;
	private OrderStatus status;
	
	
	//construtores
	public Order() {
		// TODO Auto-generated constructor stub
	}
	
	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}
	
	//encapsulamento
	
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
	
	//metodos
	
	public void addItem() {
		
	}
	
	public void removeItem() {
		
	}
	
	public Double total() {
		return
	}
	
	
	
	
	
}

