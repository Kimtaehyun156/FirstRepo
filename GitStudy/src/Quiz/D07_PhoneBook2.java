package Quiz;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.Map.Entry;



public class D07_PhoneBook2 {

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
	
//	public static class PhoneInfo{
//		String name;
//		String phone_number;
//		String address;
//		String profile_image_path;
//	}
//	
	HashMap<String , HashMap<String, String>> phonebook;
	
	public D07_PhoneBook2() {
		phonebook =new HashMap<>();
		
		phonebook.put("�̺з�", new HashMap<>());
		phonebook.put("����", new HashMap<>());
		phonebook.put("ģ��", new HashMap<>());
		phonebook.put("����", new HashMap<>());
		
		phonebook.get("����").put("010-1234-1234","����");
	}
	
	public boolean addGroup(String groupName) {
		if(phonebook.containsKey(groupName)) {
			System.out.println("�̹������ϴ� �׷��Դϴ� "+groupName);
			return false;
		}else {
			System.out.println("���������� �߰��Ǿ����ϴ�"+ groupName);
			phonebook.put(groupName , new HashMap<>() );
			return true;
		}
	}
	
	public void printGroupList() {
		for(String groupName : phonebook.keySet()) {
			System.out.printf("####%s####\n",groupName);
		}
	}
	
	// phonebook : �����׷��� �����Ҽ� �ִ� ��ü ��ȭ��ȣ�� �ν��Ͻ� 
	// phonebook.keySet() : �׷���
	// phonebook.values() : �׷��̸������� Ű������ ��� �����Ҽ� �ִ� �׷��ν��Ͻ� 
	
	public boolean addNumber(String groupName , String phoneNumber , String name) {
		
		for(HashMap<String,String> group : phonebook.values()) {
			if( group.containsKey(phoneNumber)) {
				System.out.println("�̹� ��ϵȹ�ȣ�Դϴ�");
				return false;
			}
		}
		
		if(phonebook.containsKey(groupName)) {
			phonebook.get(groupName).put(phoneNumber, name);
		}else {
			phonebook.get("�̺з�").put(phoneNumber, name);
		}
		return true;
		
//		String result = phonebook.containsKey(groupName) ? 
//				phonebook.get(groupName).put(phoneNumber, name) :
//				phonebook.get("�̺з�").put(phoneNumber, name);
		
	}
	
	public void printPhoneBook() {
		for( String groupName : new TreeSet<>(phonebook.keySet())) {
			System.out.printf("----%s ---\n",groupName);
			
			HashMap<String,String> group = phonebook.get(groupName);
			
			// TreeSet�� �ΰ��� ������ 
			//1. ���ı����� ���ϸ鼭 �ν��Ͻ��� ����
			//2. �÷����� ���� ( ���ı����� �����ϴ� �÷����� ���׸� Ÿ�� comparable�� ���)
			TreeSet<Entry<String,String>> sortedEntrySet =
					new TreeSet<> (new Comparator<Entry<String,String>>()  {
				
						public int compare(Entry<String,String> o1,Entry<String,String> o2) {
							// �̸��������� 1��������, ��ȭ��ȣ �������� 2������
							int value_diff = o1.getValue().compareTo(o2.getValue());
							
							if(value_diff == 0 ) {
								return o1.getKey().compareTo(o2.getKey());
							}else {
								return value_diff;
							}
						}
					});
			
			sortedEntrySet.addAll(group.entrySet());
			for(Entry<String,String> entry : sortedEntrySet) {
				System.out.printf("%s : %s \n" ,entry.getValue() , entry.getKey());
			}
		}
	}
	
	// 4. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �˻� �޼���
	public void SearchByName(String keyword) {
		
		
		
		int count = 0;
		System.out.println("---�˻���� ---");
		for (HashMap<String, String> group : phonebook.values()) {
			for(String phoneNumber : group.keySet()) {
				String name = group.get(phoneNumber);
				if(name.contains(keyword)) {
					System.out.printf("%s : %s \n",name , phoneNumber);
					count++;
				}
			}
		}
		
		
		
//		int count = 0;
//		System.out.println("---�˻���� ---");
//		for (HashMap<String, String> group : phonebook.values()) {
//			for(Entry<String , String> entry : group.entrySet()) {
//				if(entry.getKey().contains(keyword)) {
//					System.out.printf(" %s : %s\n" , entry.getValue() , entry.getKey());
//					count++;
//				}
//			}
//		}
		System.out.printf("�˻�(%s) ��� %d�� \n",keyword,count);
	}
	
	
	//5. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ��ȭ��ȣ�� ��µǴ� �˻� �޼���
//	public void SearchByNumber(String keyword) {
//		int count = 0;
//		System.out.println("---�˻���� ---");
//		for (HashMap<String, String> group : phonebook.values()) {
//		for (Entry<String, String> entry : group.entrySet()) {
//			if (entry.getKey().contains(keyword)) {
//				System.out.printf(" %s : %s\n", entry.getKey(), entry.getValue());
//				count++;
//			}
//		}
//		System.out.printf("�˻� ��� %d�� \n",count);
//		}
//	}
	
	public void SearchByPhoneNumber(String number_fragment) {
		int count=0;
		for(HashMap<String,String> group : phonebook.values()) {
			for(String phoneNumber : group.keySet()) {
				if(phoneNumber.contains(number_fragment)) {
					System.out.printf("%s  : %s \n", group.get(phoneNumber),phoneNumber);
					count++;
				}
			}
		}
		System.out.printf("�˻�(%s) ��� %d�� \n",number_fragment,count);
	}
	
	public static void main(String[] args) {
		
		D07_PhoneBook2 book = new D07_PhoneBook2();
//		
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("�׷��̸��� �Է� :");
//			book.addGroup(sc.nextLine());
//			
//			book.printGroupList();
//		}
				
		book.addGroup("����");
		book.addGroup("��ȣȸ");
		book.addGroup("�����");
		
		book.printGroupList();

		book.addNumber(null, "123-1234-1234", "�赿��");
		book.addNumber(null, "010-5675-1234", "�߼���");
		book.addNumber(null, "010-2354-1234", "�̴�ȣ");
		book.addNumber(null, "010-1224-1234", "��ȣ��");
		book.addNumber(null, "010-1234-1534", "�߽ż�");
		book.addNumber(null, "010-1224-3548", "��ȣ��");
		
		book.printPhoneBook();
		
		book.SearchByName("ȣ");
		//book.SearchByNumber("010");
		book.SearchByPhoneNumber("1234");
	}
}
