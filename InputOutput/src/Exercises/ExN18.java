package Exercises;

import java.util.Scanner;

public class ExN18 {

	public static void exN18 () {
		System.out.println("������� �18");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ����� h");
		int h = scanner.nextInt();
		System.out.println("������� ����� a");
		int a = scanner.nextInt();
		System.out.println("������� ����� b");
		int b = scanner.nextInt();
		
		int ans = (h / (a - b)) - ((a - (a - b)) / (a - b));
		
		System.out.println("����� " + ans);
		
	}

}