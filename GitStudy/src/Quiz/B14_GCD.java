package Quiz;

import java.util.Scanner;

public class B14_GCD {

	public static void main(String[] args) {

		/*
		 		 �� ���ڸ� �Է¹ް� �� ������ �ִ������� ���غ����� 
		 */

		int GCD =0;
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("ù���� ���� �Է����ּ��� :");
		int num1= sc.nextInt();
		
		System.out.println("�ι��� ���� �Է����ּ��� :");
		int num2= sc2.nextInt();
		
		for(int i = 2; i <= num1; ++i) {
			for(int j = 2; j <= num2; ++j) {
				if(num1 % i == 0  && num2 % i == 0) {
					if( num2 % j ==0 && num2 %j == 0) {
						if( i > j) {
							GCD = j;
						}else {
							GCD = i;							
						}
					}
					
				}
			}
		}
		System.out.println("�μ��� �ִ� ������� : " + GCD);
			
		sc.close();
		sc2.close();

	}

}
