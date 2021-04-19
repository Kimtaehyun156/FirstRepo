package Quiz;

import java.util.Scanner;

public class B07_CheckWord {

   public static void main(String[] args) {

      /*a
             사용자로부터 단어를 하나 입력받고 
             첫 번째 글자와 마지막 번째 글자가 일치하면 "OK"를출력 
             아니라면 "Not OK"를 출력해보세요 
             
             // next() : 다음 문자열을 받아오기 ( 공백기준) 
             // nextLine() : 다음 한줄의 문자열을 받아오기 (\n기준)
       */
      int word_length; //단어 길이값 
      
      System.out.println("단어를 입력해주세요 ");
      Scanner sc = new Scanner(System.in);
      String user_word = sc.next();
      
      word_length = user_word.length();
      
      if(user_word.charAt(0) == user_word.charAt((word_length-1))) {
         System.out.println("OK");
         System.out.println(user_word);
      }else {
         System.out.println("NOT OK");
      }
      
      

   }

}