package Study;

public class B12_Swap {

	public static void main(String[] args) {
		 
		int a = 10 , b = 20;
		int tmp ;
		
		System.out.printf(" a : %d  ,  b : %d " , a , b);
		System.out.println();
		
		//tmp �� a�� ��� ����
		tmp = a;
		
		// a�� b�� ���� (a�� �������)
		a = b;
		
		// �Ʊ� �����߳��� c�� b�� ����
		b = tmp;
		
		System.out.printf(" a : %d  ,  b : %d " , a , b);
	}

}
