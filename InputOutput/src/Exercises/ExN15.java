package Exercises;

import java.util.Scanner;

public class ExN15 {

	public static void exN15 () {
		System.out.println("������� �15");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ������ ������� 1");
		System.out.println("������� ���������� �����");
		int h1 = scanner.nextInt();
		System.out.println("������� ���������� �����");
		int m1 = scanner.nextInt();
		System.out.println("������� ���������� ������");
		int s1 = scanner.nextInt();
		
		System.out.println("������� ������ ������� 2");
		System.out.println("������� ���������� �����");
		int h2 = scanner.nextInt();
		System.out.println("������� ���������� �����");
		int m2 = scanner.nextInt();
		System.out.println("������� ���������� ������");
		int s2 = scanner.nextInt();
		
		int ans = ((h2 * 60* 60) + (m2 * 60) + s2) - ((h1 * 60* 60) + (m1 * 60) + s1);
		
		
		System.out.println("����� " + ans);
		
		
	}

}