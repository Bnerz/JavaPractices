package estruturaCondicional;
import java.util.Scanner;

public class TesteNumeroNegativo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N >= 0) {
			System.out.println("Número Positivo");
		}
		else{
			System.out.println("Número Negativo");
		}

	}

}
