package application;

import java.util.Scanner;

import entities.EntitiesCNPJ;
import entities.ServiceCNPJ;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o CNPJ: ");
		String cpnj = sc.next();

		EntitiesCNPJ entitiesCNPJ = ServiceCNPJ.bucarCNPJ(cpnj);

		System.out.printf("%nResultados: %n" + entitiesCNPJ.toString());

	}

}
