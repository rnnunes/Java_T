package entities;

public class PF extends Pessoa {
	
	//atributos
	private Double gastosSaude;
	
	//Construtores
	public PF() {
		super();
	}
	
	public PF(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}
	
	//Encapsulamento

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	//metodos
	
	public Double Imposto() {
		
		double tx = 0;
		if (getRendaAnual() <= 20000.00) {
			
			tx =+ getRendaAnual() * 0.15;
			
		} else {
			
			tx =+ getRendaAnual() * 0.25;
			
		}
		return tx;
	}
	
	public Double descSaude() {
		
		double tx = 0;
		if (getRendaAnual() > 20000.00 ) {
			
			tx =+ getGastosSaude() * 0.5;
		}
		return tx;
	}
	
	public Double totalPag() {
		return Imposto() - descSaude();
	}
	
	public String StringPag () {
		return getNome() + " $ " + totalPag();
	}

}
