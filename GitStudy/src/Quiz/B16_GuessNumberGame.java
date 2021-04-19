package Quiz;

import java.util.Random;
import java.util.Scanner;

public class B16_GuessNumberGame {

	public static void main(String[] args) {
	
		/*
		 		������ ���۵Ǹ� �������� 4�ڸ��� ���ڰ� �����ȴ� 
		 		player�� 8���� �õ��� �Ҽ� �ִ� 
		 		�� �õ����� 4�ڸ��� ���ڸ� �Է��ϸ� ���������� �˷��ش� 
		 		
		 		���ڿ� ��ġ�� �� ������� - Strike 
		 		���ڸ� ������� -Ball 
		 		
		 		ex)  ������ 3456�ϋ� - 
		 		��� >> 5634  - 4ball
		 			>> 3789  -  1Strike 
		 			>> 3654  -  1Strike 3 Ball 
		 			
		 		���߰� ���� ������� ������� �˷��ֱ� 
		 */
		Random rand = new Random();
		int user_try = 0;
		
		//������ ������ null�� �ʱ�ȭ�Ѵ� 
		String answer="";
		
		for (int i = 0; i < 4; i++) {
			answer += rand.nextInt(9);
		}
		while(true) {
			System.out.println("���� 4�ڸ��� �Է� >>  ");
			Scanner sc = new Scanner(System.in);
			String input = sc.next();
			
			boolean numeric = true;
			
			int Strike = 0;
			int ball =0;
			
			
			if(input.length() != 4) {
				System.out.println("4�ڸ��� �ƴմϴ� ");
				continue;
			}
			
			for(int k=0; k < 4; ++k) {
				if (input.charAt(k) < '0' || input.charAt(k) > '9') {
					numeric = false;
					break;
				}
			}
			
			if(!numeric) {
				System.out.println("4�ڸ� ���ڸ� �Է����ּ��� !!!!");
			}


			if(numeric) {
				
				System.out.println(answer); // ���� üũ�뵵 
				user_try++;
				
				for(int j=0; j < 4; ++j) {
					if(input.charAt(j) == answer.charAt(j)) {
						Strike++;	
					}else {
						for(int i = 0; i < 4;  ++i) {
							if(input.charAt(i) == answer.charAt(j)) {
								ball++;
							}
						}
					}
				}
			}
			
			if(numeric ==  true) {
				
				System.out.printf(" %d���� �õ� Strike :%d  ball :%d ",user_try,Strike,ball);
				System.out.println();
				
				if( user_try == 8 ) {
					System.out.println("8���õ��ϼż� �����Դϴ�..");
					break;
				}
				if( Strike == 4) {
					System.out.println("�����Դϴ�!!");
					break;
				}
			}
		}

	}

}
