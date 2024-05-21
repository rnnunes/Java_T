package entities;

public class PF {
	
	//Atribuições
	private String nome;
	private Double rendaAnual;
	private Double gastosSaude;
	
	//Construtores
	public PF() {
		// TODO Auto-generated constructor stub
	}
	
	public PF(String nome, Double rendaAnual, Double gastosSaude) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
		this.gastosSaude = gastosSaude;
	}
	
	//Encapsulamento
	public String getNome() {
		return nome;
	}
	
	public void getNome(String nome) {
		this.nome = nome;
	}
	
	public Double getRendaAnual() {
		return rendaAnual;
	}
	
	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	//metodos
	
	public Double PFImposto() {
		
		if (rendaAnual < 20000) {
			
			double menos20k =+ rendaAnual * 0.15;
			
		} else if (rendaAnual > 20000) {
			
			double mais20k =+ rendaAnual * 0.25;
			
			if	(gastosSaude > 0) {
				double saude = gastosSaude * 0.5;
			}
			
		 	double var = mais20k - saude;
		}
	}
	
	
	

}
