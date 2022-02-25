package Exercises;

import java.util.Scanner;

public class ExN15 {

	public static void exN15 () {
		System.out.println("Задание №15");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите данные времени 1");
		System.out.println("Введите количество часов");
		int h1 = scanner.nextInt();
		System.out.println("Введите количество минут");
		int m1 = scanner.nextInt();
		System.out.println("Введите количество секунд");
		int s1 = scanner.nextInt();
		
		System.out.println("Введите данные времени 2");
		System.out.println("Введите количество часов");
		int h2 = scanner.nextInt();
		System.out.println("Введите количество минут");
		int m2 = scanner.nextInt();
		System.out.println("Введите количество секунд");
		int s2 = scanner.nextInt();
		
		int ans = ((h2 * 60* 60) + (m2 * 60) + s2) - ((h1 * 60* 60) + (m1 * 60) + s1);
		
		
		System.out.println("Ответ " + ans);
		
		
	}

}