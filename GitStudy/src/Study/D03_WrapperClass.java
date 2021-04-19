package Study;

public class D03_WrapperClass {

	
	/*
	 *		# Wrapper Class
	 * 		- �⺻ Ÿ�Ե��� ������Ÿ������ ����ϱ� ���� Ŭ���� 
	 * 		- �� Ÿ�Ե��� ���� ������ ��ɵ��� ���ִ� 
	 * 
	 * 		# �⺻�� �̸� 
	 * 		- byte , short ,    char ,    int ,   long , float , double , boolean
	 * 		
	 * 		# ������ �̸�
	 * 		- Byte , Short ,Character , Integer , Long , Float , Double , Boolean
	 */
	
	
	public static void main(String[] args) {
		
		// # parse �ø��� 
		// - ���ڿ��� ���ϴ� Ÿ������ ��ȯ��Ű�� ��� 
		// - ��Ÿ�Կ� ����ƽ �޼���� �����Ѵ� 
		// - �����͸� �ְ� �������� ��� ���ڿ��� ��ȯ�Ͽ� ���۵Ǵ� ��찡 ���� 
		// - �ٽ� ����ϱ� ���ؼ��� ���� �����͸�  ������ Ÿ������ �ǵ����� �Ѵ�
		// - radix�� �����ִ� �����ε��� �ش� ������ �ǹ��Ѵ�
		
		// parseInt
		try {
			int a1 = Integer.parseInt("1234ABC",16);
			System.out.println(a1);
		} catch (NumberFormatException e) {
			System.out.println("int�� ��ȯ�Ҽ� ���� ���ڿ��̾����ϴ� ");
		}
		
		// parseDouble
		System.out.printf("%.9f\n", Double.parseDouble("123.123456789"));
		
		// parseBoolean
		System.out.println(Boolean.parseBoolean("true"));
		System.out.println(Boolean.parseBoolean("yes"));
		
		/*
		 *		# toString()
		 *		- �ش� Ÿ���� ���� �ս��� ���ڿ��� ��ȯ�� �� �ִ� 
		 *		- toString()�� Object�� �޼����̱� ������ ���Ŭ������ �����Ѵ�   
		 *		- �ν��Ͻ� �޼��� toString()�� �ش� �ν��Ͻ��� ���ڿ��� ��ȯ�Ѵ� 
		 *		- ����ƽ �޼��� toString()�� ������ ���� ���ڿ��� ��ȯ�Ѵ� 
		 */
		
		System.out.println(Integer.toString(123456,2));
		System.out.println(Integer.toString(123456,8));
		System.out.println(Integer.toString(123456)); // radix default : 10
		System.out.println(Integer.toString(123456,16));
		
		int num = 10 ;
		Integer num2 = 10;
		//num.toString(); �ȵ�
		num2.toString(16);// ������ȯ�̾��� 
		
		
		/*
		 * 
		 *		# typeValue() �ø���
		 * 		- �ش� �ν��Ͻ� ���� ���ϴ� Ÿ���� ������ �ս��� �����ϴ� �޼��� 
		 * 
		 */
		
		Integer num3 = 1000000010;
		System.out.println(num3.byteValue());
		System.out.println(num3.shortValue());
		System.out.println(num3.longValue());
		System.out.println(num3.floatValue());
		System.out.println(num3.doubleValue());

		
	}
}
