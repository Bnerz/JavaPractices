package entities;

public class Account {

	public int number;
	public String name;
	public double balance;

	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.name = holder;
		deposit(initialDeposit);
	}

	public Account(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}
