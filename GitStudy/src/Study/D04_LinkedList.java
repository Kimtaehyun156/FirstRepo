package Study;
import java.util.ArrayList;
import java.util.LinkedList;

public class D04_LinkedList {
	
	/*
	 *		# 연결 리스트
	 *		- ArrayList 보다 삽입 /삭제가 유리한 리스트 
	 *		- 데이터중간에 삽입이 발생했을때 
	 *		- ArrayList는 모든 데이터를 뒤로 밀어야한다 
	 *		- LinkedList는 연결된 노드만 변경하기 떄문에 훨씬 빠르다
	 *		- ArrayList는 데이터 보관및 읽기에 유리하고  (웹에서는 ArrayList 가 많이 쓰인다 ) 
	 *		- LinkedList는 데이터 추가/수정 및 삭제에 유리하다   
	 */
	
	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList<>();
		
		//LinkedList의 add들
		animals.add("tiger");
		animals.add("lion");
		animals.add("horse");
		animals.addFirst("monkey");
		animals.addLast("hama");
		
		System.out.println(animals);
		
		//LinkedList의 add들
		System.out.println(animals.get(3));
		System.out.println(animals.getFirst());
		System.out.println(animals.getLast());
		
		// pop() poll() : 리스트에서 맨앞 데이터를 읽으면서 버린다 
		while(animals.size() != 0) {
			System.out.println("pop! (Poll)"+animals.pop());			
		}
		System.out.println("after pop:" + animals);
		
		
		// PollLast() : 리스트의 맨뒤 데이터를 읽고 버린다 
		ArrayList<String> cage = new ArrayList<>();
		cage.add("rabit");
		cage.add("hamster");
		cage.add("bird");
		cage.add("fish");
		
		animals.addAll(cage);
		
		while(animals.size() != 0) {
			System.out.println("PollLast : "+animals.pollLast());			
		}
	
		// 성능 테스트
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
		
		// 데이터 추가 성능 비교 
		int insertionSize = 50000;
		System.out.println("1.ArrayList Insertion Test");
		long startTime = System.currentTimeMillis();
		
		for( int i =0; i <insertionSize; ++i) {
			arr.add(50,10);
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("소모된 시간 :"+ (endTime -startTime) + "ms");
		
		
		System.out.println("2.LinkedList Insertion Test");
		startTime = System.currentTimeMillis();
		
		for( int i =0; i <insertionSize; ++i) {
			Linked.add(50,10);
		}
		arr2.addAll(Linked);
		
		endTime = System.currentTimeMillis();
		System.out.println("소모된 시간 :"+ (endTime -startTime) + "ms");
		
		
	}
}
