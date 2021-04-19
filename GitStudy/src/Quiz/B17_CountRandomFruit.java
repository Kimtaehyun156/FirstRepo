package Quiz;

import java.util.Random;
import java.util.Scanner;

public class B17_CountRandomFruit {

   public static void main(String[] args) {
      /*
          1. 사용자로부터 배열의 크기를 입력받는다 
          2. 해당크기 만큼의 배열에 랜덤 과일 문자열을 저장한다 
             (랜덤으로 등장하는 과일 :
             (apple ,banana , kiwi , orange , peach ,strawberry,pineapple)
          3. 각각의 과일이 몇번 등장했는지 모두 기록하고 출력해본다 
       */
      
      System.out.println(" 배열의 크기를 입력해주세요 : >>");
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
            System.out.printf("%s 는 %d 개 있습니다 \n",rd[i%7],count[i]);
         }
      }
      

   }

}