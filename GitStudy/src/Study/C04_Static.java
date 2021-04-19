package Study;

public class C04_Static {

	
	/*
	 	# static ( ���� ���� , Ŭ���� ���� <=> �ν��ͽ� ����)
	 	
	 		- static�� ���� Ŭ������ ��� �ν��Ͻ��� �������� ����ϴ� �����̴�
	 		 
	 		- static�� ���� Ŭ������ �ڿ��� ��� �ν��Ͻ����� ���� ���� ���ϰ� �ȴ�.
	 		
	 		- static ������ Ŭ������ �ϳ��ۿ� �������� �����Ƿ� �޸𸮰� ������.
	 		
	 		- static ������ Ŭ������ �ϳ��̱� ������ Ŭ�������� .�� ��� �����ϴ� ���� ����
	 		
	 		- static ������ �ڿ��� �ν��Ͻ��� ����� ������ ȣ���� �� �ִ�
	 		
	 		- �ν��Ͻ��� �������� ���� ���� static�� ���� ���ɼ��� �ֱ� ������ 
	 		  static �޼��忡���� �ν��Ͻ� �ڿ��� ����� �� ����  ( static ������ ���)
	 */
	
	
	public static void main(String[] args) {
		
		// ���� ������ �ν��Ͻ��� ������ static �ڿ��� ����� �� �ִ� 
		// static �ڿ��� Ŭ�������� .�� ��� �����Ҽ� �ִ�
		System.out.println(Lamp.width);
		System.out.println(Lamp.height);
		
		Lamp lamp01 = new Lamp();
		Lamp lamp02 = new Lamp();
		Lamp lamp03 = new Lamp();
		Lamp lamp04 = new Lamp();
		
		lamp03.width = 30; // static �̶� 03���� �ٲٸ� �ٰ��� 30���� �ٲ�� 
	
		System.out.println(lamp01.width);
		System.out.println(lamp02.width);
		System.out.println(lamp03.width);
		System.out.println(lamp04.width);
	}
}


class Lamp {
	
	// ������ ������  ����������� �ʺ�� ���̴� �����ϴ�  
	static int width=50;
	static int height=20;
	
	int[] position;
	double brightness;
	boolean powerOn;
	
	// static �޼����� static ������ �����ϴ� ���� ���� 
	static void changeWidth(int width) {
		Lamp.width = width;
	}
	
	// stactic �������� instance �ڿ��� �����ϴ� ���� �Ұ��� 
//	static void turnOn() {
//		this.powerOn = true;
//	}
}