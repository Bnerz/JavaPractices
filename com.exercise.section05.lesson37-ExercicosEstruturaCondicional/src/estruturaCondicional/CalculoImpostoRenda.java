package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class CalculoImpostoRenda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double salario, imposto;
		salario = sc.nextDouble();
	
		if(salario >= 0 &&  salario <= 2000.0) {
			System.out.println("Isento");
		}
		else if(salario > 2000.01 && salario <= 3000.00) {
			imposto = salario *0.08;
			System.out.printf("R$: %.2f%n ", imposto);
		}
		else if(salario > 3000.01 && salario <= 4500.00) {
			imposto = salario *0.018;
			System.out.printf("R$: %.2f%n ", imposto);
		}
		else {
			imposto = salario *0.28;
			System.out.printf("R$: %.2f%n ", imposto);
		}
		
		sc.close();
	}

}
