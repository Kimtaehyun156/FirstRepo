package Study;

public class A01_Escape {

	public static void main(String[] args) {
		
		
		/*
		 		# Escape ���� 
		 			- Ư���� ����� ���� ���ڵ� 
		 			- �׳� ����ҷ����ϸ� ���ڰ� �߻��ϴ� Ư���� ���ڵ� 
		 			- �տ� \(��������)�� ���� ���ڴ�  Escape ���ڷ� �����Ѵ�
		 			- �տ� ���� \�� ���� ���ڰ� �������� �ϳ��� ���ڷ� �νĵȴ� 
		 			 
		 */
		
		System.out.println("1. �ȳ��ϼ��� , �ݰ����ϴ� ");
		
		// \n (Enter ȿ��) : �� �ٲ��� ����� ���� Ư�� ���� ( linefeed , breakline , newline..)���� �Ҹ�
		System.out.println("2. �ȳ��ϼ��� , ��\n��\n���ϴ� ");
		
		// \t (TapŰ ȿ��) : TapŰ ȿ�� ����� ���� Ư�� ����
		System.out.println("3. �ȳ��ϼ��� , ��\t��\t���ϴ� ");
		
		// \\ : Escape������ ����� ������� �ʰ� �׳� \ �� ��� 
		System.out.println("4. �ȳ��ϼ��� , ��\\��\\���ϴ� ");
		
		// ex) JDK�� ��θ� ����ϰ� ������ 
		System.out.println("C\\Program Files\\JAVA\\JDK");
		
		// \" : �׳� ū����ǥ�� ����ϰ� ������ ����Ѵ�
		System.out.println("������ �������� \"�Ŷ��\"�� �Ծ�߰ڴ�.");
		
		// \' : �׳� ��������ǥ�� ����ϰ� ������ ����Ѵ�
		System.out.println("������ �������� '�Ŷ��'�� �Ծ�߰ڴ�.");
		System.out.println('\'');
		
		
	}

}
