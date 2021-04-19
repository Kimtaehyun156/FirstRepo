package Quiz;

import java.util.ArrayList;

public class D01_StudentList {
	/*
	 * �л�Ŭ������ ��ҷ� ���� ArrayList�� �����ϰ� �л��� 30�� �߰��غ����� 1. �� �л��� ������ �������� �����˴ϴ� 2. ������
	 * ��/�� / �� �ۿ������ϴ� 3. 30���� ����� ������ּ��� 4. 30���� ���� ������ ���� �л��� �̸��� �������� ������ּ��� 5.
	 * �̸��� ������ ���� �����˴ϴ� �л� 000000 �л� 000001 �л� 000002 �л� 000003 ...
	 */

	public static void main(String[] args) {

		int result = 0;
		int sumMax = 0;
		boolean bestcheck = false;

		Student bestStudent = null;
		Student bestStudent2 = null;

		ArrayList<Student> list = new ArrayList<Student>();

		for (int i = 0; i < 300; ++i) {
			Student st1 = new Student(i);
			list.add(st1);
		}

		for (Student stu : list) {
			System.out.printf("�л�: %06d ����:%02d ����:%02d ���� :%02d\n", stu.getName(), stu.getKor(), stu.getEng(),
					stu.getMath());
			result += stu.getSum();
			if (sumMax < stu.getSum()) {
				bestStudent = stu;
			} else if (bestStudent.getSum() == stu.sum) {
				bestcheck = true;
				bestStudent2 = stu;
			}
		}
		
		// �������ϴ� ���ڿ��� String str = String.format("���� %d", 10);
		//					return String.format("�̸� %s / ���� :%d , name , getTotal(), getAvg()); �̷�����  ���ڿ��� ������ �����س�����  
		
		System.out.printf("�л��� �� ����� : %.2f \n", ((result / 3) / 30.0));
		System.out.printf("����л� : %06d ����:%02d ����:%02d ���� :%02d  ����:%d ��� :%.2f\n", bestStudent.name, bestStudent.kor,
				bestStudent.eng, bestStudent.math, bestStudent.sum, bestStudent.sum / 3.0);
		if (bestcheck) {
			System.out.printf("����л� : %06d ����:%02d ����:%02d ���� :%02d  ����:%d ��� :%.2f\n", bestStudent2.name,
					bestStudent2.kor, bestStudent2.eng, bestStudent2.math, bestStudent2.sum, bestStudent2.sum / 3.0);
		}
	}
}

class Student {
	int name;
	int kor;
	int eng;
	int math;

	int sum = kor + eng + math;

	public Student(int name) {
		super();
		this.name = name;
		this.kor = (int) ((Math.random() * 100) + 1);
		this.eng = (int) ((Math.random() * 100) + 1);
		this.math = (int) ((Math.random() * 100) + 1);
		this.sum = this.kor + this.eng + this.math;

	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

}