package estruturaCondicional;

import java.util.Scanner;

public class numerosMultiplos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A,B;
		A = sc.nextInt();
		B = sc.nextInt(); 

		if(A % B == 0 || B % A == 0) {
			System.out.println("É MULTIPLO");
		}
		else {
			System.out.println("NÃO É MULTIPLO");
		}
		
		sc.close();	
		
	}

}
