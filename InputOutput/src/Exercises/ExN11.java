package Exercises;

import java.util.Scanner;

public class ExN11 {

	public static void exN11 () {
		System.out.println("������� �11");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �����");
		int n = scanner.nextInt();
		scanner.nextLine();
		int s = n % 60;
		int m = (n / 60) % 60;
		int h = ((n / 60) / 60) % 24;
		
		
		System.out.print("����� �� ����� " + h + ":");
		if (m <10) {
			System.out.print("0");
		}
		System.out.print(m +":");
		if (s <10) {
			System.out.print("0");
		}
		System.out.print(s +"\n");
		
		
	}

}