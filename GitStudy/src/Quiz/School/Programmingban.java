package Quiz.School;

public class Programmingban extends Student{
	
	int programming;
	int math;
	int sum;
	int studentId;
	
	
	public Programmingban( int kor , int eng , int math ,int programming ,int studentId) {
		super.name = this.name;
		super.kor = this.kor;
		super.eng = this.eng;
		this.math = math;
		this.programming = programming;
		this.studentId = studentId;
		
		
		sum = super.kor + super.eng + this.math + this.programming;
	}
	
	@Override
	public void info() {
		System.out.printf(" %s씨는 국어:%d점 영어:%d점 수학:%d점 프로그래밍:%d점 \n",name , kor,eng,math,programming );
		System.out.printf(" %s씨의 점수의 총합계는 %d점이고 평균은 %.2f점입니다\n",name,sum,(sum/(double)4));
		System.out.printf(" %s씨의 학번은 %d 입니다\n",name,studentId);

		
	}
}
