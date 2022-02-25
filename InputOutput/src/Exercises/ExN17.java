package Exercises;

import java.util.Scanner;

public class ExN17 {

	public static void exN17 () {
		System.out.println("Задание №17");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число n");
		int n = scanner.nextInt();
		System.out.println("Введите число k");
		int k = scanner.nextInt();
		int ans = (k % n) % n;
		System.out.println("Ответ - "+ ans);
		
		
	}

}