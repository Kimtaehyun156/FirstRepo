package Study;
import java.util.Comparator;
import java.util.TreeSet;

public class D06_TreeSet {
	
	/*
	 *		# TreeSet
	 *		- 중복값을 저장 할수 없다 
	 *		- 데이터를 저장할떄 Comparator를 이용해 미리 정렬한다 
	 *		- 요소로 null을  허용하지 않는다 
	 *		- 처음에 정렬해서 넣기 떄문에 HashSet에 비해 저장 속도가 느리다
	 *		- 하지만 TreeSet은 정렬이 미리 되어있기 떄문에 정렬된순서로 데이터를 꺼내는것은 가장 빠르다 
	 */
	
	public static void main(String[] args) {
		TreeSet<Grape> grape_tree = new TreeSet<>(new 포도분류기_GNO기준_내림차순());
		TreeSet<Grape> grape_tree2 = new TreeSet<>(new 포도분류기_포도알맹이_내림차순());
		TreeSet<Mango> mango_tree1 = new TreeSet<>(new MangoCompareBySweetAsc());
		TreeSet<Mango> mango_tree2 = new TreeSet<>(new MangoCompareByMnoASC());
		TreeSet<Mango> mango_tree3 = new TreeSet<>(new MangoCompareBySizeASC());
		TreeSet<Mango> mango_tree4 = new TreeSet<>();
		
		for(int i =0; i< 5; ++i)
		{
			mango_tree4.add(new Mango(String.format("MANGO%05d",(int)(Math.random()*100000)) ,10 ,10));
		}
		System.out.println(mango_tree4.toString());
		
		//해당 객체 자체가 비교 가능한 객체라면 Comparator를 사용 하지 않을 수 있다.
		TreeSet<String> word_tree = new TreeSet<>();
		
		word_tree.add("cat");
		word_tree.add("pet");
		word_tree.add("pat");
		word_tree.add("fat");
		word_tree.add("bat");
		
		System.out.println(word_tree);
		
		
		grape_tree.add(new Grape().setGno("1").setFruit(37));
		grape_tree.add(new Grape().setGno("2").setFruit(13));
		grape_tree.add(new Grape().setGno("3").setFruit(21));
		grape_tree.add(new Grape().setGno("4").setFruit(37));
		
		grape_tree2.addAll(grape_tree);
		
		mango_tree1.add(new Mango("Mango011",10,16));
		mango_tree1.add(new Mango("Mango007",7,27));
		mango_tree1.add(new Mango("Mango009",5,32));
		mango_tree1.add(new Mango("Mango105",8,21));
		mango_tree1.add(new Mango("Mango089",5,40));
		mango_tree1.add(new Mango("Mango007",5,40));
		mango_tree1.add(new Mango("1",1,2).setMno("Mango013").setSweet(13).setSize(13));
	
		mango_tree2.add(new Mango("Mango011",10,16));
		mango_tree2.add(new Mango("Mango007",7,27));
		mango_tree2.add(new Mango("Mango009",5,32));
		mango_tree2.add(new Mango("Mango105",8,21));
		mango_tree2.add(new Mango("Mango089",5,40));
		mango_tree2.add(new Mango("Mango007",5,40));
		mango_tree2.add(new Mango("1",1,2).setMno("Mango013").setSweet(13).setSize(13));
		
		mango_tree3.add(new Mango("Mango011",10,16));
		mango_tree3.add(new Mango("Mango007",7,27));
		mango_tree3.add(new Mango("Mango009",5,32));
		mango_tree3.add(new Mango("Mango105",8,21));
		mango_tree3.add(new Mango("Mango089",5,40));
		mango_tree3.add(new Mango("Mango007",5,40));
		mango_tree3.add(new Mango("1",1,2).setMno("Mango013").setSweet(13).setSize(13));
		
		//Sweet기준
		System.out.println("망고 sweet 기준 오름차순정렬");
		System.out.println(mango_tree1.toString());
		
		//Mno기준
		System.out.println("망고 mno 기준 오름차순정렬");
		System.out.println(mango_tree2.toString());
		
		//Size 기준 
		System.out.println("망고 사이즈 기준 오름차순");
		System.out.println(mango_tree3.toString());
		
//		System.out.println(grape_tree);
//		System.out.println(grape_tree2);
		
		
		// TreeSet 활용 
		//decendingSet() : 미리 정렬해놓은 방향과 반대 방향인 set 인스턴스를 반환
		System.out.println(grape_tree.descendingSet());
		
		//headSet(toElement) : 맨앞부터 원하는 요소까지 자른 Set을 반환
		System.out.println(grape_tree.headSet((new Grape().setGno("3"))));
		
		//tailSet(toElement) : 원하는 요소부터 맨 뒤까지 자른 Set을 반환
		System.out.println(grape_tree.tailSet((new Grape().setGno("3"))));
		
		//subSet(fromElement, toElement) : 원하는 요소부터 시작해서 원하는 요소까지 자른 Set을 반환 
		System.out.println(grape_tree.subSet(new Grape().setGno("3"), new Grape().setGno("1")));
		
		
		TreeSet<Integer> int_tree = new TreeSet<>();
		
		int_tree.add(99);
		int_tree.add(5);
		int_tree.add(15);
		int_tree.add(75);
		int_tree.add(33);
		int_tree.add(9);
		int_tree.add(11);
		int_tree.add(1);
		
		System.out.println(int_tree);
		
		//ceiling(element) : 원하는 가장 가까운 요소를  선택할떄 사용 (올려서 선택) 전달한 값도 포함시킴 
		System.out.println(int_tree.ceiling(20));
		System.out.println(int_tree.ceiling(34));
			
		//floor(element) :  원하는 가장 가까운 요소를  선택할떄 사용 (내려서 선택) 전달한 값도 포함시킴 
		System.out.println(int_tree.floor(14));
		System.out.println(int_tree.floor(98));
		
		//higher(element) :  원하는 가장 가까운 요소를  선택할떄 사용 (올려서 선택) 전달한 값도 "미포함"시킴 
		System.out.println(int_tree.higher(75));
		
		//lower(element) : 원하는 가장 가까운 요소를  선택할떄 사용 (내려서 선택) 전달한 값도 "미포함"시킴 
		System.out.println(int_tree.lower(75));
		
		// 연습문제 : 망고트리에 망고를 5개 추가 하고 mno기준 오름차순 정렬을 해보세요 

	}
}

class MangoCompareBySizeASC implements Comparator<Mango> {
	@Override
	public int compare(Mango o1, Mango o2) {
		if(o1.size > o2.size) {
			return 1;
		}else if( o1.size == o2.size) {
			return 0;
		}else {
			return -1;
		}
		
	}
}

// outer class에는 protect 랑 private 을 사용 할수없다 
class MangoCompareByMnoASC implements Comparator<Mango>{
	@Override
	
	// inner class에는 모든 접근 제어자를 사용할수 있다 
	public int compare(Mango o1, Mango o2) {
		if(o1.mno.compareTo(o2.mno) > o2.mno.compareTo(o1.mno) ) {
			return 1;
		}else if(o1.mno.equals(o2.mno)) {
			return 0;
		}else {
			return -1;
		}
	}
}


class MangoCompareBySweetAsc implements Comparator<Mango>{
	/*	
	 * 		# comparator의 규칙 
	 *  	- compare 메서드의 리턴값이 1이면 o1과 o2의 순서를 바꾼다
	 *  	- compare 메서드의 리턴값이 0이면 같은 크기로 취급한다 
	 *  	- compare 메서드의 리턴값이 -1이면 o1과 o2의 순서를 그대로 유지한다  
	 *      [ 3, 2 , 3, 8, 99, 1, 5, 8 ,9, ]
	 */
	@Override
	public int compare(Mango o1, Mango o2) {	
		if(o1.sweet > o2.sweet) {
			return 1;			
		}else if (o1.sweet < o2.sweet) {
			return -1;
		}else {
			return 0;
		}
	}
}

// Comparator : 비교할떄 사용하는 비교 도구 클래스 
// Comparable : 이객체가 비교 가능한 클래스임을 표시하는 인터페이스 
class Mango implements Comparable<Mango>{
	
	String mno;
	int size;
	int sweet;
	
	public Mango(String mno , int sweet , int size){
		 this.mno = mno;
		 this.sweet =sweet;
		 this.size = size;
	}
	
	Mango setMno(String mno) {
		this.mno = mno;
		return this;
	}
	
	Mango setSize(int size) {
		this.size = size;
		return this;
	}
	
	Mango setSweet(int sweet) {
		this.sweet = sweet;
		return this;
	}
	
	@Override // this VS 매개변수로 compare 메서드를 구현하면된다 
	public int compareTo(Mango o) {
		return this.mno.compareTo(o.mno);
	}
	
	
	@Override
	public String toString() {
		return this.mno + "/" + this.sweet  + "/" + this.size;
	}
}
