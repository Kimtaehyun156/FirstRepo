package Quiz;

import java.util.Collections;
import java.util.HashSet;

public class D07_checkValidSocialNumber2 {

	class InvalidMonthException extends RuntimeException{
		public InvalidMonthException() {
			super("주민등록번호 3,4 에 올바르지 않은 값을 입력");
		}
	}
	
	class InvalidDayException extends RuntimeException{
		public InvalidDayException() {
			super("주민등록번호 5,6 에 올바르지 않은 값을 입력");
		}
	}
	
	private static HashSet<Integer> month31;
	private static HashSet<Integer> month30;
	private static HashSet<Integer> gender2000;
	
	// static을 생성자에서 초기화하면 낭비이므로  static블록에서 초기화 한다 
	static {
		month31 = new HashSet<>();
		month30 = new HashSet<>();
		gender2000 = new HashSet<>();
		
		// T...elements : 가변인자 
		Collections.addAll(month31, 1,3,5,7,8,10,12);
		Collections.addAll(month30, 4,6,9,11);
		Collections.addAll(gender2000,3,4,7,8);
	}
	
	public boolean isValidSocialNumbercheck(String sn) {
		
		if(sn.length() != 14 || sn.charAt(6) != '-') {
			System.out.println("잘못된 주민등록번호 입니다 ");
			return false;
		}

		
		try {
		int year = Integer.parseInt(sn.substring(0,2));
		int month = Integer.parseInt(sn.substring(2,4));
		int day = Integer.parseInt(sn.substring(4,6));
		int back_number = Integer.parseInt(sn.substring(7));
		
		// 원래는 성별 번호를 보고 3,4면 200을더해야함 
		
		int gender = sn.charAt(7)- '0';
		year = year+ ( gender2000.contains(gender) ? 2000 : 1900);
				
		System.out.println("gender" + gender);
		System.out.println("year "+ year);
		System.out.println("주민등록번호 뒷자리 :" +back_number);
		
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
			System.err.println("[Invalid] 숫자가 아닌것이 있음");
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
				System.out.println("올바른 주민등록입니다");
			}else {
				System.err.println("올바르지않은 주민등록입니다");
			}
					
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
