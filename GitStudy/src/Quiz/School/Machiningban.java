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
		System.out.printf(" %s���� ����:%d�� ����:%d�� �����:%d�� ���α׷���:%d�� \n",name , kor,eng, statistics,programming );
		System.out.printf(" %s���� ������ ���հ�� %d ���̰� ����� %.2f�� �Դϴ�\n",name,sum,(sum/(double)4));
		System.out.printf(" %s���� �й��� %d �Դϴ�\n",name,studentId);
	}
}
