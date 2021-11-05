package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		Account acc;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.next();
		System.out.print("Is there na initial deposit (y/n)? ");

		char response = sc.next().charAt(0);

		if (response == 'y' || response == 'Y') {
			System.out.print("Enter a deposit value: ");
			double initialDeposit = sc.nextDouble();
			acc = new Account(number, name, initialDeposit);
		} else {
			acc = new Account(number, name);
		}
		System.out.println();
		System.out.println("Account data:");
		System.out.println(acc);

		System.out.println();

		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		acc.deposit(amount);
		System.out.println("Updated account data:");
		System.out.println(acc);
		System.out.println();

		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		acc.withdraw(withdrawValue);

		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(acc);

		sc.close();
	}

}
