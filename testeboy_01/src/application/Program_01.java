package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangulo;

public class Program_01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		

		System.out.println("Entre com as Medidas do Triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Entre com as Medidas do Triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		
		double areaY = y.area();

		System.out.printf("Area do Triangulo X: %.4f%n", areaX);
		System.out.printf("Area do Triangulo Y: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior Area: X");
		} else {
			System.out.println("Maior Area: Y");
		}
		
		
		sc.close();
	}

}
