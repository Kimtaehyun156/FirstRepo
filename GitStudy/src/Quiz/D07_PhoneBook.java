package Quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class D07_PhoneBook {
	
	/*
	 		# HashMap�� �̿��� ��ȭ��ȣ�θ� �����غ����� 
	 		
	 		1. �׷�/ ��ȭ��ȣ / �̸��� �����ؾ��Ѵ� 
	 		2. �׷��̸��� Ű������ ������ �ش� �׷��� ��ȭ��ȣ ����� ���´� 
	 		3. ��ȭ��ȣ ��Ͽ� ��ȭ���� Ű������ ������ �̸��� ���´� 
	 		
	 		# �����ؾ� �� �޼��� 
	 		
	 		1. ���ο� �׷��� �߰��ϴ� �޼��� 
	 		2. �����ϴ� �׷쿡 ���ο� ��ȭ��ȣ�� ����ϴ� �޼��� (�׷��� ���ٸ� �̺з� �׷쿡 ����)
	 		3. ��ϵ� ��� ��ȭ��ȣ�� ������ �̸����� ������������ �����ִ� �޼��� 
	 		4. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �˻� �޼��� 
	 		5. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ��ȭ��ȣ�� ��µǴ� �˻� �޼��� 
	 		
	 		
	 */
	static HashMap<String,String> group = new HashMap<>();
	static HashMap<String,String> tel = new HashMap<>();
	// �̺з� �׷� 
	static HashMap<String,String> groupless = new HashMap<>();
	static HashMap<String,String> telless = new HashMap<>();
	
	// 1. ���ο� �׷��� �߰��ϴ� �޼��� 
	public static void addGroup(String addgroup ,String addtel, String addname) {
		group.put(addgroup, addtel);
		tel.put(addtel, addname);
	}
	
	// 2. �����ϴ� �׷쿡 ���ο� ��ȭ��ȣ�� ����ϴ� �޼��� (�׷��� ���ٸ� �̺з� �׷쿡 ����)
	public static void Modify(String addgroup ,String addtel, String addname) {
		if(group.get(addgroup).equals(addgroup)) {
			group.put(addgroup, addtel);
			tel.put(addtel, addname);
		}else {
			groupless.put(addgroup, addtel);
			telless.put(addtel, addname)
		}
	}
	
	//3. ��ϵ� ��� ��ȭ��ȣ�� ������ �̸����� ������������ �����ִ� �޼���
	public static void findtel() {
		System.out.println("����� ��� ��ȭ��ȣ ���");
		ArrayList<String> arr = new ArrayList<>();
		arr.addAll(tel.values());
		Collections.sort(arr);
		//System.out.println(arr);
		
		for(String key : tel.keySet()) {
			System.out.println(key);
		}
	}
	
	//4. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �˻� �޼��� 
	public static void findName(String name) {
		String name1 = tel.get(key)
		
		if( tel.containsValue(name)) {
			System.out.println("�̸����ֽ��ϴ�");
		}else if( tel.values() {
			
		}
	}

	

	public static void main(String[] args) {
		

		tel.put("010-3860-8667", "ȫ�浿");
		tel.put("010-5687-9984", "��浿");
		tel.put("010-1234-4567", "�ڱ浿");
		
		group.put("����","010-3860-8667");
		group.put("����","010-5687-9984");
		group.put("����","010-1234-4567");
		
		addGroup("����","010-3547-5748","��ö��");
		
		System.out.println(group);
		System.out.println(tel);
		
		findtel();
		
		findName("��ö��");

	}
}

class nameSort implements Comparator<D07_PhoneBook>{

	@Override
	public int compare(D07_PhoneBook o1, D07_PhoneBook o2) {
		if(o1.tel.get(o1).compareTo(o2.tel.get(o2)) >  o2.tel.get(o2).compareTo(o1.tel.get(o1))) {
			return -1;
		}else if(o1.tel.get(o1).equals(o2.tel.get(02))) {
			return 0;
		}else {
			return 1;
		}
	}
}
