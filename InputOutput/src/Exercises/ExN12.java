package Exercises;

import java.util.Scanner;

public class ExN12 {

	public static void exN12 () {
		System.out.println("������� �12");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ����� a");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ����� b");
		int b = scanner.nextInt();
		scanner.nextLine();
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a = "+ a + ", b = "+ b);
		
		
		
	}

}