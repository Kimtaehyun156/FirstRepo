package Study;


public class C10_LocalInnerClass {

	/*
	 * # 지역 내부 클래스 - 메서드 내부에서 선언하여 사용하는 클래스 - 메서드가 끝나면 해당클래스도 수명이 다한다
	 */  // 정보은닉

	public static void main(String[] args) {

		// 지역내부 클래스 (메서드가 끝나면 이클래스도 사라지게 됩니다 )
		class Apple {
			String size;
			String color;
			String insect;
		}

		Apple a = new Apple();
		AppleBox.Apple a2 = new AppleBox("고구마 박스").new Apple();

		// 내부 지역 클래스가 업캐스팅 되어있는상태
		Fruit2 banana = checkSomething();

		banana.eat();
	}

	public static Fruit2 checkSomething() {

		class Banana extends Fruit2 {
			int fruit;
			int[] color;
			public Banana(int fruit) {
			  this.fruit = fruit;
			}

			void eat() {
				System.out.println("열매가" + fruit + "개 바나나가 열려있습니다");
			}

		}
		return new Banana(20);
	}

}

abstract class Fruit2 {
	abstract void eat();
}
