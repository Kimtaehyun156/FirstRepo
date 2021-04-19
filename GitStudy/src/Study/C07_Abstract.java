package Study;

public class C07_Abstract {
	/*
	 	 # �߻� Ŭ����
	 	 - �ϼ��� �ڽ� Ŭ�������� �̷�� Ŭ���� 
	 	 - Ŭ���� ���ο� �߻�޼��带 ���� Ŭ������ �տ� abstract�� �ٿ� ǥ���ؾ��Ѵ� 
	 	 - ������ �߻�޼��带 �����ϱ� ������ �ν��Ͻ� ������ �Ұ����ϴ� 
	 	 - �Ｎ���� �������̵��Ҽ��ִ� �͸� Ŭ����(Anonymous class)�� �ִ� 
	 	 
	 	  # �߻� �޼��� (abstract)
	 	  - �Լ��� ����(���� Ÿ�� , ���� ������ , �Űܺ����� �����س��� ) 
	 	  �ڼ��ѱ����� �ڽ�Ŭ�������� �������̵带 ���� �����ϴ� �ż���
	 	  �ڽ� Ŭ�������� �������̵� ���������� ������ ������ �߻��Ѵ� 
	 	  
	 */
	
	public static void main(String[] args) {
		Vehicle v1 = new Bus();
		
		// �͸� Ŭ����(Anonymous class)
		Vehicle v2 = new Vehicle() {
			@Override
			void ride() {
				System.out.println("�Ｎ���� ������ Ż��");
			}	
		};
			
		v1.ride();
		v2.ride();
	}
}

abstract class Vehicle{
	
	abstract void ride( );
	//	void ride() {
//		System.out.println("���߿� �ݵ�� �������̵� �Ұ�");
//	}
}


class Bus extends Vehicle{
	@Override
	void ride() {
		System.out.println("����� ���� Ÿ���� ");
	}
}

class Bike extends Vehicle{

	// �������̵� (  ���� Ÿ�� /  ���� �Լ��� / ���� �Ű�����  )���� �������̵��Ҽ��ִ�
	@Override
	void ride() {
		// TODO Auto-generated method stub
		
	}
	
}