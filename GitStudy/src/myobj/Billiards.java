package myobj;

public class Billiards {

	static double ballWidthsize = 65.5;
	static double ballHeightsize = 65.5;
	
	int ballWeight ;
	int billiardsCueWidth;
	int Crossroad;
	int userPower;

	public static void main(String[] args) {
		
		Billiards bi = new Billiards();
		
		bi.ballWeight = 250;
		bi.billiardsCueWidth = 137;
		bi.userPower= 30;
		bi.Crossroad = (bi.userPower*bi.billiardsCueWidth*bi.ballWeight) /bi.ballWeight ;
		
		System.out.println("�籸���� ���Դ� : " +bi.ballWeight+"g �Դϴ�");
		System.out.println("ť���� ���̴� : " +bi.ballWeight+"g �Դϴ�");
		System.out.println("�׻���� ���� : " +bi.userPower+" �Դϴ�");
		System.out.println("�籸���� �ĳ� �Ÿ���: " +bi.Crossroad+" �Դϴ�");
		
		System.out.println("============================================");
		bi.hit(200);
		System.out.println(bi.userPower);
		System.out.println("�׻���� ���� : " + bi.userPower + " �Դϴ�");
	}
	
	static void changeball(double width , double height) {
		Billiards.ballHeightsize = width;
		Billiards.ballHeightsize = height;
	}
	
	void hit(int userPower) {
		this.userPower = userPower;
	}

}

