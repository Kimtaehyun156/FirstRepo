package Study;

public class C12_Interface {

	
	/*
	 		# 인터페이스 (Interface)
	 		- abstract class는 상속을 여러개 받을수 없다는 단점을 보안한 것 
	 		- 인터페이스 내부의 메서드는 자동으로 abstract public이 된다 
	 		- 인터페이스 내부의 변수는 자동으로 final static이 된다 
	 		- 인터페이스의 메서드를 정의할떄 default를 붙이면 기본동작을 설정할수 있다
	 */
	
	public static void main(String[] args) {
		new OrangeTree().click();
	}
}

interface CanClick{
	default void click() {
		System.out.println("클릭 인터페이스가 달려있는 클래스의 기본동작 " + " (오버라이드 해서 사용해주세요)");
	}
}

interface CanPunch{
	void punch();
}

// 자바에서는 여러가지 상속을 할수가없다  (interface  - implements)
class OrangeTree implements CanClick, CanPunch{

	@Override
	public void punch() {
		
	}
}