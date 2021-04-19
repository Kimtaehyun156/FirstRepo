package myobj;

public interface Raise {
   
   // 상수 
   public int STR = 10; 
   public int SPEED = 15;
   public boolean check = false;
   
   // 추상메서드 
   public void liftUp();
   public void liftOff();
   public void weight(int step);
   
   
   default void raiseCheck(boolean check) {
      if(check) {
         System.out.println("물건을 들어올렸습니다");
         check = false;
      }else {
         System.out.println("물건을 들어올리지 않았습니다");
         check = true;
      }
   }
   
   // 정적 메서드
   static void eatProtein() {
      System.out.println("프로틴바를 먹습니다 ! 힘이 쌔집니다");
   }
   
}


class Babel implements Raise{

   @Override
   public void liftUp() {
      System.out.println(" 바벨을 들어올리는중!");
   }
   @Override
   public void liftOff() {
      System.out.println(" 바벨을 내리는중!");
   }
   
   @Override
	public void raiseCheck(boolean check) {
		Raise.super.raiseCheck(check);
	}
   
   @Override
	public void weight(int step) {
	   
	   if(step == 1) {
		   System.out.println("1단계 무게는 10kg입니다");
	   }else if( step == 2 ) {
		   System.out.println("2단계 무게는 20kg입니다");
	   }else if( step == 3) {
		   System.out.println("3단계 무게는 30kg입니다");
	   }else {
		   System.out.println("1단계에서 ~ 3단계만 입력해주세요");
	   }
	}

}

class Dumbbell implements Raise{
   @Override
   public void liftUp() {
      System.out.println(" 덤벨을 들어올리는중!");
   }
   @Override
   public void liftOff() {
      System.out.println(" 덤벨을 내리는중!");
   }
   
   @Override
	public void raiseCheck(boolean check) {
		Raise.super.raiseCheck(check);
	}
   
   @Override
	public void weight(int step) {
	   
	   if(step == 1) {
		   System.out.println("1단계 무게는 10kg입니다");
	   }else if( step == 2 ) {
		   System.out.println("2단계 무게는 20kg입니다");
	   }else if( step == 3) {
		   System.out.println("3단계 무게는 30kg입니다");
	   }else {
		   System.out.println("1단계에서 ~ 3단계만 입력해주세요");
	   }
	}
}

   