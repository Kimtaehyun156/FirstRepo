package Quiz.School;

public class Networkban extends Student {

	int linux;
	int ccna;
	int sum;
	int studentId;
	
	public Networkban(int kor , int eng , int linux ,int ccna ,int studentId) {
		super.name = name;
		super.kor = kor;
		super.eng = eng;
		this.linux = linux;
		this.ccna = ccna;
		this.studentId = studentId;	
		
		sum = super.kor + super.eng + this.linux + this.ccna;
	}
	
	@Override
	public void info() {
		System.out.printf(" %s씨는 국어:%d점 영어:%d점 리눅스:%d점 ccna:%d점 \n",name , kor,eng,linux,ccna );
		System.out.printf(" %s씨의 점수의 총합계는 %d점이고 평균은 %.2f점입니다\n",name,sum,(sum/(double)4));
		System.out.printf(" %s씨의 학번은 %d 입니다\n",name,studentId);
	}
}
