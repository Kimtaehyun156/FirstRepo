package Quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// ���׸��� �����ص� Ŭ������ �ν��Ͻ� ������ ���ϴ� Ÿ���� ���� �ְԵȴ� 
// ���� ������ Object�� �����ȴ� 
public class D02_JiphapQuiz2<T> {

	   /*
	    *  1. �� �÷����� �Ű������� ���޹����� �������� �������� SetŸ������ ��ȯ�ϴ� �޼��� 
	    *  2. �� �÷����� �Ű������� ���޹����� �������� �������� SetŸ������ ��ȯ�ϴ� �޼���
	    *  3. �� �÷����� �Ű������� ���޹����� �������� �������� SetŸ������ ��ȯ�ϴ� �޼���  
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
		
		// �ҹ��ڷ� �����ϴ� �ֵ��� �Ű������� �����Ҷ� ���� �����Ͽ� �����Ѵ� 
		int int_a = 20;
		int int_b = 30;
		
		System.out.println(plus(int_a, int_b));
		System.out.println("int_a : "+int_a);
		
		// ������ �빮�ڷ� �����ϴ�Ÿ��(������Ÿ��)���� �Ű������� �����ҋ� �ּҸ� �����Ͽ� �����Ѵ�
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
