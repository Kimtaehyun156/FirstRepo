package Quiz;

import java.util.Scanner;

public class B11_Is_numeric_str {

	public static void main(String[] args) {
		
		/*
		 	�Է¹��� ���ڿ��� ���ڸ� ���ԵǾ������� result = 1�� ��� 
		 	�ٸ� ���ڰ� ���ԵǾ� �ִٸ� result = 0����� 
		 */
		
		int result =0; 
		int check=0;
	
		System.out.println("���ڿ��� �Է��ϼ��� ���� üũ�մϴ� : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int i = 0; i < str.length(); ++i) {
			

			if(str.charAt(i) < '0' || str.charAt(i) > '9') {
				check++;
			} 
		}
		
		if(check == 0) {
			result = 1;
			System.out.println("���ڸ� ���ԵǾ��ֽ��ϴ�  result : "+ result + " �Դϴ�");
		}else {
			System.out.println("�ٸ����ڰ� ���ԵǾ��ֽ��ϴ�  result : "+ result + " �Դϴ�");
		}

		sc.close();
	}
	

}
