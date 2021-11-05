package EstrututasRepetitivas;

import java.util.Scanner;

public class TiposDeCombustiveis {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int cod = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		
		while(cod != 4) {
			if(cod == 1) {
				alcool += 1;
			}
			else if(cod == 2) {
				gasolina += 1;
			}
			else if(cod == 3) {
				diesel += 1;
			}
			cod = sc.nextInt();
			
		}
			System.out.println("MUITO OBRIGADO");
			System.out.println("ALCOOL = " + alcool);
			System.out.println("GASOLINA = " + gasolina);
			System.out.println("DIESEL = " + diesel);
			
		sc.close();	

	}

}
