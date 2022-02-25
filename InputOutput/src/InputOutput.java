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
		case 11: ExN11.exN11();
		break;
		case 12: ExN12.exN12();
		break;
		case 13: ExN13.exN13();
		break;
		case 14: ExN14.exN14();
		break;
		case 15: ExN15.exN15();
		break;
		case 16: ExN16.exN16();
		break;
		case 17: ExN17.exN17();
		break;
		case 18: ExN18.exN18();
		break;
		case 19: ExN19.exN19();
		break;
		case 20: ExN20.exN20();
		break;
		
		
		
		default: System.out.println("нету такого задания");
		break;
		}
		
		System.out.println("Программа отработала");

	}

}
