package Study;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class D01_ArrayList {
	
	/*
	 	# Java Collections 
	 	- �ڹٿ��� �⺻������ �����ϴ� �ڷᱸ�� �������̽� 
	 	- Collection �������̽��� ����� �������̽��δ� List , Set ���ִ� 
	 	
	 	# java.util.ArrayList
	 	- �迭�� �ٸ��� ũ�Ⱑ �ڵ����� �����Ǵ� �ڷᱸ�� Ŭ���� 
	 	- �迭�� ������ �����̴� 
	 	- ���������� �����Ϳ� �����Ҷ� ���� �����ϴ� 
	 	
	 */
	
	public static void main(String[] args) {
		
		
		// Ÿ���� �����ϸ� ArrayList �����ϱ� 
		// - Ÿ���� �����Ҷ� ����ϴ� <>�� ���׸���(Generic)�̶�� �θ��� 
		// �迭���ٴ� �ӵ��� �ణ������ 
		// ���׸����� �⺻��  Ÿ���� ����Ҽ� ����  int (x) Integer(O) (�⺻Ÿ���� WrapperClass �� ���)
		ArrayList<String> fruits = new ArrayList<>();
		ArrayList<Integer> numbers = new ArrayList<>();
		
		// add(item, element) : ����Ʈ�� ���ϴ� �����͸� ���������� �ǵڿ� �߰��Ѵ� 
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("kiwi");
		fruits.add("apple");
		fruits.add("kiwi");
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		
		//add(index,item) : ����Ʈ�� ���ϴ� ��ġ�� �����͸� �ִ´� 
		fruits.add(2,"orange");
		fruits.add(2,"peach");
		fruits.add(2,"grape");
		
		numbers.add(2,25);
		
		System.out.println(fruits);
		System.out.println(numbers);
		
		// get(index) : ����Ʈ���� ���ϴ� �ε����� �����͸� �ϳ� ������  // ������ 0��
		System.out.println(fruits.get(0));
		System.out.println(fruits.get(1));
		System.out.println(fruits.get(2));
		System.out.println(fruits.get(3));
		System.out.println(fruits.get(4));
		System.out.println(fruits.get(5));
		
		
		// size(): �ش� �÷����� ũ�⸦ ��ȯ�Ѵ� 
		System.out.println("fruits�� ũ�� :" +fruits.size());
		System.out.println("numbers�� ũ�� :" +numbers.size());
		
		
		// remove(index) : �ش������ �����͸� ����   ��� ������͸� ��ȯ�Ѵ� 
		String deleted_fruit = fruits.remove(3);
		System.out.println("������"+ fruits);
		System.out.println("�����Ȱ� "+ deleted_fruit);
		
		// remove(item) :�ش� �����͸� �����Ѵ� 
		if(fruits.remove("strawberry")) {
			System.out.println("strawberry�� ���������� �����߽��ϴ� ");
		}else {
			System.out.println("strawberry�� ��� ������ ���߽��ϴ� ");
		}
		
		// ���� (��������)
		Collections.sort(fruits);
		System.out.println(fruits);
				
		// �迭���� (��������)
		int[] lottos = {45, 7 ,1 ,5  ,23,11};
		Arrays.sort(lottos);
		System.out.println(Arrays.toString(lottos));
	}
}
