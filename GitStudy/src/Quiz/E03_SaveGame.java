package Quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class E03_SaveGame {

   
   /*
    *   1.컴퓨터와 진행하는 간단한 가위바위바위보 게임을 만들어 보세요 
    *   
    *   - 처음 시작하면 이름을 입력함 
    *   -  프로그램 종료시 플레이어의 전적을 파일에 저장함
    *   -  (저장할때 파일명은 이름 .txt)
    *  
    *   2. 프로그램 실행시 이름을 입력했을 때 해당 전적이 있다면 
    *      전적을 불러온 후 진행되도록 만들어보세요 
    *   
    */

   static int wins = 0 ;
   static int loses = 0 ;
   static int draws  = 0;
   
   public static void main(String[] args) {
      
      int playWin1 =0 , playWin2 = 0, playWin3 = 0;
      int computerWin1 = 0 ,  computerWin2 = 0, computerWin3 = 0;
      int draw = 0;
      
      Scanner sc = new Scanner(System.in);
      System.out.println(" 플레이어 이름을 입력해주세요 > ");
      String name = sc.next();
      
      String Filetxt = "./notes/"+name+".txt"; 
      File newFile = new File(Filetxt);
      if(newFile.isFile()) {
         try {
            FileInputStream fin = new FileInputStream(newFile);
            
            byte[] buffer = new byte[2000];

            //※ 원하는 바이트씩 읽기 
            int len;
            while((len= fin.read(buffer)) != -1) {
               System.out.println(new String(buffer,0,len));
            }
            
         
            fin.close();
         } catch (FileNotFoundException e) {
            e.printStackTrace();
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
      boolean loop = true;
      while(loop) {
    	  
      }
      Scanner sc2 = new Scanner(System.in);
      System.out.println(" 가위(0) 바위(1) 보(2) 어떤걸 내시겠습니까 > ");
      int player = sc2.nextInt();
      
      int computer = (int)Math.random()*3;
      
      if(player == computer) {
         System.out.println("무승부입니다");
         draw++;
      }
      
      // 플레이어 가위(0)일   체크 
      if( player == 0) {
         if(computer == 1) {
            System.out.println("Player(가위) VS Computer(바위)");
            System.out.println("Computer 승리!!");
            computerWin1++;
         }else if( computer == 2) {
            System.out.println("Player(가위) VS Computer(보)");
            System.out.println("Player 승리!!");
            playWin1++;
         }
      }
      
      // 플레이어 바위(1)일   체크 
      if( player == 1) {
         if(computer == 2) {
            System.out.println("Player(바위) VS Computer(보)");
            System.out.println("Computer 승리!!");
            computerWin2++;
         }else if( computer == 0) {
            System.out.println("Player(바위) VS Computer(가위)");
            System.out.println("Player 승리!!");
            playWin2++;
         }
      }
      
      // 플레이어 보(3)일   체크 
      if( player == 2) {
         if(computer == 0) {
            System.out.println("Player(보) VS Computer(가위)");
            System.out.println("Computer 승리!!");
            computerWin3++;
         }else if( computer == 1) {
            System.out.println("Player(보) VS Computer(바위)");
            System.out.println("Player 승리!!");
            playWin3++;
         }
      }
      
      
      try {
         FileOutputStream fout = new FileOutputStream(newFile,true);
         
         if(playWin1 != 0) {
            fout.write("win!! \n".getBytes());
            //wins++;
         }else if(playWin2 != 0) {
            fout.write("win!! \n".getBytes());
            //wins++;
         }else if(playWin3 != 0) {
            fout.write("win!! \n".getBytes());
            //wins++;
         }else if(computerWin1 != 0) {
            fout.write("lose!! \n".getBytes());
            //loses++;
         }else if(computerWin2 != 0) {
            fout.write("lose!! \n".getBytes());
            //loses++;
         }else if(computerWin3 != 0) {
            fout.write("lose!! \n".getBytes());
            //loses++;
         }else if( draw != 0) {
            fout.write("draw \n".getBytes());
            //draws++;
         }
         fout.close();
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } 
      
      
      try {
      FileInputStream fin2 = new FileInputStream(newFile);


       int _byte;

      while((_byte=fin2.read()) != -1) {
         
            if((char)_byte == 'n') {
               wins++;
            }
            
            if((char)_byte == 'l') {
               loses++;
            }
            
            if((char)_byte == 'd') {
               draws++;
           }
         }
      fin2.close();
   } catch (FileNotFoundException e) {
      e.printStackTrace();
   } catch (IOException e) {
      e.printStackTrace();
   }
      
      try {
      FileOutputStream fout2 = new FileOutputStream(newFile,true);
      
      fout2.write(String.format("%d승 %d패 %d무 \n", wins,loses,draws).getBytes());
      fout2.close();
   } catch (FileNotFoundException e) {

      e.printStackTrace();
   } catch (IOException e) {
      e.printStackTrace();
   }
 
   }
}