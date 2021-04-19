package Study;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class D09_Regex {

	
	/*
	 *		# ����ǥ����(Regular Expression) 
	 * 		- ���ڿ��� ������ ǥ���ϴ� ǥ���� 
	 * 		- Ư�� ���α׷��� �� ���ӵ��� �ʴ´�
	 * 		- ���α׷��Ӱ� ���ϴ� ���ڿ� ���ϰ� ��ġ�ϴ��� �˻��Ҷ� ����Ѵ� 
	 * 
	 *   	# Pattern Ŭ���� 
	 *   	- ����ǥ������ �ٷ�� Ŭ���� 
	 *   
	 *   	# Matcher Ŭ���� 
	 *   	- ���� �ν��Ͻ��� �̿��Ͽ� ���ڿ��� �˻��� �� ����ϴ� Ŭ���� 
	 * 
	 */
	
	public static void main(String[] args) {
		
		// Pattern.matches(regex, input) : input�� regex�� ��ġ�Ǵ� ���ڿ������� �˻����ִ� �޼��� 
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		// []: �ش���ġ �ѱ��ڿ� � ���ڵ��� �ü� �ִ��� �����ϴ� ǥ����
		System.out.println(Pattern.matches("s[lh]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh@]eep", "sheep"));
		System.out.println(Pattern.matches("s[lh@]eep", "s@eep"));
		
		
		/*
		  	[] ���ο� �����Ҽ� �ִ� �͵� 
			
			1. [abc] : �ش��ڸ��� a �Ǵ� b �Ǵ� c�� ��� 
			2. [^abc] : �ش��ڸ��� a b c�� ������ ������ ���
			3. [a-z] : �ش��ڸ��� a���� z���� ������
			4. [&&] : ������
		*/
		System.out.println(Pattern.matches("s[^lh@]eep", "s!eep"));
		System.out.println(Pattern.matches("s[1-9]eep", "s1eep"));
		System.out.println(Pattern.matches("s[1-9a-z]eep", "s1eep"));
		System.out.println(Pattern.matches("s[a-d&&c-f]eep", "sceep"));
		
		Pattern instance = Pattern.compile("[0-9]@[0-9]");
		
		/*
		 *  ���� ���ڸ� ��Ÿ���°͵� 
		 *  1. .  : ��繮�� ���  �� [] �ۿ� ����ϴ� ��繮�� 
		 *  2. \d : ��� ���� ��� 
		 *  3. \D : ���ڸ� ������ ���� 
		 *  4. \s : ������ \t , \n , ' ' ,��
		 *  5. \S : �������� ������ ���� 
		 *  6. \w : �Ϲ����� ���ڵ��� ��� [a-z A-Z 0-9 _ ]
		 *  7. \W : �Ϲ����� ���ڵ��� ������ ������ ���
		 */
		
		System.out.println(Pattern.matches("s.eep", "sheep")); 		// ��繮�� ���
		System.out.println(Pattern.matches("s[.]eep", "s.eep"));	// .�����
		System.out.println(Pattern.matches("s\\.eep", "s.eep"));	// .�����
		System.out.println(Pattern.matches("s\\d.eep", "s1eep"));	// ��� ���� ��� 
		System.out.println(Pattern.matches("\\D\\D\\D", "slp"));	// ���ڸ� ������ ���� ��� �ڸ�����ŭ
		
		System.out.println(Pattern.matches("s\\seep", "s eep"));	// ��� ���� ���
		System.out.println(Pattern.matches("s\\seep", "saeep"));	// ��� ���� ���
		System.out.println(Pattern.matches("s\\seep", "s\teep"));	// ��� ���� ���
		System.out.println(Pattern.matches("s\\seep", "s\neep"));	// ��� ���� ���
		System.out.println(Pattern.matches("s\\seep", "s\reep"));	// ��� ���� ���
		System.out.println(Pattern.matches("s\\Seep", "s\reep"));	// ������ ������ ���� ���
		
		
		/*
		 * 	�ش� ������ ����� ������ �����������ϴ� ��� 
		 * 	1. [ex]{n}: {}���� ������ n�� ��ġ�ؾ��Ѵ� 
		 * 	2. [ex]{n,m} : {}���� ������ �ּ� n���̻� �ִ� m��(����) ���� ��ġ�ؾ��Ѵ� 
		 *  �� ����ǥ���Ŀ� {n,m} ó�� ������ ������ �ȵȴ�. 
		 *  3. [ex]{n,} : {}���� ������ �ּ� n���̻� ��ġ�ؾ��Ѵ� 
		 *  4.[ex]? : 0���Ǵ� �ѹ�  ex�� ���͵��ǰ� �ȳ��͵� �ȴ�!
		 *  5.[ex]+ : �ּ� �ѹ� �̻� 
		 *  6.[ex]* : 0�� �Ǵ� ������ 
		 */
		
		System.out.println(Pattern.matches("[\\D3-5]{5}\\.txt", "345!!.txt"));
		System.out.println(Pattern.matches("[\\D3-5]{2,5}\\.txt", "345!!.txt"));
		System.out.println(Pattern.matches("[��-�R]{2,}\\.txt", "�ȳ�.txt"));
		System.out.println(Pattern.matches("[��-�R]{2,}\\.txt", "�ȳ��ϼ���.txt"));
		System.out.println(Pattern.matches("[��-�R]{2,}\\.txt", "hi.txt"));
		
		System.out.println(Pattern.matches(".{2,}\\.txt", "hi.txt"));
		
		String regex1 = String.format(".{%d,}\\.txt", 2);
		System.out.println(Pattern.matches(regex1, "abcd.txt"));
		
		System.out.println(Pattern.matches("[��-�R]?\\.txt", ".txt")); 
		System.out.println(Pattern.matches("[��-�R]?\\.txt", "��.txt"));
		
		// ��ȭ��ȣ ����ǥ����  -�� �ᵵ�ǰ� �Ƚᵵ �ǰ� 
		System.out.println(Pattern.matches("0[0-9]{2}-?\\d{3,4}-?\\d{4}", "01012341234"));
		System.out.println(Pattern.matches("0[0-9]{2}-?\\d{3,4}-?\\d{4}", "0101231234"));
		System.out.println(Pattern.matches("0[0-9]{2}-?\\d{3,4}-?\\d{4}", "010-1234-1234"));
		System.out.println(Pattern.matches("0[0-9]{2}-?\\d{3,4}-?\\d{4}", "010-123-1234"));
		
		// �������� : �ڹٿ��� ����ϴ� �������� �˻��Ҽ� �ִ� ����ǥ������ ��������
		// ^ ��������
		// $ ������
		// txt$�� txt�� �������� 
		System.out.println("������:"+(Pattern.matches("^[\\D&&\\w&&\\S $��-�R][$_\\S&&\\w��-�R]*��$", "_��������")) );
		
		
		// 		Pattern.compile(regex)
		/*
		 * 		- ������ ����ǥ������ �ؼ��Ͽ� Pattern �ν��Ͻ��� �����ϰ� ��ȯ�Ѵ� 
		 * 		
		 * 		# split(): �����ϵ� ���� �ν��Ͻ��� split()�� �����Ѵ� 
		 * 
		 * 		# matcher() : Matchar �ν��Ͻ��� �����Ͽ� ��ȯ�Ѵ� 
		 * 	 
		 */
		
		String fruits_text = "apple/banana/orange/grape/peach/mango/redapple/pineapple";
		
		Pattern regex = Pattern.compile("/");
		
		String [] fruits = regex.split(fruits_text);
		
		System.out.println(Arrays.toString(fruits));
		
		for( String fru : fruits) {
			System.out.println(fru);
		}
		
		Pattern regex2 = Pattern.compile("apple");
		
		Matcher matcher = regex2.matcher(fruits_text);
		
		while(matcher.find()) {
			System.out.println("ã���� : "+matcher.group());
			System.out.println("��ġ : "+matcher.start() + "����" + matcher.end() +"����");
		}
		
		
		
		
	}
}
