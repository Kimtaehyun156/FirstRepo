package Quiz;

import java.util.Random;
import java.util.Scanner;

public class B16_31Game {

   public static void main(String[] args) {
      
      
      /*
             1.31 ������ ����� ������
              (1 ,2 ,3 �ۿ� ������ �� ����)
             2. ��ǻ�ʹ� �������� ���ڸ� �����Ѵ� 
             3. ������ �������� �����Ѵ� 
             4. �������� 31�̻��� ���ڸ� ���� �÷��̾ �й��Ѵ� 
       */
      int Game31 = 31;
      int count = 0;
      Random rand = new Random();
      
      if(rand.nextInt(2) == 0 ) {
         System.out.println("�����Դϴ� ");
         
         while ( count < 31) {
            System.out.println("���ڸ� �Է����ּ��� (3������ �Է°���)");
            Scanner sc = new Scanner(System.in);
            int user_num = sc.nextInt();
            
            if(user_num == 1) {
               count++;
               System.out.print(count +"\n");
               if( count == 31) { 
                  System.out.println("����� �й�");
                  break;
               }
            }else if( user_num == 2){
               count++;
               System.out.print(count +"  ");
               count++;
               System.out.print(count +"\n");
               if( count == 31) { 
                  System.out.println("����� �й�");
                  break;
               }
            }else {
               count++;
               System.out.print(count +"  ");
               count++;
               System.out.print(count +"  ");
               count++;
               System.out.print(count +"\n");
               if( count == 31) { 
                  System.out.println("����� �й�");
                  break;
               }
            }
            
            System.out.println("��ǻ�� �����Դϴ� ");
            int com_num = rand.nextInt(4)+1;
            
            if (count == 29) {
               count++;
               System.out.print(count+ "\n");
               continue;
            }
            if (count == 28) {
               count++;
               System.out.print(count+ "  ");
               count++;
               System.out.print(count+ "\n");
               continue;
            }
            if (count == 27) {
               count++;
               System.out.print(count+ "  ");
               count++;
               System.out.print(count+ "  ");
               count++;
               System.out.print(count+ "\n");
               continue;
            }
            
            
            if(com_num == 1) {
               count++;
               System.out.print(count+ "\n");
               if( count == 31) { System.out.println("��ǻ�� �й�");}
            }else if( com_num == 2){
               count++;
               System.out.print(count+ "  ");
               count++;
               System.out.print(count+ "\n");
               if( count == 31) { 
                  System.out.println("��ǻ�� �й�");
                  break;
               }
            }else {
               count++;
               System.out.print(count+ "  ");
               count++;
               System.out.print(count+ "  ");
               count++;
               System.out.print(count+ "\n");
               if( count == 31) { 
                  System.out.println("��ǻ�� �й�");
                  break;
               }
            }
            
         }
         
      }else {
         System.out.println("�İ��Դϴ�");
         while ( count <= 31) {
            
            System.out.println("��ǻ�� �����Դϴ� ");
            int com_num = rand.nextInt(4)+1;
            
            if(com_num == 1) {
               count++;
               System.out.print(count+ "\n");
               if( count == 31) { System.out.println("��ǻ�� �й�");}
            }else if( com_num == 2){
               count++;
               System.out.print(count+ "  ");
               count++;
               System.out.print(count+ "\n");
               if( count == 31) { 
                  System.out.println("��ǻ�� �й�");
                  break;
               }
            }else {
               count++;
               System.out.print(count+ "  ");
               count++;
               System.out.print(count+ "  ");
               count++;
               System.out.print(count+ "\n");
               if( count == 31) { 
                  System.out.println("��ǻ�� �й�");
                  break;
               }
               
            
               System.out.println("���ڸ� �Է����ּ��� (3������ �Է°���)");
               Scanner sc = new Scanner(System.in);
               int user_num = sc.nextInt();
               
               if(user_num == 1) {
                  count++;
                  System.out.print(count +"\n");
                  if( count == 31) { 
                     System.out.println("����� �й�");
                     break;
                  }
               }else if( user_num == 2){
                  count++;
                  System.out.print(count +"  ");
                  count++;
                  System.out.print(count +"\n");
                  if( count == 31) { 
                     System.out.println("����� �й�");
                     break;
                  }
               }else {
                  count++;
                  System.out.print(count +"  ");
                  count++;
                  System.out.print(count +"  ");
                  count++;
                  System.out.print(count +"\n");
                  if( count == 31) { 
                     System.out.println("����� �й�");
                     break;
                  }
               }
            }
         
         }
      }
      
     
            
   }

}