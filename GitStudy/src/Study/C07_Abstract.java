package Study;

public class C07_Abstract {
	/*
	 	 # 추상 클래스
	 	 - 완성을 자식 클래스에게 미루는 클래스 
	 	 - 클래스 내부에 추상메서드를 지닌 클래스는 앞에 abstract를 붙여 표시해야한다 
	 	 - 내부의 추상메서드를 구현하기 전에는 인스턴스 생성이 불가능하다 
	 	 - 즉석에서 오버라이드할수있는 익명 클래스(Anonymous class)도 있다 
	 	 
	 	  # 추상 메서드 (abstract)
	 	  - 함수의 형태(리턴 타입 , 접근 제어자 , 매겨변수만 정의해놓고 ) 
	 	  자세한구현은 자식클래스에서 오버라이드를 통해 구현하는 매서드
	 	  자식 클래스에서 오버라이드 하지않으면 컴파일 에러가 발생한다 
	 	  
	 */
	
	public static void main(String[] args) {
		Vehicle v1 = new Bus();
		
		// 익명 클래스(Anonymous class)
		Vehicle v2 = new Vehicle() {
			@Override
			void ride() {
				System.out.println("즉석에서 구현한 탈것");
			}	
		};
			
		v1.ride();
		v2.ride();
	}
}

abstract class Vehicle{
	
	abstract void ride( );
	//	void ride() {
//		System.out.println("나중에 반드시 오버라이드 할것");
//	}
}


class Bus extends Vehicle{
	@Override
	void ride() {
		System.out.println("요금을 내고 타야함 ");
	}
}

class Bike extends Vehicle{

	// 오버라이드 (  같은 타입 /  같은 함수명 / 같은 매개변수  )여야 오버라이드할수있다
	@Override
	void ride() {
		// TODO Auto-generated method stub
		
	}
	
}