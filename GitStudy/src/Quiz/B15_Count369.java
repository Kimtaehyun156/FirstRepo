package Quiz;

import java.util.Scanner;

public class B15_Count369 {

	public static void main(String[] args) {

		/*
		 *	����ڷκ��� ������ �ϳ� �Է¹ް� 
		 *	�ش� ���ڱ��� 369 ������ ����ȴٸ� �ڼ��� �� ��� �ľ��ϴ��� ������� 
		 */
		
		
		System.out.println("369�����Դϴ� ������ �Է����ּ��� :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		int l000 = 1000;
		int l00 = 100;
		int l0 = 10;
		
		
		for(int i=1; i<=num; i++) {
			
			
			if(i/1000 == 3 || i/1000 == 6 || i/1000 == 9) {
				count++;
				if( (i%1000)/100 == 3 ||  (i%1000)/100 == 6 || (i%1000)/100 == 9 ) {
					count++;
					if(((i%1000)%100)/10 == 3 || ((i%1000)%100)/10 == 6 || ((i%1000)%100)/10 == 9){
						count++;
						if( (((i%1000)%100)%10)/1 == 3 || (((i%1000)%100)%10)/1 == 6 || (((i%1000)%100)%10)/1 == 9){
							count ++;
						}
					}
					
				}
			}
			
			System.out.println("�� �ڼ����ڴ� "+ count + "�Դϴ�");
				
			
		}
		
		System.out.println("�ڼ��� " + count + " �� �ľ��մϴ�");
		
		
		
		// ������ Ǯ�� 
	}

}
