package Quiz;

import java.util.Scanner;

public class B11_Reverse {

   public static void main(String[] args) {
      
      //����ڰ� ������ �Է��ϸ� �� ������ �Ųܷ� ����غ����� 
      
      
      System.out.println("������ �Է����ּ��� >> ");
      Scanner sc = new Scanner(System.in);
      String word = sc.next();
      
      for(int i = 0; i < word.length(); i++ ) {
         System.out.print(word.charAt(word.length()-i-1));
      }
      

   }

}