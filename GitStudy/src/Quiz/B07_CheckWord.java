package Quiz;

import java.util.Scanner;

public class B07_CheckWord {

   public static void main(String[] args) {

      /*a
             ����ڷκ��� �ܾ �ϳ� �Է¹ް� 
             ù ��° ���ڿ� ������ ��° ���ڰ� ��ġ�ϸ� "OK"����� 
             �ƴ϶�� "Not OK"�� ����غ����� 
             
             // next() : ���� ���ڿ��� �޾ƿ��� ( �������) 
             // nextLine() : ���� ������ ���ڿ��� �޾ƿ��� (\n����)
       */
      int word_length; //�ܾ� ���̰� 
      
      System.out.println("�ܾ �Է����ּ��� ");
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