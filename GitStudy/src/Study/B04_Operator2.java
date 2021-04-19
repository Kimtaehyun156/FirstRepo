package Study;

public class B04_Operator2 {

	public static void main(String[] args) {

		
		/*
		 		# 비교 연산자 
		 		- 비교 연산의 결과는 참 또는 거짓이다 (boolean 타입이다)
		 		- 산술 연산과 비교연산이 함께 있으면 산술연산 먼저 계산을 한다.
		 */
		
		int a = 8 , b =5 ;
		
		System.out.printf("a = %d , b = %d 일떄 \n",a,b);
		System.out.println("a > b : "  + (a > b)); //참
		System.out.println("a < b : "  + (a < b)); //거짓
		System.out.println("a >= b : " + (a >= b)); //참
		System.out.println("a <= b : " + (a <= b)); //거짓
		System.out.println("a == b : " + (a == b)); // 두값이 같으면 트루
		System.out.println("a != b : " + (a != b)); // 두값이 다르면 트루  
		
		
		/*
		 		# 논리 연산자
		 		- boolean 타입 값으로 하는 연산
		 		- && : 양 옆의 값이 모두 true일 떄만  true (AND 연산자)
		 		- || : 양 옆의 값이 하나라도 true일 떄 true (OR 연산자)
		 		- ! : true 면 false , false 면 true (NOT 연산자)
		 		
		 */
		
		System.out.println("========AND(&&) 연산 ========");
		System.out.println("true && true : " + (true && true));
		System.out.println("true && false : " + (true && false));
		System.out.println("false && true : " + (false && true));
		System.out.println("false && false : " + (false && false));
		
		System.out.println("========OR(||) 연산 ========");
		System.out.println("true || true : " + (true || true));
		System.out.println("true || false : " + (true || false));
		System.out.println("false || true : " + (false || true));
		System.out.println("false || false : " + (false || false));
		
		System.out.println("========NOT(!) 연산 ========");
		System.out.println("!true : " + (!true));
		System.out.println("!false : " + (!false));
		
		
		int x= 4, y = 7 , z =10;
		
		System.out.println("x가 5보다 크고 3의배수면 통과"+(x > 5 && x % 3 == 0));
		System.out.println("3개 모두 3의배수면 통괴 : "+ (x % 3 ==0 && y%3 ==0 && z % 3 ==0));
		
		
		// 연습문제 : x . y , z 가 모두 3의배수가 아닐때 true가 나오는 비교연산을 만들어보세요 
		
		System.out.println( x%3 !=0 && y%3 !=0 && z%3 !=0 );
		
		// !(A AND B) -> !A OR !B  
		
		
			
	}

}
