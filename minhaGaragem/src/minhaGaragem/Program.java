package minhaGaragem;

import java.util.Scanner;

import carrosComprados.CarrosComprados;





public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual carro voce comprou");
		String nomeDoCarro =  sc.nextLine();
		
		System.out.println("Qual foi o valor");
		double valor = sc.nextDouble();
		
		CarrosComprados cc = new CarrosComprados();
		
		System.out.println("Qual o seu carro e valor? " + nomeDoCarro + " e o valor ?: " + valor); 
		
		cc.getNameCar();
		cc.get
		
	}

}
