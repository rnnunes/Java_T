package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
	
		//atributos
		private Integer id;
		private Date moment;
		private OrderStatus status;
		
		//constutores
		public Order() {
			
		}
		
		public Order(Integer id, Date moment, OrderStatus status) {
			this.id = id;
			this.moment = moment;
			this.status = status;
		}
		
		//encapsulametos gets
		public Integer getId() {
			return id;
		}
		
		public Date getMoment() {
			return moment;
		}

		public OrderStatus status() {
			return status;
		}
		
		//sets
		
		public void setId(Integer id) {
			this.id = id;
		}
		
		public void setMoment (Date moment) {
			this.moment = moment;
		}
		
		public void setOrderStatus (OrderStatus status) {
			this.status = status;
		}
		
		//metodos
		
		@Override
		public String toString() {
			return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
		}
		
		
}
