package Exercises;

import java.util.Scanner;

public class ExN16 {

	public static void exN16 () {
		System.out.println("������� �16");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ��� �� ������");
		double car = scanner.nextDouble();
		System.out.println("������� ��� �� ��������");
		double trip = scanner.nextDouble();
		
		int ans = (int) Math.ceil(trip / car);;
		System.out.println(ans);
		
		
	}

}