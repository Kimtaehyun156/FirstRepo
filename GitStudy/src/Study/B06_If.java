package Study;

public class B06_If {

   public static void main(String[] args) {
 
      /*
       *       # if�� 
       *       - () �ȿ� ���� true�ϋ� {}���� ������ �����Ѵ�
       *          - () �ȿ� ���� false�ϋ� {}���� ������ ���� ���Ѵ� 
       *      - {} �ȿ� �� ������ �� �����̶�� {}�� �����Ҽ� �ִ�
       *
       *      # else if��
       *     - ���� �ִ� if���� ��������ʾҴٸ� if��ó�� �����Ѵ�
       *     - else if �� �ܵ����� ����Ҽ� ���� 
       *     - else if�� ������ ����� �� �ִ�
       *  
       *     # else�� 
       *     - ���� �ִ� if , elseif  ��� ������� �ʾҴٸ� {} �ȿ� ������ ������ �����մϴ� 
       *     - if �ٷ� ������ �� ���� �ִ� 
       *     �� else �� �پ� �ִ� �������� �ּ� �ѹ��� ����ȴ� 
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
      
      char ch = '��';
      
      if( ch >= '��' && ch <='�R') {
         System.out.println("ch�� ����ִ� ���� �ѱ� �Դϴ�");
      } else {
         System.out.println("ch�� ����ִ� ���� �ѱ��� �ƴմϴ� ");
      }
      
      System.out.println("���α׷��� �������ϴ�!");
   }

}