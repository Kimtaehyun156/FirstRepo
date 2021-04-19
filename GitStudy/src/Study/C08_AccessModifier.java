package Study;
import myobj.Coffee;
import myobj.DiffPackage;

public class C08_AccessModifier {
	
	/*
	 		# 접근제어자 (Access Modifier)
	 		 ● 다른 클래스에서  해당 클래스의 자원을 사용하려고 할 떄
	 		   허용 여부를 설정한다 
	 		 
	 		# 접근 제어자를 통해 구분 할수 있는 거리의 종류 
	 		 ● 같은 클래스 내부의 다른 자원  (가장 가까운 거리)
	 		 ● 같은 패키지 내부의 다른자원 
	 		 ● 다른 패키지에 있지만 상속받은 자원
	 		 ● 다른 패키지의 자원 (가장 먼 거리)
	 		 
	 		# 접근 제어자의 종류 
	 		 ● private
	 		   	- 앞에 Private이 붙은 자원은 "같은 클래스 내부"에서만 접근할 수 있게 된다 
	 		 ● default (아무것도 안쓴거)
	 		   	- 같은 패키지 내부에서는 자유롭게 접근할 수 있게 된다.
	 		   	- 다른 패키지 에서는 접근할 수 없다.
	 		 ● protected
	 		 	- 같은 패키지 내부에서는 자유롭게 접근할 수 있게 된다.
	 		 	- 다른 패키지에서는 "상속 받은 클래스"만 접근할 수 있는 자원이 된다.
	 		 ● public
	 		 	- 다른 패키지에서도 자유롭게 접근할 수 있는 자원이 된다.
	 		
	 */
	
	public static void main(String[] args) {
		C08_SamePackage instance = new C08_SamePackage();
		instance.public_method();
		instance.default_method();
		instance.protected_method();
		
		DiffPackage instance2 = new DiffPackage();
		instance2.public_method();
		
		Coffee coffee1 = new Coffee(Coffee.AMERICANO,1500,10,Coffee.COLUMBIA);
		Coffee coffee2 = new Coffee(Coffee.CAFE_LATTE,1500,15,Coffee.BRAZIL);
		Coffee coffee3 = new Coffee(Coffee.CAFE_MOCHA,1500,22,Coffee.ETHIOPIA);
		Coffee coffee4 = new Coffee(Coffee.CAFE_MOCHA,1500,22,Coffee.BRAZIL);
		
		System.out.println(coffee1.getCoffeeName());
	}
}

class Snack{
	int size = 10;
	
	void eat() {
		System.out.println(size-1);
	}
}

class HeneyButterChip extends Snack{
	private void abc() {
		System.out.println(size);
	}
}


class Choco extends DiffPackage{
	public Choco() {
		// protected : 상속받으면 다른패키지에서도 사용이 가능하다 
		this.protected_method();
	}
	
	void abc() {
		Snack s = new Snack();
		int asd = s.size;
	}
}





