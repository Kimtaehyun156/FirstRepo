package Study;

public class B14_StringBuilder {

   //  문자열을 다시 조립하는 기능이 모여있는 클래스 
   
   public static void main(String[] args) {
       
      // ex : 문자열을 거꾸로 뒤집어서 생성해보기
      
      String text = "Spring Framework";
      
      System.out.println(text);
      
      // String 클래스는 누적연산이 매우 느린편이다 
      // String 클래스로 잦은 연산을 하는 것은 비효율적이다.
      // System.currentTimeMillis() ; 현재 시스템 시간을 밀리세컨드로 가져옴
      
      long  start_time = System.currentTimeMillis();
      
      
      String reversed_text ="";
      
      for(int i =0; i < text.length(); ++i) {
         reversed_text += text.charAt(text.length()-1-i);
      }
      
      System.out.println(reversed_text);
      
      long  taken_time = System.currentTimeMillis()-start_time;
      System.out.println("제작에 걸린시간 : "+ taken_time);
      
      StringBuilder reversed_text2 = new StringBuilder();
      
      for(int i =0; i < text.length(); ++i) {
         char ch = text.charAt(text.length()-1-i);
         reversed_text2.append(ch);
      }
      
      System.out.println(reversed_text2.toString());
 
   }

}