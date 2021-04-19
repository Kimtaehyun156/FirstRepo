package Study;

public class C05_Inheritance {

	/*
			# Ŭ���� ��� 
			- �̸� ������ �̹� �����ϴ� Ŭ������ �״�� �����ްų� ���ļ� ����ϴ°� 
			- ������ִ� Ŭ������ �θ�Ŭ���� �Ǵ� ����Ŭ���� ��� �Ѵ� 
			- ��� �޴� Ŭ������ �ڽ� Ŭ���� �Ǵ� ���� Ŭ���� ��� �Ѵ� 	 	
	 */
	
	public static void main(String[] args) {
 
		Person[] persons = new Person[3];
		
		persons[0] = new Person("ȫ�浿" ,10,10);
		persons[1] = new Person("��浿" ,45,15);
		persons[2] = new Person("�̱浿" ,30,12);
		
		persons[0].sayHi();
		persons[1].sayHi();
		persons[2].sayHi();
		
		// �θ� Ŭ�������� ������� ����� �����Ӱ� ����� �� �ִ� 
		Police police1 = new Police();
		
		police1.sayHi();
		police1.walk();
		police1.run();
		
		police1.thisSuperTest("�Ѹ�");
		
		Police police = new Police();
		police.arrest("�谭��");
		
		// Person���� ��ĳ���� �� police�� ü���� �Ҽ� ���� 
		Person person = police;
		Person person2 = new Person("����ġ",24,30);
		//person.arrest();
		person.sayHi();
		
		//�ٿ� ĳ������ Ȱ���� ������� �ٽ� ����ϱ�
		((Police)person).arrest("��Ҹ�"); 	// ���� Police���� Person�� �ٿ� ĳ������ �����ϴ� 
		//((Police)person2).arrest("�赵��"); // ���� Person �̿��� Person�� �ٿ�ĳ���� �Ұ��� 
	}

}

class Person{
	String name;
	int age;
	int speed;
		
	public Person(String name , int age , int speed) {
		this.name = name;
		this.age = age;
		this.speed = speed;
	}
	
	void sayHi() {
		//�������� ���̰� �������� �����ϰ� �λ��ϵ��� �������� 
		
		if(age <= 20) {
			System.out.printf("�ȳ�! ���̸��� %s �̰�   ���̴� %d�̾�\n",name,age);
		}else if( age <= 40) {
			System.out.printf("�ȳ��ϼ���! �� �̸��� %s �̰�   ���̴� %d�Դϴ�\n",name,age);
		}else{
			System.out.printf("�ȳ��ϼ��� �� ������ %s �̰�   ����� %d�Դϴ� ����! \n",name,age);
		}
	}
	
	void walk() {
		System.out.printf("%s����  %d��ŭ �ɾ����ϴ�\n" ,name , speed/2);
	}
	
	void run() {
		System.out.printf("%s����  %d��ŭ �پ����ϴ� \n" ,name , speed);
	}
	
}

/*
 		1. ��ӹ޴� Ŭ������ �����ڿ��� ���� ���� �θ��� �����ڸ� ȣ���ؾ��Ѵ� 
 		   �θ� Ŭ������ �⺻�����ڰ� �����ϸ� �����Ҽ� ������ 
 		   ���� ������������ ������ �Ұ����ϴ� 
 		2. �ڽ�Ŭ������ �θ�޼���� ������� ���ļ� ����Ҽ� �ִ� (�������̵� , Override)
 		
 		3. �θ�Ŭ������ �ڽ� Ŭ������ �Ȱ��� �̸��� ���� �ڿ��� �ִ°�� 
 		   super�� this�� ��Ȯ�ϰ� �����Ҽ� �ִ� 
 */


class Police extends Person{
	
	String name ="������";
	
	// �ڽ� Ŭ������ �����ڿ����� ù �ٿ� super()�� �ݵ�� ȣ���ؾ��Ѵ�.(�ʼ�)
	public Police() {
		super("�����",23,20);
		
		// super() : �θ� Ŭ������ �����ڸ� ���� ��Ų��!
	}
	
	@Override  // ��Ʈ�� + �����̽� �ؼ� �������̵� �Ҽ��ִ� 
	// �θ�޼��尡 �����Ǹ� ��������Ǽ� ������ �����Ҽ��ִ� 
	void sayHi() {
		System.out.printf("�ȳ��Ͻʴϱ�! ���� %s �����Դϴ� \n",name);
	}

	void thisSuperTest(String name) {
		System.out.println("�׳ɳ���    : " + name);			// �Է¹��� ������ ���
		System.out.println("this ����  : " + this.name); 	// �ڱ��ڽ��� ���� ���
		System.out.println("super ���� : " + super.name);	// �ڱ�θ��� ���� ��� 
	}
	
	void arrest(String suspect) {
		
		System.out.printf("%s ����� %s���� ü���߽��ϴ� \n",name,suspect);
		
	}
	
}

//class Programmer extends Person{
//	// ��� �����ڸ� ������ �� 
//	// �ڽ� Ŭ�������� �⺻ �����ڰ� ����� �θ� Ŭ������ �⺻ �����ڸ� ����Ѵ� 
//}