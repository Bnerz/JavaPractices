package application;

import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		System.out.println("Name: ");
		st.name = sc.nextLine();
		System.out.println("Grade");
		st.grade1 = sc.nextDouble();
		st.grade2 = sc.nextDouble();
		st.grade3 = sc.nextDouble();

		System.out.printf("FINAL GRADE: %.2f%n", st.finalGrade());
			
		if (st.finalGrade() < 60.0) {
		System.out.println("FAILED");
		System.out.printf("MISSING %.2f POINTS%n", st.missingPoints());
		}
		else {
		System.out.println("PASS");
		}
		sc.close();
		
	}

}
