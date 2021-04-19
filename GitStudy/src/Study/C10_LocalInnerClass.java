package Study;


public class C10_LocalInnerClass {

	/*
	 * # ���� ���� Ŭ���� - �޼��� ���ο��� �����Ͽ� ����ϴ� Ŭ���� - �޼��尡 ������ �ش�Ŭ������ ������ ���Ѵ�
	 */  // ��������

	public static void main(String[] args) {

		// �������� Ŭ���� (�޼��尡 ������ ��Ŭ������ ������� �˴ϴ� )
		class Apple {
			String size;
			String color;
			String insect;
		}

		Apple a = new Apple();
		AppleBox.Apple a2 = new AppleBox("���� �ڽ�").new Apple();

		// ���� ���� Ŭ������ ��ĳ���� �Ǿ��ִ»���
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
				System.out.println("���Ű�" + fruit + "�� �ٳ����� �����ֽ��ϴ�");
			}

		}
		return new Banana(20);
	}

}

abstract class Fruit2 {
	abstract void eat();
}
