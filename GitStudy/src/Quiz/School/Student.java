package Quiz.School;

abstract public class Student extends School {

	String name;
	int sno;
	int kor;
	int eng;
	int studentId;
	
	public Student(int sno) {
		this.sno = sno;
		name = nameRand[(int)(Math.random()*nameRand.length)];
		kor = scoreRand;
		eng = scoreRand;
	}
	
	abstract public void info();
	
	public static void main(String[] args) {
		
	}

	public abstract void printGradeCard();
	
}
