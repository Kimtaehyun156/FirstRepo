package Quiz;

import java.util.Random;
import java.util.Scanner;

public class B17_CountRandomFruit {

   public static void main(String[] args) {
      /*
          1. ����ڷκ��� �迭�� ũ�⸦ �Է¹޴´� 
          2. �ش�ũ�� ��ŭ�� �迭�� ���� ���� ���ڿ��� �����Ѵ� 
             (�������� �����ϴ� ���� :
             (apple ,banana , kiwi , orange , peach ,strawberry,pineapple)
          3. ������ ������ ��� �����ߴ��� ��� ����ϰ� ����غ��� 
       */
      
      System.out.println(" �迭�� ũ�⸦ �Է����ּ��� : >>");
      Scanner sc = new Scanner(System.in);
      int arrSize = sc.nextInt();
      Random rand = new Random();
      
      String fruit[] = new String[arrSize];
      
      int count[] = new int[arrSize];
      
      String rd[] = new String[] {"apple","banana","kiwi","orange","peach","strawberry","pineapple"}; 
      
      for(int i=0; i< fruit.length; ++i) {
         fruit[i] = rd[(rand.nextInt(rd.length))];
        // System.out.println("fruit[i] :" + i);     
      }
     
     
      for(int i=0; i< fruit.length; ++i) {
         for(int j=0; j< rd.length; ++j) {
            if(fruit[i].equals(rd[j])) {
             count[j]++;
            }
         }
      }
      
      for(int i=0; i< fruit.length; ++i) {
         if(count[i] != 0) {
            System.out.printf("%s �� %d �� �ֽ��ϴ� \n",rd[i%7],count[i]);
         }
      }
      

   }

}