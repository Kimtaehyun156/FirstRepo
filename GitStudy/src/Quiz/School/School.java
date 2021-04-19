package Quiz.School;

abstract public class School {
	
	static String name;
	static int kor;
	static int eng;
	
	static String[] nameRand = new String[] {"홍길동","사오정", "고길동", "김철수", "김짱구", "이철수"};
	static int studentId = 0;
	static int scoreRand = (int)((Math.random()*100)+1); 
	
	/*
	 	 	1. 각반의 최대정원은 30명이다
	 	 	
	 	 	2-1. 프로그래밍반 학생은 각자의 국어 ,영어, 수학 , 프로그래밍언어 점수가 있다 
	 	 	
	 	 	2-2. 네트워크반 학생은 각자의 국어 ,영어 ,리눅스 ,CCNA 점수가 있다 
	 	 	
	 	 	2-3. 머신러닝 반 학생은 각자의 국어 ,영어, 수학, 통계학, 프로그래밍언어 점수가 있다 
	 	 	
	 	 	3. 모든 학생의 점수와 이름를 랜덤으로 생성 
	 	 	    학벅은 중복없이 순차적으로 생성된다 . (또는 중복없이 랜덤) 
	 	 	 
	 	 	4. 성적표 메서드를 통해 각 학생의  이름 / 총점 / 평균점수룰 볼수있다  
	 	 	
	 */
	
	public static void main(String[] args) {
		
		
		Programmingban pro = new Programmingban(kor,eng,
				(int)(Math.random()*99)+1,
				(int)(Math.random()*99)+1,
				studentId++
		);
		pro.info();
		
		System.out.println("==================================================================================================");
		
		Networkban net = new Networkban(kor,eng,
				(int)(Math.random()*99)+1,
				(int)(Math.random()*99)+1, 
				studentId++);
		net.info();
		
		System.out.println("==================================================================================================");
		
		Machiningban mac = new Machiningban(kor,eng,
				(int)(Math.random()*99)+1,
				(int)(Math.random()*99)+1,
				studentId++);
		mac.info();

		System.out.println("==================================================================================================");

		
		Machiningban mac2 = new Machiningban(kor,eng,
				(int)(Math.random()*99)+1,
				(int)(Math.random()*99)+1,
				studentId++);
		mac2.info();
		
	}
	
	abstract public void info();
	
}


