package Exercises;

import java.util.Scanner;

public class ExN19 {

	public static void exN19 () {
		System.out.println("Задание №19");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число");
		int n = scanner.nextInt();
		int ones = n % 10;
		int dec = (n % 100) / 10;
		int hund = (n % 1000) / 100;
		int thous = n / 1000;
		
		int reverse = (ones * 1000) + (dec * 100) + (hund * 10) + thous;
		
		System.out.println("Ответ " + (n - reverse + 1));
		
	}

}