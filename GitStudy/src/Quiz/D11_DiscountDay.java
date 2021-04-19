package Quiz;

import java.util.Calendar;
import java.util.Scanner;

public class D11_DiscountDay {

	
	/*
	 *		� ī�信�� ¦����° ����ϸ��� ������縦 �����Ѵٰ� ���������� 
	 *
	 *		�⵵�� �Է��ϸ� �ش�⵵�� ������� ��¥�� ����غ����� 
	 *		31�� : 1�� 3�� 5�� 7�� 10�� 12�� 
	 *		30�� : 4�� 6�� 9�� 11�� 
	 *		2���� 29�� 28��
	 */
	
	public static void main(String[] args) {
		System.out.println("������ �Է����ּ��� ");
		Scanner sc = new Scanner(System.in);
		int years = sc.nextInt();
		int month=0;
		Calendar saleDay = Calendar.getInstance();
		saleDay.set(Calendar.YEAR,years);
		int year = saleDay.get(Calendar.YEAR);
		
		for(int i=0; i<12; ++i) {
			saleDay.set(Calendar.MONTH, i);
			
			if( i == 0) {
				for(int j=1; j<=31; ++j) {
					saleDay.set(Calendar.DATE, j);
					saleDay.set(Calendar.DAY_OF_WEEK_IN_MONTH, j);
					if(Calendar.DAY_OF_WEEK_IN_MONTH %2 ==0) {						
						System.out.printf("%d���� : %d�� %d�� �Դϴ� \n",saleDay.get(Calendar.YEAR),saleDay.get(Calendar.MONTH)+1,saleDay.get(Calendar.DATE) );
					}
				}
			}else if( i == 1 || i == 3 || i== 5 || i==7  || i == 8 || i == 10  || i == 12) {
				for(int j=1; j<=31; ++j) {
					saleDay.set(Calendar.DATE, j);
					saleDay.set(Calendar.DAY_OF_WEEK_IN_MONTH, j);
					if(Calendar.DAY_OF_WEEK_IN_MONTH %2 ==0) {						
						System.out.printf("%d���� : %d�� %d�� �Դϴ� \n",saleDay.get(Calendar.YEAR),saleDay.get(Calendar.MONTH)+1,saleDay.get(Calendar.DATE) );
					}
				}
			}else if( i == 2 ) {
				if(year % 4 == 0  &&  year % 100 == 0 || year % 400 == 0) {
					for(int j=1; j<=29; ++j) {
						saleDay.set(Calendar.DATE, j);
						saleDay.set(Calendar.DAY_OF_WEEK_IN_MONTH, j);
						if(Calendar.DAY_OF_WEEK_IN_MONTH %2 ==0) {						
							System.out.printf("%d���� : %d�� %d�� �Դϴ� \n",saleDay.get(Calendar.YEAR),saleDay.get(Calendar.MONTH)+1,saleDay.get(Calendar.DATE) );
						}
					}
				}else {
					for(int j=1; j<=28; ++j) {
						saleDay.set(Calendar.DATE, j);
						saleDay.set(Calendar.DAY_OF_WEEK_IN_MONTH, j);
						if(Calendar.DAY_OF_WEEK_IN_MONTH %2 ==0) {						
							System.out.printf("%d���� : %d�� %d�� �Դϴ� \n",saleDay.get(Calendar.YEAR),saleDay.get(Calendar.MONTH)+1,saleDay.get(Calendar.DATE) );
						}
					}
				}
			}else if( i==4 || i ==6 || i ==9 || i ==11) {
				for(int j=1; j<=30; ++j) {
					saleDay.set(Calendar.DATE, j);
					saleDay.set(Calendar.DAY_OF_WEEK_IN_MONTH, j);
					if(Calendar.DAY_OF_WEEK_IN_MONTH %2 ==0) {						
						System.out.printf("%d���� : %d�� %d�� �Դϴ� \n",saleDay.get(Calendar.YEAR),saleDay.get(Calendar.MONTH)+1,saleDay.get(Calendar.DATE) );
					}
				}
			}
			
			
			
		}
		
		
		
	}
}
