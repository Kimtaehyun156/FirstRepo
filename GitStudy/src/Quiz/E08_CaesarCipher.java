package Quiz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E08_CaesarCipher {

   /*
       # ��ȣȭ 
       - ���� �˾ƺ��� ���� ����(��ȣ��)�� ��ȯ�ϴ°� 
       - ���� �������� ������ ���İ����� �˾� ���� ���� �ϴ°��� �����̴� 
       
       
       # ��ȣȭ
       - ��ȣȭ �� ��ȣ���� �ٽ� ������ �ǵ����°�  
       
       # Ű 
       - ��ȣȭ �Ǵ� ��ȣȭ�� ���Ǵ� ��
       
       # ���� ��ȣ 
        "Hello, World!" ---- key:5 ----> "Mjqqt, btwqi!"
        
        ABCDEFGHIJKLMNOPQRSTUVWXYZ
       
       ��ȣȭ : key��ŭ ���������� ���ڸ� �̵���Ŵ 
       ��ȣȭ : key��ŭ �������� ���ڸ� �̵���Ŵ 
       
       ���� 
       #  frankenstein.txt��  1 ~ 25 ������ ����Ű�� ��ȣȭ �� ���� 
       #  "frankenstein.encrypted.txt"�� �����غ����� 
      # �� ���ĺ��� ��ȣȭ�Ұ�
       
    */
   public static void main(String[] args) {

      File file = new File("./data/text/frankenstein.txt");
      StringBuilder sb = new StringBuilder();
      int key = (int)(Math.random()*24+1);
      
      try(FileReader reader = new FileReader(file);) {
         int ch= -1;
         while((ch= reader.read()) != -1) {
            if(ch >= ((char)'a') && ch <= ((char)'z') ) {
               ch += key;
               if(ch > (char)'z') {
                  ch %= ('z'+1);
               }
               sb.append((char)ch);
            }else if ( ch >= ((char)'A') && ch <= ((char)'Z')) {
               ch += key;
               if(ch > (char)'Z') {
            	   ch %= ('Z'+1);
               }
               sb.append((char)ch);
            }else {
               sb.append((char)ch);
            }
            
         }
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e1) {
         e1.printStackTrace();
      }
      
      //���� ����
      try (BufferedWriter bout = new BufferedWriter(new FileWriter( new File("./data/text/frankenstein.encrypted.txt")));){
         bout.append(sb);
      } catch (IOException e) {
         e.printStackTrace();
      }
   
      
      //��ȣȭ�� �� �б�
      File file2 = new File("./data/text/frankenstein.encrypted.txt");
      StringBuilder sb2 = new StringBuilder();
      try(FileReader reader2 = new FileReader(file2);) {
         int ch2 = -1;
         while((ch2= reader2.read()) != -1) {
            if(ch2 >= ((char)'a') && ch2 <= ((char)'z') ) {
               ch2 -= key;
               if(ch2 < (char)'a') {
                  ch2 += 25;
               }
               System.out.print((char)ch2);
            }else if ( ch2 >= ((char)'A') && ch2 <= ((char)'Z')) {
               ch2 -= key;
               if(ch2 < (char)'A') {
                  ch2 += 25;
               }
               System.out.print((char)ch2);
            }else {
               System.out.print((char)ch2);
            }
         }
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e1) {
         e1.printStackTrace();
      }
      System.out.println("key :" + key);
   }
}