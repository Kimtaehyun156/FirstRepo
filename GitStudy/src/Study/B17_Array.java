package Study;

public class B17_Array {

	public static void main(String[] args) {
 
		/*
		 		# 배열(Array)
		 		
		 		 - 같은 타입변수를 한번에 여러개 선언하는 방법 
		 		 - 변수를 같은이름으로 변수를 여러개 선언한뒤 인덱스를 활용해 구분한다
		 		 
		 		 배열은 한번 크기가 정해지면 크기를 변경할수 없다
		 		 배열은 생성과 동시에 초기화가 되어있다 
		 		 (정수는 0 , 실수 : 0.0  , boolean : false(0) , 참조형 :null); 
		 		
		 */
		
		int[] score = new int[100];
		
		score[0] = 90;
		score[99] = 123;
		
		
		//배열도  배열.length를 통해 길이를 알수 있다  // ()가 안들어간다 
		for(int index = 0; index <= score.length-1; index++) {
			score[index] = (int)(Math.random()*101);
		}
		
		//System.out.println("10번쨰 학생의 점수는 : " + score[9]);
		
		// 연습문제 1번 score의 총합과 평균을(소수 둘쨰짜리) 출력해보세요
		int sum = 0;
		double avg = 0 ;
		
		for (int i = 0; i < score.length; ++i) {
			sum += score[i];
		}
		
		//  int형 		/ 	int 형 	= int형
		//  double 형 	/ 	int형 	= double 형
		//  int형   		/  double형  = double 형
		avg = ((double)sum / score.length);
		
		System.out.printf("학생들의 총점은 : %d \n학생들의 평균은 : %.2f" , sum , avg);
		System.out.println();
		
		/*
		 		# 배열을 선언하는 방법
		 		1. 타입[] 배열이름 = new 타입[배열크기];
		 		2. 타입[] 배열이름 = {};
		 		3. 타입[] 배열이름 = new 타입[] { 값1, 값2 , 값3 };
		 		
		 */
		char[] grade = new char[50];
		int age[] = { 10 , 15 , 21 ,80 , 75};
		boolean[] passExam = {true , false , true , true , false , 80 > 70};
		String[] animals = new String[] { "Lion" , "tiger" , "penguin" ," Monkey"};
		
		System.out.println(animals[0]);
		
		if(passExam[3]) {
			System.out.println("4번쨰 사람은 시험을 통과했습니다");
		}else {
			System.out.println("4번쨰 사람은 시험을 떨어졌습니다");
		}
		
		for(int i = 0; i < grade.length; ++i) {
			System.out.println((int)grade[i]);
		}
		
		// #배열은 변수와 다르게 초기화가 자동으로 되어있다 
		int[] arr = new int[3];
		int a, b, c;
		
		System.out.println("arr[0]" + arr[0]);
		
		// # String은 char형 배열로 변환할수 있다 
		char[] msg1 = new char[] {'h' ,'e' ,'l','l','o'};
		String msg2 = "hello";
		char[] msg3 = msg2.toCharArray();
		
		System.out.println(msg1[0]);
		System.out.println(msg1[1]);
		System.out.println(msg1[2]);
		
		System.out.println(msg2.charAt(0));
		System.out.println(msg2.charAt(1));
		System.out.println(msg2.charAt(2));
		
		System.out.println(msg3[0]);
		System.out.println(msg3[1]);
		System.out.println(msg3[2]);
	}

}
