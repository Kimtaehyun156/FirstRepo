package Quiz;

import java.util.Scanner;

public class B15_Count369_2 {
	
	public static void main(String[] args) {
		
		// 1 문자열로 풀기 
		
		//정수를 문자열로 바꾸는 방법들 
//		System.out.println("hello:" +123);
//		System.out.println(""+123);
//		System.out.println(Integer.toString(123));
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 >>");
		int input = sc.nextInt();
		int cnt = 0;
		
		for(int i = 1; i <= input; ++i) {
			
			String num_str = "" + i;
			System.out.print(i + " : ");
			
			for(int j = 0; i < num_str.length(); ++j) {
				char num_ch = num_str.charAt(j);
				
				if(num_ch == '3' || num_ch == '6' || num_ch == '9') {
					cnt++;
					System.out.print("짝");
				}
			}
			
			System.out.println();
			
		}
		
		System.out.println( "총 박수 횟수는 : " + cnt + "회");
	}
}
