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
		System.out.printf(" %s���� ����:%d�� ����:%d�� ������:%d�� ccna:%d�� \n",name , kor,eng,linux,ccna );
		System.out.printf(" %s���� ������ ���հ�� %d���̰� ����� %.2f���Դϴ�\n",name,sum,(sum/(double)4));
		System.out.printf(" %s���� �й��� %d �Դϴ�\n",name,studentId);
	}
}
