import Exercises.*;
import java.util.Scanner;


public class InputOutput {

	public static void main(String[] args) {
		System.out.println("Введите номер задачи которую хотите запустить");
		Scanner scanner = new Scanner(System.in);
		int exToCheck = scanner.nextInt();
		
		switch(exToCheck) {
		case 1: ExN1.exN1();
		break;
		case 2: ExN2.exN2();
		break;
		
		
		
		
		default: System.out.println("нету такого задания");
		break;
		}
		
		System.out.println("Программа отработала");

	}

}
