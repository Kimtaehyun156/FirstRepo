package Quiz;

import java.util.Scanner;

public class B11_Palindrome {

   public static void main(String[] args) {
   
      /*
          ����ڷκ��� �ܾ �ϳ� �Է¹ް�
          �ش� �ܾ ȸ���̶�� "PALINDROME"�� ���
          ȸ���� �ƴ϶�� "NOT PALINDROME"�� ����غ����� 
          
          �� ȸ��? MOM ,BOB, ABBA, MADAM ó�� �¿��Ī�δܾ� 
       */
      
      System.out.println("�ܾ �Է����ּ��� ȸ��üũ ���α׷� : ");
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
      System.out.printf("�Է��Ͻ� �ܾ� %s��  %s �Դϴ�",word,result);
      
   }
   
   /*
       Scanner sc = new Scanner(System.in);
       System.out.println("�ܾ� >> : ");
       String word = sc.next();
       String result = "PALINDROME";
       
       for(int i=0; i< word.length()/2; ++i){
       
       char ch =word.charAt(i);
       char ch2 = word.charAt(word.length()-i-1);
       
       if (ch != ch2){
       result = "NOT PALINDROME";
       break;
       }
       
       System.out.printf("�Է��Ͻ� �ܾ� %s��  %s �Դϴ�",word,result);
    */

}