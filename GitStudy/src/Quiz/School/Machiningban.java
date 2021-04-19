package Quiz.School;

public class Machiningban extends Student{

	int statistics;
	int programming;
	int sum;
	int studentId;
	
	public Machiningban( int kor , int eng , int statistics ,int programming ,int studentId) {
		super.name = name;
		super.kor = kor;
		super.eng = eng;
		this.statistics = statistics;
		this.programming = programming;
		this.studentId = studentId;
		
		
		sum = super.kor + super.eng + this.statistics + this.programming;
	}
	
	@Override
	public void info() {
		System.out.printf(" %s씨는 국어:%d점 영어:%d점 통계학:%d점 프로그래밍:%d점 \n",name , kor,eng, statistics,programming );
		System.out.printf(" %s씨의 점수의 총합계는 %d 점이고 평균은 %.2f점 입니다\n",name,sum,(sum/(double)4));
		System.out.printf(" %s씨의 학번은 %d 입니다\n",name,studentId);
	}
}
