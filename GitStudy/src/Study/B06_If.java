package Study;

public class B06_If {

   public static void main(String[] args) {
 
      /*
       *       # if문 
       *       - () 안에 값이 true일떄 {}안의 내용을 실행한다
       *          - () 안에 값이 false일떄 {}안의 내용을 실행 안한다 
       *      - {} 안에 들어갈 내용이 단 한줄이라면 {}를 생략할수 있다
       *
       *      # else if문
       *     - 위에 있는 if문이 실행되지않았다면 if문처럼 동작한다
       *     - else if 는 단독으로 사용할수 없다 
       *     - else if는 여러번 사용할 수 있다
       *  
       *     # else문 
       *     - 위에 있는 if , elseif  모두 실행되지 않았다면 {} 안에 내용을 무조건 실행합니다 
       *     - if 바로 다음에 쓸 수도 있다 
       *     ※ else 가 붙어 있는 조건절은 최소 한번은 실행된다 
       */
      
      int a = -8;
      
      if(a == 5) {
         System.out.println("hello!");
         System.out.println("hello2!");
      } else if( a > 0 ) {
         System.out.println("Nice to meet you!");
      } else if ( a >-10) {
         System.out.println("Greeting!");
      } else if (a > -20) {
         System.out.println("Good to see you!!");
      }
      
      char ch = '가';
      
      if( ch >= '가' && ch <='힣') {
         System.out.println("ch에 들어있는 값은 한글 입니다");
      } else {
         System.out.println("ch에 들어있는 값은 한글이 아닙니다 ");
      }
      
      System.out.println("프로그램이 끝났습니다!");
   }

}