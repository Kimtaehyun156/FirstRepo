package Quiz;

public class B17_CountAlphabet2 {

	public static void main(String[] args) {

		String text ="Everything is alright";
		
		int[] count = new int[26];
		
		// #문자열을 쉽게 대문자 또는 소문자로 변환하기 
		text = text.toUpperCase(); // 다 대문자로 바꾸고 사용하겠다
		
		for(int i = 0; i< text.length(); ++i) {
			char ch = text.charAt(i);
			//System.out.println(ch);
			
			if( ch >= 'A' && ch <= 'z') {
				count[ch - 'A']++;
			}
		}
		
		for(int i = 0; i< 26; i++) {
			if(count[i] != 0) {
				
				System.out.println((char)(i + 'A') + " : " + count[i]);
			}
		}

	}

}
