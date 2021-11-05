package program;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int funcionario, horasTrabalhadas;
		double valorHora, salario;
		
		funcionario = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorHora = sc.nextDouble();
		salario = horasTrabalhadas * valorHora;
		
		System.out.println("NUMBER: " + funcionario);
		System.out.println("SALARY = " + salario);
		
		
		sc.close();
	}

}
