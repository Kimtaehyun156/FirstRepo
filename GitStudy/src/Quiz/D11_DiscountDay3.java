package Quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class D11_DiscountDay3 {

	// Calendar 클래스는 어떤 필드를 변경하면 나머지 필드도 상황에 맞게 알아서 업데이트된다 
	public static void printAllEventDays(int year) {
		SimpleDateFormat eventFormat = new SimpleDateFormat("yyyy년 M월 d일 \t");
		Calendar event = Calendar.getInstance(TimeZone.getTimeZone("AsiaSeoul"));
		event.set(year, 0, 1, 0, 0, 0);
		
	
		//for(int i=0; i<12; ++i) {
		
		
		int count =1;
		while(event.get(Calendar.YEAR) == year) {
	
			//event.set(Calendar.MONDAY, i);
			event.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
			event.set(Calendar.DAY_OF_WEEK_IN_MONTH, 2);
//			System.out.printf("%d %d %d\n", event.get(Calendar.YEAR) ,
//											event.get(Calendar.MONTH)+1 , 
//											event.get(Calendar.DATE));
//			
			System.out.printf(eventFormat.format(event.getTime())+"\t[ %d번쨰 행사]\n",count++);
			
			event.set(Calendar.DAY_OF_WEEK_IN_MONTH, 4);
			
//			System.out.printf("%d %d %d\n", event.get(Calendar.YEAR) ,
//					event.get(Calendar.MONTH)+1 , 
//					event.get(Calendar.DATE));
			// add () : 원하는 필드를 원하는 수치만큼 더하거나 뺼수 있다 
			
			System.out.printf(eventFormat.format(event.getTime())+"\t[ %d번쨰 행사]\n",count++);
			
			event.add(Calendar.MONTH,1);
		}
	}
	
	public static void main(String[] args) {
		
		int year =2020;
		printAllEventDays(year);
		
	}
}
