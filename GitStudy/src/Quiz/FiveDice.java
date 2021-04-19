package Quiz;

import java.util.Scanner;

public class FiveDice {

   /*
    * 랜덤으로 다섯개의 주사위를 돌린다음에 결과를 통해 다음을 구분하는 클래스를 만들어보세요
    * 
    * 1. 풀하우스 ( 같은 눈이 2개 +3개) (116666) (22233) (주사위눈이점수) 2. 스몰스트레이트 (1234)
    * (2345)(3456) -(15점) 3. 라지스트레이트 (12345) (23456) - (30점) 4. 4 다이스 (같은숫자 4개) -
    * (주사위눈이 점수) 5. 5다이스 (같은숫자 5개) - (50점)
    * 
    * 주사위를 12번던진다 /유리한 자리채우면된다 ※게임까지 구현하고 싶으신 분은 Yacht을 검색해보세요
    * 
    * # 메서드 (1) 모든주사위를 던지는 메서드 (2) 원하는 주사위를 제외하고 나머지를 던지는 메서드 (2번) (3) 주사위는 3번까지
    * 던질수 있음
    */

   static int[] dice = new int[6];
   static int[] counts = new int[6];
   static int[] smallStrike = new int[]{1,2,3,4,0};
   static int[] smallStrike2 = new int[]{0,1,2,3,4};
   static int count = 1;
   static int count2 = 1;

   static int aces = 0;
   static int deuces = 0;
   static int threes = 0;
   static int fours = 0;
   static int fives = 0;
   static int sixes = 0;

   public static void main(String[] args) {

      System.out.println("주사위 게임입니다 ");
      System.out.println("1.주사위를 던진다 2.선택해서 돌리기 3.게임을 종료한다 ");
      while (count < 13) {
         Scanner sc = new Scanner(System.in);
         int mode = sc.nextInt();
         if (mode == 1) {
            for (int i = 1; i < dice.length; ++i) {
               dice[i] = (int) (Math.random() * 6) + 1;
            }
            throwDice();
            checkDice();
         } else if (mode == 2) {
            while (true) {
               System.out.println("몇번째를 바꾸시겠습니까 ? ");
               Scanner sc2 = new Scanner(System.in);
               int select = sc2.nextInt();
               selectThrow(select);
               System.out.println("1.더바꾼다 2.그만바꾼다 ");
               Scanner sc3 = new Scanner(System.in);
               int select2 = sc3.nextInt();
               System.out.println("바꿀기회 :"+ count2 +"/ 3");
               count2++;
               if(count2 == 3) {
            	   System.out.println("3번밖에 못바꿉니다..");
            	   break;
               }
               if (select2 == 1) {
                  continue;
               } else {
                  break;
               }

            }
            throwDice();
            checkDice();
         } else if (mode == 3) {
            break;
         } else {
            System.out.println(" 1,2,3번중에 입력을 해주세요");
         }
      }
      System.out.println("프로그램을 종료합니다");
   }

   static void throwDice() {
      for (int i = 1; i < dice.length; ++i) {
         // dice[i] = (int)(Math.random()*6)+1;
         System.out.printf("[%d]", dice[i]);
      }
      System.out.println();
      System.out.println("count : " + count + "/12");
      System.out.println();
   }

   static void selectThrow(int select) {

      dice[select] = (int) (Math.random() * 6) + 1;
   }

   static void checkDice() {
	   
      count++;
      for( int i = 0; i < dice.length; ++i ) {
    	  counts[i] = 0;
      }

      for (int i = 0; i < dice.length; ++i) {
         switch (dice[i]) {
         case 0:
            counts[0]++;
            break;
         case 1:
            counts[1]++;
            break;
         case 2:
            counts[2]++;
            break;
         case 3:
            counts[3]++;
            break;
         case 4:
            counts[4]++;
            break;
         case 5:
            counts[5]++;
            break;
         }

      }

      for (int i = 0; i < dice.length; ++i) {
         System.out.println(counts[i]);
            if(counts[i] == 5) {
               System.out.println("["+(i)+"]" + "YaChu!!");
            }else if(counts[i] == 4) {
               System.out.println("["+(i)+"]" + "FourDice!");
            }
          
       }
      
      if(dice.equals(smallStrike) || dice.equals(smallStrike2)) {
    	  System.out.println("small Strike");
      }
      

      }
   }
