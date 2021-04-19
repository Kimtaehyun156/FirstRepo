package Study;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class D07_HashMap {

	/*
	 		# Map 
	 		- Key �� Value�� �� ���� �̷�� �ڷᱸ�� 
	 		- Key ���� ���� Value�� ������ �� �ִ� 
	 		- Key�� �ߺ��� ������� �ʴ´�
	 */
	
	
	public static void main(String[] args) {
		HashMap<String,Integer> record = new HashMap<>();
		
		// put(Key,Value);
		record.put("ȫ�浿", 50000);
		record.put("��浿", 35000);
		record.put("�ڱ浿", 90000);
		record.put("ȫ�浿", 5000);  // �̹� �����ϴ� Ű���� put�ϸ� ���� �����Ѵ� !
		
		//�������� ȫ�浿�� ����Ǿ��ִ� ���ڸ� 3000 �����غ����� 
		System.out.println("���� ȫ�浿 " +record.get("ȫ�浿"));
		record.put("ȫ�浿", record.get("ȫ�浿")+3000);
		System.out.println("�߰� ȫ�浿 " +record.get("ȫ�浿"));
		
		// �̹� �����ϴ� Ű���� put�ϸ� ��������
		Integer previous_value = record.put("ȫ�浿", 3500);
		System.out.println("������ ��" + previous_value);
		System.out.println("���ݵ��ִ°� " + record.get("ȫ�浿"));
		
		// get(key) : key�� �̿��� value�� ���� 
		System.out.println(record.get("�ڱ浿"));
		
		
		HashMap<String,Object> person = new HashMap<>();
		person.put("�̸�", "ȫ�浿");
		person.put("����", 35);
		person.put("�����ϴ°�", new String[] {"���","���ڱ�","�Ա�"});
		person.put("�Ⱦ��ϴ°�", new HashSet<>());
	
		((HashSet)person.get("�Ⱦ��ϴ°�")).add("����");
		
		HashSet<String> dislike = ((HashSet)person.get("�Ⱦ��ϴ°�"));
		
		dislike.add("�߱�");
		dislike.add("���");
		dislike.add("�����");
		
		System.out.println(person.get("�̸�"));
		System.out.println(person.get("����"));
		System.out.println(((String[])person.get("�����ϴ°�"))[0]);
		System.out.println(person.get("�Ⱦ��ϴ°�"));
		
		
		/*
		 *  �ݺ�������  Map�� Ȱ���ϱ� 
		 *  - keySet() : key��θ� �̷���� Set�� ��ȯ�Ѵ� 
		 *  - values() : values��θ� �̷���� Set����ȯ
		 *  - entrySet() : entry<key,value>�� �̷���� set�� ��ȯ�մϴ� 
		 */
		
		for(String key : person.keySet()) {
			Object value = person.get(key);
			
			// A instanceof B : A�� B�� �ν��Ͻ������� �Ǻ��Ѵ� . ��ĳ���� ���¿����� �Ǻ��ȴ� 
			if (value instanceof String[]) {
				System.out.print("[");
				
				String[] arr = (String[]) value;
				
				for(int i =0; i < arr.length; ++i) {
					System.out.print(arr[i] + ",");
				}
				System.out.println("]");
				
			}else {	
				System.out.println(key + ":" + person.get(key)); // Ű�����
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
		
		// containsKey(key) : �ʿ� �ش� Ű�� ���ԵǾ� �ִ��� �˻��Ѵ�
		System.out.println("Ű�߿� 15���ֳ���?"+ map.containsKey(15));
		System.out.println("Ű�߿� 35���ֳ���?"+ map.containsKey(35));
		
		// containsValue(value) : �ʿ� �ش� ���� ���ԵǾ� �ִ��� �˻��Ѵ� 
		System.out.println("���߿� hello�� �ֳ��� "+ map.containsValue("hello"));
		System.out.println("���߿� Hello�� �ֳ��� "+ map.containsValue("Hello"));
	}
	
	
}
