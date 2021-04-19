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
	 		- ������ �����س��� Ŭ���� 
	 		- ��ҷ� �������� �����°��� ��������ʴ´� (�ߺ��� �ȵ�) 
	 		
	 		# Hash
	 		- � ���� �־��� �� ���� ������ �� ���� ���� �����Ǿ���ϴ� �˰��� 
	 		- ���� ���� �־��� ���� �׻� ������ ���� ���;��Ѵ� 
	 		- ������ ���� �־��� �� �����ϱ� ���� ���� �ٸ� ���� ���´� 
	 		- ������ �ؽ������� ���� ���� ã�� ���� �Ұ����ؾ� �Ѵ� 
	 		- �ٽ� ���� ������ ���ư� ���� ���� �ܹ��⼺ �˰��� 
	 		- �ߺ� üũ�ÿ� �پ ������ ���δ�
	 		- Hash�� ����ϴ� �˰����� ����(�ε���)�� ���� 
	 		
	 		* MD5 (����) ����
	 		hello 		-> 5D41402ABC4B2A76B9719D911017C592
	 		hello1 		-> 203AD5FFA1D7C650AD681FDFF3965CD2
	 		hello+����	-> F814893777BCC2295FFF05F00E508DA6

	 		* SHA256 (��) ���� 
	 		hello 		-> 2CF24DBA5FB0A30E26E83B2AC5B9E29E1B161E5C1FA7425E73043362938B9824
	 */
	
	
	public static void main(String[] args) {
		HashSet<Integer> num = new HashSet<>();
		num.add(100);
		num.add(100);
		num.add(100);
		num.add(100);
		
		System.out.println(num);
		
		// ���� �÷����̱� ������ ArrayList�� �ִ� �޼������ ���⿡�� �����Ѵ� // HashSet�� �ε����� ���� 
		if(num.remove(100)) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		
		System.out.println(num);
		
		// �̸��� �ؽ��� �� �˰������ ������ ���� 
		// ������ ������ �ε����� ���� 
		HashSet<String> eng = new HashSet<>();
		eng.add("apple");
		eng.add("airplane");
		eng.add("bio");
		eng.add("cat");
		eng.add("drama");
		eng.add("zebra");
		eng.add("elepthant");
		
		System.out.println(eng);
		
		// Set�� �ε����� ���� ������ for-each�� ����Ҽ� �ִ� 
		for ( String word : eng) {
			System.out.println(word);
		}
		
		// �÷��� ������ ��ȯ�� �����Ӵ�!
		// Set�� ������ �����ؾ��Ѵٸ� List �� ��ȯ�Ͽ� ����Ҽ� �ִ�
		// List�� ������ �ߺ��� ������ ����� �ʿ��ϴٸ� Set���� ��ȯ�Ͽ� ����Ҽ� �ִ� 
		ArrayList<String> eng_list = new ArrayList<>(eng);
		Collections.sort(eng_list);
		System.out.println(eng_list);
		
		
		ArrayList<Integer> numbers2 = new ArrayList<>();
		
		// �÷��ǵ��� �迭�� ��ȯ�ϱ�
		//1
		Object[] arr1 = eng.toArray();
		
		//2
		String[] arr2 = new String[eng.size()]; // 2����� �̸� ������ �迭������ 
		eng.toArray(arr2);
		
		System.out.println("Object[]�� ��ȯ�� english :" + Arrays.toString(arr1));
		System.out.println("�迭�� ��ȯ�� english :"+Arrays.toString(arr2));
		
		
		// ���׸��� �䱸�ϴ� Ŭ������ ���׸��� ������� ������� ��� Ÿ���� ������ �ִ� 
		// - ���Ÿ���� ������Ʈ Ÿ������ ��ĳ���õǾ� ����ȴ� 
		// - �ش簪�� �ٽ� ����ϱ� ���ؼ��� �ٿ�ĳ������ �ʿ��ؼ� ���ŷӴ� 
		ArrayList numbers3 = new ArrayList();
		numbers3.add("ȫ�浿");
		numbers3.add('a');
		
		String str = (String)numbers3.get(0); // �ڹٹ��������δ� �ƹ� ���������� 
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
		
		
		//conains() : �÷��ǿ� �ش� ��Ұ� ���ԵǾ��ִ��� ���θ� ��ȯ���� 
		System.out.println(eng.contains("apple"));
		System.out.println(eng.contains("banana"));
		
		System.out.println(eng_list.contains("apple"));
		System.out.println(eng_list.contains("banana"));
		
		//containsAll(collection) : ������ �÷����� ��� ���ԵǾ��ִ����� �˻� 
		Set<String> subset = new HashSet<>();
		List<String> sublist = new ArrayList<>();
		
		subset.add("zebra");
		subset.add("drama");
		subset.add("tiger");
		
		sublist.add("apple");
		sublist.add("apple");
		sublist.add("apple");

		System.out.println("englist���� subset�� ��系���� ����ֳ���?"+eng.containsAll(subset));
		System.out.println("englist���� sublist�� ��系���� ����ֳ���?"+eng.containsAll(sublist));
		
		
		// addAll(Collection) : ������ �÷����� ������ ����߰�  (�߰� �������θ� ��ȯ);
		// ���� �߰��Ȱ��� ������ true�� ��ȯ 
		// �̹� ��� ���Ե� ��쿡�� false�� ��ȯ 
		System.out.println(eng.addAll(subset));
		System.out.println(eng.addAll(subset));
		
		// removeAll(Collection) : ������ �÷��ǰ� ���� ������ ��� ���� 
		// �������� ������ true ������ false�̴� 
		System.out.println(eng_list.removeAll(subset));
		System.out.println(eng_list);
		
		// retainAll(Collection) : ������ �÷��ǰ� ��ġ�� ���븸 ���´� 
		// ���Ѱ��� ������ true ������ false
		System.out.println(eng.retainAll(subset));
		System.out.println(eng);
		
		// isEmpty() �ش��÷����� ��������� true ������������� false
		System.out.println(eng.isEmpty());
		System.out.println(!eng.isEmpty());
		
		
	}
	
}
