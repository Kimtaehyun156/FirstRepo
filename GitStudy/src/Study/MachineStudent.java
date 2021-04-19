package Study;
public class MachineStudent extends Student{
   final static String[] subject_name = {"국어", "영어", "수학", "통계학", "PL"};
   
   int math;
   int sum;
   int pl;
   
   public MachineStudent(int sno) {
      super(sno);
      sum = getRandomScore();
      pl = getRandomScore();
      math = getRandomScore();
   }
   
   @Override
   public void printGradeCard() {
      System.out.println("┌───────────────────────────────────────────────────────────────────────┐");
      System.out.printf("│학번\t이름\t%s\t%s\t%s\t%s\t%s\t총점\t평균\t│\n",
            subject_name[0], subject_name[1], subject_name[2], subject_name[3], subject_name[4]);
      
      System.out.printf("│%X\t%s\t%d\t%d\t%d\t%d\t%d\t%d\t%.2f\t│\n",
            sno, name, kor, eng, math, sum, pl, kor+ eng + math + sum + pl,
             (kor+ eng + sum + pl + math) / 5.0);
      
      System.out.println("└───────────────────────────────────────────────────────────────────────┘");
   }      
}