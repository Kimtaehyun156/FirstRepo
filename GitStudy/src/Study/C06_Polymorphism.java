package Study;

public class C06_Polymorphism {
	
	/*
	 		# ��ü�� ������
	 		
	 		  - ��ü�� �پ��� ���¸� ���� �� �ִ� 
	 		  - ����� ����̱⵵ �ϰ� �����̱⵵ �ϴ� 
	 		  - ������ ���������� ����� �ƴϴ� 
	 		  
	 		# �ڽ� Ŭ������ �θ� Ŭ������ �ɼ� �ִ�  (��ĳ����)
	 		 - �ڽ� Ŭ���� Ÿ���� �θ� Ŭ���� Ÿ���� �Ǵ°��� ��ĳ�����̶�� �Ѵ�
	 		 - ��ĳ���õ� ��ü�� �ڽ�Ŭ�������� �����ϴ� �͵��� ��� �ؾ������   
	 		 - �������̵�� �޼���� �ڽ� Ŭ������ ���� �����Ѵ� 
	 		 
	 		# �θ� Ŭ������ �ڽ� Ŭ������ �ɼ� "��"��! (�ٿ� ĳ����)
	 		- ������  ���������� ��ĳ���õǾ��� �ν��Ͻ���  �ٽ� ���� Ÿ�������� �ٿ�ĳ������ �����ϴ�  
	 		
	 		
	 */
	public static void main(String[] args) {
		new Food(new PigMeat(),new Vege() , new Balsamic() );
		
		MainMaterial main_mat = new MainMaterial();
		MainMaterial main_mat2 = new Meat();
		
		Meat meat = new Meat();
		// Meat meat2 = new MainMaterial();
		
		
		doSomethingWith(new MainMaterial());
		doSomethingWith(new Fish());
		doSomethingWith(new Meat());
		doSomethingWith(new PigMeat ());
	}
	
	public static void doSomethingWith(MainMaterial mat) {
		
	}
}

class Car{
	Tire tire;
	
	public Car(Tire tire) {
		this.tire = tire;
	}
}

class Tire {}

class TireVer1 extends Tire {}


class Food{
	
	MainMaterial mainMat;
	SubMaterial subMat;
	Sauce sauce;
	
	public Food(MainMaterial mainMat ,SubMaterial subMat ,Sauce sauce) {
		this.mainMat = mainMat;
		this.subMat = subMat;
		this.sauce = sauce;
	}
}

class PorkCutlet extends Food{
	
	public PorkCutlet(PigMeat pig , SubMaterial subMat ,Sauce sauce) {
		super(pig,subMat,sauce);
	}
}


// ���ϳ��� Ŭ���� (����� ,����� , �ҽ� )
class MainMaterial{}
class SubMaterial{}
class Sauce{}

// ����Ḧ ��ӹ��� Ŭ������
class Fish extends MainMaterial {}
class Meat extends MainMaterial {}

// ����Ḧ ��ӹ��� Ŭ������ ��ӹ��� Ŭ���� 
class PigMeat extends MainMaterial {}

// ����Ḧ ��ӹ��� Ŭ���� 
class Vege extends SubMaterial {}
class Fruit extends SubMaterial {}

// �ҽ��� ��ӹ��� Ŭ������ 
class Salsa extends Sauce{}
class Balsamic extends Sauce{}





