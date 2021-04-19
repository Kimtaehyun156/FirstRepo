package Quiz;

import java.util.Scanner;

public class B03_GuessAge {

	public static void main(String[] args) {
		
		
		// 사용자로부터 태어난해와 올해의 년도를 입력받으면 
		// 그 사람의 한국 나이를 계싼하여 몇 살인지 알려주는 프로그램을 만들어보세요 
		
		System.out.println("사용자의 태어난해를 적어주세요 EX) 1992(년) ");
		Scanner sc = new Scanner(System.in);
		int User_year = sc.nextInt();
		
		System.out.println("올해의 년도를 적어주세요 EX) 1992(년) ");
		Scanner sc2 = new Scanner(System.in);
		int this_year = sc2.nextInt();
		
		System.out.println("사용자의 나이는 : "+ ((this_year-User_year)+1) + "살 입니다" );
		
		
		
	}

}
