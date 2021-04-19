package Quiz;

import java.util.Random;
import java.util.Scanner;

public class B16_GuessNumberGame {

	public static void main(String[] args) {
	
		/*
		 		게임이 시작되면 랜덤으로 4자리의 숫자가 선정된다 
		 		player는 8번의 시도를 할수 있다 
		 		각 시도마다 4자리의 숫자를 입력하면 다음과가이 알려준다 
		 		
		 		숫자와 위치가 다 맞을경우 - Strike 
		 		숫자만 맞을경우 -Ball 
		 		
		 		ex)  정답이 3456일떄 - 
		 		당신 >> 5634  - 4ball
		 			>> 3789  -  1Strike 
		 			>> 3654  -  1Strike 3 Ball 
		 			
		 		맞추고 나면 몇번만에 맞췄는지 알려주기 
		 */
		Random rand = new Random();
		int user_try = 0;
		
		//참조형 변수는 null로 초기화한다 
		String answer="";
		
		for (int i = 0; i < 4; i++) {
			answer += rand.nextInt(9);
		}
		while(true) {
			System.out.println("숫자 4자리를 입력 >>  ");
			Scanner sc = new Scanner(System.in);
			String input = sc.next();
			
			boolean numeric = true;
			
			int Strike = 0;
			int ball =0;
			
			
			if(input.length() != 4) {
				System.out.println("4자리가 아닙니다 ");
				continue;
			}
			
			for(int k=0; k < 4; ++k) {
				if (input.charAt(k) < '0' || input.charAt(k) > '9') {
					numeric = false;
					break;
				}
			}
			
			if(!numeric) {
				System.out.println("4자리 숫자만 입력해주세요 !!!!");
			}


			if(numeric) {
				
				System.out.println(answer); // 정답 체크용도 
				user_try++;
				
				for(int j=0; j < 4; ++j) {
					if(input.charAt(j) == answer.charAt(j)) {
						Strike++;	
					}else {
						for(int i = 0; i < 4;  ++i) {
							if(input.charAt(i) == answer.charAt(j)) {
								ball++;
							}
						}
					}
				}
			}
			
			if(numeric ==  true) {
				
				System.out.printf(" %d번쨰 시도 Strike :%d  ball :%d ",user_try,Strike,ball);
				System.out.println();
				
				if( user_try == 8 ) {
					System.out.println("8번시도하셔서 실패입니다..");
					break;
				}
				if( Strike == 4) {
					System.out.println("정답입니다!!");
					break;
				}
			}
		}

	}

}
