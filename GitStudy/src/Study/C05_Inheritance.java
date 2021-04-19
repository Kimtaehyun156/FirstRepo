package Study;

public class C05_Inheritance {

	/*
			# 클래스 상속 
			- 미리 만들어둔 이미 존재하는 클래스를 그대로 물려받거나 고쳐서 사용하는것 
			- 상속해주는 클래스는 부모클래스 또는 슈퍼클래스 라고 한다 
			- 상속 받는 클래스를 자식 클래스 또는 서브 클래스 라고 한다 	 	
	 */
	
	public static void main(String[] args) {
 
		Person[] persons = new Person[3];
		
		persons[0] = new Person("홍길동" ,10,10);
		persons[1] = new Person("고길동" ,45,15);
		persons[2] = new Person("이길동" ,30,12);
		
		persons[0].sayHi();
		persons[1].sayHi();
		persons[2].sayHi();
		
		// 부모 클래스에서 만들었던 기능을 자유롭게 사용할 수 있다 
		Police police1 = new Police();
		
		police1.sayHi();
		police1.walk();
		police1.run();
		
		police1.thisSuperTest("둘리");
		
		Police police = new Police();
		police.arrest("김강도");
		
		// Person으로 업캐스팅 된 police는 체포를 할수 없다 
		Person person = police;
		Person person2 = new Person("전우치",24,30);
		//person.arrest();
		person.sayHi();
		
		//다운 캐스팅을 활용해 원래기능 다시 사용하기
		((Police)person).arrest("김소매"); 	// 원래 Police였던 Person은 다운 캐스팅이 가능하다 
		//((Police)person2).arrest("김도적"); // 원래 Person 이였던 Person은 다운캐스팅 불가능 
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
		//연습문제 나이가 먹을수록 공손하게 인사하도록 만들어보세요 
		
		if(age <= 20) {
			System.out.printf("안녕! 내이름은 %s 이고   나이는 %d이야\n",name,age);
		}else if( age <= 40) {
			System.out.printf("안녕하세요! 제 이름은 %s 이고   나이는 %d입니다\n",name,age);
		}else{
			System.out.printf("안녕하세요 제 성함은 %s 이고   연배는 %d입니다 껄껄! \n",name,age);
		}
	}
	
	void walk() {
		System.out.printf("%s씨는  %d만큼 걸었습니다\n" ,name , speed/2);
	}
	
	void run() {
		System.out.printf("%s씨는  %d만큼 뛰었습니다 \n" ,name , speed);
	}
	
}

/*
 		1. 상속받는 클래스는 생성자에서 가장 먼저 부모의 생성자를 호출해야한다 
 		   부모 클래스에 기본생성자가 존재하면 생략할수 있지만 
 		   존재 하지않을때는 생략이 불가능하다 
 		2. 자식클래스는 부모메서드는 마음대로 고쳐서 사용할수 있다 (오버라이드 , Override)
 		
 		3. 부모클래스와 자식 클래스에 똑같은 이름을 가진 자원이 있는경우 
 		   super와 this로 정확하게 구분할수 있다 
 */


class Police extends Person{
	
	String name ="마동석";
	
	// 자식 클래스의 생성자에서는 첫 줄에 super()를 반드시 호출해야한다.(필수)
	public Police() {
		super("김경찰",23,20);
		
		// super() : 부모 클래스의 생성자를 실행 시킨다!
	}
	
	@Override  // 컨트롤 + 스페이스 해서 오버라이딩 할수있다 
	// 부모메서드가 삭제되면 에러검출되서 오류를 방지할수있다 
	void sayHi() {
		System.out.printf("안녕하십니까! 저는 %s 형사입니다 \n",name);
	}

	void thisSuperTest(String name) {
		System.out.println("그냥네임    : " + name);			// 입력받은 네임을 출력
		System.out.println("this 네임  : " + this.name); 	// 자기자신의 네임 출력
		System.out.println("super 네임 : " + super.name);	// 자기부모의 네임 출력 
	}
	
	void arrest(String suspect) {
		
		System.out.printf("%s 형사는 %s씨를 체포했습니다 \n",name,suspect);
		
	}
	
}

//class Programmer extends Person{
//	// 모든 생성자를 생략할 시 
//	// 자식 클래스에도 기본 생성자가 생기고 부모 클래스의 기본 생성자를 사용한다 
//}