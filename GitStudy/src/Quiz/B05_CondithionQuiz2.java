package Quiz;

public class B05_CondithionQuiz2 {

	public static void main(String[] args) {

		/*
		 * [ �븣留욎� 議곌굔�떇�쓣 留뚮뱾�뼱蹂댁꽭�슂 ]
		 * 
		 * 1. char�삎 蹂��닔 a媛� 'q'�삉�뒗 'Q'�씪 �븣 true 2. char�삎 蹂��닔 b媛� 怨듬갚�씠�굹 �꺆�씠 �븘�땺 �븣 true 3. char�삎 蹂��닔
		 * c媛� 臾몄옄('0' ~ '9')�씪 �븣 true 4. char�삎 蹂��닔 d媛� �쁺臾몄옄(��臾몄옄 �삉�뒗 �냼臾몄옄)�씪 �븣 true 5. char�삎 蹂��닔
		 * e媛� �븳湲��씪 �븣 true 6. char�삎 蹂��닔 f媛� �씪蹂몄뼱�씪 �븣 true   7. �궗�슜�옄媛� �엯�젰�븳 臾몄옄�뿴�씠 exit�씪 �븣 true
		 */
		
		// 1. char�삎 蹂��닔 a媛� 'q'�삉�뒗 'Q'�씪 �븣 true
		char a ='q';
		System.out.println( a== 'q' || a == 'Q');
		
		// 2. char�삎 蹂��닔 b媛� 怨듬갚�씠�굹 �꺆�씠 �븘�땺 �븣 true
		char b =' ';	
		System.out.println(!(b == ' ' || b == '	'));
		
		// 3. char�삎 蹂��닔c媛� 臾몄옄('0' ~ '9')�씪 �븣 true
		char c = 11;
		System.out.println((int)c >= 0 && (int)c <=9 );
		
		// 4.  char�삎 蹂��닔 d媛� �쁺臾몄옄(��臾몄옄 �삉�뒗 �냼臾몄옄)�씪 �븣 true
		char d ='Z'; //97~122(a~z) 65~90(A~B)
		System.out.println((int)d >= 97 && (int)d <=122  || (int)d >= 65 && (int)d <= 90  );
		
		// 5. char�삎 蹂��닔 e媛� �븳湲��씪 �븣 true
		char e ='가'; //44032(媛�) 55203(�옡)
		System.out.println((int)e >= 44032 &&  (int)e <= 55203);
		
		// 6. char�삎 蹂��닔 f媛� �씪蹂몄뼱�씪 �븣 true   //30A0��30FF  (12448~12543)
		char f ='가';
		System.out.println((int)f >= 12448 &&  (int)f <= 12543);
		
		// 7. �궗�슜�옄媛� �엯�젰�븳 臾몄옄�뿴�씠 exit�씪 �븣 true
		String user ="exit";
		System.out.println(user.equals("exit"));
	}

}
