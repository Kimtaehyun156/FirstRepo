package Study;
import myobj.Coffee;
import myobj.DiffPackage;

public class C08_AccessModifier {
	
	/*
	 		# ���������� (Access Modifier)
	 		 �� �ٸ� Ŭ��������  �ش� Ŭ������ �ڿ��� ����Ϸ��� �� ��
	 		   ��� ���θ� �����Ѵ� 
	 		 
	 		# ���� �����ڸ� ���� ���� �Ҽ� �ִ� �Ÿ��� ���� 
	 		 �� ���� Ŭ���� ������ �ٸ� �ڿ�  (���� ����� �Ÿ�)
	 		 �� ���� ��Ű�� ������ �ٸ��ڿ� 
	 		 �� �ٸ� ��Ű���� ������ ��ӹ��� �ڿ�
	 		 �� �ٸ� ��Ű���� �ڿ� (���� �� �Ÿ�)
	 		 
	 		# ���� �������� ���� 
	 		 �� private
	 		   	- �տ� Private�� ���� �ڿ��� "���� Ŭ���� ����"������ ������ �� �ְ� �ȴ� 
	 		 �� default (�ƹ��͵� �Ⱦ���)
	 		   	- ���� ��Ű�� ���ο����� �����Ӱ� ������ �� �ְ� �ȴ�.
	 		   	- �ٸ� ��Ű�� ������ ������ �� ����.
	 		 �� protected
	 		 	- ���� ��Ű�� ���ο����� �����Ӱ� ������ �� �ְ� �ȴ�.
	 		 	- �ٸ� ��Ű�������� "��� ���� Ŭ����"�� ������ �� �ִ� �ڿ��� �ȴ�.
	 		 �� public
	 		 	- �ٸ� ��Ű�������� �����Ӱ� ������ �� �ִ� �ڿ��� �ȴ�.
	 		
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
		// protected : ��ӹ����� �ٸ���Ű�������� ����� �����ϴ� 
		this.protected_method();
	}
	
	void abc() {
		Snack s = new Snack();
		int asd = s.size;
	}
}





