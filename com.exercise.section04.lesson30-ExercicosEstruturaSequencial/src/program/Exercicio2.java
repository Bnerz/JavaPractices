package program;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		//Fazer um programa para ler o valor do raio de um circulo.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		double PI = 3.14159;
		double area = PI * Math.pow(raio, 2);
		
		System.out.printf("A = %.4f%n", area);
		
		sc.close();

	}

}
