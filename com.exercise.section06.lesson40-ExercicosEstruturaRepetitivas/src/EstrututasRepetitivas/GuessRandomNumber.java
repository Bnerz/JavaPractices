package EstrututasRepetitivas;
import java.util.Scanner;

public class GuessRandomNumber {

	public static void main(String[] args) {
		

		int n = (int)( Math.random() * 11);
		int alvo = (int)( Math.random() * 11);

		while (n != alvo) {
			n = (int)( Math.random() * 11);
			System.out.println(n);
			alvo = (int)( Math.random() * 11);
			System.out.println("tente outra vez");

		}
		System.out.println("No Alvo!");
	}
}
