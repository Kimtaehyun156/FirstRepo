package Quiz;

import java.util.Scanner;

public class B17_CountAlphabet {

	public static void main(String[] args) {
		
		/*
		 *  ����ڷκ��� ������ �ϳ� �Է� �ް� 
		 *  �ش� ���忡 � ���ĺ��� ��� �����ߴ��� ��� ��� ����غ����� 
		 *  ( ��ҹ��� ���о���) 
		 */
		
		
		System.out.println( "������ �Է����ּ��� >> ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char[] alphabet = new char[26];
		int[] count = new int[26];

		input = input.toUpperCase(); //���ڿ��� �빮�ڷ� �����Ѵ� 
		//input = input.toLowerCase(); //���ڿ��� �ҹ��ڷ� �����Ѵ�
		
		// �빮��
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
					System.out.printf(" �Է��Ͻ� �����߿� ���� ���ĺ��� ");
					System.out.printf( "���ĺ� : %s ��  %s�� ���Խ��ϴ� \n" ,alphabet[i], count[i]);
				}
				
			
		}
		
		
		
		
		
		

	}

}
