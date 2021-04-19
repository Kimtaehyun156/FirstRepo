package Quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 제네릭을 설정해둔 클래스는 인스턴스 생성시 원하는 타입을 고를수 있게된다 
// 고르지 않으면 Object로 설정된다 
public class D02_JiphapQuiz2<T> {

	   /*
	    *  1. 두 컬렉션을 매개변수로 전달받으면 두집합의 합집합을 Set타입으로 반환하는 메서드 
	    *  2. 두 컬렉션을 매개변수로 전달받으면 두집합의 교집합을 Set타입으로 반환하는 메서드
	    *  3. 두 컬렉션을 매개변수로 전달받으면 두집합의 차집합을 Set타입으로 반환하는 메서드  
	    */
	public Set<T> union(Collection<? extends T> A , Collection<? extends T> B) {
		Set<T> union_set = new HashSet<>(A); 
		union_set.addAll(B);
		return union_set;
	}
	
	public Set<T> intersection(Collection<? extends T> A , Collection<? extends T> B) {
		Set<T> inter_set = new HashSet<>(A); 
		inter_set.retainAll(B);
		return inter_set;
	}
	
	public Set<T> difference(Collection<? extends T> A , Collection<? extends T> B) {
		Set<T> differ_set = new HashSet<>(A); 
		differ_set.removeAll(B);
		return differ_set;
	}
	

	public static int plus(int a, int b) {
		a += b; 
		return a;
	}
	
	public static void main(String[] args) {
		
		// 소문자로 시작하는 애들은 매개변수로 전달할때 값을 복사하여 전달한다 
		int int_a = 20;
		int int_b = 30;
		
		System.out.println(plus(int_a, int_b));
		System.out.println("int_a : "+int_a);
		
		// 하지만 대문자로 시작하는타입(참조형타입)들은 매개변수로 전달할떄 주소를 복사하여 전달한다
		List<String> A = new ArrayList<>();
		Set<String> B = new HashSet<>();
		Set<String> C = new HashSet<>();
		
		A.add("abc");
		A.add("application");
		A.add("advertise");
		A.add("apple");
		
		B.add("banana");
		B.add("balloon");
		B.add("bike");
		B.add("boat");
		B.add("apple");
		
		C.add("cow");
		C.add("cat");
		C.add("crack");
		C.add("apple");
		
		D02_JiphapQuiz2<String> jiphap_tools = new D02_JiphapQuiz2<String>();
		D02_JiphapQuiz2<Integer> jiphap_tools2 = new D02_JiphapQuiz2<Integer>();
	
		System.out.println(jiphap_tools.union(A,B));
		System.out.println(jiphap_tools.intersection(jiphap_tools.intersection(A, B), C));
		System.out.println(jiphap_tools.difference(A, C));
	}

}
