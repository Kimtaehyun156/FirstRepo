package Quiz;

import java.util.Calendar;
import java.util.Scanner;

public class D11_DiscountDay2 {
	

	/*
	 *		� ī�信�� ¦����° ����ϸ��� ������縦 �����Ѵٰ� ���������� 
	 *
	 *		�⵵�� �Է��ϸ� �ش�⵵�� ������� ��¥�� ����غ����� 
	 *		31�� : 1�� 3�� 5�� 7�� 10�� 12�� 
	 *		30�� : 4�� 6�� 9�� 11�� 
	 *		2���� 29�� 28��
	 */
	
	static Calendar saleDay = Calendar.getInstance();


	
	public static void main(String[] args) {
		System.out.println("������ �Է����ּ��� ");
		Scanner sc = new Scanner(System.in);
		int years = sc.nextInt();

		saleDay.set(Calendar.YEAR,years);
		int year = saleDay.get(Calendar.YEAR);


		for(int i=0; i<12; ++i) {
			saleDay.set(Calendar.MONTH, i);
			
			for(int j=1, maxDate = saleDay.getMaximum(Calendar.DATE); j <= maxDate; ++j) {
				saleDay.set(Calendar.DATE, j);
				int dow =saleDay.get(Calendar.DAY_OF_WEEK);
				int dowim = saleDay.get(Calendar.DAY_OF_WEEK_IN_MONTH);
				if(dow==5 &&  dowim %2 == 0) {
					System.out.printf("%d�� %d�� %d��\n",year,saleDay.get(Calendar.MONTH)+1 ,saleDay.get(Calendar.DATE));
				}
			}
		}
		
		
	}
}
