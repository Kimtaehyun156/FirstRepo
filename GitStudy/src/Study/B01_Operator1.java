package Study;


public class B01_Operator1 {

   public static void main(String[] args) {
      
      /*
             # 연산자 (Operator)
                - 계산할 때 사용하는 것
                - + , - , * , / ...
       */
      
      // 산술 연산자 
      int a = 10 , b =7;
      double c = 7.0; 
      
      System.out.println("a + b = "+(a+b));
      System.out.println("a - b = "+(a-b));
      System.out.println("a * b = "+(a*b));
      
      // 정수끼리 나누면 몫만 나온다 
      System.out.println("a / b = "+(a/b));
      
      // 정수와 실수를 나누면 정확한 값을 계산한다.
      System.out.println("a / c = "+(a/c));
      System.out.println("a / (double)b = "+(a/(double)b));
      System.out.println("a / (float)b = "+(a/(float)b));
      
      // % = 나머지 
      System.out.println("a % b = "+(a%c));
      
      System.out.println(" a의 3제곱 :" + Math.pow(a, 3));
      // System.out.println(" a의 3제곱? ^ :" + a ^ 3);
      System.out.println(" 49의 제곱근 :" + Math.sqrt(49));
      System.out.println(" 50의 제곱근 :" + Math.sqrt(50));
      System.out.println(" -25의 절대값 :" + Math.abs(-25));
      
      // # Math.round 함수는 소수 첫째자리에 반올림
      /*
             Math.round()는 소수 첫쨰자리에서만 반올림 할수 있다 . 
             반올림하고 싶은 자리를 소수 첫쨰 자리로 만들만큼 곱한후 
             다시 나누는 방식을 통해 원하는 자릿수에서 반올림 할수 있다
       */
      
      System.out.println("반올림 소수 첫쨰자리  : "+ Math.round(3.335));
      System.out.println("반올림 소수 셋쨰자리  : "+ Math.round(3.335*100) /100.0);
      System.out.println("반올림 : "+ Math.round(3.665));
      
      System.out.println("올림 : " + Math.ceil(1.001));
      System.out.println("내림 : " + Math.floor(1.999));
      
      
      System.out.println(" 더 큰 숫자 구하기 : " + Math.max(1900, 1500));
      System.out.println(" 더 작은 숫자 구하기 : " + Math.min(1900, 1500));
   
      
      // # 비트 연산 
      // & , | , ^ , >> , << 
      
      // a = 10  , b = 7 
      //  a= 1010 , b =0111
      
      //  a 1010
      //  b 0111
      //--------------
      //    0010 -> 2
      System.out.println("a & b = " + (a & b));      // AND 연산 (두개가 참일떄 참 )
      
      
      //  a 1010
      //  b 0111
      //--------------
      //    1111 =  15 
      System.out.println(a | b);      // OR 연산  (두개중에 하나라 참이면 참)
      
      //  a 1010
      //  b 0111
      //--------------
      //    1101  = 13 
      System.out.println(a ^ b);      // XOR 연산 (두개가 서로달라야 참)
      
      
      // 0000001000
      // 0000100000 = 32
      System.out.println(8 << 2);      // SHIFT 연산 <<쪽으로 해당칸만큼 밀어버림
      
      // 0000001000
      // 0000000010 = 2
      System.out.println(8 >> 2);      // SHIFT 연산  >> 쪽으로 해당칸만큼 밀어버림 
   }

}
