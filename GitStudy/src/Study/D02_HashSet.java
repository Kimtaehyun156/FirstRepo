package Study;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_HashSet {

	/*
	 		# Set 
	 		- 집합을 구현해놓은 클래스 
	 		- 요소로 같은값이 들어오는것을 허용하지않는다 (중복이 안됨) 
	 		
	 		# Hash
	 		- 어떤 값을 넣었을 때 전혀 예측할 수 없는 값이 생성되어야하는 알고리즘 
	 		- 같은 값을 넣었을 때는 항상 일정한 값이 나와야한다 
	 		- 유사한 값을 넣었을 때 예측하기 힘든 전혀 다른 값이 나온다 
	 		- 생성된 해쉬값으로 원래 값을 찾는 것이 불가능해야 한다 
	 		- 다시 원래 값으로 돌아갈 수도 없는 단방향성 알고리즘 
	 		- 중복 체크시에 뛰어난 성능을 보인다
	 		- Hash를 사용하는 알고리즘은 순서(인덱스)가 없다 
	 		
	 		* MD5 (약함) 비교적
	 		hello 		-> 5D41402ABC4B2A76B9719D911017C592
	 		hello1 		-> 203AD5FFA1D7C650AD681FDFF3965CD2
	 		hello+공백	-> F814893777BCC2295FFF05F00E508DA6

	 		* SHA256 (썜) 비교적 
	 		hello 		-> 2CF24DBA5FB0A30E26E83B2AC5B9E29E1B161E5C1FA7425E73043362938B9824
	 */
	
	
	public static void main(String[] args) {
		HashSet<Integer> num = new HashSet<>();
		num.add(100);
		num.add(100);
		num.add(100);
		num.add(100);
		
		System.out.println(num);
		
		// 같은 컬렉션이기 떄문에 ArrayList에 있는 메서드들이 여기에도 존재한다 // HashSet은 인덱스가 없다 
		if(num.remove(100)) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		System.out.println(num);
		
		// 이름에 해쉬가 들어간 알고리즘들은 순서가 없다 
		// 순서가 없으면 인덱스도 없다 
		HashSet<String> eng = new HashSet<>();
		eng.add("apple");
		eng.add("airplane");
		eng.add("bio");
		eng.add("cat");
		eng.add("drama");
		eng.add("zebra");
		eng.add("elepthant");
		
		System.out.println(eng);
		
		// Set은 인덱스가 없기 떄문에 for-each만 사용할수 있다 
		for ( String word : eng) {
			System.out.println(word);
		}
		
		// 컬렉션 끼리는 변환이 자유롭다!
		// Set의 내용을 정렬해야한다면 List 로 변환하여 사용할수 있다
		// List의 내용을 중복을 제거한 목록이 필요하다면 Set으로 변환하여 사용할수 있다 
		ArrayList<String> eng_list = new ArrayList<>(eng);
		Collections.sort(eng_list);
		System.out.println(eng_list);
		
		
		ArrayList<Integer> numbers2 = new ArrayList<>();
		
		// 컬렉션들을 배열로 변환하기
		//1
		Object[] arr1 = eng.toArray();
		
		//2
		String[] arr2 = new String[eng.size()]; // 2번방법 미리 만들어둔 배열을전달 
		eng.toArray(arr2);
		
		System.out.println("Object[]로 변환된 english :" + Arrays.toString(arr1));
		System.out.println("배열로 변환된 english :"+Arrays.toString(arr2));
		
		
		// 제네릭을 요구하는 클래스ㅔ 제네릭을 사용하지 않은경우 모든 타입을 넣을수 있다 
		// - 모든타입이 오브젝트 타입으로 업캐스팅되어 저장된다 
		// - 해당값을 다시 사용하기 위해서는 다운캐스팅이 필요해서 번거롭다 
		ArrayList numbers3 = new ArrayList();
		numbers3.add("홍길동");
		numbers3.add('a');
		
		String str = (String)numbers3.get(0); // 자바문법상으로는 아무 문제가없음 
		System.out.println("str :" + str);
		
		
		
		numbers2.add(1);
		numbers2.add(1);
		numbers2.add(1);
		numbers2.add(3);
		numbers2.add(6);
		numbers2.add(6);
		numbers2.add(13);
		
		System.out.println(numbers2);
		System.out.println(new HashSet<>(numbers2));
		
		
		//conains() : 컬레션에 해당 요소가 포함되어있는지 여부를 반환해줌 
		System.out.println(eng.contains("apple"));
		System.out.println(eng.contains("banana"));
		
		System.out.println(eng_list.contains("apple"));
		System.out.println(eng_list.contains("banana"));
		
		//containsAll(collection) : 전달한 컬렉션이 모두 포함되어있는지를 검사 
		Set<String> subset = new HashSet<>();
		List<String> sublist = new ArrayList<>();
		
		subset.add("zebra");
		subset.add("drama");
		subset.add("tiger");
		
		sublist.add("apple");
		sublist.add("apple");
		sublist.add("apple");

		System.out.println("englist에는 subset의 모든내용이 들어있나요?"+eng.containsAll(subset));
		System.out.println("englist에는 sublist의 모든내용이 들어있나요?"+eng.containsAll(sublist));
		
		
		// addAll(Collection) : 전달한 컬렉션의 내용을 모두추가  (추가 성공여부를 반환);
		// 새로 추가된것이 있으면 true를 반환 
		// 이미 모두 포함된 경우에는 false를 반환 
		System.out.println(eng.addAll(subset));
		System.out.println(eng.addAll(subset));
		
		// removeAll(Collection) : 전달한 컬렉션과 같은 내용을 모두 제거 
		// 지워진게 있으면 true 없으면 false이다 
		System.out.println(eng_list.removeAll(subset));
		System.out.println(eng_list);
		
		// retainAll(Collection) : 전달한 컬렉션과 일치한 내용만 남는다 
		// 변한것이 있으면 true 없으면 false
		System.out.println(eng.retainAll(subset));
		System.out.println(eng);
		
		// isEmpty() 해당컬렉션이 비어있으면 true 비어있지않으면 false
		System.out.println(eng.isEmpty());
		System.out.println(!eng.isEmpty());
		
		
	}
	
}
