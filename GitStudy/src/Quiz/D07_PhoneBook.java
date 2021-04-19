package Quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class D07_PhoneBook {
	
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
	static HashMap<String,String> group = new HashMap<>();
	static HashMap<String,String> tel = new HashMap<>();
	// 미분류 그룹 
	static HashMap<String,String> groupless = new HashMap<>();
	static HashMap<String,String> telless = new HashMap<>();
	
	// 1. 새로운 그룹을 추가하는 메서드 
	public static void addGroup(String addgroup ,String addtel, String addname) {
		group.put(addgroup, addtel);
		tel.put(addtel, addname);
	}
	
	// 2. 존재하는 그룹에 새로운 전화번호를 등록하는 메서드 (그룹이 없다면 미분류 그룹에 저장)
	public static void Modify(String addgroup ,String addtel, String addname) {
		if(group.get(addgroup).equals(addgroup)) {
			group.put(addgroup, addtel);
			tel.put(addtel, addname);
		}else {
			groupless.put(addgroup, addtel);
			telless.put(addtel, addname)
		}
	}
	
	//3. 등록된 모든 전화번호를 정보를 이름기준 내림차순으로 보여주는 메서드
	public static void findtel() {
		System.out.println("저장된 모든 전화번호 출력");
		ArrayList<String> arr = new ArrayList<>();
		arr.addAll(tel.values());
		Collections.sort(arr);
		//System.out.println(arr);
		
		for(String key : tel.keySet()) {
			System.out.println(key);
		}
	}
	
	//4. 이름의 일부를 입력하면 일치하는 모든 정보가 출력되는 검색 메서드 
	public static void findName(String name) {
		String name1 = tel.get(key)
		
		if( tel.containsValue(name)) {
			System.out.println("이름이있습니다");
		}else if( tel.values() {
			
		}
	}

	

	public static void main(String[] args) {
		

		tel.put("010-3860-8667", "홍길동");
		tel.put("010-5687-9984", "고길동");
		tel.put("010-1234-4567", "박길동");
		
		group.put("강남","010-3860-8667");
		group.put("종로","010-5687-9984");
		group.put("용인","010-1234-4567");
		
		addGroup("성남","010-3547-5748","김철수");
		
		System.out.println(group);
		System.out.println(tel);
		
		findtel();
		
		findName("김철수");

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
