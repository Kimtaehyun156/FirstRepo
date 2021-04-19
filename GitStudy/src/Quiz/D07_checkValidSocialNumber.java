package Quiz;

import java.util.Scanner;

public class D07_checkValidSocialNumber {
   /*
    * 사용자가 주민등록번호를 입력하면 그 주민등록번호가 유호한지 검사하는 프로그램을 만들어보세요
    *  921116-1164629
    *  1234567
    *   
    * 맨앞 2자리 숫자 월 자리에 01~ 12 이내의숫자 일자리에 01 ~ 31 이내의 숫자 7번째자리 - 뒤에 맨앞자리 1~4
    */
    private static boolean checkNumer(char ch) {
         return ch >= '0' && ch <= '9';
    }

   public static void check(String num) {
      int len = num.length();
      String yearStr , monthStr ,dayStr ,lastNumStr;
      boolean checkNum = false;
      boolean checkNum2 = false;
      
      if( len == 14) {
        for(int i=0; i< len; ++i) {
           char ch = num.charAt(i);
           if(i == 6 && ch == '-') {
              checkNum = true;
           }else if( !checkNumer(ch)) {
              System.out.println("숫자를입력해주세요 ");
              break;
           }
        }
       
         if(checkNum) {
            int year = Integer.parseInt(yearStr =num.substring(0,2));
            int month = Integer.parseInt(monthStr =num.substring(2,4));
            int day = Integer.parseInt( dayStr =num.substring(4,6));
            String hipen =num.substring(6,7);
            int lastNum = Integer.parseInt(lastNumStr =num.substring(7));
            
            
            if(month == 1 ||  month == 3 || month == 5 || month == 7 || month ==8 || month == 10 || month == 12) {
            	if(day > 31) {
            		System.out.println("일이 잘못입력되었습니다 ");
            	}
            }else if(month == 4 ||  month == 6 || month == 9 || month == 11)    {
            	if(day > 30) {
            		System.out.println("일이 잘못입력되었습니다 ");
            	}
            }else if( month == 2) {
            	if(year >21) {
            		if((1900+year)%4 == 0 &&  (1900+year)%100 == 0 || (1900+year)%400 == 0) {
            			if(day > 29) {
                    		System.out.println("일이 잘못입력되었습니다 ");
                    	}
            		}
            	}else {
            		if(day > 29) {
                		System.out.println("일이 잘못입력되었습니다 ");
                	}
            	}
            }
            
            checkNum2 =true;
            
            if(checkNum2) {	
            	System.out.println("주민등록번호 입력완료 > "+num);
            	if(year >21) {
            		System.out.println("나이 > " + (2021-(1900+year)+1));
            	}else {
            		System.out.println("나이 > " + (2021-(2000+year)+1));
            	}
            	System.out.printf("생일 >  %d월 %d일 " , month,day);
            }
         }
         
      } else {
         System.out.println("주민등록번호가 길이가 맞지않습니다");
      }
   }
   

   public static void main(String[] args) {
      System.out.println("주민등록번호를 입력해주세요 :");

      Scanner sc = new Scanner(System.in);
      String num = sc.next();
      check(num);
   }
}