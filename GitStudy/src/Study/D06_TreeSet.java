package Study;
import java.util.Comparator;
import java.util.TreeSet;

public class D06_TreeSet {
	
	/*
	 *		# TreeSet
	 *		- �ߺ����� ���� �Ҽ� ���� 
	 *		- �����͸� �����ҋ� Comparator�� �̿��� �̸� �����Ѵ� 
	 *		- ��ҷ� null��  ������� �ʴ´� 
	 *		- ó���� �����ؼ� �ֱ� ������ HashSet�� ���� ���� �ӵ��� ������
	 *		- ������ TreeSet�� ������ �̸� �Ǿ��ֱ� ������ ���ĵȼ����� �����͸� �����°��� ���� ������ 
	 */
	
	public static void main(String[] args) {
		TreeSet<Grape> grape_tree = new TreeSet<>(new �����з���_GNO����_��������());
		TreeSet<Grape> grape_tree2 = new TreeSet<>(new �����з���_�����˸���_��������());
		TreeSet<Mango> mango_tree1 = new TreeSet<>(new MangoCompareBySweetAsc());
		TreeSet<Mango> mango_tree2 = new TreeSet<>(new MangoCompareByMnoASC());
		TreeSet<Mango> mango_tree3 = new TreeSet<>(new MangoCompareBySizeASC());
		TreeSet<Mango> mango_tree4 = new TreeSet<>();
		
		for(int i =0; i< 5; ++i)
		{
			mango_tree4.add(new Mango(String.format("MANGO%05d",(int)(Math.random()*100000)) ,10 ,10));
		}
		System.out.println(mango_tree4.toString());
		
		//�ش� ��ü ��ü�� �� ������ ��ü��� Comparator�� ��� ���� ���� �� �ִ�.
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
		
		//Sweet����
		System.out.println("���� sweet ���� ������������");
		System.out.println(mango_tree1.toString());
		
		//Mno����
		System.out.println("���� mno ���� ������������");
		System.out.println(mango_tree2.toString());
		
		//Size ���� 
		System.out.println("���� ������ ���� ��������");
		System.out.println(mango_tree3.toString());
		
//		System.out.println(grape_tree);
//		System.out.println(grape_tree2);
		
		
		// TreeSet Ȱ�� 
		//decendingSet() : �̸� �����س��� ����� �ݴ� ������ set �ν��Ͻ��� ��ȯ
		System.out.println(grape_tree.descendingSet());
		
		//headSet(toElement) : �Ǿպ��� ���ϴ� ��ұ��� �ڸ� Set�� ��ȯ
		System.out.println(grape_tree.headSet((new Grape().setGno("3"))));
		
		//tailSet(toElement) : ���ϴ� ��Һ��� �� �ڱ��� �ڸ� Set�� ��ȯ
		System.out.println(grape_tree.tailSet((new Grape().setGno("3"))));
		
		//subSet(fromElement, toElement) : ���ϴ� ��Һ��� �����ؼ� ���ϴ� ��ұ��� �ڸ� Set�� ��ȯ 
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
		
		//ceiling(element) : ���ϴ� ���� ����� ��Ҹ�  �����ҋ� ��� (�÷��� ����) ������ ���� ���Խ�Ŵ 
		System.out.println(int_tree.ceiling(20));
		System.out.println(int_tree.ceiling(34));
			
		//floor(element) :  ���ϴ� ���� ����� ��Ҹ�  �����ҋ� ��� (������ ����) ������ ���� ���Խ�Ŵ 
		System.out.println(int_tree.floor(14));
		System.out.println(int_tree.floor(98));
		
		//higher(element) :  ���ϴ� ���� ����� ��Ҹ�  �����ҋ� ��� (�÷��� ����) ������ ���� "������"��Ŵ 
		System.out.println(int_tree.higher(75));
		
		//lower(element) : ���ϴ� ���� ����� ��Ҹ�  �����ҋ� ��� (������ ����) ������ ���� "������"��Ŵ 
		System.out.println(int_tree.lower(75));
		
		// �������� : ����Ʈ���� ���� 5�� �߰� �ϰ� mno���� �������� ������ �غ����� 

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

// outer class���� protect �� private �� ��� �Ҽ����� 
class MangoCompareByMnoASC implements Comparator<Mango>{
	@Override
	
	// inner class���� ��� ���� �����ڸ� ����Ҽ� �ִ� 
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
	 * 		# comparator�� ��Ģ 
	 *  	- compare �޼����� ���ϰ��� 1�̸� o1�� o2�� ������ �ٲ۴�
	 *  	- compare �޼����� ���ϰ��� 0�̸� ���� ũ��� ����Ѵ� 
	 *  	- compare �޼����� ���ϰ��� -1�̸� o1�� o2�� ������ �״�� �����Ѵ�  
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

// Comparator : ���ҋ� ����ϴ� �� ���� Ŭ���� 
// Comparable : �̰�ü�� �� ������ Ŭ�������� ǥ���ϴ� �������̽� 
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
	
	@Override // this VS �Ű������� compare �޼��带 �����ϸ�ȴ� 
	public int compareTo(Mango o) {
		return this.mno.compareTo(o.mno);
	}
	
	
	@Override
	public String toString() {
		return this.mno + "/" + this.sweet  + "/" + this.size;
	}
}
