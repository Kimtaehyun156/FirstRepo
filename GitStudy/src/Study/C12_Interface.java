package Study;

public class C12_Interface {

	
	/*
	 		# �������̽� (Interface)
	 		- abstract class�� ����� ������ ������ ���ٴ� ������ ������ �� 
	 		- �������̽� ������ �޼���� �ڵ����� abstract public�� �ȴ� 
	 		- �������̽� ������ ������ �ڵ����� final static�� �ȴ� 
	 		- �������̽��� �޼��带 �����ҋ� default�� ���̸� �⺻������ �����Ҽ� �ִ�
	 */
	
	public static void main(String[] args) {
		new OrangeTree().click();
	}
}

interface CanClick{
	default void click() {
		System.out.println("Ŭ�� �������̽��� �޷��ִ� Ŭ������ �⺻���� " + " (�������̵� �ؼ� ������ּ���)");
	}
}

interface CanPunch{
	void punch();
}

// �ڹٿ����� �������� ����� �Ҽ�������  (interface  - implements)
class OrangeTree implements CanClick, CanPunch{

	@Override
	public void punch() {
		
	}
}