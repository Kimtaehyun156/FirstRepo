package Quiz;

import java.util.Scanner;

public class B06_AppleQuiz {

   public static void main(String[] args) {

      /*
             ����� 10���� ���� �� �ִ� �ٱ��ϰ� �ִ� .
             ����ڰ�  �����ϰ� ���� ����� ������ �Է��ϸ� 
             ����� ��� ��� ���� �ʿ��� �ٱ����� ������ �˷��ִ� ���α׷��� ��������
       */
      
      Scanner sc = new Scanner(System.in);
      System.out.println("�����Ͻ� ����� ������ �Է����ּ��� : ");
      int apple_count = sc.nextInt();
      
      if(apple_count%10 == 0 && apple_count >=0) {
         System.out.printf("�����Ͻ� ����� �ٱ��ϴ� : %d ���Դϴ� ",(apple_count/10));
      } else if(apple_count%10 >= 1) {
         System.out.printf("�����Ͻ� ����� �ٱ��ϴ� : %d ���Դϴ� ",(apple_count/10)+1);
      }else {
         System.out.println("����� �Է����ּ��� ");
      }
   }

}