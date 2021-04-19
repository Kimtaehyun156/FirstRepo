package Study;
import Quiz.A01_printQuiz;
import Quiz.A03_Introduce;
//import Quiz.advance.AbcQuiz;
//import Quiz.basic.AbcTest;
/*
       #import
       - 다른 패키지에 정의되어있는 클래스를 사용하기 위해서는
        해당 클래스의 정확한 경로를 import 해야 한다.
       - 같은 패키지에 존재하는 클래스는 import 없이도 사용 할 수 있다 
 */


public class B02_Import {

   public static void main(String[] args) {
      
      
      // 같은 default package의  자원
      A01_Escape.main(null);
      A02_Variable.main(null);
      
      // 다른 패키지(Quiz)의 자원을 사용하기 위해서는 import가 필요하다
      A01_printQuiz.main(null);
      A03_Introduce.main(null);
      
      System.out.println();
      System.out.println();
      
      //Scanner sc = new Scanner(System.in); // Ctrl + Shift + O 
      
      
      // 연습 : quiz 밑의 advance 밑의 AbcQuiz 클래스를 사용해보세요
      //AbcQuiz.main(null);
      
      System.out.println();
      System.out.println();
      
      // 재시험 : Quiz 밑에 basic 이라는 패키지 만든후 
      //AbcTest.main(null);
      
   }

}