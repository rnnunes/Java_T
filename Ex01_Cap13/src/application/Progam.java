package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Progam {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		// -----------------------------------------------------------------

		System.out.print("Entre com o nome do Departamento: ");
		String departamentName = sc.nextLine();

		System.out.println("Entre com os dados do Funcionario");
		System.out.print("Nome: ");
		String workerName = sc.nextLine();

		System.out.print("Nivel: ");
		String workerLevel = sc.nextLine();

		System.out.print("Salario Base: ");
		double baseSalary = sc.nextDouble();

		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
				new Departament(departamentName));

		System.out.print("Quantos contratos deste funcionario? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("Entre com o Contrato #%d ", i + 1);
			System.out.print("Data (DD/MMD/YYYY): ");
			Date ContractDate = sdf.parse(sc.next());

			System.out.print("Valor por Hora: ");
			double ValueHour = sc.nextDouble();

			System.out.print("Duração (Horas): ");
			int WorkHour = sc.nextInt();

			HourContract hourContract = new HourContract(ContractDate, ValueHour, WorkHour);
			worker.addContract(hourContract); // associação do contrato com o funcionario
		}

		System.out.println();
		System.out.print("Entre com o Mês e Ano a serem Calculados (MM/YYYY): ");
		String monthAndYear = sc.next();

		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));

		System.out.println(worker.toString());
		System.out.println("Departamento: " + worker.getDepartament().getName());
		System.out.println("Ganho no Periodo Selecionado: " + monthAndYear + " Valor: "
				+ String.format("%.2f", worker.income(year, month)));
		
		sc.close();
	}

}
