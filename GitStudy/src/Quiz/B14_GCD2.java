package Quiz;

import java.util.Scanner;

public class B14_GCD2 {

	public static void main(String[] args) {
		
		/*
		 * �� ���ڸ� �Է¹ް� �� ������ �ִ������� ���غ�����
		 */


		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		System.out.println("ù���� ���� �Է����ּ��� :");
		int num1 = sc.nextInt();

		System.out.println("�ι��� ���� �Է����ּ��� :");
		int num2 = sc2.nextInt();
		
		int GCD = 0;
		
		int maxNum = num1 >= num2 ? num1 : num2;
		 
		 // int maxNum = Math.max(num1,num2);
		 //  ū������ --�ؼ� �˻��ϸ�  break;�� ���������°� ȿ�����̴� 
		 
			for (int i = 1; i <= maxNum; ++i) {
				if (num1 % i == 0 && num2 % i == 0) {
					if (GCD <= i) {
						GCD = i;
					}
				}
			}
			
		System.out.println("�μ��� �ִ������� : " + GCD + "�Դϴ�");
		
		sc.close();
		sc2.close();
	}

}
