package course;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Ex02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee funcionario = new Employee();

		System.out.print("Nome: ");
		funcionario.name = sc.nextLine();

		System.out.print("Salario Grosso: ");
		funcionario.salGrosso = sc.nextDouble();

		System.out.print("Taxa: ");
		funcionario.tax = sc.nextDouble();

		System.out.printf("%nFuncionario: %s, $ %.2f %n", funcionario.name, funcionario.salLiq());

		System.out.printf("%nQual o percentual sera colocado no salario? ");
		double percent = sc.nextDouble();
		funcionario.aumentoSal(percent);
		
		System.out.printf("%nDados Alterados: %s, $ %.2f", funcionario.name, funcionario.salLiq());

	}

}