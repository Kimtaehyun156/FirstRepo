package Quiz;

import java.util.Scanner;

public class B08_ConvertSecond {

	public static void main(String[] args) {

		/*
		 		�ʸ� �Է� ������ ��/��/�ð�/��/�ʷ� ��ȯ�Ͽ� ����غ�����
		 		
		 		�� �ʿ���� ������ ������� ���� 
		 		ex: 0�� 0�� 5�ð� 0�� 20���ΰ��  
		 		1�� - 15768000
		 		1��  -  86400
		 		1�ð� - 3600
		 		1��  - 60 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" �ʸ� �Է����ּ��� ");
		int second = sc.nextInt();
		
		// int second = new Scanner(System.in).nextInt();
		
		int year = 31536000;
		int day = 86400;
		int hour = 3600;
		int minute = 60;
		
		if(second >= year) {
			System.out.printf(" %d�� %d�� %d�ð� %d�� %d�� ",(second/year) , ((second%year)/day) , ((second%year)%day)/hour , (((second%year)%day)%hour)/minute , (((second%year)%day)%hour)%minute);
		}else if(second >= day){
			System.out.printf(" %d�� %d�ð� %d�� %d�� ",((second%year)/day) , ((second%year)%day)/hour , (((second%year)%day)%hour)/minute , (((second%year)%day)%hour)%minute);
		}else if(second >= hour) {
			System.out.printf(" %d�ð� %d�� %d�� ",((second%year)%day)/hour , (((second%year)%day)%hour)/minute , (((second%year)%day)%hour)%minute);
		}else if(second >= minute) {
			System.out.printf(" %d�� %d�� ", (((second%year)%day)%hour)/minute , (((second%year)%day)%hour)%minute);
		}else if(second < minute && second >= 0) {
			System.out.printf(" %d�� " , (((second%year)%day)%hour)%minute);
		}else {
			System.out.println("����� �Է����ּ��� ");
			
		}
		
		
		// boolean exist = false ;  �Ҹ��� Ÿ������ üũ�ؼ� 0�̾ƴҋ� üũ!
		// YEAR_PER _SECOND = // ���� �����ؼ� ���� ����ϰ� �ڵ��ϱ�
		// final ���� ������ �� ������ �Ұ����ϴ� !! 
 

		
		
		
		
		
		
	}

}
