package Quiz;

import java.util.Scanner;

public class B04_CondithionQuiz {

	public static void main(String[] args) {

		/*
		 * [ �˸��� �񱳿����� �������� ]
		 * 
		 * - �񱳸� �� �� ������ ���ʿ� �ִ°��� ���� (������ �Ϲ����� ��)
		 * - Ctrl + shift + F ( �ڵ�����) 
		 * - boolean Ÿ���� ������ �������� �ܵ����� ����� �����ϴ� 
		 * - ���ڿ���(������ Ÿ��) == ���� ���ؼ��� �ȵȴ�
		 * - ������ Ÿ���� ���� ���ҋ��� �ش� Ŭ������ ������ �Ǿ� �ִ� equals()��� �޼��带 �̿��ؾ��Ѵ� 
		 */

//		// 1. int�� ���� a�� 10���� ũ�� 20���� ���� �� true
//		System.out.println("a �� �Է����ּ��� (10���� ũ�� 20���� ���� �� true) ");
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		System.out.println(a > 10 && a < 20);
//
//		// 2. int�� ���� b�� ¦���� �� true
//		System.out.println("b �� �Է����ּ��� (¦���� �� true) ");
//		Scanner sc2 = new Scanner(System.in);
//		int b = sc2.nextInt();
//		System.out.println(b % 2 == 0);
//
//		// 3. int�� ���� c�� 7�� ����� �� true
//		System.out.println("c �� �Է����ּ��� (7�� ����� �� true) ");
//		Scanner sc3 = new Scanner(System.in);
//		int c = sc3.nextInt();
//		System.out.println(c % 7 == 0);
//
//		// 4. int�� ���� hour�� 0�̸� 24�̻��� �ƴϰ�, 12�̻��� �� true
//		System.out.println("hour �� �Է����ּ��� (0�̸� 24�̻��� �ƴϰ�, 12�̻��� �� true) ");
//		Scanner sc4 = new Scanner(System.in);
//		int hour = sc4.nextInt();
//		System.out.println(12 <= hour && hour < 24);
//
//		// 5. int�� ���� d�� e�� ���̰� 30�� �� true
//		System.out.println("d�� e�� �Է¹޽��ϴ� d �� e ���̰� 30�� �� ture");
//		System.out.println("int�� ���� d �� �Է����ּ���");
//		Scanner sc5 = new Scanner(System.in);
//		int d = sc5.nextInt();
//
//		System.out.println("int�� ���� e �� �Է����ּ���");
//		Scanner sc6 = new Scanner(System.in);
//		int e = sc6.nextInt();
//		System.out.println((d - e) == 30 || (d - e) == -30);
//		System.out.println(Math.abs(d-e)== 30);
//
//		// 6. int�� ���� year�� 400���� ������ �������ų� �Ǵ� 4�� ������ �������� 100���� ����������� ���� �� true
//		System.out.println("year �� �Է����ּ���( 400���� ������ �������ų� �Ǵ� 4�� ������ �������� 100���� ����������� ���� �� true)");
//		Scanner sc7 = new Scanner(System.in);
//		int year = sc7.nextInt();
//		System.out.println(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
//
//		// 7. �μ��� ö������ 2�� ������ true
//		System.out.println("�μ��� ö������ ���̸� �Է¹޽��ϴ� (2�� ������ true)");
//		System.out.println("�μ� ���� �Է����ּ���");
//		Scanner sc8 = new Scanner(System.in);
//		int minsu_age = sc8.nextInt();
//
//		System.out.println("ö�� ���� �Է����ּ���");
//		Scanner sc9 = new Scanner(System.in);
//		int chulsoo_age = sc9.nextInt();
//		System.out.println(2 <= (minsu_age - chulsoo_age));
//
//		// 8. �μ��� ö������ ������ 3�� ������ true
//		int minsu_Month = 9, chulsoo_Month = 12;
//		System.out.println(-3 >= (minsu_Month - chulsoo_Month));
//
//		// 9. boolean�� ���� powerOn�� false�� �� true
//		boolean powerOn = true;
//		System.out.println(!powerOn);
//
//		// 10. ���ڿ� �������� str�� "yes"�� �� true
//		String str = "yes";
//		String str_check = "yes";
//		System.out.println(str == str_check);
//		System.out.println(str.equals(str_check));
//
//		sc.close();
//		sc2.close();
//		sc3.close();
//		sc4.close(); 
//		sc5.close();
//		sc6.close();
//		sc7.close();
//		sc8.close();
//		sc9.close();
		
		// # �⺻�� Ÿ�԰� ������ Ÿ���� ����
		// - �⺻ Ÿ���� ���� �������� ũ�⸦ �����ϱ� ����  (�������� ���̴� �޸�)  - ����(Stack)
		// - ������ Ÿ���� ���� �������� ũ�⸦ �����ϱ� ��ƴ� (ũ�⸦ ���� ������ �޸𸮷� �������� �ּҰ��� �����ϰ� �ִ� ) - ��(Heap)
		
		String str1 = "yes";
		String str2 = new String("yes");
		String str3 = "yes";
		
		System.out.println("str1 == str2 : " + (str1 == str2 ));
		System.out.println("str1 == str2(equals) : " + (str1.equals(str2)));
		System.out.println("str1 == str3 : " + (str1 == str3 ));

	}
}
