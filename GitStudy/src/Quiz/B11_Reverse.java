package Quiz;

import java.util.Scanner;

public class B11_Reverse {

   public static void main(String[] args) {
      
      //사용자가 문장을 입력하면 그 문장을 거꿀로 출력해보세요 
      
      
      System.out.println("문장을 입력해주세요 >> ");
      Scanner sc = new Scanner(System.in);
      String word = sc.next();
      
      for(int i = 0; i < word.length(); i++ ) {
         System.out.print(word.charAt(word.length()-i-1));
      }
      

   }

}