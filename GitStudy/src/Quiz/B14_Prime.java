package Quiz;

import java.util.Scanner;

public class B14_Prime {

   public static void main(String[] args) {
       
      /*
          ����ڷκ��� ���ڸ� �Է¹����� 
          1���� �Է��� ���� ���̿� �����ϴ� �Ҽ��� ��� ����غ����� 
          �Ҽ� : 1�� �ڱ� �ڽ����θ� ������ �������¼� 
       */
      
      System.out.println(" ���ڸ� �Է����ּ��� : ");
      Scanner sc =  new Scanner(System.in);
      int num = sc.nextInt();
      int count =0;
   
         for(int i = 2; i <= num; i++) { // 1�� �Ҽ��� �ƴϴ� 2���� �Է°� �˻� 
             for(int j = 2; j <= Math.sqrt(i); j++) { //1�� �ڱ��ڽ��� �˻��ص� ������ ���������� �ڱ��ڽź��� ���������� �˻� 
            	 
                if( i % j == 0) {
                   count ++;
                   break;
                }
         
             }
             if(count == 0) {
                System.out.print(i + " ");
             }
             count=0;
      }
   }

}