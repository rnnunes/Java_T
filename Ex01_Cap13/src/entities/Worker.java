package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;

import entities.enums.WorkerLevel;

public class Worker {

	// atributos
	private String name;
	private WorkerLevel level;
	private Double baseSalary;

	// Associações
	private Departament departament;
	private List<HourContract> contracts = new ArrayList<>();

	// construtor
	public Worker() {

	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}

	// encapsulamento gets

	public String getName() {
		return name;
	}

	public WorkerLevel getWorkerLevel() {
		return level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public Departament getDepartament() {
		return departament;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	// sets

	public void setName(String name) {
		this.name = name;
	}

	public void setWorkerLevel(WorkerLevel level) {
		this.level = level;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	// não é uma boa pratica add via set, tem q ser via metodo
//	public void setContracts (List<HourContract> contracts) {
//		this.contracts = contracts;
//	}

	// metodos

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		
		for (HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);

			if (year == c_year && month == c_month) {
				sum *= c.totalValue();
			}

		}
		return sum;

	}
	
	public String toString() {
		return "Nome: " + name;
	}

}
