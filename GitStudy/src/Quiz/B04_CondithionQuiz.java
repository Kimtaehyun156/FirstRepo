package Quiz;

import java.util.Scanner;

public class B04_CondithionQuiz {

	public static void main(String[] args) {

		/*
		 * [ 알맞은 비교연산을 만들어보세요 ]
		 * 
		 * - 비교를 할 떄 변수가 왼쪽에 있는것이 좋다 (일종의 암묵적인 룰)
		 * - Ctrl + shift + F ( 자동정렬) 
		 * - boolean 타입의 변수는 조건으로 단독으로 사용이 가능하다 
		 * - 문자열은(참조형 타입) == 으로 비교해서는 안된다
		 * - 참조형 타입의 값을 비교할떄는 해당 클래스에 저으이 되어 있는 equals()라는 메서드를 이용해야한다 
		 */

//		// 1. int형 변수 a가 10보다 크고 20보다 작을 때 true
//		System.out.println("a 를 입력해주세요 (10보다 크고 20보다 작을 때 true) ");
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		System.out.println(a > 10 && a < 20);
//
//		// 2. int형 변수 b가 짝수일 때 true
//		System.out.println("b 를 입력해주세요 (짝수일 때 true) ");
//		Scanner sc2 = new Scanner(System.in);
//		int b = sc2.nextInt();
//		System.out.println(b % 2 == 0);
//
//		// 3. int형 변수 c가 7의 배수일 때 true
//		System.out.println("c 를 입력해주세요 (7의 배수일 때 true) ");
//		Scanner sc3 = new Scanner(System.in);
//		int c = sc3.nextInt();
//		System.out.println(c % 7 == 0);
//
//		// 4. int형 변수 hour가 0미만 24이상이 아니고, 12이상일 때 true
//		System.out.println("hour 를 입력해주세요 (0미만 24이상이 아니고, 12이상일 때 true) ");
//		Scanner sc4 = new Scanner(System.in);
//		int hour = sc4.nextInt();
//		System.out.println(12 <= hour && hour < 24);
//
//		// 5. int형 변수 d와 e의 차이가 30일 때 true
//		System.out.println("d와 e을 입력받습니다 d 와 e 차이가 30일 때 ture");
//		System.out.println("int형 변수 d 를 입력해주세요");
//		Scanner sc5 = new Scanner(System.in);
//		int d = sc5.nextInt();
//
//		System.out.println("int형 변수 e 를 입력해주세요");
//		Scanner sc6 = new Scanner(System.in);
//		int e = sc6.nextInt();
//		System.out.println((d - e) == 30 || (d - e) == -30);
//		System.out.println(Math.abs(d-e)== 30);
//
//		// 6. int형 변수 year가 400으로 나누어 떨어지거나 또는 4로 나누어 떨어지고 100으로 나누어떨어지지 않을 때 true
//		System.out.println("year 를 입력해주세요( 400으로 나누어 떨어지거나 또는 4로 나누어 떨어지고 100으로 나누어떨어지지 않을 때 true)");
//		Scanner sc7 = new Scanner(System.in);
//		int year = sc7.nextInt();
//		System.out.println(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
//
//		// 7. 민수가 철수보다 2살 많으면 true
//		System.out.println("민수가 철수보다 나이를 입력받습니다 (2살 많으면 true)");
//		System.out.println("민수 나이 입력해주세요");
//		Scanner sc8 = new Scanner(System.in);
//		int minsu_age = sc8.nextInt();
//
//		System.out.println("철수 나이 입력해주세요");
//		Scanner sc9 = new Scanner(System.in);
//		int chulsoo_age = sc9.nextInt();
//		System.out.println(2 <= (minsu_age - chulsoo_age));
//
//		// 8. 민수가 철수보다 생일이 3달 빠르면 true
//		int minsu_Month = 9, chulsoo_Month = 12;
//		System.out.println(-3 >= (minsu_Month - chulsoo_Month));
//
//		// 9. boolean형 변수 powerOn이 false일 때 true
//		boolean powerOn = true;
//		System.out.println(!powerOn);
//
//		// 10. 문자열 참조변수 str이 "yes"일 때 true
//		String str = "yes";
//		String str_check = "yes";
//		System.out.println(str == str_check);
//		System.out.println(str.equals(str_check));
//
//		sc.close();
//		sc2.close();
//		sc3.close();
//		sc4.close(); 
//		sc5.close();
//		sc6.close();
//		sc7.close();
//		sc8.close();
//		sc9.close();
		
		// # 기본형 타입과 참조형 타입의 차이
		// - 기본 타입은 내부 데이터의 크기를 예측하기 쉽다  (차곡차곡 쌓이는 메모리)  - 스텍(Stack)
		// - 참조형 타입은 내부 데이터의 크기를 예측하기 어렵다 (크기를 몰라서 가상의 메모리로 만들어놓고 주소값을 참조하고 있다 ) - 힙(Heap)
		
		String str1 = "yes";
		String str2 = new String("yes");
		String str3 = "yes";
		
		System.out.println("str1 == str2 : " + (str1 == str2 ));
		System.out.println("str1 == str2(equals) : " + (str1.equals(str2)));
		System.out.println("str1 == str3 : " + (str1 == str3 ));

	}
}
