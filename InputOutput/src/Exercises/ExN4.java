package Exercises;

import java.util.Scanner;

public class ExN4 {

	public static void exN4 () {
		System.out.println("������� �4");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ����� N");
		int N = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ����� K");
		int K = scanner.nextInt();
		scanner.nextLine();
		int ans = K % N;
		System.out.println("�������� " + ans);
		
		
	}

}