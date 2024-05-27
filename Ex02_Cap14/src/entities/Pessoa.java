package entities;

public class Pessoa {
	
	//atributos

	private String nome;
	private Double rendaAnual;
	
	//construtores
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	
	public Pessoa(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}
	
	//encapsulamento

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	//metodos
	
	public Double Imposto() {
		return 0.0;
	}
	
	public Double totalPag() {
		return 0.0;
	}
	
	public String StringPag() {
		return getNome() + getRendaAnual();
	}
}
