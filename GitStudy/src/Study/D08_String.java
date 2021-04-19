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
		
		// split(delimiter(구분문자)) 문자열을 원하는 기준으로 자른후 문자열 배열로 반환
		String[] splited_fruits = fruits.split("/");
		System.out.println(Arrays.toString(splited_fruits));
		
		for( String fruit : splited_fruits) {
			System.out.println(fruit);
		}
		
		// join(delim , 이어붙이고 싶은거) : 뒤에 나오는 문자열들을 모두 delim으로 이어 붙인다 
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
		
		//substring(start : start부터 마지막까지 
		//substring(start,end) : start부터 end미만까지 문자열을 잘라서 반환 
		System.out.println("Hello, everyone!".substring(3));
		System.out.println("Hello, everyone!".substring(0,5));
		System.out.println("Hello, everyone!".substring(5));
		
		// replace() : 문자열을 치환할떄 사용한다 
		String emails ="abc123@naver.com ,abc123@naver.com  , abc123@naver.com ";
		String replaced1 = emails.replace('a','A');
		String replaced2 = emails.replace("@naver.com","@gamil.com");
		System.out.println(replaced1);
		System.out.println(replaced2);
		
		// format(format , value) : 서식을 이용해 원하는 문자열을 생성한다 
		String text = String.format("오늘은 %c요일 입니다",'수');
		System.out.println(text);
		
		//contains(seq) ; 문자열에 해당 문자열이 포함되어있는지 검사한다 
		System.out.println("pineapple".contains("apple"));
		
		//startsWith(seq) : 문자열이 해당 문자열로 시작하는지 검사한다 
		System.out.println("pineapple".startsWith("pine"));
		
		//endsWith(seq) : 문자열이 해당문자열로 끝나는지 검사한다 
		System.out.println("펭귄.jpeg".endsWith(".jpeg"));
		System.out.println("resource/image/펭귄.jpeg".startsWith("resource/image/"));
		System.out.println("resource/image/펭귄.jpeg".endsWith(".jpeg"));
		
		//getBytes(charset = 설정안하면 디폴트값이 들어감) : 문자열을 byte[]로 변환한다 (데이터 전송준비)
		// byte[]를 나뉠 때와 같은 인코딩 타입을 사용해야한다 
		String data = "오늘도 좋은 하루를 보내세요";
		//System.out.println(data.getBytes());
		
		byte[] byte_arr = null;
		try {
			byte_arr = data.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			System.err.println("지원하지 않은 인코딩 익셉션");
			System.exit(0);
		}
		
		for( byte b : byte_arr) {
			System.out.printf("%d", b);
		}
		System.out.println();
		
		// 생성자를 이용해 byte[]을 다시 문자열로 합칠수 있다 (전달받은데이터를 변환)
		System.out.println(new String(byte_arr));
		
		//trim(): 문자열 바깥쪽의 공백을 제거해준다 
		String str1 = "   abc123 ";
		String str2 = "abc123    ";
		String str3 = " hello    java    ";
		
		System.out.println(str1.equals(str2));
		
		str1 = str1.trim();
		str2 = str2.trim();
		System.out.println(str1.equals(str2));
		System.out.println(str3.trim());
		
		//toUpperCase() : 문자열을 모두 대문자로 변환한 새로운 인스턴스 반환  
		System.out.println(str1.toUpperCase());
		
		//toLowerCase() : 문자열을 모두 소문자로 반환한 새로운 인스턴스 반환 
		System.out.println(str2.toLowerCase().trim().substring(1,3));
		
		
		// 문자열 비교 전에 대문자 또는 소문자로 통일한 후 비교하기 
		str1 = "Java";
		str2 = "java";
		
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		
		System.out.println(str1.equals(str2));
		
		// equalsIgnoreCase()  :  대소문자 상관없는 equals ()
		str1 = "Hello Java";
		str2 = "hEllo java";
		
		System.out.println("equals : " +str1.equals(str2));
		System.out.println("equalsIgnoreCase : " +str1.equalsIgnoreCase(str2));
		
		// getChars( start , end ,담을곳 , 담을곳 시작지점 ) : char[] 에 문자열의 원하는 부분을 담을수 있다 
		char[] buffer = new char[20];

		// fill 모든것을 채울떄 쓰는 메서드
		Arrays.fill(buffer, '#');
//		for(int i =0; i < buffer.length; ++i) {
//			buffer[i] = '#';
//		}
		
		"Hello ,world!!!".getChars(7, 12, buffer, 10);
		System.out.println(buffer);
		
	}
}
