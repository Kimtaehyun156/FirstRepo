package Study;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class D09_Regex {

	
	/*
	 *		# 정규표현식(Regular Expression) 
	 * 		- 문자열의 패턴을 표현하는 표현식 
	 * 		- 특정 프로그래밍 언어에 종속되지 않는다
	 * 		- 프로그래머가 원하는 문자열 패턴과 일치하는지 검사할때 사용한다 
	 * 
	 *   	# Pattern 클래스 
	 *   	- 정규표현식을 다루는 클래스 
	 *   
	 *   	# Matcher 클래스 
	 *   	- 패턴 인스턴스를 이용하여 문자열을 검사할 때 사용하는 클래스 
	 * 
	 */
	
	public static void main(String[] args) {
		
		// Pattern.matches(regex, input) : input이 regex에 매치되는 문자열인지를 검사해주는 메서드 
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		// []: 해당위치 한글자에 어떤 문자들이 올수 있는지 정의하는 표현식
		System.out.println(Pattern.matches("s[lh]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh@]eep", "sheep"));
		System.out.println(Pattern.matches("s[lh@]eep", "s@eep"));
		
		
		/*
		  	[] 내부에 정의할수 있는 것들 
			
			1. [abc] : 해당자리에 a 또는 b 또는 c를 허용 
			2. [^abc] : 해당자리에 a b c를 제외한 모든것을 허용
			3. [a-z] : 해당자리에 a부터 z까지 모두허용
			4. [&&] : 교집합
		*/
		System.out.println(Pattern.matches("s[^lh@]eep", "s!eep"));
		System.out.println(Pattern.matches("s[1-9]eep", "s1eep"));
		System.out.println(Pattern.matches("s[1-9a-z]eep", "s1eep"));
		System.out.println(Pattern.matches("s[a-d&&c-f]eep", "sceep"));
		
		Pattern instance = Pattern.compile("[0-9]@[0-9]");
		
		/*
		 *  여러 문자를 나타내는것들 
		 *  1. .  : 모든문자 허용  ※ [] 밖에 써야하는 모든문자 
		 *  2. \d : 모든 숫자 허용 
		 *  3. \D : 숫자를 제외한 모든것 
		 *  4. \s : 모든공백 \t , \n , ' ' ,등
		 *  5. \S : 모든공백을 제외한 모든것 
		 *  6. \w : 일반적인 문자들을 허용 [a-z A-Z 0-9 _ ]
		 *  7. \W : 일반적인 문자들을 제외한 모든것을 허용
		 */
		
		System.out.println(Pattern.matches("s.eep", "sheep")); 		// 모든문자 허용
		System.out.println(Pattern.matches("s[.]eep", "s.eep"));	// .만허용
		System.out.println(Pattern.matches("s\\.eep", "s.eep"));	// .만허용
		System.out.println(Pattern.matches("s\\d.eep", "s1eep"));	// 모든 숫자 허용 
		System.out.println(Pattern.matches("\\D\\D\\D", "slp"));	// 숫자를 제외한 모든것 허용 자릿수만큼
		
		System.out.println(Pattern.matches("s\\seep", "s eep"));	// 모든 공백 허용
		System.out.println(Pattern.matches("s\\seep", "saeep"));	// 모든 공백 허용
		System.out.println(Pattern.matches("s\\seep", "s\teep"));	// 모든 공백 허용
		System.out.println(Pattern.matches("s\\seep", "s\neep"));	// 모든 공백 허용
		System.out.println(Pattern.matches("s\\seep", "s\reep"));	// 모든 공백 허용
		System.out.println(Pattern.matches("s\\Seep", "s\reep"));	// 공백을 제외한 모든것 허용
		
		
		/*
		 * 	해당 패턴이 적용될 문자의 개수를정의하는 방법 
		 * 	1. [ex]{n}: {}앞의 패턴이 n개 일치해야한다 
		 * 	2. [ex]{n,m} : {}앞의 패턴이 최소 n개이상 최대 m개(포함) 까지 일치해야한다 
		 *  ※ 정규표현식에 {n,m} 처럼 공백을 넣으면 안된다. 
		 *  3. [ex]{n,} : {}앞의 패턴이 최소 n개이상 일치해야한다 
		 *  4.[ex]? : 0번또는 한번  ex가 나와도되고 안나와도 된다!
		 *  5.[ex]+ : 최소 한번 이상 
		 *  6.[ex]* : 0번 또는 여러번 
		 */
		
		System.out.println(Pattern.matches("[\\D3-5]{5}\\.txt", "345!!.txt"));
		System.out.println(Pattern.matches("[\\D3-5]{2,5}\\.txt", "345!!.txt"));
		System.out.println(Pattern.matches("[가-힣]{2,}\\.txt", "안녕.txt"));
		System.out.println(Pattern.matches("[가-힣]{2,}\\.txt", "안녕하세요.txt"));
		System.out.println(Pattern.matches("[가-힣]{2,}\\.txt", "hi.txt"));
		
		System.out.println(Pattern.matches(".{2,}\\.txt", "hi.txt"));
		
		String regex1 = String.format(".{%d,}\\.txt", 2);
		System.out.println(Pattern.matches(regex1, "abcd.txt"));
		
		System.out.println(Pattern.matches("[가-힣]?\\.txt", ".txt")); 
		System.out.println(Pattern.matches("[가-힣]?\\.txt", "한.txt"));
		
		// 전화번호 정규표현식  -를 써도되고 안써도 되고 
		System.out.println(Pattern.matches("0[0-9]{2}-?\\d{3,4}-?\\d{4}", "01012341234"));
		System.out.println(Pattern.matches("0[0-9]{2}-?\\d{3,4}-?\\d{4}", "0101231234"));
		System.out.println(Pattern.matches("0[0-9]{2}-?\\d{3,4}-?\\d{4}", "010-1234-1234"));
		System.out.println(Pattern.matches("0[0-9]{2}-?\\d{3,4}-?\\d{4}", "010-123-1234"));
		
		// 연습문제 : 자바에서 허용하는 변수명을 검사할수 있는 정규표현식을 만들어보세요
		// ^ 시작지점
		// $ 끝지점
		// txt$는 txt로 끝나야함 
		System.out.println("김태현:"+(Pattern.matches("^[\\D&&\\w&&\\S $가-힣][$_\\S&&\\w가-힣]*ㅎ$", "_김태현ㅎ")) );
		
		
		// 		Pattern.compile(regex)
		/*
		 * 		- 전달한 정규표현식을 해석하여 Pattern 인스턴스를 생성하고 반환한다 
		 * 		
		 * 		# split(): 컴파일된 패턴 인스턴스로 split()을 진행한다 
		 * 
		 * 		# matcher() : Matchar 인스턴스를 생성하여 반환한다 
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
			System.out.println("찾은것 : "+matcher.group());
			System.out.println("위치 : "+matcher.start() + "부터" + matcher.end() +"까지");
		}
		
		
		
		
	}
}
