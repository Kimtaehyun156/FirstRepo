package Study;
public class School {
   

/*
    1. �� ���� ������ 30���̴�
    
    2-1. ���α׷��ֹ��� ���� ���� ���� ���α׷��� ����
    
    2-1. ��Ʈ��ũ�� ���� ���� ������ ccna����
 
    2-3. �ӽŷ��� �� ���� ���� ���� ����� ���α׷���
    
    3 ������ �̸��� ����
    �й��� �ߺ����� ������
    
    4. ����ǥ�޼���̸� ���� ���л��� �̸� ���� ����������
    
    
 */
   
   int sno;
   
   public School() {
      sno = 100000;
      
      Student[] program = new Student[30];
      Student[] network = new Student[30];
      Student[] machine = new Student[30];
      
      
      System.out.println("-----------------------���α׷��� �� ����ǥ-----------------------");
      for (int i = 0; i < program.length; i++) {
         program[i] = new ProgrammingStudent(sno++);
         program[i].printGradeCard();
      }
      System.out.println();
      System.out.println();
      System.out.println("-----------------------��Ʈ��ũ �� ����ǥ-----------------------");
      for (int i = 0; i < network.length; i++) {
         network[i] = new NetworkStudent(sno++);
         network[i].printGradeCard();
      }
      System.out.println();
      System.out.println();
      System.out.println("-----------------------�ӽŷ��� �� ����ǥ-----------------------");
      for (int i = 0; i < machine.length; i++) {
         machine[i] = new MachineStudent(sno++);
         machine[i].printGradeCard();
      }
      
   }
   public static void main(String[] args) {
      new School();
   }
}