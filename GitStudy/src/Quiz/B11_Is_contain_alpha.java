package Quiz;

import java.util.Scanner;

public class B11_Is_contain_alpha {

	/*
	 	사용자가 입력한 문자열에 알파벳이 포함되어있으면 true출력 없으면 false
	 */
	
	public static void main(String[] args) {
		
		System.out.println("문자열을 입력하세요 알파벳 체크합니다 : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		// 97~122 65~90
		for(int i = 0; i < str.length(); ++i) {
			
			if(((int)str.charAt(i)) >= 'a' && ((int)str.charAt(i)) <= 'z' ) {
				System.out.println("true");
			}else if(((int)str.charAt(i)) >= 'A' && ((int)str.charAt(i)) <= 'Z' ) {
				System.out.println("true" );
			}else {
				System.out.println("false");
			}
		}
		
		sc.close();
	}

}
