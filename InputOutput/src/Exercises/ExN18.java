package Exercises;

import java.util.Scanner;

public class ExN18 {

	public static void exN18 () {
		System.out.println("Задание №18");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число h");
		int h = scanner.nextInt();
		System.out.println("Введите число a");
		int a = scanner.nextInt();
		System.out.println("Введите число b");
		int b = scanner.nextInt();
		
		int ans = (h / (a - b)) - ((a - (a - b)) / (a - b));
		
		System.out.println("Ответ " + ans);
		
	}

}