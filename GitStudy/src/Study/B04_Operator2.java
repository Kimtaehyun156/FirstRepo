package Study;

public class B04_Operator2 {

	public static void main(String[] args) {

		
		/*
		 		# �� ������ 
		 		- �� ������ ����� �� �Ǵ� �����̴� (boolean Ÿ���̴�)
		 		- ��� ����� �񱳿����� �Բ� ������ ������� ���� ����� �Ѵ�.
		 */
		
		int a = 8 , b =5 ;
		
		System.out.printf("a = %d , b = %d �ϋ� \n",a,b);
		System.out.println("a > b : "  + (a > b)); //��
		System.out.println("a < b : "  + (a < b)); //����
		System.out.println("a >= b : " + (a >= b)); //��
		System.out.println("a <= b : " + (a <= b)); //����
		System.out.println("a == b : " + (a == b)); // �ΰ��� ������ Ʈ��
		System.out.println("a != b : " + (a != b)); // �ΰ��� �ٸ��� Ʈ��  
		
		
		/*
		 		# �� ������
		 		- boolean Ÿ�� ������ �ϴ� ����
		 		- && : �� ���� ���� ��� true�� ����  true (AND ������)
		 		- || : �� ���� ���� �ϳ��� true�� �� true (OR ������)
		 		- ! : true �� false , false �� true (NOT ������)
		 		
		 */
		
		System.out.println("========AND(&&) ���� ========");
		System.out.println("true && true : " + (true && true));
		System.out.println("true && false : " + (true && false));
		System.out.println("false && true : " + (false && true));
		System.out.println("false && false : " + (false && false));
		
		System.out.println("========OR(||) ���� ========");
		System.out.println("true || true : " + (true || true));
		System.out.println("true || false : " + (true || false));
		System.out.println("false || true : " + (false || true));
		System.out.println("false || false : " + (false || false));
		
		System.out.println("========NOT(!) ���� ========");
		System.out.println("!true : " + (!true));
		System.out.println("!false : " + (!false));
		
		
		int x= 4, y = 7 , z =10;
		
		System.out.println("x�� 5���� ũ�� 3�ǹ���� ���"+(x > 5 && x % 3 == 0));
		System.out.println("3�� ��� 3�ǹ���� �뱫 : "+ (x % 3 ==0 && y%3 ==0 && z % 3 ==0));
		
		
		// �������� : x . y , z �� ��� 3�ǹ���� �ƴҶ� true�� ������ �񱳿����� �������� 
		
		System.out.println( x%3 !=0 && y%3 !=0 && z%3 !=0 );
		
		// !(A AND B) -> !A OR !B  
		
		
			
	}

}
