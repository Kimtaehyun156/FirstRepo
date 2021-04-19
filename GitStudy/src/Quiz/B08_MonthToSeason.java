package Quiz;

import java.util.Scanner;

public class B08_MonthToSeason {

   public static void main(String[] args) {

      /*
             사용자로부터 달을 입력받으면 해당하는 계절을 출력해보세요
             (switch ~case문을 이용)
       */
      
      System.out.println("몇월인지 입력해주세요 : ");
      Scanner sc = new Scanner(System.in);
      String user_Month = sc.next();
   
      
      switch(user_Month) {
         case "3": case "4": case "5": 
            System.out.println("봄입니다");
            break;
         case "6": case "7": case "8": 
            System.out.println("여름입니다");
            break;
         case "9": case "10": case "11": 
            System.out.println("가을입니다");
            break;
         case "12": case "1": case "2": 
            System.out.println("겨울입니다");
            break;
         default:
            System.out.println("1~12월 에맞는 값을 넣어주세요");
      }
      
      
   }

}