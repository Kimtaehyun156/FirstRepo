package Quiz;

import java.util.Scanner;

public class B03_wonToDollar {

	public static void main(String[] args) {
		
//		double dollar = 1122.80f;
//		
//		// �ѱ� ���� �Է��ϸ� �̱� �޷��� ȯ�����ִ� ���α׷��� �������� 
//		// (���� ȯ�� 1�޷��� = 1,122.80 �� ) �Ҽ��Ѥ����� ��� ,  ȯ�� ������� 1.75% 
//		
//		
//		
//		System.out.println("�ѱ� ���� �̱��޷��� ȯ�����ִ� ���α׷��Դϴ� �󸶸� ȯ���Ͻðڽ��ϱ� ?");
//		
//		Scanner sc = new Scanner(System.in);
//		int user_money = sc.nextInt();
//		
//		double commission = user_money * 0.0175; // ȯ�� ������ 
//		
//		double dollar_money = ( (user_money - commission) / dollar);
//		
//		System.out.printf(" �Է��Ͻ� ���� ȯ���ϸ� %.2f �޷� �Դϴ�", dollar_money);
//		
		

//		// final�� �Բ� ����� ������ ���߿� ���� ������ �� ���� 
		final double WON_TO_DOLLAR = 0.00089; // ȯ�� ������ ������ �������� �빮��
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ѱ� ���� �̱��޷��� ȯ�����ִ� ���α׷��Դϴ� �󸶸� ȯ���Ͻðڽ��ϱ�.(������ 1.75%) ");
		int korMoney = sc.nextInt();
		
		double usd = korMoney * WON_TO_DOLLAR;
		double exchange_fee = usd * 0.0175;
		
		//printf ���
		System.out.printf(" �Է��Ͻ� �� %d ���� ȯ���ϸ� %.2f �޷� �Դϴ�", korMoney ,(usd- exchange_fee));
		System.out.println();
		
		
		//println ��� 
		System.out.println(Math.round((usd*0.9825)*100)/100.0);

	}

}
