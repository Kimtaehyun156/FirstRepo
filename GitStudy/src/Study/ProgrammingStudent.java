package Study;

public class ProgrammingStudent extends Student{
	
	final static String[] subject_name = {"국어", "영어", "수학", "PL"};
	
	int math;
	int PL;
	int sum;
	
	public ProgrammingStudent(int sno) {
		  super(sno);
	      sum = super.kor + super.eng +math + PL;
	      math = getRandomScore();
	      PL = getRandomScore();
	}
	
	
	@Override
	public void printGradeCard() {
	     System.out.println("┌───────────────────────────────────────────────────────────────────────┐");
	      System.out.printf("│학번\t이름\t%s\t%s\t%s\t%s\t총점\t평균\t\t│\n",
	            subject_name[0], subject_name[1], subject_name[2], subject_name[3]);
	      
	      System.out.printf("│%X\t%s\t%d\t%d\t%d\t%d\t%d\t%.2f\t\t│\n",
	            sno, name, kor, eng, math,PL,sum,(sum/4.0));
	      
	      System.out.println("└───────────────────────────────────────────────────────────────────────┘");
	}  
}
