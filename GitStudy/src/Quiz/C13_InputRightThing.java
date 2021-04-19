package Quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C13_InputRightThing {

	/*
	 * 사용자로부터 숫자를 제대로 입력받을때 까지 계속 입력받는 프로그램을 만들어보세요 (잘못된 값이 입력되어도 강제종료 되지않고 , 올바른 값이
	 * 입력되면 출력후 프로그램 종료 )
	 */
	static Scanner sc = new Scanner(System.in); // System.in 은 close를 하지 않는것이 좋음

	public static void main(String[] args) {

		int a = input("숫자> ");

		System.out.println("input 함수로 입력받은 값" + a);
		System.out.println(" 프로그램이 정상적으로 종료되었습니다");

	}

	public static int input(String message) {
		int num;

		while (true) {
			try {
				System.out.print(message);
				num = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				sc.nextLine();
			}
		}
		return num;
	}
}
