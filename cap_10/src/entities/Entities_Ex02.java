package entities;

public class Entities_Ex02 {

	private String name;
	private int idade;
	private double alt;
	
	//consutrutor
	public Entities_Ex02(String name, int idade, double alt) {
		this.name = name;
		this.idade = idade;
		this.alt = alt;
	}
	
	//encapsulamento
	public int getIdade() {
		return idade;
	}
	
	public double getAlt() {
		return alt;
	}
	
	public String getName () {
		return name;
		
	}
}
 