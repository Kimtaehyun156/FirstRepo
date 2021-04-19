package Quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

public class PhoneBook {

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
	
	static HashMap<String , HashMap<String,String>> group = new HashMap<>();
	static HashMap<String , String> phonenum = new HashMap<>();
	
	static HashMap<String , HashMap<String,String>> degroup = new HashMap<>();
	static HashMap<String , String> dephonenum = new HashMap<>();
	
	//1. 그룹/ 전화번호 / 이름을 저장해야한다 
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
	
	//2. 그룹이름을 키값으로 넣으면 해당 그룹의 전화번호 목록이 나온다 
	public static void groupInput(String gro) {
		
		if(group.containsKey(gro)) {
			System.out.println(group.get(gro).keySet());
		}
	}
	
	//3. 전화번호 목록에 전화번호를 키값으로 넣으면 이름이 나온다 
	public static void phonenumInput(String num) {
		if(phonenum.containsKey(num)) {
			System.out.println(phonenum.get(num));
		}
	}
	
	
	//3. 등록된 모든 전화번호를 정보를 이름기준 내림차순으로 보여주는 메서드
	
	public static void allPhonePrint() {
		
		System.out.println("저장된 모든 전화번호 출력");
		ArrayList<String> arr = new ArrayList<>();
		arr.addAll(phonenum.keySet());
		System.out.println(arr);
		//Collections.sort(arr , new nameSort());
	}
	
	
	// 4.이름의 일부를 입력하면 일치하는 모든 정보가 출력되는 검색 메서드
	
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
		
		addGroup("가족","010-3860-8667","홍길동");
		addGroup("친구","010-1234-5678","고길동");
		
		
		//System.out.println(group);
		
		// 그룹을 넣으면 번호나옴
//		groupInput("친구");
//		
//		// 번호를입력하면 이름을 출력 
//		phonenumInput("010-3860-8667");
//		
//		//모든 전화번호 출력 
//		allPhonePrint();
		
		//이름을 찾아서 모든정보 출력 
		findName("기니동");
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
