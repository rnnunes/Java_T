package entities;

public class Entities {

	// Atributos
	private int conta;
	private String usuario;
	private double saldo;

	// Construtores
	public Entities(int conta, String usuario, double inicial_dep) {
		this.conta = conta;
		this.usuario = usuario;
		addDeposito(inicial_dep);
	}

	// Encapsulamento
	public int getConta() {
		return conta;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public double getSaldo() {
		return saldo;
	}

	// Metodos
	public void addDeposito (double saldo) {
		this.saldo += saldo;
	}
	
	public void saque (double saldo) {
		this.saldo -= saldo + 5.0;
	}
	
	public  String toString() {
		return "Conta "
				+ conta
				+ ", Usuario: "
				+ usuario
				+ ", Saldo: $ "
				+ String.format("%.2f", saldo);
	}
 	
}
