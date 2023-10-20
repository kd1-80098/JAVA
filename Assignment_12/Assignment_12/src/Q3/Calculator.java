package Q3;

import java.util.Scanner;
@FunctionalInterface
interface Arithmetic {
	double calc(double a, double b);
}

public class Calculator {

	public static int menu() {
		int choice;
		//
		System.out.println("1. Add Numbers");
		System.out.println("2. Subtract Numbers");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("Enter your choic: ");
		choice = new Scanner(System.in).nextInt();
		return choice;
	}

	public static double calculate(double a, double b, Arithmetic op) {
		double result = op.calc(a, b);
		System.out.println("Result: " + result);
		return 0;
	}

	public static void main(String[] args) {
		int choice;

		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1: {
				System.out.println("Enter first number");
				double a = new Scanner(System.in).nextDouble();
				System.out.println("Enter second number");
				double b = new Scanner(System.in).nextDouble();
				calculate(a, b, (u, g) -> u + g);
			}
				break;
			case 2: {
				System.out.println("Enter first number");
				double a = new Scanner(System.in).nextDouble();
				System.out.println("Enter second number");
				double b = new Scanner(System.in).nextDouble();
				calculate(a, b, (u, g) -> u - g);
			}
				break;
			case 3: {
				System.out.println("Enter first number");
				double a = new Scanner(System.in).nextDouble();
				System.out.println("Enter second number");
				double b = new Scanner(System.in).nextDouble();
				calculate(a, b, (u, g) -> u * g);
			}
				break;
			case 4: {
				System.out.println("Enter first number");
				double a = new Scanner(System.in).nextDouble();
				System.out.println("Enter second number");
				double b = new Scanner(System.in).nextDouble();
				calculate(a, b, (u, g) -> u / g);
			}
				break;

			}

		}
	}
}
