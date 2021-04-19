package Study;
import java.util.ArrayList;
import java.util.LinkedList;

public class D04_LinkedList {
	
	/*
	 *		# ���� ����Ʈ
	 *		- ArrayList ���� ���� /������ ������ ����Ʈ 
	 *		- �������߰��� ������ �߻������� 
	 *		- ArrayList�� ��� �����͸� �ڷ� �о���Ѵ� 
	 *		- LinkedList�� ����� ��常 �����ϱ� ������ �ξ� ������
	 *		- ArrayList�� ������ ������ �б⿡ �����ϰ�  (�������� ArrayList �� ���� ���δ� ) 
	 *		- LinkedList�� ������ �߰�/���� �� ������ �����ϴ�   
	 */
	
	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList<>();
		
		//LinkedList�� add��
		animals.add("tiger");
		animals.add("lion");
		animals.add("horse");
		animals.addFirst("monkey");
		animals.addLast("hama");
		
		System.out.println(animals);
		
		//LinkedList�� add��
		System.out.println(animals.get(3));
		System.out.println(animals.getFirst());
		System.out.println(animals.getLast());
		
		// pop() poll() : ����Ʈ���� �Ǿ� �����͸� �����鼭 ������ 
		while(animals.size() != 0) {
			System.out.println("pop! (Poll)"+animals.pop());			
		}
		System.out.println("after pop:" + animals);
		
		
		// PollLast() : ����Ʈ�� �ǵ� �����͸� �а� ������ 
		ArrayList<String> cage = new ArrayList<>();
		cage.add("rabit");
		cage.add("hamster");
		cage.add("bird");
		cage.add("fish");
		
		animals.addAll(cage);
		
		while(animals.size() != 0) {
			System.out.println("PollLast : "+animals.pollLast());			
		}
	
		// ���� �׽�Ʈ
		int testSize = 1000000;
		ArrayList<Integer> arr = new ArrayList<>(testSize);
		ArrayList<Integer> arr2 = new ArrayList<>(testSize);
		
		for (int i = 0; i < testSize; ++i) {
			arr.add(i);
		}
		
		LinkedList<Integer> Linked = new LinkedList<>();
		for (int i = 0; i < testSize; ++i) {
			Linked.add(i);
		}
		
		// ������ �߰� ���� �� 
		int insertionSize = 50000;
		System.out.println("1.ArrayList Insertion Test");
		long startTime = System.currentTimeMillis();
		
		for( int i =0; i <insertionSize; ++i) {
			arr.add(50,10);
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("�Ҹ�� �ð� :"+ (endTime -startTime) + "ms");
		
		
		System.out.println("2.LinkedList Insertion Test");
		startTime = System.currentTimeMillis();
		
		for( int i =0; i <insertionSize; ++i) {
			Linked.add(50,10);
		}
		arr2.addAll(Linked);
		
		endTime = System.currentTimeMillis();
		System.out.println("�Ҹ�� �ð� :"+ (endTime -startTime) + "ms");
		
		
	}
}
