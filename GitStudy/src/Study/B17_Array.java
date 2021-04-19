package Study;

public class B17_Array {

	public static void main(String[] args) {
 
		/*
		 		# �迭(Array)
		 		
		 		 - ���� Ÿ�Ժ����� �ѹ��� ������ �����ϴ� ��� 
		 		 - ������ �����̸����� ������ ������ �����ѵ� �ε����� Ȱ���� �����Ѵ�
		 		 
		 		 �迭�� �ѹ� ũ�Ⱑ �������� ũ�⸦ �����Ҽ� ����
		 		 �迭�� ������ ���ÿ� �ʱ�ȭ�� �Ǿ��ִ� 
		 		 (������ 0 , �Ǽ� : 0.0  , boolean : false(0) , ������ :null); 
		 		
		 */
		
		int[] score = new int[100];
		
		score[0] = 90;
		score[99] = 123;
		
		
		//�迭��  �迭.length�� ���� ���̸� �˼� �ִ�  // ()�� �ȵ��� 
		for(int index = 0; index <= score.length-1; index++) {
			score[index] = (int)(Math.random()*101);
		}
		
		//System.out.println("10���� �л��� ������ : " + score[9]);
		
		// �������� 1�� score�� ���հ� �����(�Ҽ� �Ѥ�¥��) ����غ�����
		int sum = 0;
		double avg = 0 ;
		
		for (int i = 0; i < score.length; ++i) {
			sum += score[i];
		}
		
		//  int�� 		/ 	int �� 	= int��
		//  double �� 	/ 	int�� 	= double ��
		//  int��   		/  double��  = double ��
		avg = ((double)sum / score.length);
		
		System.out.printf("�л����� ������ : %d \n�л����� ����� : %.2f" , sum , avg);
		System.out.println();
		
		/*
		 		# �迭�� �����ϴ� ���
		 		1. Ÿ��[] �迭�̸� = new Ÿ��[�迭ũ��];
		 		2. Ÿ��[] �迭�̸� = {};
		 		3. Ÿ��[] �迭�̸� = new Ÿ��[] { ��1, ��2 , ��3 };
		 		
		 */
		char[] grade = new char[50];
		int age[] = { 10 , 15 , 21 ,80 , 75};
		boolean[] passExam = {true , false , true , true , false , 80 > 70};
		String[] animals = new String[] { "Lion" , "tiger" , "penguin" ," Monkey"};
		
		System.out.println(animals[0]);
		
		if(passExam[3]) {
			System.out.println("4���� ����� ������ ����߽��ϴ�");
		}else {
			System.out.println("4���� ����� ������ ���������ϴ�");
		}
		
		for(int i = 0; i < grade.length; ++i) {
			System.out.println((int)grade[i]);
		}
		
		// #�迭�� ������ �ٸ��� �ʱ�ȭ�� �ڵ����� �Ǿ��ִ� 
		int[] arr = new int[3];
		int a, b, c;
		
		System.out.println("arr[0]" + arr[0]);
		
		// # String�� char�� �迭�� ��ȯ�Ҽ� �ִ� 
		char[] msg1 = new char[] {'h' ,'e' ,'l','l','o'};
		String msg2 = "hello";
		char[] msg3 = msg2.toCharArray();
		
		System.out.println(msg1[0]);
		System.out.println(msg1[1]);
		System.out.println(msg1[2]);
		
		System.out.println(msg2.charAt(0));
		System.out.println(msg2.charAt(1));
		System.out.println(msg2.charAt(2));
		
		System.out.println(msg3[0]);
		System.out.println(msg3[1]);
		System.out.println(msg3[2]);
	}

}
