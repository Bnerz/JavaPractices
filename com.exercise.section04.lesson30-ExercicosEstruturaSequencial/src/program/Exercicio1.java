package program;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		//programa para ler 2 valores inteiros e depois mostrar a soma:
		Scanner sc = new Scanner(System.in);
		
		int a, b, soma;
		
		a = sc.nextInt();
		b = sc.nextInt();
		soma = a + b;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
		
	}

}
