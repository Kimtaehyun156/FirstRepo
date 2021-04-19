package Study;


public class D10_args {
	
	/*
	 		main의 args의 역활은  : 첫번째 매개변수의 역활
	 		- 프로그램 실행시 사용자가 지정한 옵션을  main의 첫번째 매개변수에 받는다 
	 		- 사용자가 지정한 옵션에 따라 다르게 동작하는 프로그램을 만들 수 있다 
	 */
	
	public static void main(String[] args) {
		System.out.println("args.length :" +args.length);
		
		for(int i = 0; i< args.length; ++i) {
			System.out.println(args[i]);
		}
	}
}
