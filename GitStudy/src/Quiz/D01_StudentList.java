package Quiz;

import java.util.ArrayList;

public class D01_StudentList {
	/*
	 * 학생클래스를 요소로 갖는 ArrayList를 생성하고 학생을 30명 추가해보세요 1. 각 학생의 점수는 랜덤으로 설정됩니다 2. 과목은
	 * 국/영 / 수 밖에없습니다 3. 30명의 평균을 출력해주세요 4. 30명중 가장 총점이 높은 학생의 이름고 ㅏ성적을 출력해주세요 5.
	 * 이름은 다음과 같이 생성됩니다 학생 000000 학생 000001 학생 000002 학생 000003 ...
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
			System.out.printf("학생: %06d 국어:%02d 영어:%02d 수학 :%02d\n", stu.getName(), stu.getKor(), stu.getEng(),
					stu.getMath());
			result += stu.getSum();
			if (sumMax < stu.getSum()) {
				bestStudent = stu;
			} else if (bestStudent.getSum() == stu.sum) {
				bestcheck = true;
				bestStudent2 = stu;
			}
		}
		
		// 내가원하는 문자열을 String str = String.format("서식 %d", 10);
		//					return String.format("이름 %s / 총점 :%d , name , getTotal(), getAvg()); 이런식을  문자열에 서식을 저장해놓은다  
		
		System.out.printf("학생의 총 평균은 : %.2f \n", ((result / 3) / 30.0));
		System.out.printf("우수학생 : %06d 국어:%02d 영어:%02d 수학 :%02d  총점:%d 평균 :%.2f\n", bestStudent.name, bestStudent.kor,
				bestStudent.eng, bestStudent.math, bestStudent.sum, bestStudent.sum / 3.0);
		if (bestcheck) {
			System.out.printf("우수학생 : %06d 국어:%02d 영어:%02d 수학 :%02d  총점:%d 평균 :%.2f\n", bestStudent2.name,
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