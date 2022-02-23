package Exercises;

import java.util.Scanner;

public class ExN3 {

	public static void exN3 () {
		System.out.println("Задание №3");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число N");
		int N = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Введите число K");
		int K = scanner.nextInt();
		scanner.nextLine();
		int ans = K / N;
		System.out.println("Каждому досталось по " + ans);
		
		
	}

}