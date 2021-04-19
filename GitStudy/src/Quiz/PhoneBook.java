package Quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

public class PhoneBook {

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
	
	static HashMap<String , HashMap<String,String>> group = new HashMap<>();
	static HashMap<String , String> phonenum = new HashMap<>();
	
	static HashMap<String , HashMap<String,String>> degroup = new HashMap<>();
	static HashMap<String , String> dephonenum = new HashMap<>();
	
	//1. �׷�/ ��ȭ��ȣ / �̸��� �����ؾ��Ѵ� 
	public static void addGroup(String gro ,String num , String name) {	
		HashMap<String , HashMap<String,String>> group2 = new HashMap<>();
		HashMap<String , String> phonenum2 = new HashMap<>();
		
		if(group.keySet().equals(gro)){
			phonenum2.put(num, name);
			group2.put(gro, phonenum2);
			dephonenum.put(num, name);
			degroup.put(gro, phonenum2);
		}
		
		phonenum2.put(num, name);
		group2.put(gro, phonenum2);
		phonenum.put(num, name);
		group.put(gro, phonenum2);
		
	}
	
	//2. �׷��̸��� Ű������ ������ �ش� �׷��� ��ȭ��ȣ ����� ���´� 
	public static void groupInput(String gro) {
		
		if(group.containsKey(gro)) {
			System.out.println(group.get(gro).keySet());
		}
	}
	
	//3. ��ȭ��ȣ ��Ͽ� ��ȭ��ȣ�� Ű������ ������ �̸��� ���´� 
	public static void phonenumInput(String num) {
		if(phonenum.containsKey(num)) {
			System.out.println(phonenum.get(num));
		}
	}
	
	
	//3. ��ϵ� ��� ��ȭ��ȣ�� ������ �̸����� ������������ �����ִ� �޼���
	
	public static void allPhonePrint() {
		
		System.out.println("����� ��� ��ȭ��ȣ ���");
		ArrayList<String> arr = new ArrayList<>();
		arr.addAll(phonenum.keySet());
		System.out.println(arr);
		//Collections.sort(arr , new nameSort());
	}
	
	
	// 4.�̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �˻� �޼���
	
	public static void findName(String findname) {
		
//		for(Entry<String, HashMap<String, String>> entry : group.entrySet()) {
//			String key = ((Entry<String, HashMap<String, String>>) group).getKey();
//			Object value = ((Entry<String, HashMap<String, String>>) group).getValue();
//			
//			System.out.println( key + "=" + value);
//				
//		}
		
		for(Entry<String , String> entry : phonenum.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();
			
			String val = (String)value;
			if(val.charAt(0) == findname.charAt(0)) {
				System.out.println( key );
				System.out.println( value );	
			}else if(val.charAt(2) == findname.charAt(2)) {
				System.out.println( key );
				System.out.println( value );	
			}else if(val.charAt(1) == findname.charAt(1)) {
				System.out.println( key );
				System.out.println( value );	
			}
			
					
		}


	}
		
	
	public static void main(String[] args) {
		
		addGroup("����","010-3860-8667","ȫ�浿");
		addGroup("ģ��","010-1234-5678","��浿");
		
		
		//System.out.println(group);
		
		// �׷��� ������ ��ȣ����
//		groupInput("ģ��");
//		
//		// ��ȣ���Է��ϸ� �̸��� ��� 
//		phonenumInput("010-3860-8667");
//		
//		//��� ��ȭ��ȣ ��� 
//		allPhonePrint();
		
		//�̸��� ã�Ƽ� ������� ��� 
		findName("��ϵ�");
	}
}

class nameSort implements Comparator<PhoneBook>{
	@Override
	public int compare(PhoneBook o1, PhoneBook o2) {
		if(o1.phonenum.get(o1).compareTo(o2.phonenum.get(o2)) >  o2.phonenum.get(o2).compareTo(o1.phonenum.get(o1))) {
			return -1;
		}else if(o1.phonenum.get(o1).equals(o2.phonenum.get(02))) {
			return 0;
		}else {
			return 1;
		}
	}
}
