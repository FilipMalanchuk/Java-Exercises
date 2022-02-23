package Exercises;

import java.util.Scanner;

public class ExN10 {

	public static void exN10 () {
		System.out.println("Задание №10");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число");
		int n = scanner.nextInt();
		scanner.nextLine();
		int h = (n % 1440) / 60;
		int m = (n % 1440) % 60;
		
		
		System.out.println("время на часах " + h + " часов " + m + " минут");
		
		
	}

}