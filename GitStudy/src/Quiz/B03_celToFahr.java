package Quiz;

import java.util.Scanner;

public class B03_celToFahr {

	public static void main(String[] args) {
		
		/*
		 		����ڷκ��� ���� �µ��� �Է¹����� 
		 		ȭ�� �µ��� ��ȯ�Ͽ� ������ִ� ���α׷��� ����� ������ 
		 		(��ȯ ������ ���۰˻� , ����� �Ҽ� ù° �ڸ�����)
		 		1 �����µ��� = ȭ���µ� 33.8��
		 		(1 *9/5) + 32 = 33.8 
		 */
		
		System.out.println("�����µ��� ȭ���µ��� ������ִ� ���α׷��Դϴ� �����µ��� �Է����ּ��� : ");
		
		Scanner sc = new Scanner(System.in);
		double celsius  = sc.nextDouble();
		
		double fahrenheit =  (celsius *9/5) + 32 ;
		
		System.out.println(" �Է��Ͻ� �羾�µ��� : "+ celsius + " �� �Դϴ�");  
		System.out.printf(" ��ȯ�� ȭ�� �µ��� : %.1f �� �Դϴ� ", fahrenheit );

	}

}
