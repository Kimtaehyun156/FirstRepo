package Quiz;

import java.util.Scanner;

public class B03_celToFahr {

	public static void main(String[] args) {
		
		/*
		 		사용자로부터 섭씨 온도를 입력받으면 
		 		화씨 온도로 변환하여 출력해주는 프로그램을 만들어 보세요 
		 		(변환 공식은 구글검색 , 출력은 소수 첫째 자리까지)
		 		1 섭씨온도는 = 화씨온도 33.8도
		 		(1 *9/5) + 32 = 33.8 
		 */
		
		System.out.println("섭씨온도를 화씨온도로 출력해주는 프로그램입니다 섭씨온도를 입력해주세요 : ");
		
		Scanner sc = new Scanner(System.in);
		double celsius  = sc.nextDouble();
		
		double fahrenheit =  (celsius *9/5) + 32 ;
		
		System.out.println(" 입력하신 썹씨온도는 : "+ celsius + " ℃ 입니다");  
		System.out.printf(" 변환한 화씨 온도는 : %.1f ℉ 입니다 ", fahrenheit );

	}

}
