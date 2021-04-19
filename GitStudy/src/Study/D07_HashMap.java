package Study;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class D07_HashMap {

	/*
	 		# Map 
	 		- Key 와 Value가 한 쌍을 이루는 자료구조 
	 		- Key 값을 통해 Value의 접근할 수 있다 
	 		- Key는 중복을 허용하지 않는다
	 */
	
	
	public static void main(String[] args) {
		HashMap<String,Integer> record = new HashMap<>();
		
		// put(Key,Value);
		record.put("홍길동", 50000);
		record.put("고길동", 35000);
		record.put("박길동", 90000);
		record.put("홍길동", 5000);  // 이미 존재하는 키값에 put하면 값을 수정한다 !
		
		//연습문제 홍길동에 저장되어있는 수자를 3000 증가해보세요 
		System.out.println("원래 홍길동 " +record.get("홍길동"));
		record.put("홍길동", record.get("홍길동")+3000);
		System.out.println("추가 홍길동 " +record.get("홍길동"));
		
		// 이미 존재하는 키값에 put하면 값을수정
		Integer previous_value = record.put("홍길동", 3500);
		System.out.println("이전의 값" + previous_value);
		System.out.println("지금들어가있는값 " + record.get("홍길동"));
		
		// get(key) : key를 이용해 value를 꺼냄 
		System.out.println(record.get("박길동"));
		
		
		HashMap<String,Object> person = new HashMap<>();
		person.put("이름", "홍길동");
		person.put("나이", 35);
		person.put("좋아하는것", new String[] {"놀기","잠자기","먹기"});
		person.put("싫어하는것", new HashSet<>());
	
		((HashSet)person.get("싫어하는것")).add("공부");
		
		HashSet<String> dislike = ((HashSet)person.get("싫어하는것"));
		
		dislike.add("야근");
		dislike.add("출근");
		dislike.add("출퇴근");
		
		System.out.println(person.get("이름"));
		System.out.println(person.get("나이"));
		System.out.println(((String[])person.get("좋아하는것"))[0]);
		System.out.println(person.get("싫어하는것"));
		
		
		/*
		 *  반복문으로  Map을 활용하기 
		 *  - keySet() : key들로만 이루어진 Set을 반환한다 
		 *  - values() : values들로만 이루어진 Set을반환
		 *  - entrySet() : entry<key,value>로 이루어진 set을 반환합니다 
		 */
		
		for(String key : person.keySet()) {
			Object value = person.get(key);
			
			// A instanceof B : A가 B의 인스턴스인지를 판별한다 . 업캐스팅 상태에서도 판별된다 
			if (value instanceof String[]) {
				System.out.print("[");
				
				String[] arr = (String[]) value;
				
				for(int i =0; i < arr.length; ++i) {
					System.out.print(arr[i] + ",");
				}
				System.out.println("]");
				
			}else {	
				System.out.println(key + ":" + person.get(key)); // 키값출력
			}
			
		}
		
		
		// values()
		System.out.println("values: " + person.values());
		
		
		// # entrySet()
		for(Entry<String, Object> entry : person.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();
			
			System.out.println( key + "=" + value);
		}
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(3, "hello");
		map.put(99, "you");
		map.put(35, "see");
		
		System.out.println(map.get(3));
		
		// containsKey(key) : 맵에 해당 키가 포함되어 있는지 검사한다
		System.out.println("키중에 15가있나요?"+ map.containsKey(15));
		System.out.println("키중에 35가있나요?"+ map.containsKey(35));
		
		// containsValue(value) : 맵에 해당 값이 포함되어 있는지 검사한다 
		System.out.println("값중에 hello가 있나요 "+ map.containsValue("hello"));
		System.out.println("값중에 Hello가 있나요 "+ map.containsValue("Hello"));
	}
	
	
}
