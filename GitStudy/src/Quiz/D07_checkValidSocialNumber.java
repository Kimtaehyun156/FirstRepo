package Quiz;

import java.util.Scanner;

public class D07_checkValidSocialNumber {
   /*
    * ����ڰ� �ֹε�Ϲ�ȣ�� �Է��ϸ� �� �ֹε�Ϲ�ȣ�� ��ȣ���� �˻��ϴ� ���α׷��� ��������
    *  921116-1164629
    *  1234567
    *   
    * �Ǿ� 2�ڸ� ���� �� �ڸ��� 01~ 12 �̳��Ǽ��� ���ڸ��� 01 ~ 31 �̳��� ���� 7��°�ڸ� - �ڿ� �Ǿ��ڸ� 1~4
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
              System.out.println("���ڸ��Է����ּ��� ");
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
            		System.out.println("���� �߸��ԷµǾ����ϴ� ");
            	}
            }else if(month == 4 ||  month == 6 || month == 9 || month == 11)    {
            	if(day > 30) {
            		System.out.println("���� �߸��ԷµǾ����ϴ� ");
            	}
            }else if( month == 2) {
            	if(year >21) {
            		if((1900+year)%4 == 0 &&  (1900+year)%100 == 0 || (1900+year)%400 == 0) {
            			if(day > 29) {
                    		System.out.println("���� �߸��ԷµǾ����ϴ� ");
                    	}
            		}
            	}else {
            		if(day > 29) {
                		System.out.println("���� �߸��ԷµǾ����ϴ� ");
                	}
            	}
            }
            
            checkNum2 =true;
            
            if(checkNum2) {	
            	System.out.println("�ֹε�Ϲ�ȣ �Է¿Ϸ� > "+num);
            	if(year >21) {
            		System.out.println("���� > " + (2021-(1900+year)+1));
            	}else {
            		System.out.println("���� > " + (2021-(2000+year)+1));
            	}
            	System.out.printf("���� >  %d�� %d�� " , month,day);
            }
         }
         
      } else {
         System.out.println("�ֹε�Ϲ�ȣ�� ���̰� �����ʽ��ϴ�");
      }
   }
   

   public static void main(String[] args) {
      System.out.println("�ֹε�Ϲ�ȣ�� �Է����ּ��� :");

      Scanner sc = new Scanner(System.in);
      String num = sc.next();
      check(num);
   }
}