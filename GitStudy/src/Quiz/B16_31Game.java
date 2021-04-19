package Quiz;

import java.util.Random;
import java.util.Scanner;

public class B16_31Game {

   public static void main(String[] args) {
      
      
      /*
             1.31 게임을 만들어 보세요
              (1 ,2 ,3 밖에 선택할 수 없음)
             2. 컴퓨터는 랜덤으로 숫자를 선택한다 
             3. 선공은 랜덤으로 결정한다 
             4. 마지막에 31이상의 숫자를 만든 플레이어가 패배한다 
       */
      int Game31 = 31;
      int count = 0;
      Random rand = new Random();
      
      if(rand.nextInt(2) == 0 ) {
         System.out.println("선공입니다 ");
         
         while ( count < 31) {
            System.out.println("숫자를 입력해주세요 (3개까지 입력가능)");
            Scanner sc = new Scanner(System.in);
            int user_num = sc.nextInt();
            
            if(user_num == 1) {
               count++;
               System.out.print(count +"\n");
               if( count == 31) { 
                  System.out.println("사용자 패배");
                  break;
               }
            }else if( user_num == 2){
               count++;
               System.out.print(count +"  ");
               count++;
               System.out.print(count +"\n");
               if( count == 31) { 
                  System.out.println("사용자 패배");
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
                  System.out.println("사용자 패배");
                  break;
               }
            }
            
            System.out.println("컴퓨터 차례입니다 ");
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
               if( count == 31) { System.out.println("컴퓨터 패배");}
            }else if( com_num == 2){
               count++;
               System.out.print(count+ "  ");
               count++;
               System.out.print(count+ "\n");
               if( count == 31) { 
                  System.out.println("컴퓨터 패배");
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
                  System.out.println("컴퓨터 패배");
                  break;
               }
            }
            
         }
         
      }else {
         System.out.println("후공입니다");
         while ( count <= 31) {
            
            System.out.println("컴퓨터 차례입니다 ");
            int com_num = rand.nextInt(4)+1;
            
            if(com_num == 1) {
               count++;
               System.out.print(count+ "\n");
               if( count == 31) { System.out.println("컴퓨터 패배");}
            }else if( com_num == 2){
               count++;
               System.out.print(count+ "  ");
               count++;
               System.out.print(count+ "\n");
               if( count == 31) { 
                  System.out.println("컴퓨터 패배");
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
                  System.out.println("컴퓨터 패배");
                  break;
               }
               
            
               System.out.println("숫자를 입력해주세요 (3개까지 입력가능)");
               Scanner sc = new Scanner(System.in);
               int user_num = sc.nextInt();
               
               if(user_num == 1) {
                  count++;
                  System.out.print(count +"\n");
                  if( count == 31) { 
                     System.out.println("사용자 패배");
                     break;
                  }
               }else if( user_num == 2){
                  count++;
                  System.out.print(count +"  ");
                  count++;
                  System.out.print(count +"\n");
                  if( count == 31) { 
                     System.out.println("사용자 패배");
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
                     System.out.println("사용자 패배");
                     break;
                  }
               }
            }
         
         }
      }
      
     
            
   }

}