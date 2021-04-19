package Quiz;

import java.util.Arrays;

public class C01_FunctionQuiz2 {

   
   /*
          # ������ �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ����� 2
           
          1. �ִ밪�� �Ű������� ���� ������ 0���� �ִ밪 �̸��� ��� ���� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ� range�Լ��� ��������
           
           ex) range(10) �� ��� [0.1.2.3.4.5.6
           
          2. �ּҰ��� �ִ밪�� �Ű������� ������ �׻��̿� �����ϴ� 
           ��� ���� �����ϴ� int �迩�� �����Ͽ� ��ȯ�ϴ� range �Լ��� �������� (�ּҰ� �̻� , �ִ밪 �̸�)
           
          
          3.�ּҰ��� �ִ밪�� �������� �Ű������� ������ �ּҰ����� ���� �Ͽ� �ִ밪���� ��������ŭ �����ϴ� int�迭�� �����Ͽ� ��ȯ�ϴ� range�Լ����������� 
          (�ּҰ� �̻� , �ִ밪�̸�)
    */
   
   
   //1. �ִ밪�� �Ű������� ���� ������ 0���� �ִ밪 �̸��� ��� ���� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ� range�Լ��� ��������
   public static int[] range(int max) {
   
      int[] sum = new int[max];
      for (int i = 0; i< max; ++i) {
         sum[i] = i;
      }
      
      return sum;
   }
   
   
   //2. �ּҰ��� �ִ밪�� �Ű������� ������ �׻��̿� �����ϴ� 
   //��� ���� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ� range �Լ��� �������� (�ּҰ� �̻� , �ִ밪 �̸�)
   // �Ű������� ���� Ȥ�� Ÿ���� �ٸ��� �����̸��� �Լ��� �ٸ��Լ��� ����̵ȴ� ( �Լ��� �����ε�)   function overLoading
   public static int[] range(int min , int max) {
      
	   if(min >= max) {
		   return null; // �߸��� ���� �� return���� �Լ��� ������ �����Ű��
	   }
	   
      int size = max >min ? max-min : min-max;
      int[] minTomax = new int[size];
   
      for (int i = 0; i < minTomax.length; ++i ) {
         minTomax[i] = i+min;
      }
      return minTomax;
   }
   
  // 3.�ּҰ��� �ִ밪�� �������� �Ű������� ������ �ּҰ����� ���� �Ͽ� �ִ밪���� ��������ŭ �����ϴ� int�迭�� �����Ͽ� ��ȯ�ϴ� range�Լ����������� 
  // (�ּҰ� �̻� , �ִ밪�̸�)
   public static int[] range(int min ,int max ,int inc) {
	   
      int len = (int)Math.ceil((max-min)/ (double)inc);
      
      int[] minTomax2 = new int[len];
      
      for (int i=0; i < minTomax2.length;  ++i) {
         minTomax2[i] = min;
         min += inc;
      }
      return minTomax2;
      
   }
  
   
   
   
   
   public static void main(String[] args) {
   
      
      //1�� ���� ��� 
      System.out.println(Arrays.toString(range(5)));
      System.out.println(range(5)[4]);
      // 2�� ���� ���
      System.out.println(Arrays.toString(range(5,15)));
      // 3�� ���� ���
      System.out.println(Arrays.toString(range(50,56,5)));
   }

}