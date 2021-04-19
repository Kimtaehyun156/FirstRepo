package Study;

public class C11_AnonymousInnerClass {
	
	
	/*
	 		# �͸� ���� Ŭ���� 
	 		- Ŭ������ �̸��� �����ʰ� �ٷ� ������ ���� �ٷ� ����ϴ� ��� 
	 		- ��ȸ���̴� 
	 */
	
	public static void kick( Kickable something) {
		something.kick();
	}
	
	public static void main(String[] args) {
		kick(new Human());
		kick(new VendingMachine());
		kick(new Ball("�޽�"));
		kick(new Ball("�⼺��"));
		
		// # ���� ���� Ŭ���� 
		class Door extends Kickable{
			boolean open;
			
			@Override
			void kick() {
				if(open) {
					System.out.println("��¦�� �߷� �Ⱦ� �� �ݾҽ��ϴ� ");				
					open = false;
				}else {
					System.out.println("��¦�� �߷� �Ⱦ� �� �������ϴ� ");				
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
		
		// #�͸� Ŭ����  (�Ｎ���� ��� ���׷��̵��� ����� �ν��Ͻ��� ����) 
		// - ����� ���� �������� �ʱ� ������ �ٽô� ����Ҽ� ���� (��ȸ��)
		kick(new Door() {
			@Override
			void kick() {
				System.out.println("ưư�� �ݰ��� ���ſ��� ��½�� �����ʾҽ��ϴ� ");
			}
		});
		
		kick(new Ball() {
			@Override
			void kick() {
					System.out.println("�󱸰��� �߷� á���ϸָ��������¾ʰ� �����⸸�մϴ�");
			}
		});
		
		// punch() �޼����� ���ڰ����� �����Ҽ��ִ� �͸� Ŭ������ 2�� , �������� Ŭ������ 2���� �����غ���  
		class Pineboard extends Punchable{
			int count;
			
			public Pineboard() {}
			
			public Pineboard(int count) {
				this.count = count;
			}
			@Override
			void punch() {
				System.out.println("������ �ָ����� "+count+"�� �����߽��ϴ�");
			}
		}
		
		class Person extends Punchable{
			@Override
			void punch() {
				System.out.println("����� �ָ����� ���Ƚ��ϴ�");
			}
		}
		
		Pineboard pb = new Pineboard(12);
		punch(pb);
		
		punch(new Pineboard(7));
		
		punch(new Person());
		
		//�͸� Ŭ���� 
		punch(new Person() {
			@Override
			void punch() {
				System.out.println("����� �Ժη� ������ �ȵ˴ϴ�");
			}
		});
		
		// �͸� Ŭ���� 
		punch(new Pineboard(){
			@Override
			void punch() {
				System.out.println(" (���ǻѽô� �Ҹ� )�Ѱ�!!");
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
		if(kicker.equals("�޽�")) {
			System.out.println("���� ������ á���ϴ� ");
		}else if( kicker.equals("�⼺��")) {
			System.out.println("�н��� ��Ȯ�ϰ� á���ϴ� ");
		}
	}
}

class Human extends Kickable{
	@Override
	void kick() {
		System.out.println("����� �߷� �Ⱦ� á���ϴ� ");
	}
}

class VendingMachine extends Kickable{
	@Override
	void kick() {
		System.out.println("���Ǳ⸦ �Ⱦ� á���� ����� �ϳ��� ���Խ��ϴ� ");
	}
}