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

	public Double Imposto() {
		double tx = 0;
		if (getNumFuncionarios() > 10) {
			tx = 0.14;
		} else {
			tx = 0.16;
		}
		return tx;
	}
	
	public Double totalPag() {
		double total =  getRendaAnual() * Imposto();
		return total;
	}

	public String StringPag () {
		return getNome() + " $ " + String.format("%.2f", totalPag());
	}

}