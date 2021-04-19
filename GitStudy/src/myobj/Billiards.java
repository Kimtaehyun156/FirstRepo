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
		
		System.out.println("당구공의 무게는 : " +bi.ballWeight+"g 입니다");
		System.out.println("큐대의 길이는 : " +bi.ballWeight+"g 입니다");
		System.out.println("그사람의 힘은 : " +bi.userPower+" 입니다");
		System.out.println("당구공을 쳐낼 거리는: " +bi.Crossroad+" 입니다");
		
		System.out.println("============================================");
		bi.hit(200);
		System.out.println(bi.userPower);
		System.out.println("그사람의 힘은 : " + bi.userPower + " 입니다");
	}
	
	static void changeball(double width , double height) {
		Billiards.ballHeightsize = width;
		Billiards.ballHeightsize = height;
	}
	
	void hit(int userPower) {
		this.userPower = userPower;
	}

}

