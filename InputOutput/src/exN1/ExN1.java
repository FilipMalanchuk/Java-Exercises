package exN1;

import java.util.Scanner;

public class ExN1 {

	public static void exN1 () {
		System.out.println("������� �1");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� a");
		double a = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("������� b");
		double b = scanner.nextDouble();
		scanner.nextLine();
		
		double c = Math.hypot(a, b);
		
		System.out.println("answer N1 = " + c);
	}

}
