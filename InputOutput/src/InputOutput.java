import java.util.Scanner;
import java.math.*;

import test.test;


public class InputOutput {

	public static void main(String[] args) {
		//exN1();
		test.testing(args);

	}
	
	public static void exN1 () {
		System.out.println("Задание №1");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите a");
		double a = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Введите b");
		double b = scanner.nextDouble();
		scanner.nextLine();
		
		double c = Math.hypot(a, b);
		
		System.out.println("answer N1 = " + c);
	}

}
