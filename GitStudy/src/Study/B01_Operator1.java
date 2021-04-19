package Study;


public class B01_Operator1 {

   public static void main(String[] args) {
      
      /*
             # ������ (Operator)
                - ����� �� ����ϴ� ��
                - + , - , * , / ...
       */
      
      // ��� ������ 
      int a = 10 , b =7;
      double c = 7.0; 
      
      System.out.println("a + b = "+(a+b));
      System.out.println("a - b = "+(a-b));
      System.out.println("a * b = "+(a*b));
      
      // �������� ������ �� ���´� 
      System.out.println("a / b = "+(a/b));
      
      // ������ �Ǽ��� ������ ��Ȯ�� ���� ����Ѵ�.
      System.out.println("a / c = "+(a/c));
      System.out.println("a / (double)b = "+(a/(double)b));
      System.out.println("a / (float)b = "+(a/(float)b));
      
      // % = ������ 
      System.out.println("a % b = "+(a%c));
      
      System.out.println(" a�� 3���� :" + Math.pow(a, 3));
      // System.out.println(" a�� 3����? ^ :" + a ^ 3);
      System.out.println(" 49�� ������ :" + Math.sqrt(49));
      System.out.println(" 50�� ������ :" + Math.sqrt(50));
      System.out.println(" -25�� ���밪 :" + Math.abs(-25));
      
      // # Math.round �Լ��� �Ҽ� ù°�ڸ��� �ݿø�
      /*
             Math.round()�� �Ҽ� ù���ڸ������� �ݿø� �Ҽ� �ִ� . 
             �ݿø��ϰ� ���� �ڸ��� �Ҽ� ù�� �ڸ��� ���鸸ŭ ������ 
             �ٽ� ������ ����� ���� ���ϴ� �ڸ������� �ݿø� �Ҽ� �ִ�
       */
      
      System.out.println("�ݿø� �Ҽ� ù���ڸ�  : "+ Math.round(3.335));
      System.out.println("�ݿø� �Ҽ� �¤��ڸ�  : "+ Math.round(3.335*100) /100.0);
      System.out.println("�ݿø� : "+ Math.round(3.665));
      
      System.out.println("�ø� : " + Math.ceil(1.001));
      System.out.println("���� : " + Math.floor(1.999));
      
      
      System.out.println(" �� ū ���� ���ϱ� : " + Math.max(1900, 1500));
      System.out.println(" �� ���� ���� ���ϱ� : " + Math.min(1900, 1500));
   
      
      // # ��Ʈ ���� 
      // & , | , ^ , >> , << 
      
      // a = 10  , b = 7 
      //  a= 1010 , b =0111
      
      //  a 1010
      //  b 0111
      //--------------
      //    0010 -> 2
      System.out.println("a & b = " + (a & b));      // AND ���� (�ΰ��� ���ϋ� �� )
      
      
      //  a 1010
      //  b 0111
      //--------------
      //    1111 =  15 
      System.out.println(a | b);      // OR ����  (�ΰ��߿� �ϳ��� ���̸� ��)
      
      //  a 1010
      //  b 0111
      //--------------
      //    1101  = 13 
      System.out.println(a ^ b);      // XOR ���� (�ΰ��� ���δ޶�� ��)
      
      
      // 0000001000
      // 0000100000 = 32
      System.out.println(8 << 2);      // SHIFT ���� <<������ �ش�ĭ��ŭ �о����
      
      // 0000001000
      // 0000000010 = 2
      System.out.println(8 >> 2);      // SHIFT ����  >> ������ �ش�ĭ��ŭ �о���� 
   }

}
