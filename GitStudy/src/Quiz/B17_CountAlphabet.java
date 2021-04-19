package Quiz;

import java.util.Scanner;

public class B17_CountAlphabet {

	public static void main(String[] args) {
		
		/*
		 *  사용자로부터 문장을 하나 입력 받고 
		 *  해당 문장에 어떤 알파벳이 몇번 등장했는지 세어서 모두 출력해보세요 
		 *  ( 대소문자 구분안함) 
		 */
		
		
		System.out.println( "문장을 입력해주세요 >> ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char[] alphabet = new char[26];
		int[] count = new int[26];

		input = input.toUpperCase(); //문자열을 대문자로 변경한다 
		//input = input.toLowerCase(); //문자열을 소문자로 변경한다
		
		// 대문자
		for(int i=0; i< alphabet.length; i++ ) {
			alphabet[i] = (char)(65+i);
		}
		
	
		
		for(int i=0; i< input.length(); i++ ) {		
			for(int j=0; j < alphabet.length; j++ ) {
				
				if(input.charAt(i) == alphabet[j]) {
					count[j]++;
				}
			}
		}
		
	
		
		for(int i=0; i< alphabet.length; i++ ) {
				if(count[i] != 0 ) {	
					System.out.printf(" 입력하신 문장중에 나온 알파벳은 ");
					System.out.printf( "알파벳 : %s 는  %s번 나왔습니다 \n" ,alphabet[i], count[i]);
				}
				
			
		}
		
		
		
		
		
		

	}

}
