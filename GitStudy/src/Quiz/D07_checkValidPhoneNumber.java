package Quiz;

import java.util.Scanner;

public class D07_checkValidPhoneNumber {

	 /*
	 * 사용자로 부터 핸드폰번호를 입력 받으면 올바른 핸드폰번호를 구분하는 프로그램을 만들어보세요 숫자만 포함 문자 X 000-0000-0000
	 * 
	 * 앞의 3자리가 숫자 두번쨰 숫자는 3자리 혹은 4자리 세번쨰 숫자리는 4자리 
	 * 
	 * 000-0000-0000 = 13개 
	 * 000-000 -0000  = 12개
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
				System.out.println("정상적으로 전화번호가 저장되었습니다 >> " + num);			
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
				System.out.println("정상적으로 전화번호가 저장되었습니다 >> " + num);			
			}
		} else {
			System.out.println("잘못된 번호를 입력하셨습니다 ");
		}
	}
	
	public static void checkFalse() {
		check = false;
	}
	
	public static void Hypoon() {
		System.out.println("하이푼(-)없음");
	}
	
	public static void stirngCheck() {
		System.out.println("문자열이 섞여있음");
	}

	public static void main(String[] args) {
		System.out.println("전화번호를 입력해주세요 EX) 000-0000-0000");
		Scanner sc = new Scanner(System.in);
		String number = sc.next();

		checkNumber(number);
	}
}
