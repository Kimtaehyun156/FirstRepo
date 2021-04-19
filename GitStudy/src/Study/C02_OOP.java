package Study;
import myobj.Peach;
import myobj.Tobacco;

public class C02_OOP {

	/*
	 * # 객체지향 프로그래밍( OOP : Object Oriented Programming) - 세상에 존재하는 모든 것들을 변수와 함수로
	 * 표현하려는 프로그래밍 방법론
	 * - 변수와 함수를 무분별하게 사용하기 보다는 
	 * - 현실에 존재하는 객체단위로 묶어서 표현하여 가독성을 올린다 -
	 * 객체(Object) : 세상에 존재하는 모든 것을 말한다 ( 사물 , 개념 ...등등)
	 * 
	 * ex) 사과 - 사과의 변수 : 크기 , 색깔 , 유통기한 , 보유한 칼로리 , 당도(브릭스) 등등... 
	 * - 사과의 함수(메서드) : 
	 * ->던진다 (크기만큼의 데미지를 입힌다 ) 
	 * -> 먹는다 ( 먹은 만큼 칼로리가 줄어들고 사과의크기가 감소한다 )
	 *  -> 냉장고에 보관한다 ( 유통기한이 느리게 감소한다 )
	 * 
	 * 함수랑 메서드 차이는 : 클래스 내부에 있는 함수를 메서드라고 부른다 사실 자바에는 메서드 밖에없다
	 * 
	 * # 클래스 (Class) 
	 * - 객체를 프로그래밍 언어로 표현한것 
	 * - 클래스는 객체의 설계도이다 (정의한 시점에서는 실체가 없음) 
	 * - 클래스를 통해 생성하는 실제 객체를 '인스턴스'라고 부른다 
	 * - 클래스는 참조형 변수 타입이다
	 */

	// 프로그램 실행시에 public class에 있는 main만 찾을수 있다
	public static void main(String[] args) {

		// Apple 클래스(설계도)로 만들어낸 인스턴스(생산품) a1
		Apple a1 = new Apple();
		Apple a2 = new Apple();
		Apple a3 = new Apple();

		// 다른 패키지에 선언한 public class를사용할수 있다
		myobj.Peach p1 = new myobj.Peach();
		Peach p2 = new Peach();

		a1.calorie = 100;
		a2.calorie = 120;
		a3.calorie = 115;

		a1.eat();
		a1.eat();

//		System.out.println("a1.calorie : " + a1.calorie);
//		System.out.println("a2.calorie : " + a2.calorie);
//		System.out.println("a3.calorie : " + a3.calorie);
//		
		String str1 = "abc";
		String str2 = "def";
		String str3 = "ghi";

		/*
		 * myobj 패키지에 현실의 객체를 참조하여 클래스를 하나 생성한 후 인스턴스를 생성하고 값을 채워보세요 출력해보세요
		 * 
		 * ※ 인스턴스 변수 3개 이상 ,인스턴스 메서드 2개이상 , 과일금지
		 * 
		 */
		Tobacco db1 = new Tobacco(30000);
		Tobacco db2 = new Tobacco(25000,250);
		Tobacco db3 = new Tobacco(50000,20,7);
		Tobacco db4 = new Tobacco(100000,50,3,50);
		
		db1.price = 1000;
		//db1.money = 20000;
		db1.life = 100;
		db1.nicotine = 5;
		
		db3.price = 100;

		System.out.println("db1의 소지금은 ?:" + db1.money);
		System.out.println("db1의 생명은 ?:" + db1.life);
		System.out.println("db1의 니코틴은 ?:" + db1.nicotine);
		System.out.println("db1의 가격은 ?:" + db1.price);
		System.out.println("=========================");
		
		System.out.println("db2의 소지금은 ?:" + db2.money);
		System.out.println("db2의 생명은 ?:" + db2.life);
		System.out.println("db2의 니코틴은 ?:" + db2.nicotine);
		System.out.println("db2의 가격은 ?:" + db2.price);
		System.out.println("=========================");
		
		System.out.println("db3의 소지금은 ?:" + db3.money);
		System.out.println("db3의 생명은 ?:" + db3.life);
		System.out.println("db3의 니코틴은 ?:" + db3.nicotine);
		System.out.println("db3의 가격은 ?:" + db3.price);
		System.out.println("=========================");
		
		System.out.println("db4의 소지금은 ?:" + db4.money);
		System.out.println("db4의 생명은 ?:" + db4.life);
		System.out.println("db4의 니코틴은 ?:" + db4.nicotine);
		System.out.println("db4의 가격은 ?:" + db4.price);
		System.out.println("=========================");
		


		int countdb1 = 0;
		int countdb2 = 0;
		int countdb3 = 0;
		int countdb4 = 0;
		while (true) {
			if (db1.life <= 0) { 
				break;
			}else{
				countdb1++;
				db1.eat();
			}
			
			if (db2.life <= 0) { 
				break;
			}else{
				countdb2++;
				db2.eat();
			}
			
			if (db3.life <= 0) { 
				break;
			}else{
				countdb3++;
				db3.eat();
			}
			
			if (db4.life <= 0) { 
				break;
			}else{
				countdb4++;
				db4.eat();
			}
		
		
		}

		System.out.printf(" db1 = 담배를 %d 개피면 죽습니다\n", countdb1);
		System.out.printf(" db2 = 담배를 %d 개피면 죽습니다\n", countdb2);
		System.out.printf(" db3 = 담배를 %d 개피면 죽습니다\n", countdb3);
		System.out.printf(" db4 = 담배를 %d 개피면 죽습니다\n", countdb4);

		// 클래스는 첫글자는 대문자로 시작한다 ! (String 클래스설)
	}

}

// default class(public이 안 붙은 calss)
class Apple {

	/*
	 * # 인스턴스 변수 - 각 인스턴스마다 다른 값을 가질 수 있는 변수 - aka 필드 , 속성 , 멤버변수 , 상태 ... ( 다
	 * 같은말이다)
	 */
	int size;
	int calorie;
	long lifetime;
	double sweet;
	String color;

	/*
	 * # 인스턴스 메서드 - 인스턴스 변수를 활용하여 해당 인스턴스의 상태를 변화시키는 메서드
	 */

	void eat() {
		size--;
		calorie -= 10;
	}
}
