package Quiz;

import java.util.Scanner;

public class B11_Is_numeric_str {

	public static void main(String[] args) {
		
		/*
		 	입력받은 문자열에 숫자만 포함되어있으면 result = 1을 출력 
		 	다른 문자가 포함되어 있다면 result = 0을출력 
		 */
		
		int result =0; 
		int check=0;
	
		System.out.println("문자열을 입력하세요 숫자 체크합니다 : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int i = 0; i < str.length(); ++i) {
			

			if(str.charAt(i) < '0' || str.charAt(i) > '9') {
				check++;
			} 
		}
		
		if(check == 0) {
			result = 1;
			System.out.println("숫자만 포함되어있습니다  result : "+ result + " 입니다");
		}else {
			System.out.println("다른문자가 포함되어있습니다  result : "+ result + " 입니다");
		}

		sc.close();
	}
	

}
