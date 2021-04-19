package Quiz;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.Map.Entry;



public class D07_PhoneBook2 {

	/*
		# HashMap을 이용해 전화번호부를 구현해보세요 
		
		1. 그룹/ 전화번호 / 이름을 저장해야한다 
		2. 그룹이름을 키값으로 넣으면 해당 그룹의 전화번호 목록이 나온다 
		3. 전화번호 목록에 전화번를 키값으로 넣으면 이름이 나온다 
		
		# 구현해야 할 메서드 
		
		1. 새로운 그룹을 추가하는 메서드 
		2. 존재하는 그룹에 새로운 전화번호를 등록하는 메서드 (그룹이 없다면 미분류 그룹에 저장)
		3. 등록된 모든 전화번호를 정보를 이름기준 내림차순으로 보여주는 메서드 
		4. 이름의 일부를 입력하면 일치하는 모든 정보가 출력되는 검색 메서드 
		5. 전화번호의 일부를 입력하면 일치하는 모든 전화번호가 출력되는 검색 메서드 
		
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
		
		phonebook.put("미분류", new HashMap<>());
		phonebook.put("가족", new HashMap<>());
		phonebook.put("친구", new HashMap<>());
		phonebook.put("직장", new HashMap<>());
		
		phonebook.get("가족").put("010-1234-1234","엄마");
	}
	
	public boolean addGroup(String groupName) {
		if(phonebook.containsKey(groupName)) {
			System.out.println("이미존재하는 그룹입니다 "+groupName);
			return false;
		}else {
			System.out.println("성공적으로 추가되었습니다"+ groupName);
			phonebook.put(groupName , new HashMap<>() );
			return true;
		}
	}
	
	public void printGroupList() {
		for(String groupName : phonebook.keySet()) {
			System.out.printf("####%s####\n",groupName);
		}
	}
	
	// phonebook : 여러그룹을 저장할수 있는 전체 전화번호부 인스턴스 
	// phonebook.keySet() : 그룹명들
	// phonebook.values() : 그룹이름을통해 키값으로 삼아 접근할수 있는 그룹인스턴스 
	
	public boolean addNumber(String groupName , String phoneNumber , String name) {
		
		for(HashMap<String,String> group : phonebook.values()) {
			if( group.containsKey(phoneNumber)) {
				System.out.println("이미 등록된번호입니다");
				return false;
			}
		}
		
		if(phonebook.containsKey(groupName)) {
			phonebook.get(groupName).put(phoneNumber, name);
		}else {
			phonebook.get("미분류").put(phoneNumber, name);
		}
		return true;
		
//		String result = phonebook.containsKey(groupName) ? 
//				phonebook.get(groupName).put(phoneNumber, name) :
//				phonebook.get("미분류").put(phoneNumber, name);
		
	}
	
	public void printPhoneBook() {
		for( String groupName : new TreeSet<>(phonebook.keySet())) {
			System.out.printf("----%s ---\n",groupName);
			
			HashMap<String,String> group = phonebook.get(groupName);
			
			// TreeSet의 두가지 생성자 
			//1. 정렬기준을 정하면서 인스턴스를 생성
			//2. 컬렉션을 전달 ( 정렬기준은 전달하는 컬렉션의 제네릭 타입 comparable을 사용)
			TreeSet<Entry<String,String>> sortedEntrySet =
					new TreeSet<> (new Comparator<Entry<String,String>>()  {
				
						public int compare(Entry<String,String> o1,Entry<String,String> o2) {
							// 이름기준으로 1차정렬후, 전화번호 기준으로 2차정렬
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
	
	// 4. 이름의 일부를 입력하면 일치하는 모든 정보가 출력되는 검색 메서드
	public void SearchByName(String keyword) {
		
		
		
		int count = 0;
		System.out.println("---검색결과 ---");
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
//		System.out.println("---검색결과 ---");
//		for (HashMap<String, String> group : phonebook.values()) {
//			for(Entry<String , String> entry : group.entrySet()) {
//				if(entry.getKey().contains(keyword)) {
//					System.out.printf(" %s : %s\n" , entry.getValue() , entry.getKey());
//					count++;
//				}
//			}
//		}
		System.out.printf("검색(%s) 결과 %d건 \n",keyword,count);
	}
	
	
	//5. 전화번호의 일부를 입력하면 일치하는 모든 전화번호가 출력되는 검색 메서드
//	public void SearchByNumber(String keyword) {
//		int count = 0;
//		System.out.println("---검색결과 ---");
//		for (HashMap<String, String> group : phonebook.values()) {
//		for (Entry<String, String> entry : group.entrySet()) {
//			if (entry.getKey().contains(keyword)) {
//				System.out.printf(" %s : %s\n", entry.getKey(), entry.getValue());
//				count++;
//			}
//		}
//		System.out.printf("검색 결과 %d건 \n",count);
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
		System.out.printf("검색(%s) 결과 %d건 \n",number_fragment,count);
	}
	
	public static void main(String[] args) {
		
		D07_PhoneBook2 book = new D07_PhoneBook2();
//		
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("그룹이름을 입력 :");
//			book.addGroup(sc.nextLine());
//			
//			book.printGroupList();
//		}
				
		book.addGroup("가족");
		book.addGroup("동호회");
		book.addGroup("취업반");
		
		book.printGroupList();

		book.addNumber(null, "123-1234-1234", "김동현");
		book.addNumber(null, "010-5675-1234", "추성훈");
		book.addNumber(null, "010-2354-1234", "이대호");
		book.addNumber(null, "010-1224-1234", "강호동");
		book.addNumber(null, "010-1234-1534", "추신수");
		book.addNumber(null, "010-1224-3548", "강호동");
		
		book.printPhoneBook();
		
		book.SearchByName("호");
		//book.SearchByNumber("010");
		book.SearchByPhoneNumber("1234");
	}
}
