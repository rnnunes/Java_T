package entities;

public class Entities_ex16 {
	//Atributos
	private Integer id;
	private String name;
	private Double salario;
	
	
	//Construtor
	public Entities_ex16(int id, String name, double salario) {
		this.id = id;
		this.name = name;
		this.salario = salario;
		
	}
	
	//encapsulamento
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void AumSal(double percent){
		salario  += salario * percent / 100;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", salario=" + String.format("%.2f.", salario);
	}
	
	
	
}
