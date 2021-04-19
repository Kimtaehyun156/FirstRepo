package Quiz;

import java.util.Calendar;
import java.util.Scanner;

public class D11_DiscountDay2 {
	

	/*
	 *		어떤 카페에서 짝수번째 목요일마다 할인행사를 진행한다고 가정했을때 
	 *
	 *		년도를 입력하면 해당년도의 모든할인 날짜를 출력해보세요 
	 *		31일 : 1월 3월 5월 7월 10월 12월 
	 *		30일 : 4월 6월 9월 11월 
	 *		2월은 29일 28일
	 */
	
	static Calendar saleDay = Calendar.getInstance();


	
	public static void main(String[] args) {
		System.out.println("연도를 입력해주세요 ");
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
					System.out.printf("%d년 %d월 %d일\n",year,saleDay.get(Calendar.MONTH)+1 ,saleDay.get(Calendar.DATE));
				}
			}
		}
		
		
	}
}
