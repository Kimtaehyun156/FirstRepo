package Study;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashSet;

public class D08_String {
	
	/*
	 *		
	 */
	
	public static void main(String[] args) {
		String fruits = "apple/banana/orange/kiwi/pineapple";
		
		// split(delimiter(���й���)) ���ڿ��� ���ϴ� �������� �ڸ��� ���ڿ� �迭�� ��ȯ
		String[] splited_fruits = fruits.split("/");
		System.out.println(Arrays.toString(splited_fruits));
		
		for( String fruit : splited_fruits) {
			System.out.println(fruit);
		}
		
		// join(delim , �̾���̰� ������) : �ڿ� ������ ���ڿ����� ��� delim���� �̾� ���δ� 
		String join_result1 = String.join("..", splited_fruits);
		String join_result2 = String.join("-", "Java","is","cool");
		String join_result3 = String.join(",",splited_fruits);
		
		HashSet<StringBuilder> set = new HashSet<>();
		
		set.add(new StringBuilder("Hello"));
		set.add(new StringBuilder("my name is"));
		set.add(new StringBuilder("John Doe"));
		
		String join_result4 = String.join("--",set);
		
		System.out.println(join_result1);
		System.out.println(join_result2);
		System.out.println(join_result3);
		System.out.println(join_result4);
		
		//substring(start : start���� ���������� 
		//substring(start,end) : start���� end�̸����� ���ڿ��� �߶� ��ȯ 
		System.out.println("Hello, everyone!".substring(3));
		System.out.println("Hello, everyone!".substring(0,5));
		System.out.println("Hello, everyone!".substring(5));
		
		// replace() : ���ڿ��� ġȯ�ҋ� ����Ѵ� 
		String emails ="abc123@naver.com ,abc123@naver.com  , abc123@naver.com ";
		String replaced1 = emails.replace('a','A');
		String replaced2 = emails.replace("@naver.com","@gamil.com");
		System.out.println(replaced1);
		System.out.println(replaced2);
		
		// format(format , value) : ������ �̿��� ���ϴ� ���ڿ��� �����Ѵ� 
		String text = String.format("������ %c���� �Դϴ�",'��');
		System.out.println(text);
		
		//contains(seq) ; ���ڿ��� �ش� ���ڿ��� ���ԵǾ��ִ��� �˻��Ѵ� 
		System.out.println("pineapple".contains("apple"));
		
		//startsWith(seq) : ���ڿ��� �ش� ���ڿ��� �����ϴ��� �˻��Ѵ� 
		System.out.println("pineapple".startsWith("pine"));
		
		//endsWith(seq) : ���ڿ��� �ش繮�ڿ��� �������� �˻��Ѵ� 
		System.out.println("���.jpeg".endsWith(".jpeg"));
		System.out.println("resource/image/���.jpeg".startsWith("resource/image/"));
		System.out.println("resource/image/���.jpeg".endsWith(".jpeg"));
		
		//getBytes(charset = �������ϸ� ����Ʈ���� ��) : ���ڿ��� byte[]�� ��ȯ�Ѵ� (������ �����غ�)
		// byte[]�� ���� ���� ���� ���ڵ� Ÿ���� ����ؾ��Ѵ� 
		String data = "���õ� ���� �Ϸ縦 ��������";
		//System.out.println(data.getBytes());
		
		byte[] byte_arr = null;
		try {
			byte_arr = data.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			System.err.println("�������� ���� ���ڵ� �ͼ���");
			System.exit(0);
		}
		
		for( byte b : byte_arr) {
			System.out.printf("%d", b);
		}
		System.out.println();
		
		// �����ڸ� �̿��� byte[]�� �ٽ� ���ڿ��� ��ĥ�� �ִ� (���޹��������͸� ��ȯ)
		System.out.println(new String(byte_arr));
		
		//trim(): ���ڿ� �ٱ����� ������ �������ش� 
		String str1 = "   abc123 ";
		String str2 = "abc123    ";
		String str3 = " hello    java    ";
		
		System.out.println(str1.equals(str2));
		
		str1 = str1.trim();
		str2 = str2.trim();
		System.out.println(str1.equals(str2));
		System.out.println(str3.trim());
		
		//toUpperCase() : ���ڿ��� ��� �빮�ڷ� ��ȯ�� ���ο� �ν��Ͻ� ��ȯ  
		System.out.println(str1.toUpperCase());
		
		//toLowerCase() : ���ڿ��� ��� �ҹ��ڷ� ��ȯ�� ���ο� �ν��Ͻ� ��ȯ 
		System.out.println(str2.toLowerCase().trim().substring(1,3));
		
		
		// ���ڿ� �� ���� �빮�� �Ǵ� �ҹ��ڷ� ������ �� ���ϱ� 
		str1 = "Java";
		str2 = "java";
		
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		
		System.out.println(str1.equals(str2));
		
		// equalsIgnoreCase()  :  ��ҹ��� ������� equals ()
		str1 = "Hello Java";
		str2 = "hEllo java";
		
		System.out.println("equals : " +str1.equals(str2));
		System.out.println("equalsIgnoreCase : " +str1.equalsIgnoreCase(str2));
		
		// getChars( start , end ,������ , ������ �������� ) : char[] �� ���ڿ��� ���ϴ� �κ��� ������ �ִ� 
		char[] buffer = new char[20];

		// fill ������ ä� ���� �޼���
		Arrays.fill(buffer, '#');
//		for(int i =0; i < buffer.length; ++i) {
//			buffer[i] = '#';
//		}
		
		"Hello ,world!!!".getChars(7, 12, buffer, 10);
		System.out.println(buffer);
		
	}
}
