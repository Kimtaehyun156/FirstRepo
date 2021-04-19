package Study;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class D09_Regex {

	
	/*
	 *		# Á¤±ÔÇ¥Çö½Ä(Regular Expression) 
	 * 		- ¹®ÀÚ¿­ÀÇ ÆĞÅÏÀ» Ç¥ÇöÇÏ´Â Ç¥Çö½Ä 
	 * 		- Æ¯Á¤ ÇÁ·Î±×·¡¹Ö ¾ğ¾î¿¡ Á¾¼ÓµÇÁö ¾Ê´Â´Ù
	 * 		- ÇÁ·Î±×·¡¸Ó°¡ ¿øÇÏ´Â ¹®ÀÚ¿­ ÆĞÅÏ°ú ÀÏÄ¡ÇÏ´ÂÁö °Ë»çÇÒ¶§ »ç¿ëÇÑ´Ù 
	 * 
	 *   	# Pattern Å¬·¡½º 
	 *   	- Á¤±ÔÇ¥Çö½ÄÀ» ´Ù·ç´Â Å¬·¡½º 
	 *   
	 *   	# Matcher Å¬·¡½º 
	 *   	- ÆĞÅÏ ÀÎ½ºÅÏ½º¸¦ ÀÌ¿ëÇÏ¿© ¹®ÀÚ¿­À» °Ë»çÇÒ ¶§ »ç¿ëÇÏ´Â Å¬·¡½º 
	 * 
	 */
	
	public static void main(String[] args) {
		
		// Pattern.matches(regex, input) : inputÀÌ regex¿¡ ¸ÅÄ¡µÇ´Â ¹®ÀÚ¿­ÀÎÁö¸¦ °Ë»çÇØÁÖ´Â ¸Ş¼­µå 
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		// []: ÇØ´çÀ§Ä¡ ÇÑ±ÛÀÚ¿¡ ¾î¶² ¹®ÀÚµéÀÌ ¿Ã¼ö ÀÖ´ÂÁö Á¤ÀÇÇÏ´Â Ç¥Çö½Ä
		System.out.println(Pattern.matches("s[lh]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh@]eep", "sheep"));
		System.out.println(Pattern.matches("s[lh@]eep", "s@eep"));
		
		
		/*
		  	[] ³»ºÎ¿¡ Á¤ÀÇÇÒ¼ö ÀÖ´Â °Íµé 
			
			1. [abc] : ÇØ´çÀÚ¸®¿¡ a ¶Ç´Â b ¶Ç´Â c¸¦ Çã¿ë 
			2. [^abc] : ÇØ´çÀÚ¸®¿¡ a b c¸¦ Á¦¿ÜÇÑ ¸ğµç°ÍÀ» Çã¿ë
			3. [a-z] : ÇØ´çÀÚ¸®¿¡ aºÎÅÍ z±îÁö ¸ğµÎÇã¿ë
			4. [&&] : ±³ÁıÇÕ
		*/
		System.out.println(Pattern.matches("s[^lh@]eep", "s!eep"));
		System.out.println(Pattern.matches("s[1-9]eep", "s1eep"));
		System.out.println(Pattern.matches("s[1-9a-z]eep", "s1eep"));
		System.out.println(Pattern.matches("s[a-d&&c-f]eep", "sceep"));
		
		Pattern instance = Pattern.compile("[0-9]@[0-9]");
		
		/*
		 *  ¿©·¯ ¹®ÀÚ¸¦ ³ªÅ¸³»´Â°Íµé 
		 *  1. .  : ¸ğµç¹®ÀÚ Çã¿ë  ¡Ø [] ¹Û¿¡ ½á¾ßÇÏ´Â ¸ğµç¹®ÀÚ 
		 *  2. \d : ¸ğµç ¼ıÀÚ Çã¿ë 
		 *  3. \D : ¼ıÀÚ¸¦ Á¦¿ÜÇÑ ¸ğµç°Í 
		 *  4. \s : ¸ğµç°ø¹é \t , \n , ' ' ,µî
		 *  5. \S : ¸ğµç°ø¹éÀ» Á¦¿ÜÇÑ ¸ğµç°Í 
		 *  6. \w : ÀÏ¹İÀûÀÎ ¹®ÀÚµéÀ» Çã¿ë [a-z A-Z 0-9 _ ]
		 *  7. \W : ÀÏ¹İÀûÀÎ ¹®ÀÚµéÀ» Á¦¿ÜÇÑ ¸ğµç°ÍÀ» Çã¿ë
		 */
		
		System.out.println(Pattern.matches("s.eep", "sheep")); 		// ¸ğµç¹®ÀÚ Çã¿ë
		System.out.println(Pattern.matches("s[.]eep", "s.eep"));	// .¸¸Çã¿ë
		System.out.println(Pattern.matches("s\\.eep", "s.eep"));	// .¸¸Çã¿ë
		System.out.println(Pattern.matches("s\\d.eep", "s1eep"));	// ¸ğµç ¼ıÀÚ Çã¿ë 
		System.out.println(Pattern.matches("\\D\\D\\D", "slp"));	// ¼ıÀÚ¸¦ Á¦¿ÜÇÑ ¸ğµç°Í Çã¿ë ÀÚ¸´¼ö¸¸Å­
		
		System.out.println(Pattern.matches("s\\seep", "s eep"));	// ¸ğµç °ø¹é Çã¿ë
		System.out.println(Pattern.matches("s\\seep", "saeep"));	// ¸ğµç °ø¹é Çã¿ë
		System.out.println(Pattern.matches("s\\seep", "s\teep"));	// ¸ğµç °ø¹é Çã¿ë
		System.out.println(Pattern.matches("s\\seep", "s\neep"));	// ¸ğµç °ø¹é Çã¿ë
		System.out.println(Pattern.matches("s\\seep", "s\reep"));	// ¸ğµç °ø¹é Çã¿ë
		System.out.println(Pattern.matches("s\\Seep", "s\reep"));	// °ø¹éÀ» Á¦¿ÜÇÑ ¸ğµç°Í Çã¿ë
		
		
		/*
		 * 	ÇØ´ç ÆĞÅÏÀÌ Àû¿ëµÉ ¹®ÀÚÀÇ °³¼ö¸¦Á¤ÀÇÇÏ´Â ¹æ¹ı 
		 * 	1. [ex]{n}: {}¾ÕÀÇ ÆĞÅÏÀÌ n°³ ÀÏÄ¡ÇØ¾ßÇÑ´Ù 
		 * 	2. [ex]{n,m} : {}¾ÕÀÇ ÆĞÅÏÀÌ ÃÖ¼Ò n°³ÀÌ»ó ÃÖ´ë m°³(Æ÷ÇÔ) ±îÁö ÀÏÄ¡ÇØ¾ßÇÑ´Ù 
		 *  ¡Ø Á¤±ÔÇ¥Çö½Ä¿¡ {n,m} Ã³·³ °ø¹éÀ» ³ÖÀ¸¸é ¾ÈµÈ´Ù. 
		 *  3. [ex]{n,} : {}¾ÕÀÇ ÆĞÅÏÀÌ ÃÖ¼Ò n°³ÀÌ»ó ÀÏÄ¡ÇØ¾ßÇÑ´Ù 
		 *  4.[ex]? : 0¹ø¶Ç´Â ÇÑ¹ø  ex°¡ ³ª¿ÍµµµÇ°í ¾È³ª¿Íµµ µÈ´Ù!
		 *  5.[ex]+ : ÃÖ¼Ò ÇÑ¹ø ÀÌ»ó 
		 *  6.[ex]* : 0¹ø ¶Ç´Â ¿©·¯¹ø 
		 */
		
		System.out.println(Pattern.matches("[\\D3-5]{5}\\.txt", "345!!.txt"));
		System.out.println(Pattern.matches("[\\D3-5]{2,5}\\.txt", "345!!.txt"));
		System.out.println(Pattern.matches("[°¡-ÆR]{2,}\\.txt", "¾È³ç.txt"));
		System.out.println(Pattern.matches("[°¡-ÆR]{2,}\\.txt", "¾È³çÇÏ¼¼¿ä.txt"));
		System.out.println(Pattern.matches("[°¡-ÆR]{2,}\\.txt", "hi.txt"));
		
		System.out.println(Pattern.matches(".{2,}\\.txt", "hi.txt"));
		
		String regex1 = String.format(".{%d,}\\.txt", 2);
		System.out.println(Pattern.matches(regex1, "abcd.txt"));
		
		System.out.println(Pattern.matches("[°¡-ÆR]?\\.txt", ".txt")); 
		System.out.println(Pattern.matches("[°¡-ÆR]?\\.txt", "ÇÑ.txt"));
		
		// ÀüÈ­¹øÈ£ Á¤±ÔÇ¥Çö½Ä  -¸¦ ½áµµµÇ°í ¾È½áµµ µÇ°í 
		System.out.println(Pattern.matches("0[0-9]{2}-?\\d{3,4}-?\\d{4}", "01012341234"));
		System.out.println(Pattern.matches("0[0-9]{2}-?\\d{3,4}-?\\d{4}", "0101231234"));
		System.out.println(Pattern.matches("0[0-9]{2}-?\\d{3,4}-?\\d{4}", "010-1234-1234"));
		System.out.println(Pattern.matches("0[0-9]{2}-?\\d{3,4}-?\\d{4}", "010-123-1234"));
		
		// ¿¬½À¹®Á¦ : ÀÚ¹Ù¿¡¼­ Çã¿ëÇÏ´Â º¯¼ö¸íÀ» °Ë»çÇÒ¼ö ÀÖ´Â Á¤±ÔÇ¥Çö½ÄÀ» ¸¸µé¾îº¸¼¼¿ä
		// ^ ½ÃÀÛÁöÁ¡
		// $ ³¡ÁöÁ¡
		// txt$´Â txt·Î ³¡³ª¾ßÇÔ 
		System.out.println("±èÅÂÇö:"+(Pattern.matches("^[\\D&&\\w&&\\S $°¡-ÆR][$_\\S&&\\w°¡-ÆR]*¤¾$", "_±èÅÂÇö¤¾")) );
		
		
		// 		Pattern.compile(regex)
		/*
		 * 		- Àü´ŞÇÑ Á¤±ÔÇ¥Çö½ÄÀ» ÇØ¼®ÇÏ¿© Pattern ÀÎ½ºÅÏ½º¸¦ »ı¼ºÇÏ°í ¹İÈ¯ÇÑ´Ù 
		 * 		
		 * 		# split(): ÄÄÆÄÀÏµÈ ÆĞÅÏ ÀÎ½ºÅÏ½º·Î split()À» ÁøÇàÇÑ´Ù 
		 * 
		 * 		# matcher() : Matchar ÀÎ½ºÅÏ½º¸¦ »ı¼ºÇÏ¿© ¹İÈ¯ÇÑ´Ù 
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
			System.out.println("Ã£Àº°Í : "+matcher.group());
			System.out.println("À§Ä¡ : "+matcher.start() + "ºÎÅÍ" + matcher.end() +"±îÁö");
		}
		
		
		
		
	}
}
