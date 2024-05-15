package entities;

import java.util.Date;

public class HourContract {

	// atributos
	private Date date;
	private Double valuePerHour;
	private Integer hours;

	// construtores

	public HourContract() {

	}

	public HourContract(Date date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	// encapsulamento ()get

	public Date getDate() {
		return date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	// encapsulmanto sets

	public void setDate(Date date) {
		this.date = date;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	// metodos
	
	public double totalValue() {
		return  valuePerHour * hours;
	}

}
