package Exercises;

import java.util.Scanner;

public class ExN13 {

	public static void exN13 () {
		System.out.println("Задание №13");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число");
		int n = scanner.nextInt();
		int startMin = 540;
		int five = (n / 2) * 5;// 2 4 6 8 10
		int fifteen = ((n / 2 + n % 2) - 1) * 15;
		int endTime = startMin + ((45 * n) + five + fifteen);
		System.out.println(endTime / 60 + ":" + endTime % 60);
		
	}

}