package Quiz;

import java.util.Scanner;

public class B03_GuessAge {

	public static void main(String[] args) {
		
		
		// ����ڷκ��� �¾�ؿ� ������ �⵵�� �Է¹����� 
		// �� ����� �ѱ� ���̸� ����Ͽ� �� ������ �˷��ִ� ���α׷��� �������� 
		
		System.out.println("������� �¾�ظ� �����ּ��� EX) 1992(��) ");
		Scanner sc = new Scanner(System.in);
		int User_year = sc.nextInt();
		
		System.out.println("������ �⵵�� �����ּ��� EX) 1992(��) ");
		Scanner sc2 = new Scanner(System.in);
		int this_year = sc2.nextInt();
		
		System.out.println("������� ���̴� : "+ ((this_year-User_year)+1) + "�� �Դϴ�" );
		
		
		
	}

}
