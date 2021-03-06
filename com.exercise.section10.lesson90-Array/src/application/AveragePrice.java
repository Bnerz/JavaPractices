package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class AveragePrice {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Product[] vect = new Product[n];

		for (int i = 0; i <n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
			
		}

		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i].getPrice();
			}
		
		double average = sum/n;
		System.out.printf("M?dia: %.2f%n ",average);
		
		sc.close();
	}

}
