package Study;

public class NetworkStudent extends Student {
	final static String[] subject_name = {"국어", "영어", "리눅스", "ccna"};
	
	int linux;
	int ccna;
	int sum;
	
	public NetworkStudent(int sno) {
		  super(sno);
	      sum = super.kor + super.eng +linux + ccna;
	      linux = getRandomScore();
	      sum = getRandomScore();
	}
	
	
	@Override
	public void printGradeCard() {
	     System.out.println("┌───────────────────────────────────────────────────────────────────────┐");
	      System.out.printf("│학번\t이름\t%s\t%s\t%s\t%s\t총점\t평균\t\t│\n",
	            subject_name[0], subject_name[1], subject_name[2], subject_name[3]);
	      
	      System.out.printf("│%X\t%s\t%d\t%d\t%d\t%d\t%d\t%.2f\t\t│\n",
	            sno, name, kor, eng, linux,ccna,sum,(sum/4.0));
	      
	      System.out.println("└───────────────────────────────────────────────────────────────────────┘");
	}
}
