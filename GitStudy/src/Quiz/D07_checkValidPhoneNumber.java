package Quiz;

import java.util.Scanner;

public class D07_checkValidPhoneNumber {

	 /*
	 * ����ڷ� ���� �ڵ�����ȣ�� �Է� ������ �ùٸ� �ڵ�����ȣ�� �����ϴ� ���α׷��� �������� ���ڸ� ���� ���� X 000-0000-0000
	 * 
	 * ���� 3�ڸ��� ���� �ι��� ���ڴ� 3�ڸ� Ȥ�� 4�ڸ� ������ ���ڸ��� 4�ڸ� 
	 * 
	 * 000-0000-0000 = 13�� 
	 * 000-000 -0000  = 12��
	 */
	static boolean check = true;

	public static void checkNumber(String num) {
		
		if (num.length() == 13) {
			for (int i = 0; i < num.length(); ++i) {
				if (i == 3) {
					if (num.charAt(i) != '-') {
						Hypoon();
						checkFalse();
						break;
					}
				} else if (i == 8) {
					if (num.charAt(i) != '-') {
						Hypoon();
						checkFalse();
						break;
					}
				} else {
					if (num.charAt(i) < '0' || num.charAt(i) > '9') {
						stirngCheck();
						checkFalse();
						break;
					}
				}
			}
			if(check) {
				System.out.println("���������� ��ȭ��ȣ�� ����Ǿ����ϴ� >> " + num);			
			}
		} else if (num.length() == 12) {
			for (int i = 0; i < num.length(); ++i) {
				if (i == 3) {
					if (num.charAt(i) != '-') {
						Hypoon();
						checkFalse();
						break;
					}
				} else if (i == 7) {
					if (num.charAt(i) != '-') {
						Hypoon();
						checkFalse();
						break;
					}
				} else {
					if (num.charAt(i) < '0' || num.charAt(i) > '9' ) {
						stirngCheck();
						checkFalse();
						break;
					}
				}
			}
			if(check) {
				System.out.println("���������� ��ȭ��ȣ�� ����Ǿ����ϴ� >> " + num);			
			}
		} else {
			System.out.println("�߸��� ��ȣ�� �Է��ϼ̽��ϴ� ");
		}
	}
	
	public static void checkFalse() {
		check = false;
	}
	
	public static void Hypoon() {
		System.out.println("����Ǭ(-)����");
	}
	
	public static void stirngCheck() {
		System.out.println("���ڿ��� ��������");
	}

	public static void main(String[] args) {
		System.out.println("��ȭ��ȣ�� �Է����ּ��� EX) 000-0000-0000");
		Scanner sc = new Scanner(System.in);
		String number = sc.next();

		checkNumber(number);
	}
}
