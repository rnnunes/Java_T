package course;

import java.util.Locale;
import java.util.Scanner;

import entities.Entities;

public class Ex05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o Numero da conta: ");
		int conta = sc.nextInt();
		
		System.out.printf("Entre com o nome do Usuario: ");
		sc.nextLine();
		String usuario = sc.nextLine();

		System.out.printf("Haverá um deposito inicial? (y/n) ");
		char resp = sc.next().charAt(0);

		double inicial_dep = 0;
		if (resp == 'y') {
			System.out.printf("Entre com o valor inicial do deposito: ");
			inicial_dep = sc.nextDouble();
		}

		Entities entities = new Entities(conta, usuario, inicial_dep);

		System.out.printf("%nDados da Conta: %n");
		System.out.print(entities);

		System.out.printf("%nEntre com o valor do deposito: ");
		double dep = sc.nextDouble();
		entities.addDeposito(dep);
		System.out.printf("%nDados da conta alterados: %n");
		System.out.print(entities);

		System.out.printf("%nEntre com o valor do saque: ");
		double saq = sc.nextDouble();
		entities.saque(saq);
		System.out.printf("Dados da conta alterados: %n");
		System.out.print(entities);
		
		
		sc.close();
	}

}
