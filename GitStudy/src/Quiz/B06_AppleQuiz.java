package Quiz;

import java.util.Scanner;

public class B06_AppleQuiz {

   public static void main(String[] args) {

      /*
             사과를 10개씩 담을 수 있는 바구니가 있다 .
             사용자가  구매하고 싶은 사과의 갯수를 입력하면 
             사과를 모두 담기 위해 필요한 바구니의 개수를 알려주는 프로그램을 만들어보세요
       */
      
      Scanner sc = new Scanner(System.in);
      System.out.println("구매하실 사과의 개수를 입력해주세요 : ");
      int apple_count = sc.nextInt();
      
      if(apple_count%10 == 0 && apple_count >=0) {
         System.out.printf("구매하실 사과의 바구니는 : %d 개입니다 ",(apple_count/10));
      } else if(apple_count%10 >= 1) {
         System.out.printf("구매하실 사과의 바구니는 : %d 개입니다 ",(apple_count/10)+1);
      }else {
         System.out.println("양수를 입력해주세요 ");
      }
   }

}