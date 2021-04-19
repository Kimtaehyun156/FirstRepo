package Quiz;

import java.util.Scanner;

public class B03_wonToDollar {

	public static void main(String[] args) {
		
//		double dollar = 1122.80f;
//		
//		// 한국 돈을 입력하면 미국 달러로 환전해주는 프로그램을 만들어보세요 
//		// (현재 환율 1달러당 = 1,122.80 원 ) 소수둘쨰까지 출력 ,  환전 수수료는 1.75% 
//		
//		
//		
//		System.out.println("한국 돈을 미국달러로 환전해주는 프로그램입니다 얼마를 환전하시겠습니까 ?");
//		
//		Scanner sc = new Scanner(System.in);
//		int user_money = sc.nextInt();
//		
//		double commission = user_money * 0.0175; // 환전 수수료 
//		
//		double dollar_money = ( (user_money - commission) / dollar);
//		
//		System.out.printf(" 입력하신 돈을 환전하면 %.2f 달러 입니다", dollar_money);
//		
		

//		// final이 함께 선언된 변수는 나중에 값을 변경할 수 없다 
		final double WON_TO_DOLLAR = 0.00089; // 환전 수수료 변하지 않을값은 대문자
		
		Scanner sc = new Scanner(System.in);
		System.out.println("한국 돈을 미국달러로 환전해주는 프로그램입니다 얼마를 환전하시겠습니까.(수수료 1.75%) ");
		int korMoney = sc.nextInt();
		
		double usd = korMoney * WON_TO_DOLLAR;
		double exchange_fee = usd * 0.0175;
		
		//printf 출력
		System.out.printf(" 입력하신 돈 %d 원을 환전하면 %.2f 달러 입니다", korMoney ,(usd- exchange_fee));
		System.out.println();
		
		
		//println 출력 
		System.out.println(Math.round((usd*0.9825)*100)/100.0);

	}

}
