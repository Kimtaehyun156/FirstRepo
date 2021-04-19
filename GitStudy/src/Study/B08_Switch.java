package Study;

public class B08_Switch {

   public static void main(String[] args) {
 
      /*
             # switch-case문
             - ()안의 연산 결과에 따라 실행할 코드를 결정한다
             -()안에 boolean 타입은 들어갈수 없다 
       */
      
      int a = 10;
      
      switch (a%2) {
      case 0:
         System.out.println("a는 짝수입니다");
         break;
      case 1:
         System.out.println("a는 짝수입니다");
         break;
      }
      
      char grade ='A';
      
      switch(grade) {
      case 'E':
         System.out.println("전체 관람가입니다");
         break;
      case 'k': 
         System.out.println("12세 이상 관람가입니다");
         break;
      case 'Y':
         System.out.println("15세 이상 관람가입니다");
         break;
      case 'A':
         System.out.println("청소년 관람 불가 입니다");
         break;
      default:
         System.out.println("상영제한 등급 입니다");
         break;   
      }
   }

}