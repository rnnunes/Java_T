package Application;

import entities.PF;
import entities.PJ;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Pessoa pessoasFisica = new PF("Didi", 50000.00, 2000.00);
		Pessoa pessoasJuridicas = new PJ("Loja", 2500.00, 20);
		Pessoa pessoa = new Pessoa("dio", 10.0);
		
		System.out.println(pessoa.StringPag());

	}

}
