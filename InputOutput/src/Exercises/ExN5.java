package Exercises;

import java.util.Scanner;

public class ExN5 {

	public static void exN5 () {
		System.out.println("������� �5");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �����");
		int a = scanner.nextInt();
		scanner.nextLine();
		int ans = a % 10;
		System.out.println("��������� ����� " + ans);
		
		
	}

}