package Study;

public class B06_If {

   public static void main(String[] args) {
 
      /*
       *       # if¹® 
       *       - () ¾È¿¡ °ªÀÌ trueÀÏ‹š {}¾ÈÀÇ ³»¿ëÀ» ½ÇÇàÇÑ´Ù
       *          - () ¾È¿¡ °ªÀÌ falseÀÏ‹š {}¾ÈÀÇ ³»¿ëÀ» ½ÇÇà ¾ÈÇÑ´Ù 
       *      - {} ¾È¿¡ µé¾î°¥ ³»¿ëÀÌ ´Ü ÇÑÁÙÀÌ¶ó¸é {}¸¦ »ý·«ÇÒ¼ö ÀÖ´Ù
       *
       *      # else if¹®
       *     - À§¿¡ ÀÖ´Â if¹®ÀÌ ½ÇÇàµÇÁö¾Ê¾Ò´Ù¸é if¹®Ã³·³ µ¿ÀÛÇÑ´Ù
       *     - else if ´Â ´Üµ¶À¸·Î »ç¿ëÇÒ¼ö ¾ø´Ù 
       *     - else if´Â ¿©·¯¹ø »ç¿ëÇÒ ¼ö ÀÖ´Ù
       *  
       *     # else¹® 
       *     - À§¿¡ ÀÖ´Â if , elseif  ¸ðµÎ ½ÇÇàµÇÁö ¾Ê¾Ò´Ù¸é {} ¾È¿¡ ³»¿ëÀ» ¹«Á¶°Ç ½ÇÇàÇÕ´Ï´Ù 
       *     - if ¹Ù·Î ´ÙÀ½¿¡ ¾µ ¼öµµ ÀÖ´Ù 
       *     ¡Ø else °¡ ºÙ¾î ÀÖ´Â Á¶°ÇÀýÀº ÃÖ¼Ò ÇÑ¹øÀº ½ÇÇàµÈ´Ù 
       */
      
      int a = -8;
      
      if(a == 5) {
         System.out.println("hello!");
         System.out.println("hello2!");
      } else if( a > 0 ) {
         System.out.println("Nice to meet you!");
      } else if ( a >-10) {
         System.out.println("Greeting!");
      } else if (a > -20) {
         System.out.println("Good to see you!!");
      }
      
      char ch = '°¡';
      
      if( ch >= '°¡' && ch <='ÆR') {
         System.out.println("ch¿¡ µé¾îÀÖ´Â °ªÀº ÇÑ±Û ÀÔ´Ï´Ù");
      } else {
         System.out.println("ch¿¡ µé¾îÀÖ´Â °ªÀº ÇÑ±ÛÀÌ ¾Æ´Õ´Ï´Ù ");
      }
      
      System.out.println("ÇÁ·Î±×·¥ÀÌ ³¡³µ½À´Ï´Ù!");
   }

}