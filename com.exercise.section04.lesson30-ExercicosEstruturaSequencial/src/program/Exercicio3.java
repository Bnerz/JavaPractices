package program;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		//Fazer um programa para ler o valor o valor de 4 inteiros e a seguir calcular a diferenca do produto de A e B pelo poduto de C e D 
		//DIFERENCA = (A*B-C*D)
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();	
		diferenca = (A*B-C*D);
		
		System.out.println("DIFERENCA = " + diferenca);
		
		sc.close();
	}

}
