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
		System.out.printf(" %s���� ����:%d�� ����:%d�� ����:%d�� ���α׷���:%d�� \n",name , kor,eng,math,programming );
		System.out.printf(" %s���� ������ ���հ�� %d���̰� ����� %.2f���Դϴ�\n",name,sum,(sum/(double)4));
		System.out.printf(" %s���� �й��� %d �Դϴ�\n",name,studentId);

		
	}
}
