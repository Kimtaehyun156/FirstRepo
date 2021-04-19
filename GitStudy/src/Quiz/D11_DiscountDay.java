package Quiz;

import java.util.Calendar;
import java.util.Scanner;

public class D11_DiscountDay {

	
	/*
	 *		어떤 카페에서 짝수번째 목요일마다 할인행사를 진행한다고 가정했을때 
	 *
	 *		년도를 입력하면 해당년도의 모든할인 날짜를 출력해보세요 
	 *		31일 : 1월 3월 5월 7월 10월 12월 
	 *		30일 : 4월 6월 9월 11월 
	 *		2월은 29일 28일
	 */
	
	public static void main(String[] args) {
		System.out.println("연도를 입력해주세요 ");
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
						System.out.printf("%d년은 : %d월 %d일 입니다 \n",saleDay.get(Calendar.YEAR),saleDay.get(Calendar.MONTH)+1,saleDay.get(Calendar.DATE) );
					}
				}
			}else if( i == 1 || i == 3 || i== 5 || i==7  || i == 8 || i == 10  || i == 12) {
				for(int j=1; j<=31; ++j) {
					saleDay.set(Calendar.DATE, j);
					saleDay.set(Calendar.DAY_OF_WEEK_IN_MONTH, j);
					if(Calendar.DAY_OF_WEEK_IN_MONTH %2 ==0) {						
						System.out.printf("%d년은 : %d월 %d일 입니다 \n",saleDay.get(Calendar.YEAR),saleDay.get(Calendar.MONTH)+1,saleDay.get(Calendar.DATE) );
					}
				}
			}else if( i == 2 ) {
				if(year % 4 == 0  &&  year % 100 == 0 || year % 400 == 0) {
					for(int j=1; j<=29; ++j) {
						saleDay.set(Calendar.DATE, j);
						saleDay.set(Calendar.DAY_OF_WEEK_IN_MONTH, j);
						if(Calendar.DAY_OF_WEEK_IN_MONTH %2 ==0) {						
							System.out.printf("%d년은 : %d월 %d일 입니다 \n",saleDay.get(Calendar.YEAR),saleDay.get(Calendar.MONTH)+1,saleDay.get(Calendar.DATE) );
						}
					}
				}else {
					for(int j=1; j<=28; ++j) {
						saleDay.set(Calendar.DATE, j);
						saleDay.set(Calendar.DAY_OF_WEEK_IN_MONTH, j);
						if(Calendar.DAY_OF_WEEK_IN_MONTH %2 ==0) {						
							System.out.printf("%d년은 : %d월 %d일 입니다 \n",saleDay.get(Calendar.YEAR),saleDay.get(Calendar.MONTH)+1,saleDay.get(Calendar.DATE) );
						}
					}
				}
			}else if( i==4 || i ==6 || i ==9 || i ==11) {
				for(int j=1; j<=30; ++j) {
					saleDay.set(Calendar.DATE, j);
					saleDay.set(Calendar.DAY_OF_WEEK_IN_MONTH, j);
					if(Calendar.DAY_OF_WEEK_IN_MONTH %2 ==0) {						
						System.out.printf("%d년은 : %d월 %d일 입니다 \n",saleDay.get(Calendar.YEAR),saleDay.get(Calendar.MONTH)+1,saleDay.get(Calendar.DATE) );
					}
				}
			}
			
			
			
		}
		
		
		
	}
}
