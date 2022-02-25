package Exercises;

import java.util.Scanner;

public class ExN16 {

	public static void exN16 () {
		System.out.println("Задание №16");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите кол км машины");
		double car = scanner.nextDouble();
		System.out.println("Введите кол км маршрута");
		double trip = scanner.nextDouble();
		
		int ans = (int) Math.ceil(trip / car);;
		System.out.println(ans);
		
		
	}

}