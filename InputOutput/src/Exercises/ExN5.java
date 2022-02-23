package Exercises;

import java.util.Scanner;

public class ExN5 {

	public static void exN5 () {
		System.out.println("Задание №5");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число");
		int a = scanner.nextInt();
		scanner.nextLine();
		int ans = a % 10;
		System.out.println("Последняя цифра " + ans);
		
		
	}

}