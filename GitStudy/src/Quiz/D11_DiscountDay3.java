package Quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class D11_DiscountDay3 {

	// Calendar Ŭ������ � �ʵ带 �����ϸ� ������ �ʵ嵵 ��Ȳ�� �°� �˾Ƽ� ������Ʈ�ȴ� 
	public static void printAllEventDays(int year) {
		SimpleDateFormat eventFormat = new SimpleDateFormat("yyyy�� M�� d�� \t");
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
			System.out.printf(eventFormat.format(event.getTime())+"\t[ %d���� ���]\n",count++);
			
			event.set(Calendar.DAY_OF_WEEK_IN_MONTH, 4);
			
//			System.out.printf("%d %d %d\n", event.get(Calendar.YEAR) ,
//					event.get(Calendar.MONTH)+1 , 
//					event.get(Calendar.DATE));
			// add () : ���ϴ� �ʵ带 ���ϴ� ��ġ��ŭ ���ϰų� �E�� �ִ� 
			
			System.out.printf(eventFormat.format(event.getTime())+"\t[ %d���� ���]\n",count++);
			
			event.add(Calendar.MONTH,1);
		}
	}
	
	public static void main(String[] args) {
		
		int year =2020;
		printAllEventDays(year);
		
	}
}
