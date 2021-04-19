package Quiz;

public class B17_CountAlphabet2 {

	public static void main(String[] args) {

		String text ="Everything is alright";
		
		int[] count = new int[26];
		
		// #���ڿ��� ���� �빮�� �Ǵ� �ҹ��ڷ� ��ȯ�ϱ� 
		text = text.toUpperCase(); // �� �빮�ڷ� �ٲٰ� ����ϰڴ�
		
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
