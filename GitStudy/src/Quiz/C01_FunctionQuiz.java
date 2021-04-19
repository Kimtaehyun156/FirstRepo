package Quiz;

import java.util.Arrays;

public class C01_FunctionQuiz {

	/*
	 		# 다음의 함수를 정의하고 올바르게 동작하는지 테스트해보세요 
	 		
	 		1. 전달한 문자가 알파벳이면 true 반환 아니면 false 반환
	 		2. 전달한 문자가 3의 배수이면 true 반환 아니면 false 반환
	 		3. 숫자하나 전달하면 문자열 "짝수입니다 " 또는 "홀수입니다" 를 반환하는 함수 
	 		4. 숫자를 전달하면 해당 숫자의 모든약수를 배열 형태로 반환하는 함수 
	 		5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수 
	 		6. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수 
	 		 factorial ; (n) * (n-1) * ( n-2 ) .... 3*2*1
	 		- 리턴 타입 void는 해당 함수가 반환하는 값이 없다는걸을 나타낸다
	 */
	
	
	//1. 전달한 문자가 알파벳이면 true 반환 아니면 false 반환 
	public static boolean AlphabetCheck( char alphabet) {
		
		if(alphabet >='a' && alphabet <= 'z' ) {
			return true;
		}else if(alphabet >='A' && alphabet <= 'Z') {
			return true;
		}else {
			return false;
		}
		
//		return (ch >= 'A' && ch <= 'z' || ch>= 'a' && ch <= 'z');
	}
	
	//2. 전달한 문자가 3의 배수이면 true 반환 아니면 false 반환
	public static boolean Multiple3( int num) {
		if(num % 3 == 0) {
			return true;
		}else {
			return false;
		}
		
		//return num % 3 == 0;
	}
	
	
	//3. 숫자하나 전달하면 문자열 "짝수입니다 " 또는 "홀수입니다" 를 반환하는 함수
	public static String Sniffling(int num) {
		if(num % 2 == 0 ){
			return "짝수입니다"; 
		}else {
			return "홀수입니다"; 
		}
		
		// return num % 2 == 0 ? "짝수입니다 "  : "홀수입니다 " ;
	}
	
	//4. 숫자를 전달하면 해당 숫자의 모든약수를 배열 형태로 반환하는 함수 
//	public static StringBuilder Measure(int num) {
//		StringBuilder mea = new StringBuilder();
//		for (int i = 1 ; i <= num; ++i) {   
//			
//			if(i == 1) {
//				mea.append(i);
//			}else if(num % i == 0) {
//					mea.append(i);
//			}else if(i == num) {
//				mea.append(i);
//			}
//		}
//		return mea;
//	}
	
	public static int[] findDivide(int num) {
		
		boolean[] divide = new boolean[num];
		int count = 0 ;
		for(int i=1; i <= num; ++i) {
			if(num % i == 0) {
				divide[i -1] = true;
				count++;
			}
		}
		
		int[] result = new int[count];
		int index = 0 ;
		
		for (int i = 0 ; i < divide.length; ++i) {
			if(divide[i]) {
				result[index++] = i + 1;
			}
		}
		return result;
	}
	
	
	//5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	public static boolean Decimal(int num) {
		for(int i = 2; i < num; ++i) {
			if( num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	//6. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수 
	// factorial ; (n) * (n-1) * ( n-2 ) .... 3*2*1
	public static int factorial(int num) {
//		int sum=num;
//		for(int i=1; i <= num; ++i) {
//				if( num - i !=0) {
//					sum *= num-i;
//				}
//			}
//
//		return sum;
//		
		if( num == 2) {
			return 2;
		}
		
		return num * factorial(num -1);
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		//1번 실행 
		System.out.println(AlphabetCheck('k'));
		//2번 실행
		System.out.println(Multiple3(15));
		//3번 실행
		System.out.println(Sniffling(6));
		//4번 실행 
		System.out.println(Arrays.toString(findDivide(40)));
		//5번 실행 
		System.out.println(Decimal(4));
		//6번 실행
		System.out.println(factorial(10));
		
	}

}
