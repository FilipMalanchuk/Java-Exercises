package Exercises;

import java.util.Scanner;

public class ExN9 {

	public static void exN9 () {
		System.out.println("Задание №9");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число");
		int a = scanner.nextInt();
		scanner.nextLine();
		int ans = a + 2 - (a % 2);
		
		System.out.println("Следующее парное " + ans);
		
		
	}

}