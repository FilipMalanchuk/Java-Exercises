package Exercises;

import java.util.Scanner;

public class ExN3 {

	public static void exN3 () {
		System.out.println("������� �3");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ����� N");
		int N = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ����� K");
		int K = scanner.nextInt();
		scanner.nextLine();
		int ans = K / N;
		System.out.println("������� ��������� �� " + ans);
		
		
	}

}