package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de pessoas: ");
		int n = sc.nextInt();
		double vector[] = new double[n];
		
		System.out.println("Digite as alturas: ");
		for(int i=0; i<n; i++) {
			vector[i]=sc.nextDouble();
		}
		double sum =0.0;
		for(int i=0; i<n; i++) {
			sum += vector[i];			
			
		}
		double average = sum/n;
		
		System.out.printf("Média"+ average);
		
		sc.close();
	}
	
	

}
