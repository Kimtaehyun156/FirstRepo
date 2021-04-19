package Quiz;

import java.util.Scanner;

public class B14_GCD {

	public static void main(String[] args) {

		/*
		 		 두 숫자를 입력받고 두 숫자의 최대공약수를 구해보세요 
		 */

		int GCD =0;
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("첫번쨰 수를 입력해주세요 :");
		int num1= sc.nextInt();
		
		System.out.println("두번쨰 수를 입력해주세요 :");
		int num2= sc2.nextInt();
		
		for(int i = 2; i <= num1; ++i) {
			for(int j = 2; j <= num2; ++j) {
				if(num1 % i == 0  && num2 % i == 0) {
					if( num2 % j ==0 && num2 %j == 0) {
						if( i > j) {
							GCD = j;
						}else {
							GCD = i;							
						}
					}
					
				}
			}
		}
		System.out.println("두수의 최대 공약수는 : " + GCD);
			
		sc.close();
		sc2.close();

	}

}
