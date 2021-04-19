package Quiz;

import Quiz.School.Student;
import Quiz.school.ProgrammingStudent;


public class C07_School{
	
	int sno;
	
	public C07_School() {
		sno = 1000000;
		
		Student[] program = new Student[30];
		Student[] network = new Student[30];
		Student[] machine_learning = new Student[30];
		
		for(int i = 0; i< program.length; ++i) {
			program[i] = new ProgrammingStudent(sno++);
			program[i].printGradeCard();
		}
	}
	
	public static void main(String[] args) {
		new C07_School();
	}
	
	/*
	 	1. 각반의 최대정원은 30명이다
	 	
	 	2-1. 프로그래밍반 학생은 각자의 국어 ,영어, 수학 , 프로그래밍언어 점수가 있다 
	 	
	 	2-2. 네트워크반 학생은 각자의 국어 ,영어 ,리눅스 ,CCNA 점수가 있다 
	 	
	 	2-3. 머신러닝 반 학생은 각자의 국어 ,영어, 수학, 통계학, 프로그래밍언어 점수가 있다 
	 	
	 	3. 모든 학생의 점수와 이름를 랜덤으로 생성 
	 	    학벅은 중복없이 순차적으로 생성된다 . (또는 중복없이 랜덤) 
	 	 
	 	4. 성적표 메서드를 통해 각 학생의  이름 / 총점 / 평균점수룰 볼수있다  
	 	
	 */
	
	
}
