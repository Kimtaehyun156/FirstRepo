package Quiz;

import java.util.Scanner;

public class FiveDice {

   /*
    * �������� �ټ����� �ֻ����� ���������� ����� ���� ������ �����ϴ� Ŭ������ ��������
    * 
    * 1. Ǯ�Ͽ콺 ( ���� ���� 2�� +3��) (116666) (22233) (�ֻ�����������) 2. ������Ʈ����Ʈ (1234)
    * (2345)(3456) -(15��) 3. ������Ʈ����Ʈ (12345) (23456) - (30��) 4. 4 ���̽� (�������� 4��) -
    * (�ֻ������� ����) 5. 5���̽� (�������� 5��) - (50��)
    * 
    * �ֻ����� 12�������� /������ �ڸ�ä���ȴ� �ذ��ӱ��� �����ϰ� ������ ���� Yacht�� �˻��غ�����
    * 
    * # �޼��� (1) ����ֻ����� ������ �޼��� (2) ���ϴ� �ֻ����� �����ϰ� �������� ������ �޼��� (2��) (3) �ֻ����� 3������
    * ������ ����
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

      System.out.println("�ֻ��� �����Դϴ� ");
      System.out.println("1.�ֻ����� ������ 2.�����ؼ� ������ 3.������ �����Ѵ� ");
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
               System.out.println("���°�� �ٲٽðڽ��ϱ� ? ");
               Scanner sc2 = new Scanner(System.in);
               int select = sc2.nextInt();
               selectThrow(select);
               System.out.println("1.���ٲ۴� 2.�׸��ٲ۴� ");
               Scanner sc3 = new Scanner(System.in);
               int select2 = sc3.nextInt();
               System.out.println("�ٲܱ�ȸ :"+ count2 +"/ 3");
               count2++;
               if(count2 == 3) {
            	   System.out.println("3���ۿ� ���ٲߴϴ�..");
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
            System.out.println(" 1,2,3���߿� �Է��� ���ּ���");
         }
      }
      System.out.println("���α׷��� �����մϴ�");
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
