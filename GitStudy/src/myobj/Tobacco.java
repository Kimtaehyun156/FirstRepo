package myobj;

public class Tobacco {

	public int price;
	public int nicotine;
	public int money;
	public double life;
	
	public void eat() {
			life -= Math.ceil((nicotine * (life/100)));	
	}
	
	public void buy() {
		if (money-(price*nicotine) < 0) {
			System.out.println("�������� �����ؼ� ����ϴ� ");
		} else {			
			money -= price*nicotine;
			System.out.println("������ �������� ? " + money + "��");
		}
	}
	
	public Tobacco() {
		money = 20000;
		life = 200;
	}
	
	public Tobacco(int money) {
		this.money = money;
	}
	
	public Tobacco(int money , double life) {
		this.money = money;
		this.life = life;
	}
	public Tobacco(int money , double life , int nicotine) {
		this.money = money;
		this.life = life;
		this.nicotine = nicotine;
	}
	public Tobacco(int money , double life , int nicotine, int price) {
		this.money = money;
		this.life = life;
		this.nicotine = nicotine;
		this.price = price;
	}
}
