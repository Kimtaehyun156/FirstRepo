package Quiz;

import java.util.Collections;
import java.util.HashSet;

public class D07_checkValidSocialNumber2 {

	class InvalidMonthException extends RuntimeException{
		public InvalidMonthException() {
			super("�ֹε�Ϲ�ȣ 3,4 �� �ùٸ��� ���� ���� �Է�");
		}
	}
	
	class InvalidDayException extends RuntimeException{
		public InvalidDayException() {
			super("�ֹε�Ϲ�ȣ 5,6 �� �ùٸ��� ���� ���� �Է�");
		}
	}
	
	private static HashSet<Integer> month31;
	private static HashSet<Integer> month30;
	private static HashSet<Integer> gender2000;
	
	// static�� �����ڿ��� �ʱ�ȭ�ϸ� �����̹Ƿ�  static��Ͽ��� �ʱ�ȭ �Ѵ� 
	static {
		month31 = new HashSet<>();
		month30 = new HashSet<>();
		gender2000 = new HashSet<>();
		
		// T...elements : �������� 
		Collections.addAll(month31, 1,3,5,7,8,10,12);
		Collections.addAll(month30, 4,6,9,11);
		Collections.addAll(gender2000,3,4,7,8);
	}
	
	public boolean isValidSocialNumbercheck(String sn) {
		
		if(sn.length() != 14 || sn.charAt(6) != '-') {
			System.out.println("�߸��� �ֹε�Ϲ�ȣ �Դϴ� ");
			return false;
		}

		
		try {
		int year = Integer.parseInt(sn.substring(0,2));
		int month = Integer.parseInt(sn.substring(2,4));
		int day = Integer.parseInt(sn.substring(4,6));
		int back_number = Integer.parseInt(sn.substring(7));
		
		// ������ ���� ��ȣ�� ���� 3,4�� 200�����ؾ��� 
		
		int gender = sn.charAt(7)- '0';
		year = year+ ( gender2000.contains(gender) ? 2000 : 1900);
				
		System.out.println("gender" + gender);
		System.out.println("year "+ year);
		System.out.println("�ֹε�Ϲ�ȣ ���ڸ� :" +back_number);
		
		boolean day29 = year % 400  == 0 || (year % 4 == 0  && year % 100 != 0);
		
		
			if(month > 12) {
				throw new InvalidMonthException();
			}else if(month31.contains(month) && day >31) {
				throw new InvalidDayException();
			}else if(month30.contains(month) && day >30) {
				throw new InvalidDayException();
			}else if( month == 2 && day29 && day >29) {
				throw new InvalidDayException();
			}else if ( month == 2 && !day29 && day>28) {
				throw new InvalidDayException();
			}
		}catch(NumberFormatException e) {
			System.err.println("[Invalid] ���ڰ� �ƴѰ��� ����");
			return false;
		}
//		}catch(InvalidMonthException e) {
//			System.err.println("[Invalid] "+e.getMessage());
//			return false;
//		}catch(InvalidDayException e) {
//			System.err.println("[Invalid] "+e.getMessage());
//			return false;
//		}
		return true;
	}
	
	public static void main(String[] args) {
		try {
			if(new D07_checkValidSocialNumber2().isValidSocialNumbercheck("921116-1234567")) {
				System.out.println("�ùٸ� �ֹε���Դϴ�");
			}else {
				System.err.println("�ùٸ������� �ֹε���Դϴ�");
			}
					
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
