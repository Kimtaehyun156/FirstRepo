package myobj;

public class Risecontrol {

   public static void main(String[] args) {
      
      Raise raise = new Babel();
      raise.liftUp();
      raise.liftOff();
      raise.raiseCheck(true);
      System.out.println("�ٺ��� ����� ���ǵ� :" +raise.SPEED);
      raise.weight(1);
      raise.weight(2);
      raise.weight(3);
      
      Raise raise2 = new Dumbbell();
      raise2.liftUp();
      raise2.liftOff();
      raise2.raiseCheck(false);
      System.out.println("������ �� :" + raise2.STR);
      raise2.weight(1);
      raise2.weight(2);
      raise2.weight(3);
      
     
   }

}