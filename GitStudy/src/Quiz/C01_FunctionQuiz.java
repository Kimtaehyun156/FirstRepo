package Quiz;

import java.util.Arrays;

public class C01_FunctionQuiz {

	/*
	 		# ������ �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ�غ����� 
	 		
	 		1. ������ ���ڰ� ���ĺ��̸� true ��ȯ �ƴϸ� false ��ȯ
	 		2. ������ ���ڰ� 3�� ����̸� true ��ȯ �ƴϸ� false ��ȯ
	 		3. �����ϳ� �����ϸ� ���ڿ� "¦���Դϴ� " �Ǵ� "Ȧ���Դϴ�" �� ��ȯ�ϴ� �Լ� 
	 		4. ���ڸ� �����ϸ� �ش� ������ ������� �迭 ���·� ��ȯ�ϴ� �Լ� 
	 		5. ������ ������ �Ҽ���� true�� ��ȯ�ϰ� �ƴϸ� false�� ��ȯ�ϴ� �Լ� 
	 		6. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ� 
	 		 factorial ; (n) * (n-1) * ( n-2 ) .... 3*2*1
	 		- ���� Ÿ�� void�� �ش� �Լ��� ��ȯ�ϴ� ���� ���ٴ°��� ��Ÿ����
	 */
	
	
	//1. ������ ���ڰ� ���ĺ��̸� true ��ȯ �ƴϸ� false ��ȯ 
	public static boolean AlphabetCheck( char alphabet) {
		
		if(alphabet >='a' && alphabet <= 'z' ) {
			return true;
		}else if(alphabet >='A' && alphabet <= 'Z') {
			return true;
		}else {
			return false;
		}
		
//		return (ch >= 'A' && ch <= 'z' || ch>= 'a' && ch <= 'z');
	}
	
	//2. ������ ���ڰ� 3�� ����̸� true ��ȯ �ƴϸ� false ��ȯ
	public static boolean Multiple3( int num) {
		if(num % 3 == 0) {
			return true;
		}else {
			return false;
		}
		
		//return num % 3 == 0;
	}
	
	
	//3. �����ϳ� �����ϸ� ���ڿ� "¦���Դϴ� " �Ǵ� "Ȧ���Դϴ�" �� ��ȯ�ϴ� �Լ�
	public static String Sniffling(int num) {
		if(num % 2 == 0 ){
			return "¦���Դϴ�"; 
		}else {
			return "Ȧ���Դϴ�"; 
		}
		
		// return num % 2 == 0 ? "¦���Դϴ� "  : "Ȧ���Դϴ� " ;
	}
	
	//4. ���ڸ� �����ϸ� �ش� ������ ������� �迭 ���·� ��ȯ�ϴ� �Լ� 
//	public static StringBuilder Measure(int num) {
//		StringBuilder mea = new StringBuilder();
//		for (int i = 1 ; i <= num; ++i) {   
//			
//			if(i == 1) {
//				mea.append(i);
//			}else if(num % i == 0) {
//					mea.append(i);
//			}else if(i == num) {
//				mea.append(i);
//			}
//		}
//		return mea;
//	}
	
	public static int[] findDivide(int num) {
		
		boolean[] divide = new boolean[num];
		int count = 0 ;
		for(int i=1; i <= num; ++i) {
			if(num % i == 0) {
				divide[i -1] = true;
				count++;
			}
		}
		
		int[] result = new int[count];
		int index = 0 ;
		
		for (int i = 0 ; i < divide.length; ++i) {
			if(divide[i]) {
				result[index++] = i + 1;
			}
		}
		return result;
	}
	
	
	//5. ������ ������ �Ҽ���� true�� ��ȯ�ϰ� �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	public static boolean Decimal(int num) {
		for(int i = 2; i < num; ++i) {
			if( num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	//6. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ� 
	// factorial ; (n) * (n-1) * ( n-2 ) .... 3*2*1
	public static int factorial(int num) {
//		int sum=num;
//		for(int i=1; i <= num; ++i) {
//				if( num - i !=0) {
//					sum *= num-i;
//				}
//			}
//
//		return sum;
//		
		if( num == 2) {
			return 2;
		}
		
		return num * factorial(num -1);
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		//1�� ���� 
		System.out.println(AlphabetCheck('k'));
		//2�� ����
		System.out.println(Multiple3(15));
		//3�� ����
		System.out.println(Sniffling(6));
		//4�� ���� 
		System.out.println(Arrays.toString(findDivide(40)));
		//5�� ���� 
		System.out.println(Decimal(4));
		//6�� ����
		System.out.println(factorial(10));
		
	}

}
