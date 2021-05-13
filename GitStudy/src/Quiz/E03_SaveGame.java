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
    *   1.��ǻ�Ϳ� �����ϴ� ������ �������������� ������ ����� ������ 
    *   
    *   - ó�� �����ϸ� �̸��� �Է��� 
    *   -  ���α׷� ����� �÷��̾��� ������ ���Ͽ� ������
    *   -  (�����Ҷ� ���ϸ��� �̸� .txt)
    *  
    *   2. ���α׷� ����� �̸��� �Է����� �� �ش� ������ �ִٸ� 
    *      ������ �ҷ��� �� ����ǵ��� �������� 
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
      System.out.println(" �÷��̾� �̸��� �Է����ּ��� > ");
      String name = sc.next();
      
      String Filetxt = "./notes/"+name+".txt"; 
      File newFile = new File(Filetxt);
      if(newFile.isFile()) {
         try {
            FileInputStream fin = new FileInputStream(newFile);
            
            byte[] buffer = new byte[2000];

            //�� ���ϴ� ����Ʈ�� �б� 
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
      System.out.println(" ����(0) ����(1) ��(2) ��� ���ðڽ��ϱ� > ");
      int player = sc2.nextInt();
      
      int computer = (int)Math.random()*3;
      
      if(player == computer) {
         System.out.println("���º��Դϴ�");
         draw++;
      }
      
      // �÷��̾� ����(0)��   üũ 
      if( player == 0) {
         if(computer == 1) {
            System.out.println("Player(����) VS Computer(����)");
            System.out.println("Computer �¸�!!");
            computerWin1++;
         }else if( computer == 2) {
            System.out.println("Player(����) VS Computer(��)");
            System.out.println("Player �¸�!!");
            playWin1++;
         }
      }
      
      // �÷��̾� ����(1)��   üũ 
      if( player == 1) {
         if(computer == 2) {
            System.out.println("Player(����) VS Computer(��)");
            System.out.println("Computer �¸�!!");
            computerWin2++;
         }else if( computer == 0) {
            System.out.println("Player(����) VS Computer(����)");
            System.out.println("Player �¸�!!");
            playWin2++;
         }
      }
      
      // �÷��̾� ��(3)��   üũ 
      if( player == 2) {
         if(computer == 0) {
            System.out.println("Player(��) VS Computer(����)");
            System.out.println("Computer �¸�!!");
            computerWin3++;
         }else if( computer == 1) {
            System.out.println("Player(��) VS Computer(����)");
            System.out.println("Player �¸�!!");
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
      
      fout2.write(String.format("%d�� %d�� %d�� \n", wins,loses,draws).getBytes());
      fout2.close();
   } catch (FileNotFoundException e) {

      e.printStackTrace();
   } catch (IOException e) {
      e.printStackTrace();
   }
 
   }
}