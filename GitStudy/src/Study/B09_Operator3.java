package Study;
public class B09_Operator3 {

   public static void main(String[] args) {
 
      /*
             # 삼항 연산자 
             
             -간단한 if문을 한줄로 표현할 수 있다
             - 조건 ? 예 : 아니오 ;
       */
      
      // ex : 필요한 바구니 개수 구하기 
      int apple = 25;
      int size = 10; 
      int needs = apple % size == 0 ? apple/ size : apple /size +1;
      
      System.out.println("필요한 바구니 개수는 " + needs + " 개 입니다 ");
   }

}