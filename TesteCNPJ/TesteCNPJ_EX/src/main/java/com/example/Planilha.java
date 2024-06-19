package com.example;

public class Planilha {

	private String nome;
	private String situacao;
	private String cnpj;
	
	public Planilha() {
		// TODO Auto-generated constructor stub
	}

	public Planilha(String nome, String situacao, String cnpj) {
		super();
		this.nome = nome;
		this.situacao = situacao;
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getCNPJ() {
		return cnpj;
	}

	public void setCNPJ(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
