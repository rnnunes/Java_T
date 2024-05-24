package entities;

public class PJ extends Pessoa {

	//atributos
	private Integer numFuncionarios;
	
	//construtores
	public PJ() {
		super();
	}

	public PJ(String nome, Double rendaAnual, Integer numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	//encapsulamento
	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	//metodos
	public String StringPag () {
		return getNome() + ", " + getRendaAnual() + ", " + getNumFuncionarios();
	}

}