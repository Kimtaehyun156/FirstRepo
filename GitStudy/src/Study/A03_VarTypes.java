package Study;

public class A03_VarTypes {

	public static void main(String[] args) {
		
		/*
		 		# 정수 타입 
		 		- byte	(1byte)
		 			1byte => 8bit 
		 			
		 			 0000 0000 (0) ~ 1111 1111 (255)
		 			
		 			 ※ 첫 번쨰 bit는 부호 비트로 사용된다 
		 			 
		 			 byte 타입의 양수 범위 0000 0000 (0)  ~ 0111 1111 (127)
		 			 byte 타입의 양수 범위 1000 0000(-128)~ 1111 1111 (-1)
		 			 
		 			 2 ^ 1 = 2가지
		 			 2 ^ 2 = 4가지
		 			 2 ^ 3 = 8가지
		 			 2 ^ 4 = 16가지
		 			 2 ^ 5 = 32가지
		 			 2 ^ 6 = 64가지
		 			 2 ^ 7 = 128가지
		 			 2 ^ 8 = 256가지
		 			 
		 		
		 		- short	(2byte)
		 			2byte -> 16bit 
		 			2 ^ 16 - 65536가지 
		 			
		 			short의 양수범위  0 ~ 32767
		 			short의 음수범위  -32768 ~ -1
		 			
		 		- char	(2byte , unsigned)
		 			2byte -> 16bit 
		 			
		 			2 ^ 16 - 65536 가지 이지만 
		 			char는 양수만 나타내기때문에  0 ~ 65536 나타내는 타입이다
		 			주로 문자 코드를 저장하는데 사용한다 (문자타입)
		 		
		 		- int	(4byte)
		 			4byte => 32bit
		 			2 ^ 32 - 4,294,967,296가지 
		 			
		 			int의 양수범위는 0 ~ 2,147,483,647
		 			int의 음수범위는 -2,147,483,648  ~ -1  
		 		 	
		 		- long	(8byte)
		 			8byte = 64bit 
		 			2 ^ 64 =  ...
		 			
		 			
		 		*/
				
				byte  min_Byte = -128;
				byte  max_Byte = 127;
				System.out.println("byte 타입에서 저장할수있는 가장 큰 값은 :" + max_Byte +"이고" + " 가장작은 값은 :"+ min_Byte +"이다");
				
				short min_Short = -32768;
				short max_Short = 32767;
				System.out.println("short 타입에서 저장할수있는 가장 큰 값은 :" + max_Short +"이고" + " 가장작은 값은 :"+ min_Short +"이다");
				
				char  min_char = 0;
				char  max_char = 65535;
				char ch =65;
				System.out.println("char 타입에 저장된 값은 기본적으로 문자로 출력한다 : "+ ch);
				System.out.println("char 타입에 저장된 코드값을 확인하고 싶으면(int)를 붙인다 :" + (int)ch);
				System.out.println("char 타입에서 저장할수있는 가장 큰 값은 :" + (int)max_char +"이고" + " 가장작은 값은 :"+ (int)min_char +"이다");
				
				// 숫자가 긴경우 _(언더바)로 표시가능하다
				int   minInt = -2_147_483_648;
				int   maxInt = 2_147_483_647;
				System.out.println("int 타입에서 저장할수있는 가장 큰 값은 :" + maxInt +"이고" + " 가장작은 값은 :"+ minInt +"이다");
				
				// int의 범위를 넘어가는 숫자를 사용할 떄는 L을 붙여야한다
				long  minLong = -18_446_744_073_709_551_62L;
				long  maxLong = 18_446_744_073_709_551_61L;
				
		
		
		 			
		 	/*	
		 		# 실수 타입
		 			- float (4byte)  
		 			- Double (8byte)
		 		
		 			실수는 주로 그래픽 계산에 사용된다.
		 			부동 소수점 방식을 사용한다 
		 	*/
				// 그냥 소수만 적는것은 기본적으로 double 타입이다
				// float 타입에 저장할때는 뒤에 f를 붙여야 한다 
				float weight =65.66f;
				double height =177.77;
				
			/*
		 		# 참/거짓 타입
		 			참과 거짓을 표현하는데에 사용되는 타입 
		 			boolean ( true , false ) 타입 
		 	*/
				
				boolean hasfood = true;
				boolean is130cm = false;
				
				
		 /*
		 	# 참조형 타입(클래스타입)
		 		참조형 타입은 기본형 타입들과는 다르게 대문자로 시작한다.
		 		- String : 문자열 
		 		- 그외 모든 클래스들 ..
		 		
		 */
		 String helloMessage = "Hello , My name is John Doe.";
		 String byeMessage = "Good bye.";
		 
		 System.out.println(helloMessage);    // 변수
		 System.out.println("helloMessage");  // 문자열 
		 
		 System.out.println(byeMessage  +  byeMessage  +  byeMessage );
		
	}

}

