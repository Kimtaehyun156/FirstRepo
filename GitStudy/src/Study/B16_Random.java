package Study;

public class B16_Random {

   public static void main(String[] args) {
      
      /*
       *  # JAVA에서 무작위 숫자 생성하기
       *   1. Math.random()
       *   -  double 타입의 랜덤 소수를 생성한다 
       *     - 0<= x < 1  
       *     -  이 랜덤 소수를 이용하여 원하는 범위의 숫자를 만들수있다
       *    
       *    ※  원하는 범위의 숫자를 만드는순서 
       *  (1) 생성된 랜덤 소수에 원하는 수자의 개수를 곱한다 
       *     ( 0 * 31 <= x < 1 * 31 )  0~ 31
       *  (2) 원하는 숫자중 가장 작은 숫자를 더한다 
       *     (0 * 31 + 30 < = x < 1* 31 +30)
       *  (3) 소수점 아래를 삭제한다 
       *     Math.floor()  또는 인트로 타입캐스팅한다 
       */
      
//      for (int i = 0; i< 10; ++i) {
//         System.out.println((int)Math.floor(Math.random()*31+30));
//      }
      
      // 연습문제 :  1부터  45의 랜덤숫자를 7개 출력해보세요 
      
      for (int i = 0; i< 7; ++i) {
         System.out.println((int)(Math.random()*45+1));
      }
   }

}