package Study;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class D11_Calendar {
	
	/*
	  		# Date -> Calendar -> Time
	 		-�ڹٷ� ��¥�� �ð��� �ٷ�� Ŭ����
	 		
	 
	 
	 */
	
	
	
	public static void main(String[] args) {
		
		// �ý����� ���н� Ÿ���� �������� �޼���
		// �� ���н�Ÿ��  1970�� 1�� 1�� ���ķ� �ð��� �� �и��ʳ� �귶���� ����
		System.out.println("1970�� 1�� 1�� ���ķ� .."+System.currentTimeMillis() +"�и����귶���ϴ�");
		System.out.println("1970�� 1�� 1�� ���ķ� .. "+System.currentTimeMillis()/1000 + " �� �귶���ϴ� ");
		System.out.println("1970�� 1�� 1�� ���ķ� .. "+System.currentTimeMillis()/1000 / 60 + " �� �귶���ϴ� ");
		System.out.println("1970�� 1�� 1�� ���ķ� .. "+System.currentTimeMillis()/1000 / 60 / 60 + " �ð� �귶���ϴ� ");
		System.out.println("1970�� 1�� 1�� ���ķ� .. "+System.currentTimeMillis()/1000 / 60 / 60 /24 + " �� �귶���ϴ� ");
		System.out.println("1970�� 1�� 1�� ���ķ� .. "+System.currentTimeMillis()/1000 / 60 / 60 /24 /365 + " �� �귶���ϴ� ");
		
		/*
		 * 		Date 
		 * 	 	- DateŬ���� ������ �޼������ ���� ���������� ���� ������Ʈ�� �ߴ܉��
		 * 		- �ð��� ��� �Ҷ��� �ٸ� Ŭ������ ����� ���� �����Ѵ� 
		 * 		- Date Ŭ������ �ַ� �ð� �ν��Ͻ��� �����ϴ� �뵵�θ� ����Ѵ�  
		 */
		
		Date now = new Date();
		System.out.println(now);
		// System.out.println(now.getMinutes()); ������ش� 1.1���������� Ķ������ ������������
		
		
		/*
		 			Calendar
		 			- �޷��� ǥ���� Ŭ����
		 			- ��¥�� ���� ����� �� �ִ� ��ɵ��� ���ִ� 
		 			- �ð��� ������ �� �����ڰ� �ƴ� getInstance()��� ����ƽ �޼��带 ����Ѵ� 
		 			- .getInstance() �޼��忡 �浵�� ��Ÿ���� TimeZone�� �����Ҽ��ִ� 
		 			
		 			TimeZone
		 			-���� ������ ������ �����ϰ� �ִ� Ŭ���� 
		 			-getAvailableIDs() ����ƽ �޼��带 ���� ����� ���ִ� Ÿ�������� �� �� �ִ� 
		 */
		
//		for( String zoneID : TimeZone.getAvailableIDs()) {
//			System.out.println(zoneID);
//		}
		String str ="";
		// Date Ÿ������ ��ȯ�ϸ� ������ ������� 
		Calendar korea = Calendar.getInstance();
		System.out.println(" �ѱ� ���� �ð� :" +korea.get(Calendar.HOUR));

		// Calendar �� ����� �ð��� �ʿ��� ���� get() �޼��带 ���� ������ �ִ�
		
		int year = korea.get(Calendar.YEAR);
		int month = korea.get(Calendar.MONTH); //Month�� 0���ν��� �� +1 �������
		int date =korea.get(Calendar.DATE);
		
		// Calendar�� ����� �ð��� set() �޼��带 ���� �����Ҽ� �ִ� 
		korea.set(Calendar.HOUR_OF_DAY, 13);
		
		int hour = korea.get(Calendar.HOUR);
		int hourOfDay = korea.get(Calendar.HOUR_OF_DAY);
		int minute = korea.get(Calendar.MINUTE);
		int second  = korea.get(Calendar.SECOND);
		int millisec = korea.get(Calendar.MILLISECOND);
		
		// ���� -50���� �����ϸ� BC���ȴ� 
		korea.set(Calendar.YEAR,-50);
		
		// Calendar.ERA �� �ʵ����̰� , GregorianCalendat.AD �� .BC�̴� 
		int era = korea.get(Calendar.ERA);
		
		// Calendar.AM_PM�� �ʵ����� Calendar.AM ��   Calendar.PM�� ����̴� 
		int am = korea.get(Calendar.AM_PM);
		
		
		
		int doy =korea.get(Calendar.DAY_OF_YEAR);
		int dom =korea.get(Calendar.DAY_OF_MONTH);
		int dow =korea.get(Calendar.DAY_OF_WEEK);
		int dowim = korea.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		
		System.out.println("DOY(���ذ� ���۵ǰ� ���� ��¥):" + doy);
		System.out.println("DOM(�̹��� ���۵ǰ� ���� ��¥):" + dom);
		System.out.println("DOW(�̹��� ���۵ǰ� ���� ��¥,����):" + dow);
		System.out.println("DOWIM(�̹����� ���° �ش� �����ΰ� ):" + dowim);
		
		System.out.println("Calendar.SUMDAY :" + Calendar.SUNDAY);
		System.out.println("Calendar.MONDAY :" + Calendar.MONDAY);
		System.out.println("Calendar.TUESDAY :" + Calendar.TUESDAY);
		System.out.println("Calendar.WEDNESDAY :" + Calendar.WEDNESDAY);
		System.out.println("Calendar.THURSDAY :" + Calendar.THURSDAY);
		System.out.println("Calendar.FRIDAY :" + Calendar.FRIDAY);
		System.out.println("Calendar.SATURDAY :" + Calendar.SATURDAY);

		System.out.printf("%s : %d %d %d \n",korea.getTimeZone().getDisplayName(),year,month +1 ,date);
		
		
		System.out.printf("hour(12H) : %d  hourOfDay(24H) : %d \n" ,hour ,hourOfDay);
		System.out.printf("�ѱ�: %d %d %d \n" , year , month+1 ,date);
		System.out.printf("��:%d �� :%d  �̸���:%03d \n" , minute , second ,millisec);
		
		System.out.println(era == GregorianCalendar.AD ? "AD" : "BC");
		System.out.println(era == GregorianCalendar.BC ? "AD" : "BC");
		
		System.out.println(am == Calendar.AM ? "AM" : "PM");
		System.out.println(am != Calendar.PM ? "AM" : "PM");
		
		
		Calendar new_york = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
		System.out.println(" ���� ���� �ð� :" +new_york.get(Calendar.HOUR));
		
	}
}
