package Study;

public class B11_For {
	
	public static void main(String[] args) {
		
		
		/*
		 		# 반복문 (Loop)
		 		- for , while , do-while(x ,안배움 ) , forEach(향상된 포문)
		 		- 똑같은 코드를 여러번 반복하고 싶을 때 사용한다 	
		 		
		 		
		 		for (초기값; 조건; 증가값){
		 			가운데 있는 조건이 true인 동안 반복될 명령어들을 적는 곳
		 		}
		 */
		
		// 1. 가장 기본적인 형태의 for문 
		// - 원하는 횟수만큼 반복하기 가장 좋은 형태의 for문
		// - 초기값에는 0을주고 조건에는 반복하고 싶은 횟수를 적으면 된다
		// - 증가는 1씩 + 한다 
		for (int i = 0; i < 100; ++i) {
			System.out.println("hello, world! "+ i);
		}
		
		
		// 2. 초기값 ,증가값, 조건은 마음대로 변경할 수 있다 
		for(int i = 70; i< 555; i+=10) {
			System.out.println(i);
		}
		
		for(int i = 9000; i >= 0; i-=100) {
			System.out.println("2번쨰 반복문 " + i);
		}
		
		// 3. 초기값과 증가갑의 위치는 마음대로 변경할 수 있다
		int x = 0;
		for(; x<10; ){
			System.out.println("3번쨰 반복문" + x++);
		}
		
		// 변수는 자신이 속한 중괄호를 벗어나면 죽는다 (변수의 생명주기 ) 
		
		// 4. 반복문 내부에 다른 문법들도 자유롭게 사용할 수 있다
		for(int month = 1; month <= 12; ++month) {
				
		    switch(month) {
	         case 3: case 4: case 5: 
	            System.out.println("봄입니다");
	            break;
	         case 6: case 7: case 8: 
	            System.out.println("여름입니다");
	            break;
	         case 9: case 10: case 11: 
	            System.out.println("가을입니다");
	            break;
	         case 12: case 1: case 2: 
	            System.out.println("겨울입니다");
	            break;
	         default:
	            System.out.println("1~12월 에맞는 값을 넣어주세요");
	            break;
	      }
	      
		}
		
		// 5. for문은 조건을 비워놓으면[for(;;)] 무한반복한다
		// 조건을 해서 break문을 사용해서 탈출할수있다 
		int count =0;
		
		for(;;) {
			System.out.println("hello" +  count++);
			if( count == 7) {
				break;
			}
		}
		
		// 6. 반복문 내부에서 continue를 만나면 바로 다음번 반복으로 넘어간다 
		for(int i = 0; i <= 50; ++i) {
			System.out.printf("%2d ", i);
			
			if(i %10 != 0) {
				continue;
			}
			
			System.out.println(); //줄바꿈 
		}
		
		int count_check = 0; //카운트하여 줄바꿈 하기위한 변수!
		// 연습문제 :continue를 이용하여 5천부터 100사이에 존재하는 홀수만 출력하기 
		for(int i=5000; i>=100; --i) {
			
			
			if(i%2 != 1){
				continue;	//짝수일떄는 continue를 만나서 출력이 되지않는다 
			}
			count_check++;
			System.out.print(i+" ");
			
			if(count_check %10 == 0) {
				System.out.println();
			}
			
		}
		
		/*
			7.반복문으로 총합 구하기
			(1) 반복문 바깥쪽에 총합을 저장할 변수를하나 선언하고 0으로 초기화한다 
			(2) 반복문을 진행하면 해당변수에 값을 누적시킨다 
			 
		*/
		// 80부터 333사이의 3의배수의 총합을 구해보기 
		int sum = 0;
		
		for(int i=80; i<=333; ++i) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		
		System.out.println("80부터 333사이의 3의배수 총합 : " + sum);
		
		
	}
}
