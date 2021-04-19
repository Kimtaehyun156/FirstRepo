package Quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C13_InputRightThing {

	/*
	 * ����ڷκ��� ���ڸ� ����� �Է¹����� ���� ��� �Է¹޴� ���α׷��� �������� (�߸��� ���� �ԷµǾ �������� �����ʰ� , �ùٸ� ����
	 * �ԷµǸ� ����� ���α׷� ���� )
	 */
	static Scanner sc = new Scanner(System.in); // System.in �� close�� ���� �ʴ°��� ����

	public static void main(String[] args) {

		int a = input("����> ");

		System.out.println("input �Լ��� �Է¹��� ��" + a);
		System.out.println(" ���α׷��� ���������� ����Ǿ����ϴ�");

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
