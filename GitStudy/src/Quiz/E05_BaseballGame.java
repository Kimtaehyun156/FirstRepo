package Quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class E05_BaseballGame {

   public static void main(String[] args) {
      
       
      
      LinkedList<UserRecord> ranking = new LinkedList<>();
      
      File save = new File("./data/base.ball");
      
      if(save.exists()) {
         
         try {
            ObjectInputStream oin = new ObjectInputStream(new FileInputStream(save));
            ranking = (LinkedList)oin.readObject();
            
            oin.close();
         } catch (FileNotFoundException e) {
            e.printStackTrace();
         } catch (IOException e) {
            e.printStackTrace();
         } catch (ClassNotFoundException e) {
            e.printStackTrace();
         }
         
         System.out.println(" #### ���緩ŷ  ####");
         printRanking(ranking);
      }
      
      
      
      InputStreamReader input = new InputStreamReader(System.in);
      //DataInputStream sc = new DataInputStream(System.in);
      Scanner sc = new Scanner(input);
      
      System.out.println("���ӽ���! ������ 1234�� �Է����ּ���");
      
      long start = System.currentTimeMillis();
      
      System.out.println("�Է����ּ��� >>");
      int record = -1;
      if( sc.nextInt() == 1234) {
         System.out.println("����");
         record =  (int)(System.currentTimeMillis() - start);
         
         System.out.println("����� �̸��� �Է��ϼ��� >");
         ranking.add(new UserRecord(sc.next(),record));
         Collections.sort(ranking);
         
         if(ranking.size() == 31 ) {
            ranking.remove(30);
         }

         try {
            ObjectOutputStream out = new ObjectOutputStream(
                  new FileOutputStream(save));
            
            out.writeObject(ranking);
            out.close();
         } catch (FileNotFoundException e) {
            e.printStackTrace();
         } catch (IOException e) {
            e.printStackTrace();
         }
      
         
   
         
      }else {
         System.out.println("����");
      }
      
      printRanking(ranking);
   }
   private static void printRanking(List<UserRecord> ranking) {
      int i = 1;
      for( UserRecord record : ranking) {
         System.out.println(i++ + "�� - " +record);
      }
   }
}

/*
    # Serializable interface 
    -  �ش� Ŭ������ ������ �ν��Ͻ��� ����ȭ �Ҽ� �ִٰ� ǥ���ϴ� �������̽� 
    - serialVersionUID�� ���ϴ� ���� ������ȴ� 
    - ObjectOutputStream���� �ڹ� ��ü�� ���Ͽ� ������ �� 
      �ش� ��ü�� ����ȭ(�ڵ�ȭ) �Ҽ� �־�� �Ѵ� 
 */

class UserRecord implements Comparable<UserRecord> , Serializable{
   
   private static final long serialVersionUID = 1L;
   String name;
   int user_try;
   int record;
   
   public UserRecord(String name , int record) {
      this.name = name;
      this.record = record;
      this.user_try =(int)(Math.random()*8 +1);
   }
   
   @Override
   public String toString() {
      return String.format("%s[try %d time(s) / %d millisec]", name,user_try,record);
   }
   @Override
   public int compareTo(UserRecord o) {

      return this.user_try - o.user_try !=0 ? 
            this.user_try - o.user_try :this.record-o.record;
   }
}