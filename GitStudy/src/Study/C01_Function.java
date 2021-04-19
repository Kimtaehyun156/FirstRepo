package Study;

public class C01_Function {

	/*
	 		함수(Function)
	 		- 기능을 미리 정의해두고 나중에 가져다 쓰는 것 
	 		- 자바에서 함수(메서드)는 반드시 클래스 내부에 선언해야한다 
	 		- 정의해둔 함수 이름 뒤에 ()를 붙여서 함수를 호출하면 
	 		- 호출한자리에 함수의 실행 결과가 반환된다
	 		- 함수를 정의할 때 해당 함수가  자기가 반환할 값의 타입을 앞에 적어 둔다 
	 		- 나중에 재사용 할 가능성이 있는 기능들을 미리 만들어둠으로써 
	 		  작업의 반복을 줄일수 있다 		
	 */
	
	 public static void main(String[] args) {
		
		 for(int i = 0 ; i < 10; ++i) {	 
			 print_rabbit();
			 print_rabbit();
			 print_rabbit();
		 }
		 
		 System.out.println(apple_basket(123,10));
		 
	}
	 
	 /*
		 // 사과의 개수와 바구니의크기를 전달하면 필요한 바구니 갯수를 알려주는 함수
		 // public static : 나중에 생각할것 
		 // int : 이함수의 실행 결과를 정수형으로 반환함 ( 리턴 타입 ) return type
		 // apple_basket : 타입 뒤에 함수명을 정의할수 있다 
		 // (int apple , int size)  : 이 함수를 실행할때 int타입 값을 두개 전달 받아야한다 (매개변수) arguments
	 */
	 
	 public static String apple_basket(int apple , int size) {
		 
		 int result = 0;
		 
		 if( apple % size == 0) {
			 result = apple / size;
		 }else {
			 result = apple / size +1;
		 }
		 
		 return "필요한 바구니으 ㅣ개수는 " +result+ " 개 입니다 ";
	 }
	 
	 
	 
	 public static void print_rabbit() {
		 System.out.println(" /)/)");
		 System.out.println("(  ..)");
		 System.out.println("(  >☆");
		 System.out.println();
	 }

}
