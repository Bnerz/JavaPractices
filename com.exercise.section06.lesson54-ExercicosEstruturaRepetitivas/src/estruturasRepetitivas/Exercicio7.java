package estruturasRepetitivas;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int inti = i;
			int dobro = i*i;
			int triplo = i*i*i;
			System.out.printf("%d %d %d%n", inti, dobro, triplo);
			

		}

		sc.close();
	}

}
