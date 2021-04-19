package Study;

public class A01_Escape {

	public static void main(String[] args) {
		
		
		/*
		 		# Escape 문자 
		 			- 특수한 기능을 가진 문자들 
		 			- 그냥 출력할려고하면 문자가 발생하는 특수한 문자들 
		 			- 앞에 \(역슬래시)가 붙은 문자는  Escape 문자로 간주한다
		 			- 앞에 붙은 \와 뒤의 문자가 합쳐져서 하나의 문자로 인식된다 
		 			 
		 */
		
		System.out.println("1. 안녕하세요 , 반갑습니다 ");
		
		// \n (Enter 효과) : 줄 바꿈의 기능을 가진 특수 문자 ( linefeed , breakline , newline..)으로 불림
		System.out.println("2. 안녕하세요 , 반\n갑\n습니다 ");
		
		// \t (Tap키 효과) : Tap키 효과 기능을 가진 특수 문자
		System.out.println("3. 안녕하세요 , 반\t갑\t습니다 ");
		
		// \\ : Escape문자의 기능을 사용하지 않고 그냥 \ 가 출력 
		System.out.println("4. 안녕하세요 , 반\\갑\\습니다 ");
		
		// ex) JDK의 경로를 출력하고 싶을떄 
		System.out.println("C\\Program Files\\JAVA\\JDK");
		
		// \" : 그냥 큰따옴표를 출력하고 싶을떄 사용한다
		System.out.println("오늘은 점심으로 \"컵라면\"을 먹어야겠다.");
		
		// \' : 그냥 작은따옴표를 출력하고 싶을떄 사용한다
		System.out.println("오늘은 점심으로 '컵라면'을 먹어야겠다.");
		System.out.println('\'');
		
		
	}

}
