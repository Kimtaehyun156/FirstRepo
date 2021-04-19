package Quiz;

import java.util.Scanner;

public class B14_GCD2 {

	public static void main(String[] args) {
		
		/*
		 * 두 숫자를 입력받고 두 숫자의 최대공약수를 구해보세요
		 */


		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		System.out.println("첫번쨰 수를 입력해주세요 :");
		int num1 = sc.nextInt();

		System.out.println("두번쨰 수를 입력해주세요 :");
		int num2 = sc2.nextInt();
		
		int GCD = 0;
		
		int maxNum = num1 >= num2 ? num1 : num2;
		 
		 // int maxNum = Math.max(num1,num2);
		 //  큰수부터 --해서 검색하며  break;로 빠져나오는게 효율적이다 
		 
			for (int i = 1; i <= maxNum; ++i) {
				if (num1 % i == 0 && num2 % i == 0) {
					if (GCD <= i) {
						GCD = i;
					}
				}
			}
			
		System.out.println("두수의 최대공약수는 : " + GCD + "입니다");
		
		sc.close();
		sc2.close();
	}

}
