package Exercises;

import java.util.Scanner;

public class ExN14 {

	public static void exN14 () {
		System.out.println("Задание №14");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите цену руб");
		int a = scanner.nextInt();
		System.out.println("Введите цену коп");
		int b = scanner.nextInt();
		System.out.println("Введите колличество");
		int n = scanner.nextInt();
		
		int allPriceRub = (n * a)+((n * b) / 100);
		int allPriceCop = (n * b) % 100;
		System.out.println("Суммарно : "+ allPriceRub + "."+ allPriceCop);
		
		
	}

}