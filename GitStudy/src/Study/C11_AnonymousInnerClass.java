package Study;

public class C11_AnonymousInnerClass {
	
	
	/*
	 		# 익명 내부 클래스 
	 		- 클래스에 이름을 짓지않고 바로 구현한 다음 바로 사용하는 방식 
	 		- 일회용이다 
	 */
	
	public static void kick( Kickable something) {
		something.kick();
	}
	
	public static void main(String[] args) {
		kick(new Human());
		kick(new VendingMachine());
		kick(new Ball("메시"));
		kick(new Ball("기성용"));
		
		// # 지역 내부 클래스 
		class Door extends Kickable{
			boolean open;
			
			@Override
			void kick() {
				if(open) {
					System.out.println("문짝을 발로 걷어 차 닫았습니다 ");				
					open = false;
				}else {
					System.out.println("문짝을 발로 걷어 차 열었습니다 ");				
					open = true;
				}
			}
		}
		
		Door door1 = new Door() , door2 =  new Door()  ,  door3 =  new Door();
		
		kick(door1);
		kick(door1);
		kick(door1);
		kick(door2);
		kick(door3);
		
		// #익명 클래스  (즉석에서 도어를 업그레이드한 상속한 인스턴스를 생성) 
		// - 만들고 따로 저장하지 않기 떄문에 다시는 사용할수 없다 (일회용)
		kick(new Door() {
			@Override
			void kick() {
				System.out.println("튼튼한 금고문이 무거워서 꿈쩍도 하지않았습니다 ");
			}
		});
		
		kick(new Ball() {
			@Override
			void kick() {
					System.out.println("농구공이 발로 찼더니멀리나가지는않고 아프기만합니다");
			}
		});
		
		// punch() 메서드의 인자값으로 전달할수있는 익명 클래스로 2개 , 지역내부 클래스로 2개를 정의해보기  
		class Pineboard extends Punchable{
			int count;
			
			public Pineboard() {}
			
			public Pineboard(int count) {
				this.count = count;
			}
			@Override
			void punch() {
				System.out.println("송판을 주먹으로 "+count+"개 격파했습니다");
			}
		}
		
		class Person extends Punchable{
			@Override
			void punch() {
				System.out.println("사람을 주먹으로 때렸습니다");
			}
		}
		
		Pineboard pb = new Pineboard(12);
		punch(pb);
		
		punch(new Pineboard(7));
		
		punch(new Person());
		
		//익명 클래스 
		punch(new Person() {
			@Override
			void punch() {
				System.out.println("사람을 함부로 떄리면 안됩니다");
			}
		});
		
		// 익명 클래스 
		punch(new Pineboard(){
			@Override
			void punch() {
				System.out.println(" (송판뿌시는 소리 )뿌각!!");
			}
		});
		
	}
	public static void punch(Punchable something) {
		something.punch();
	}
}
 
abstract class Punchable{
	abstract void punch();
}

abstract class Kickable{
	abstract void kick();
}

class Ball extends Kickable{
	
	String kicker;
	public Ball() {}
	
	public Ball(String kicker) {
		this.kicker = kicker;
	}
	
	@Override
	void kick() {
		if(kicker.equals("메시")) {
			System.out.println("슟을 멋지게 찼습니다 ");
		}else if( kicker.equals("기성용")) {
			System.out.println("패스를 정확하게 찼습니다 ");
		}
	}
}

class Human extends Kickable{
	@Override
	void kick() {
		System.out.println("사람을 발로 걷어 찼습니다 ");
	}
}

class VendingMachine extends Kickable{
	@Override
	void kick() {
		System.out.println("자판기를 걷어 찼더니 음료수 하나가 나왔습니다 ");
	}
}