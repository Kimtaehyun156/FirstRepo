package myobj;

public interface Raise {
   
   // ��� 
   public int STR = 10; 
   public int SPEED = 15;
   public boolean check = false;
   
   // �߻�޼��� 
   public void liftUp();
   public void liftOff();
   public void weight(int step);
   
   
   default void raiseCheck(boolean check) {
      if(check) {
         System.out.println("������ ���÷Ƚ��ϴ�");
         check = false;
      }else {
         System.out.println("������ ���ø��� �ʾҽ��ϴ�");
         check = true;
      }
   }
   
   // ���� �޼���
   static void eatProtein() {
      System.out.println("����ƾ�ٸ� �Խ��ϴ� ! ���� �����ϴ�");
   }
   
}


class Babel implements Raise{

   @Override
   public void liftUp() {
      System.out.println(" �ٺ��� ���ø�����!");
   }
   @Override
   public void liftOff() {
      System.out.println(" �ٺ��� ��������!");
   }
   
   @Override
	public void raiseCheck(boolean check) {
		Raise.super.raiseCheck(check);
	}
   
   @Override
	public void weight(int step) {
	   
	   if(step == 1) {
		   System.out.println("1�ܰ� ���Դ� 10kg�Դϴ�");
	   }else if( step == 2 ) {
		   System.out.println("2�ܰ� ���Դ� 20kg�Դϴ�");
	   }else if( step == 3) {
		   System.out.println("3�ܰ� ���Դ� 30kg�Դϴ�");
	   }else {
		   System.out.println("1�ܰ迡�� ~ 3�ܰ踸 �Է����ּ���");
	   }
	}

}

class Dumbbell implements Raise{
   @Override
   public void liftUp() {
      System.out.println(" ������ ���ø�����!");
   }
   @Override
   public void liftOff() {
      System.out.println(" ������ ��������!");
   }
   
   @Override
	public void raiseCheck(boolean check) {
		Raise.super.raiseCheck(check);
	}
   
   @Override
	public void weight(int step) {
	   
	   if(step == 1) {
		   System.out.println("1�ܰ� ���Դ� 10kg�Դϴ�");
	   }else if( step == 2 ) {
		   System.out.println("2�ܰ� ���Դ� 20kg�Դϴ�");
	   }else if( step == 3) {
		   System.out.println("3�ܰ� ���Դ� 30kg�Դϴ�");
	   }else {
		   System.out.println("1�ܰ迡�� ~ 3�ܰ踸 �Է����ּ���");
	   }
	}
}

   