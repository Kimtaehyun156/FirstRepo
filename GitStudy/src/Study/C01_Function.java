package Study;

public class C01_Function {

	/*
	 		�Լ�(Function)
	 		- ����� �̸� �����صΰ� ���߿� ������ ���� �� 
	 		- �ڹٿ��� �Լ�(�޼���)�� �ݵ�� Ŭ���� ���ο� �����ؾ��Ѵ� 
	 		- �����ص� �Լ� �̸� �ڿ� ()�� �ٿ��� �Լ��� ȣ���ϸ� 
	 		- ȣ�����ڸ��� �Լ��� ���� ����� ��ȯ�ȴ�
	 		- �Լ��� ������ �� �ش� �Լ���  �ڱⰡ ��ȯ�� ���� Ÿ���� �տ� ���� �д� 
	 		- ���߿� ���� �� ���ɼ��� �ִ� ��ɵ��� �̸� ���������ν� 
	 		  �۾��� �ݺ��� ���ϼ� �ִ� 		
	 */
	
	 public static void main(String[] args) {
		
		 for(int i = 0 ; i < 10; ++i) {	 
			 print_rabbit();
			 print_rabbit();
			 print_rabbit();
		 }
		 
		 System.out.println(apple_basket(123,10));
		 
	}
	 
	 /*
		 // ����� ������ �ٱ�����ũ�⸦ �����ϸ� �ʿ��� �ٱ��� ������ �˷��ִ� �Լ�
		 // public static : ���߿� �����Ұ� 
		 // int : ���Լ��� ���� ����� ���������� ��ȯ�� ( ���� Ÿ�� ) return type
		 // apple_basket : Ÿ�� �ڿ� �Լ����� �����Ҽ� �ִ� 
		 // (int apple , int size)  : �� �Լ��� �����Ҷ� intŸ�� ���� �ΰ� ���� �޾ƾ��Ѵ� (�Ű�����) arguments
	 */
	 
	 public static String apple_basket(int apple , int size) {
		 
		 int result = 0;
		 
		 if( apple % size == 0) {
			 result = apple / size;
		 }else {
			 result = apple / size +1;
		 }
		 
		 return "�ʿ��� �ٱ����� �Ӱ����� " +result+ " �� �Դϴ� ";
	 }
	 
	 
	 
	 public static void print_rabbit() {
		 System.out.println(" /)/)");
		 System.out.println("(  ..)");
		 System.out.println("(  >��");
		 System.out.println();
	 }

}
