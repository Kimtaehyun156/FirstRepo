package Study;
public class School {
   

/*
    1. 각 반의 정원은 30명이다
    
    2-1. 프로그래밍반은 국어 영어 수학 프로그래밍 과목
    
    2-1. 네트워크반 국어 영어 리눅스 ccna과목
 
    2-3. 머신러닝 반 국어 영어 수학 통계학 프로그래밍
    
    3 점수와 이름은 랜덤
    학번은 중복없이 순차덕
    
    4. 성적표메서드ㅜ를 통해 각학생의 이름 총점 평균점수출력
    
    
 */
   
   int sno;
   
   public School() {
      sno = 100000;
      
      Student[] program = new Student[30];
      Student[] network = new Student[30];
      Student[] machine = new Student[30];
      
      
      System.out.println("-----------------------프로그래밍 반 성적표-----------------------");
      for (int i = 0; i < program.length; i++) {
         program[i] = new ProgrammingStudent(sno++);
         program[i].printGradeCard();
      }
      System.out.println();
      System.out.println();
      System.out.println("-----------------------네트워크 반 성적표-----------------------");
      for (int i = 0; i < network.length; i++) {
         network[i] = new NetworkStudent(sno++);
         network[i].printGradeCard();
      }
      System.out.println();
      System.out.println();
      System.out.println("-----------------------머신러닝 반 성적표-----------------------");
      for (int i = 0; i < machine.length; i++) {
         machine[i] = new MachineStudent(sno++);
         machine[i].printGradeCard();
      }
      
   }
   public static void main(String[] args) {
      new School();
   }
}