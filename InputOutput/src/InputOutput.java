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
		case 3: ExN3.exN3();
		break;
		case 4: ExN4.exN4();
		break;
		case 5: ExN5.exN5();
		break;
		case 6: ExN6.exN6();
		break;
		case 7: ExN7.exN7();
		break;
		case 8: ExN8.exN8();
		break;
		case 9: ExN9.exN9();
		break;
		case 10: ExN10.exN10();
		break;
		
		
		
		
		default: System.out.println("нету такого задания");
		break;
		}
		
		System.out.println("Программа отработала");

	}

}
