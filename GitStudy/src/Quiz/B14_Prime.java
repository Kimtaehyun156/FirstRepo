package Quiz;

import java.util.Scanner;

public class B14_Prime {

   public static void main(String[] args) {
       
      /*
          사용자로부터 숫자를 입력받으면 
          1부터 입력한 숫자 사이에 존재하는 소수를 모두 출력해보세요 
          소수 : 1과 자기 자신으로만 나누어 떨어지는수 
       */
      
      System.out.println(" 숫자를 입력해주세요 : ");
      Scanner sc =  new Scanner(System.in);
      int num = sc.nextInt();
      int count =0;
   
         for(int i = 2; i <= num; i++) { // 1은 소수가 아니니 2부터 입력값 검사 
             for(int j = 2; j <= Math.sqrt(i); j++) { //1과 자기자신은 검사해도 무조건 나누어지니 자기자신보다 작을떄까지 검사 
            	 
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