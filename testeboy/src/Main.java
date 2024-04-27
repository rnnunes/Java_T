
//import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {

		// 01
		// ------------------------------------------------

//		System.out.println("Hello novamente");

//		int x = 32;
//		double y = 10.3588;

//		System.out.println(x);
//		
//		Locale.setDefault(Locale.US);
//		
//		System.out.printf("%.2f%n", y);
//	
		// 02
		// ------------------------------------------------

//		String nome = "Maria";
//		int idade = 31;
//		double soldo = 2000.0;
//		
//		System.out.printf("%s tem %d anos e ganha R$ %.3f reais. %n", nome, idade, soldo);

//		03
//		------------------------------------------------

//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Digite algo: ");
//		String x = sc.next();
//		System.out.println("Você Digitou: " + x);
//
//		System.out.println("-------------------------------------------------");
//
//		System.out.print("Digite um Numero: ");
//		int y = sc.nextInt();
//		System.out.println("Você Digitou: " + y);
//		System.out.println("-------------------------------------------------");
//
//		sc.close();

//		04
//		------------------------------------------------

//		int x = 5;
//		
//		if (x < 0) {
//			System.out.println("zé mane");
//		}
//		
//		else {
//			System.out.println("né não pae");
//		}
//		
//		05
//		------------------------------------------------

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("-------------------------------");
//		System.out.print("Digite o numero de vezes: ");
//		
//		int x = sc.nextInt();
//		
//		int soma = 0;
//		
//		for (int i = 0; i < x; i ++) {
//			int n = sc.nextInt();
//			soma += n;
//		}
//		
//		System.out.println("O valor total é: " + soma);;
//		
//		sc.close();

//		for (int i = 0; i <= 10; i++) {
//			System.out.println("Contagem: " + i);
//		}

//		06
//		------------------------------------------------

//		Scanner sc = new Scanner(System.in);
//
//		char resp;
//		
//		do {
//		System.out.print("Digite a temperatura em Celsius: ");
//
//		double temp = sc.nextInt();
//
//		double var = temp * 1.8 + 32;
//
//		System.out.printf("A temperatura equivalente em Fahrenheit:  %.1f. %n", var);
//		System.out.print("Deseja repetir (s/n)");
//		resp = sc.next().charAt(0);
//		
//		} while (resp == 's');
//		
//		
//		sc.close();

//		07
//		------------------------------------------------

		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva 3 Numeros: ");

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

//		System.out.println("Higher = " + Math.max(Math.max(n1, n2), n3));
		int higher = max(n1 , n2, n3);
		
		showResult(higher);
		
		sc.close();

	}

	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}

	public static void showResult(int value) {

		System.out.println("Higher = " + value);
	}

}
