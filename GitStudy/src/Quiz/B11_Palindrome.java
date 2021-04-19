package Quiz;

import java.util.Scanner;

public class B11_Palindrome {

   public static void main(String[] args) {
   
      /*
          사용자로부터 단어를 하나 입력받고
          해당 단어가 회문이라면 "PALINDROME"를 출력
          회문이 아니라면 "NOT PALINDROME"을 출력해보세요 
          
          ※ 회문? MOM ,BOB, ABBA, MADAM 처럼 좌우대칭인단어 
       */
      
      System.out.println("단어를 입력해주세요 회문체크 프로그램 : ");
      Scanner sc = new Scanner(System.in);
      String word = sc.next();
      String result = "NOT PALINDROME";
      int tot = 0;
      
      for(int i=0; i < word.length(); ++i) {
         char ch = word.charAt(i);
         if(ch == word.charAt(word.length()-1-i)) {
            
            if(word.length()%2 == 1 ) {
               break;
            }
            tot++;

         }
         
      }
      if(tot >= 1){
         result = "PALINDROME";
      }
      System.out.printf("입력하신 단어 %s는  %s 입니다",word,result);
      
   }
   
   /*
       Scanner sc = new Scanner(System.in);
       System.out.println("단어 >> : ");
       String word = sc.next();
       String result = "PALINDROME";
       
       for(int i=0; i< word.length()/2; ++i){
       
       char ch =word.charAt(i);
       char ch2 = word.charAt(word.length()-i-1);
       
       if (ch != ch2){
       result = "NOT PALINDROME";
       break;
       }
       
       System.out.printf("입력하신 단어 %s는  %s 입니다",word,result);
    */

}