package Study;
import Quiz.A01_printQuiz;
import Quiz.A03_Introduce;
//import Quiz.advance.AbcQuiz;
//import Quiz.basic.AbcTest;
/*
       #import
       - �ٸ� ��Ű���� ���ǵǾ��ִ� Ŭ������ ����ϱ� ���ؼ���
        �ش� Ŭ������ ��Ȯ�� ��θ� import �ؾ� �Ѵ�.
       - ���� ��Ű���� �����ϴ� Ŭ������ import ���̵� ��� �� �� �ִ� 
 */


public class B02_Import {

   public static void main(String[] args) {
      
      
      // ���� default package��  �ڿ�
      A01_Escape.main(null);
      A02_Variable.main(null);
      
      // �ٸ� ��Ű��(Quiz)�� �ڿ��� ����ϱ� ���ؼ��� import�� �ʿ��ϴ�
      A01_printQuiz.main(null);
      A03_Introduce.main(null);
      
      System.out.println();
      System.out.println();
      
      //Scanner sc = new Scanner(System.in); // Ctrl + Shift + O 
      
      
      // ���� : quiz ���� advance ���� AbcQuiz Ŭ������ ����غ�����
      //AbcQuiz.main(null);
      
      System.out.println();
      System.out.println();
      
      // ����� : Quiz �ؿ� basic �̶�� ��Ű�� ������ 
      //AbcTest.main(null);
      
   }

}