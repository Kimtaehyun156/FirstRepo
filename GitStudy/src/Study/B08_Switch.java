package Study;

public class B08_Switch {

   public static void main(String[] args) {
 
      /*
             # switch-case��
             - ()���� ���� ����� ���� ������ �ڵ带 �����Ѵ�
             -()�ȿ� boolean Ÿ���� ���� ���� 
       */
      
      int a = 10;
      
      switch (a%2) {
      case 0:
         System.out.println("a�� ¦���Դϴ�");
         break;
      case 1:
         System.out.println("a�� ¦���Դϴ�");
         break;
      }
      
      char grade ='A';
      
      switch(grade) {
      case 'E':
         System.out.println("��ü �������Դϴ�");
         break;
      case 'k': 
         System.out.println("12�� �̻� �������Դϴ�");
         break;
      case 'Y':
         System.out.println("15�� �̻� �������Դϴ�");
         break;
      case 'A':
         System.out.println("û�ҳ� ���� �Ұ� �Դϴ�");
         break;
      default:
         System.out.println("������ ��� �Դϴ�");
         break;   
      }
   }

}