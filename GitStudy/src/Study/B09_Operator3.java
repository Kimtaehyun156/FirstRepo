package Study;
public class B09_Operator3 {

   public static void main(String[] args) {
 
      /*
             # ���� ������ 
             
             -������ if���� ���ٷ� ǥ���� �� �ִ�
             - ���� ? �� : �ƴϿ� ;
       */
      
      // ex : �ʿ��� �ٱ��� ���� ���ϱ� 
      int apple = 25;
      int size = 10; 
      int needs = apple % size == 0 ? apple/ size : apple /size +1;
      
      System.out.println("�ʿ��� �ٱ��� ������ " + needs + " �� �Դϴ� ");
   }

}