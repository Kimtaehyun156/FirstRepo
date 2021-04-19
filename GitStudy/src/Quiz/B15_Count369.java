package Quiz;

import java.util.Scanner;

public class B15_Count369 {

	public static void main(String[] args) {

		/*
		 *	사용자로부터 정수를 하나 입력받고 
		 *	해당 숫자까지 369 게임이 진행된다면 박수를 총 몇번 쳐야하는지 세어보세요 
		 */
		
		
		System.out.println("369게임입니다 정수를 입력해주세요 :");
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
			
			System.out.println("총 박수숫자는 "+ count + "입니다");
				
			
		}
		
		System.out.println("박수는 " + count + " 번 쳐야합니다");
		
		
		
		// 정수로 풀기 
	}

}
