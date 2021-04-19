package Quiz;

import java.util.Random;

public class B16_Random_Quiz {

   public static void main(String[] args) {
      
      //4자리의 랜덤 임시비밀번호를 생성하는 프로그램을 만들어보세요.
      //(비밀번호를 구성하는 문자는 영어 대문자와 숫자입니다)

      for(int i=1; i<= 4; i++) {
         
         int rand = (int)(Math.random()*4)+1;
         if(rand % 2 == 0) {
            System.out.println((char)(Math.random()*26+65)); //알파벳 랜덤 
         }else {
         System.out.println((int)(Math.random()*9+0)); //숫자랜덤
         }
         
         
      }
      
       
        // 문자셋을 만들어두고 인덱스를 랜덤으로 선택하는 방식
        String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        
        int password_size = 4;
        
        for (int i = 0; i < password_size; ++i) {
                int random_index = (int)(Math.random() * charset.length());
                System.out.print(charset.charAt(random_index));
        }
        System.out.println();

      
       /*
        *    2. Random 클래스 
        *    - 좀 더 편리하게 랜덤 값을 선택할 수 있는 기능들이 모여있는 클래스
        *    - 생성할때 랜덤 시드가 생성된다
        *    - 원하는 랜덤 시드를 선택할 수도 있다. 
        *     
        */
        
        // 새로운 랜덤 시드 생성
        Random ran = new Random();
        
        // Random.nextInt(bound) 
        // 0~ bound 미만의 정수를 반환한다 
        System.out.println(ran.nextInt(45)+1); // 1~45의 랜덤 정수 
        System.out.println(ran.nextInt(41)+30); // 30~70의 랜덤정수
        System.out.println(ran.nextInt());
        System.out.println(ran.nextInt());
        System.out.println(ran.nextInt());
        
        int com_num = ran.nextInt(4)+1;
        System.out.println(com_num);
   }

}