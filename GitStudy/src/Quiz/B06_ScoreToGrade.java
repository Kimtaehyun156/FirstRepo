package Quiz;

import java.util.Scanner;

public class B06_ScoreToGrade {

   public static void main(String[] args) {

      /*
          #점수를 입력받으면 점수에 해당하는 등급을 출력해주는 프로그램 작성해보세요 
          
          90점이상 : A등급
          80점이상 : B등급
          70점이상 : C등급
          60점이상 : D등급
          그외 :F등급
          
          ※ 유효한 점수는 0~ 100점 입니다 
       */
      
      System.out.println("점수를 입력해주세요(0~100) : ");
      Scanner sc = new Scanner(System.in);
      int score = sc.nextInt();
      
      if(score < 0 || score >100) {
         System.out.println("점수를 (0~100)사이로 입력해주세요 ");
      }else if(score >= 90) {
         System.out.println("A등급");
      }else if(score >= 80) {
         System.out.println("B등급");
      }else if(score >= 70) {
         System.out.println("C등급");
      }else if(score >= 60) {
         System.out.println("D등급");
      }else {
         System.out.println("F등급");
      }
   }

}