package EstrututasRepetitivas;
import java.util.Scanner;

public class TestPassword01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		while(senha != 2002) {
			System.out.println("SenhaInvalida");
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
sc.close();
	}
	

}
