package Quiz;

import java.util.Scanner;

public class B11_Is_contain_alpha {

	/*
	 	����ڰ� �Է��� ���ڿ��� ���ĺ��� ���ԵǾ������� true��� ������ false
	 */
	
	public static void main(String[] args) {
		
		System.out.println("���ڿ��� �Է��ϼ��� ���ĺ� üũ�մϴ� : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		// 97~122 65~90
		for(int i = 0; i < str.length(); ++i) {
			
			if(((int)str.charAt(i)) >= 'a' && ((int)str.charAt(i)) <= 'z' ) {
				System.out.println("true");
			}else if(((int)str.charAt(i)) >= 'A' && ((int)str.charAt(i)) <= 'Z' ) {
				System.out.println("true" );
			}else {
				System.out.println("false");
			}
		}
		
		sc.close();
	}

}
