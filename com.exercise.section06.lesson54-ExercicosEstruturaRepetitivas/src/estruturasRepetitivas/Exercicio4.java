package estruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int n = 2;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (b == 0) {
				System.out.println("Divisao Impossivel");
			} else {
				int resultado = a / b;
			System.out.println(resultado);
			}

		}
		sc.close();

	}

}
