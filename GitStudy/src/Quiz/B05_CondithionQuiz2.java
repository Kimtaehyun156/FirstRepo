package Quiz;

public class B05_CondithionQuiz2 {

	public static void main(String[] args) {

		/*
		 * [ 占쎈르筌띿쉸占� 鈺곌퀗援뷂옙�뻼占쎌뱽 筌띾슢諭억옙堉김퉪�똻苑�占쎌뒄 ]
		 * 
		 * 1. char占쎌굨 癰귨옙占쎈땾 a揶쏉옙 'q'占쎌굢占쎈뮉 'Q'占쎌뵬 占쎈르 true 2. char占쎌굨 癰귨옙占쎈땾 b揶쏉옙 �⑤벉媛싷옙�뵠占쎄돌 占쎄틙占쎌뵠 占쎈툡占쎈빜 占쎈르 true 3. char占쎌굨 癰귨옙占쎈땾
		 * c揶쏉옙 �눧紐꾩쁽('0' ~ '9')占쎌뵬 占쎈르 true 4. char占쎌굨 癰귨옙占쎈땾 d揶쏉옙 占쎌겫�눧紐꾩쁽(占쏙옙�눧紐꾩쁽 占쎌굢占쎈뮉 占쎈꺖�눧紐꾩쁽)占쎌뵬 占쎈르 true 5. char占쎌굨 癰귨옙占쎈땾
		 * e揶쏉옙 占쎈립疫뀐옙占쎌뵬 占쎈르 true 6. char占쎌굨 癰귨옙占쎈땾 f揶쏉옙 占쎌뵬癰귣챷堉깍옙�뵬 占쎈르 true   7. 占쎄텢占쎌뒠占쎌쁽揶쏉옙 占쎌뿯占쎌젾占쎈립 �눧紐꾩쁽占쎈였占쎌뵠 exit占쎌뵬 占쎈르 true
		 */
		
		// 1. char占쎌굨 癰귨옙占쎈땾 a揶쏉옙 'q'占쎌굢占쎈뮉 'Q'占쎌뵬 占쎈르 true
		char a ='q';
		System.out.println( a== 'q' || a == 'Q');
		
		// 2. char占쎌굨 癰귨옙占쎈땾 b揶쏉옙 �⑤벉媛싷옙�뵠占쎄돌 占쎄틙占쎌뵠 占쎈툡占쎈빜 占쎈르 true
		char b =' ';	
		System.out.println(!(b == ' ' || b == '	'));
		
		// 3. char占쎌굨 癰귨옙占쎈땾c揶쏉옙 �눧紐꾩쁽('0' ~ '9')占쎌뵬 占쎈르 true
		char c = 11;
		System.out.println((int)c >= 0 && (int)c <=9 );
		
		// 4.  char占쎌굨 癰귨옙占쎈땾 d揶쏉옙 占쎌겫�눧紐꾩쁽(占쏙옙�눧紐꾩쁽 占쎌굢占쎈뮉 占쎈꺖�눧紐꾩쁽)占쎌뵬 占쎈르 true
		char d ='Z'; //97~122(a~z) 65~90(A~B)
		System.out.println((int)d >= 97 && (int)d <=122  || (int)d >= 65 && (int)d <= 90  );
		
		// 5. char占쎌굨 癰귨옙占쎈땾 e揶쏉옙 占쎈립疫뀐옙占쎌뵬 占쎈르 true
		char e ='가'; //44032(揶쏉옙) 55203(占쎌삞)
		System.out.println((int)e >= 44032 &&  (int)e <= 55203);
		
		// 6. char占쎌굨 癰귨옙占쎈땾 f揶쏉옙 占쎌뵬癰귣챷堉깍옙�뵬 占쎈르 true   //30A0占쏙옙30FF  (12448~12543)
		char f ='다';
		System.out.println((int)f >= 12448 &&  (int)f <= 12543);
		
		// 7. 占쎄텢占쎌뒠占쎌쁽揶쏉옙 占쎌뿯占쎌젾占쎈립 �눧紐꾩쁽占쎈였占쎌뵠 exit占쎌뵬 占쎈르 true
		String user ="exit";
		System.out.println(user.equals("exit"));
	}

}
