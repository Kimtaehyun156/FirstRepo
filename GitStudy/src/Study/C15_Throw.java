package Study;
import java.io.FileReader;

public class C15_Throw {
	
	/*
	 		# throw
	 		- ���ϴ� ���ܸ� �߻���Ų�� 
	 		
	 		# throws
	 		- �ش� �޼��忡�� �̷��� ���ܵ��� �߻���Ų�ٴ°��� �˸���
	 		- �ش� �޼��带 ȣ���ϴ� ���� ��� ���� �� �ִ� 
	 		- ���ܿ� ���� ó���� ȣ���ϴ°����� �̷�� 
	 		
	 		# Exception Ŭ������ ��ӹ��� ���ܴ� "�ݵ�� ó���ؾ��ϴ� ����" �� �ȴ� 
	 		- Exception �� ����ó���� ���� ������ ������ ������ �߻���Ų�� 
	 		- ����ó���� �� ��쿡�� �������� ������ش� 
	 		
	 		# RuntimeException Ŭ������ ��ӹ��� ���ܴ�  "�ݵ�� ó�������ʾƵ� �Ǵ� ���� "�� �ȴ� 
	 		 - InputMismathException, ArrayIndexOutOfBoundException �� 
	 		 - ����ó���� ���� �ʾƵ� ������ ������ �߻����� �ʴ� ���ܵ� 
	 */
	
	public static void main(String[] args) {
		C15_Throw instance = new C15_Throw();
		
		try {
			instance.checkEven(20);
		} catch (NotEvenException e) {
			System.out.println("¦���ƴ� �ͼ��ǹ߻�");
		}
			
		try {
			instance.checkOdd(16);			
		} catch(NotOddException e){
			System.out.println("Ȧ���ƴ� �ͼ��ǹ߻�");
		}
		
		System.out.println("���α׷� ���� ����");
	}
	
	public void dangerous_method() {
		//������ ������ �о���� ���� �غ� ���� 
		//File f = new File("D:\\nameless.txt");
		//FileReader reader = new FileReadaer(f);
	}
	public void dangerous_method2() {
		throw new ArrayIndexOutOfBoundsException("�׳ɸ������");
	}
	
	public void checkEven(int num) throws NotEvenException {
		if(num %2 ==0) {
			System.out.println("¦���Դϴ�");
		}else {
			throw new NotEvenException();
		}
		
		System.out.println("checkEven �޼��尡 ���� ����Ǿ����ϴ�");
	}
	
	
	public void checkOdd(int num){
		if(num %2 ==1) {
			System.out.println("Ȧ���Դϴ�");
		}else {
			throw new NotOddException();
		}
		
		System.out.println("checkOdd �޼��尡 ���� ����Ǿ����ϴ�");
	}
}

// ¦���� �ƴҋ� �߻���ų ���� (����ó�� ���� ������ ������ �Ұ�)
class NotEvenException extends Exception{
	public NotEvenException() {
		super("¦���� �ƴϿ��� �߻��ϴ� ����!");
	}
}

//Ȧ���� �ƴҋ� �߻���ų ����  (����ó�� ���� �ʾƵ� �������� ���� �ʴ� ����!)
class NotOddException extends RuntimeException{
	public NotOddException() {
		super("Ȧ���� �ƴϿ��� �߻��ϴ� ����!");
	}
}

