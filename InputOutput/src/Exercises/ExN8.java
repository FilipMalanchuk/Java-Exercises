package Exercises;

import java.util.Scanner;

public class ExN8 {

	public static void exN8 () {
		System.out.println("Задание №8");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число");
		int a = scanner.nextInt();
		scanner.nextLine();
		int hundred = (a % 1000) / 100;
		int dec = (a % 100) / 10;
		int ones = a % 10;
		int ans = hundred + dec + ones;
		System.out.println("Сумма чисел " + ans);
		
		
	}

}