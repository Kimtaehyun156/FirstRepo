package Study;
import myobj.Peach;
import myobj.Tobacco;

public class C02_OOP {

	/*
	 * # ��ü���� ���α׷���( OOP : Object Oriented Programming) - ���� �����ϴ� ��� �͵��� ������ �Լ���
	 * ǥ���Ϸ��� ���α׷��� �����
	 * - ������ �Լ��� ���к��ϰ� ����ϱ� ���ٴ� 
	 * - ���ǿ� �����ϴ� ��ü������ ��� ǥ���Ͽ� �������� �ø��� -
	 * ��ü(Object) : ���� �����ϴ� ��� ���� ���Ѵ� ( �繰 , ���� ...���)
	 * 
	 * ex) ��� - ����� ���� : ũ�� , ���� , ������� , ������ Į�θ� , �絵(�긯��) ���... 
	 * - ����� �Լ�(�޼���) : 
	 * ->������ (ũ�⸸ŭ�� �������� ������ ) 
	 * -> �Դ´� ( ���� ��ŭ Į�θ��� �پ��� �����ũ�Ⱑ �����Ѵ� )
	 *  -> ����� �����Ѵ� ( ��������� ������ �����Ѵ� )
	 * 
	 * �Լ��� �޼��� ���̴� : Ŭ���� ���ο� �ִ� �Լ��� �޼����� �θ��� ��� �ڹٿ��� �޼��� �ۿ�����
	 * 
	 * # Ŭ���� (Class) 
	 * - ��ü�� ���α׷��� ���� ǥ���Ѱ� 
	 * - Ŭ������ ��ü�� ���赵�̴� (������ ���������� ��ü�� ����) 
	 * - Ŭ������ ���� �����ϴ� ���� ��ü�� '�ν��Ͻ�'��� �θ��� 
	 * - Ŭ������ ������ ���� Ÿ���̴�
	 */

	// ���α׷� ����ÿ� public class�� �ִ� main�� ã���� �ִ�
	public static void main(String[] args) {

		// Apple Ŭ����(���赵)�� ���� �ν��Ͻ�(����ǰ) a1
		Apple a1 = new Apple();
		Apple a2 = new Apple();
		Apple a3 = new Apple();

		// �ٸ� ��Ű���� ������ public class������Ҽ� �ִ�
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
		 * myobj ��Ű���� ������ ��ü�� �����Ͽ� Ŭ������ �ϳ� ������ �� �ν��Ͻ��� �����ϰ� ���� ä�������� ����غ�����
		 * 
		 * �� �ν��Ͻ� ���� 3�� �̻� ,�ν��Ͻ� �޼��� 2���̻� , ���ϱ���
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

		System.out.println("db1�� �������� ?:" + db1.money);
		System.out.println("db1�� ������ ?:" + db1.life);
		System.out.println("db1�� ����ƾ�� ?:" + db1.nicotine);
		System.out.println("db1�� ������ ?:" + db1.price);
		System.out.println("=========================");
		
		System.out.println("db2�� �������� ?:" + db2.money);
		System.out.println("db2�� ������ ?:" + db2.life);
		System.out.println("db2�� ����ƾ�� ?:" + db2.nicotine);
		System.out.println("db2�� ������ ?:" + db2.price);
		System.out.println("=========================");
		
		System.out.println("db3�� �������� ?:" + db3.money);
		System.out.println("db3�� ������ ?:" + db3.life);
		System.out.println("db3�� ����ƾ�� ?:" + db3.nicotine);
		System.out.println("db3�� ������ ?:" + db3.price);
		System.out.println("=========================");
		
		System.out.println("db4�� �������� ?:" + db4.money);
		System.out.println("db4�� ������ ?:" + db4.life);
		System.out.println("db4�� ����ƾ�� ?:" + db4.nicotine);
		System.out.println("db4�� ������ ?:" + db4.price);
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

		System.out.printf(" db1 = ��踦 %d ���Ǹ� �׽��ϴ�\n", countdb1);
		System.out.printf(" db2 = ��踦 %d ���Ǹ� �׽��ϴ�\n", countdb2);
		System.out.printf(" db3 = ��踦 %d ���Ǹ� �׽��ϴ�\n", countdb3);
		System.out.printf(" db4 = ��踦 %d ���Ǹ� �׽��ϴ�\n", countdb4);

		// Ŭ������ ù���ڴ� �빮�ڷ� �����Ѵ� ! (String Ŭ������)
	}

}

// default class(public�� �� ���� calss)
class Apple {

	/*
	 * # �ν��Ͻ� ���� - �� �ν��Ͻ����� �ٸ� ���� ���� �� �ִ� ���� - aka �ʵ� , �Ӽ� , ������� , ���� ... ( ��
	 * �������̴�)
	 */
	int size;
	int calorie;
	long lifetime;
	double sweet;
	String color;

	/*
	 * # �ν��Ͻ� �޼��� - �ν��Ͻ� ������ Ȱ���Ͽ� �ش� �ν��Ͻ��� ���¸� ��ȭ��Ű�� �޼���
	 */

	void eat() {
		size--;
		calorie -= 10;
	}
}
