package Exercises;

import java.util.Scanner;

public class ExN6 {

	public static void exN6 () {
		System.out.println("������� �6");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �����");
		int a = scanner.nextInt();
		scanner.nextLine();
		int ans = (a % 100) / 10;
		System.out.println("������������� ����� " + ans);
		
		
	}

}