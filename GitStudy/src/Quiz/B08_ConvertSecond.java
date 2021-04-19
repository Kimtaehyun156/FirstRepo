package Quiz;

import java.util.Scanner;

public class B08_ConvertSecond {

	public static void main(String[] args) {

		/*
		 		초를 입력 받으면 년/일/시간/분/초로 변환하여 출력해보세요
		 		
		 		※ 필요없는 단위는 출력하지 말것 
		 		ex: 0년 0일 5시간 0분 20초인경우  
		 		1년 - 15768000
		 		1일  -  86400
		 		1시간 - 3600
		 		1분  - 60 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" 초를 입력해주세요 ");
		int second = sc.nextInt();
		
		// int second = new Scanner(System.in).nextInt();
		
		int year = 31536000;
		int day = 86400;
		int hour = 3600;
		int minute = 60;
		
		if(second >= year) {
			System.out.printf(" %d년 %d일 %d시간 %d분 %d초 ",(second/year) , ((second%year)/day) , ((second%year)%day)/hour , (((second%year)%day)%hour)/minute , (((second%year)%day)%hour)%minute);
		}else if(second >= day){
			System.out.printf(" %d일 %d시간 %d분 %d초 ",((second%year)/day) , ((second%year)%day)/hour , (((second%year)%day)%hour)/minute , (((second%year)%day)%hour)%minute);
		}else if(second >= hour) {
			System.out.printf(" %d시간 %d분 %d초 ",((second%year)%day)/hour , (((second%year)%day)%hour)/minute , (((second%year)%day)%hour)%minute);
		}else if(second >= minute) {
			System.out.printf(" %d분 %d초 ", (((second%year)%day)%hour)/minute , (((second%year)%day)%hour)%minute);
		}else if(second < minute && second >= 0) {
			System.out.printf(" %d초 " , (((second%year)%day)%hour)%minute);
		}else {
			System.out.println("양수만 입력해주세요 ");
			
		}
		
		
		// boolean exist = false ;  불리안 타입으로 체크해서 0이아닐떄 체크!
		// YEAR_PER _SECOND = // 변수 선언해서 더욱 깔끔하게 코딩하기
		// final 붙인 변수는 값 변경이 불가능하다 !! 
 

		
		
		
		
		
		
	}

}
