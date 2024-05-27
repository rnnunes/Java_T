package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.PF;
import entities.PJ;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<Pessoa>();

		System.out.print("Entre com o numero de pagamento de Taxas: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da Taxa do %d# Pagador: ", i + 1);
			System.out.print("Pessoa Fisica ou Pessoa Juridica (F/J)? ");
			char resp = sc.next().charAt(0);
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Renda Anual: ");
			double rendaAnual = sc.nextDouble();
			
			if (resp == 'F') {
				System.out.print("Gastos com Saúde: ");
				double gastoSaude = sc.nextDouble();
				list.add(new PF(name, rendaAnual, gastoSaude));
			} else if (resp == 'J') {
				System.out.print("Numero de Funcionarios da Empresa: ");
				int numFunc = sc.nextInt();
				list.add(new PJ(name, rendaAnual, numFunc));
			} 
			
		}
		
		System.out.println();
		System.out.println("Pagamento de Taxas: ");

		for (Pessoa pessoa : list) {
			System.out.println(pessoa.StringPag());
		}
		System.out.println();
		System.out.println("Total de Taxas: ");
		double sum = 0;
		for (Pessoa pessoa : list) {
			sum += pessoa.totalPag();
		}
		System.out.println(sum);
		
		sc.close();
	}

}


//Testes
//Pessoa pessoasFisica = new PF("Didi", 50000.00, 2000.00);
//Pessoa pessoasJuridicas = new PJ("Loja", 400000.00, 9);