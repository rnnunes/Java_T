package entities;

public class EntitiesCNPJ {

	// atributos
	String nome;
	String situacao;
	String tipo;

	// construtores
	public EntitiesCNPJ() {

	}

	public EntitiesCNPJ(String name, String situacao, String tipo) {
		this.nome = name;
		this.situacao = situacao;
		this.tipo = tipo;
	}

	// encapsulamentos
	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// metodos
	@Override
	public String toString() {
		return String.format("Nome: " + getName() + ", " + "%nSituação: " + getSituacao() + ", " + "%nTipo: " + getTipo());
	}
}
