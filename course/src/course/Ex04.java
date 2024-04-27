package course;

import java.util.Locale;
import java.util.Scanner;

import entities.Conversor;

public class Ex04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Conversor conversor = new Conversor();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Qual o valor do dolar? ");
		conversor.vlr_Dol = sc.nextDouble();
		
		System.out.printf("Quantos dolares você pretende comprar? ");
		conversor.compra_Dol = sc.nextDouble();
		
		System.out.printf("O valor vai ficar: %.2f", conversor.conversao());
	}

}
