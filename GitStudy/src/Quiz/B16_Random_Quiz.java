package Quiz;

import java.util.Random;

public class B16_Random_Quiz {

   public static void main(String[] args) {
      
      //4�ڸ��� ���� �ӽú�й�ȣ�� �����ϴ� ���α׷��� ��������.
      //(��й�ȣ�� �����ϴ� ���ڴ� ���� �빮�ڿ� �����Դϴ�)

      for(int i=1; i<= 4; i++) {
         
         int rand = (int)(Math.random()*4)+1;
         if(rand % 2 == 0) {
            System.out.println((char)(Math.random()*26+65)); //���ĺ� ���� 
         }else {
         System.out.println((int)(Math.random()*9+0)); //���ڷ���
         }
         
         
      }
      
       
        // ���ڼ��� �����ΰ� �ε����� �������� �����ϴ� ���
        String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        
        int password_size = 4;
        
        for (int i = 0; i < password_size; ++i) {
                int random_index = (int)(Math.random() * charset.length());
                System.out.print(charset.charAt(random_index));
        }
        System.out.println();

      
       /*
        *    2. Random Ŭ���� 
        *    - �� �� ���ϰ� ���� ���� ������ �� �ִ� ��ɵ��� ���ִ� Ŭ����
        *    - �����Ҷ� ���� �õ尡 �����ȴ�
        *    - ���ϴ� ���� �õ带 ������ ���� �ִ�. 
        *     
        */
        
        // ���ο� ���� �õ� ����
        Random ran = new Random();
        
        // Random.nextInt(bound) 
        // 0~ bound �̸��� ������ ��ȯ�Ѵ� 
        System.out.println(ran.nextInt(45)+1); // 1~45�� ���� ���� 
        System.out.println(ran.nextInt(41)+30); // 30~70�� ��������
        System.out.println(ran.nextInt());
        System.out.println(ran.nextInt());
        System.out.println(ran.nextInt());
        
        int com_num = ran.nextInt(4)+1;
        System.out.println(com_num);
   }

}