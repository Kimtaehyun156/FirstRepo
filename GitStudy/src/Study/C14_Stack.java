package Study;

public class C14_Stack {

	static int i =0;
	public static void main(String[] args) {
		//a();
		overflow();
	}
	public static void overflow() {
		System.out.println(i++);
		overflow();
	}
	
	public static void a() {
		b();
	}
	
	public static void b() {
		b_1();
	}
	
	public static void b_1() {
		b_2();
	}
	
	public static void b_2() {
		System.out.println("b-2 Hi");
	}
	
	public static void c() {
		System.out.println("c Hi");
	}
}
