package Exercises;

import java.util.Scanner;

public class ExN20 {

	public static void exN20 () {
		System.out.println("Задание №20");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число a");
		int a = scanner.nextInt();
		System.out.println("Введите число b");
		int b = scanner.nextInt();
		
		int ans = (a % b) * (b % a) + 1;
		System.out.println("Ответ " + ans);
		
		
	}

}