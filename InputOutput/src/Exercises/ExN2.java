package Exercises;

import java.util.Scanner;

public class ExN2 {

	public static void exN2 () {
		System.out.println("Задание №2");
		System.out.println("Введите число ");
		Scanner scanner = new Scanner(System.in);
		int myNum = scanner.nextInt();
		scanner.nextLine();
		System.out.println("The next number for the number " + myNum + " is " + (myNum + 1) + ".");
		System.out.println("The previous number for the number " + myNum + " is " + (myNum - 1) + ".");
		
	}

}
