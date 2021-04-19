package Quiz;

import java.util.Arrays;

public class C01_FunctionQuiz2 {

   
   /*
          # 다음의 함수를 정의하고 올바르게 동작하는지 테스트 해보세요 2
           
          1. 최대값을 매개변수로 전달 받으면 0부터 최대값 미만의 모든 값을 포함하는 int 배열을 생성하여 반환하는 range함수를 만들어보세요
           
           ex) range(10) 의 결과 [0.1.2.3.4.5.6
           
          2. 최소값과 최대값을 매개변수로 받으면 그사이에 존재하는 
           모든 값을 포함하는 int 배여을 생성하여 반환하는 range 함수를 만들어보세요 (최소값 이상 , 최대값 미만)
           
          
          3.최소값과 최대값과 증가값을 매개변수로 받으면 최소값에서 시작 하여 최대값까지 증가값만큼 증가하는 int배열을 생성하여 반환하는 range함수를만들어보세요 
          (최소값 이상 , 최대값미만)
    */
   
   
   //1. 최대값을 매개변수로 전달 받으면 0부터 최대값 미만의 모든 값을 포함하는 int 배열을 생성하여 반환하는 range함수를 만들어보세요
   public static int[] range(int max) {
   
      int[] sum = new int[max];
      for (int i = 0; i< max; ++i) {
         sum[i] = i;
      }
      
      return sum;
   }
   
   
   //2. 최소값과 최대값을 매개변수로 받으면 그사이에 존재하는 
   //모든 값을 포함하는 int 배열을 생성하여 반환하는 range 함수를 만들어보세요 (최소값 이상 , 최대값 미만)
   // 매개변수의 갯수 혹은 타입이 다르면 같은이름의 함수라도 다른함수로 취급이된다 ( 함수의 오버로딩)   function overLoading
   public static int[] range(int min , int max) {
      
	   if(min >= max) {
		   return null; // 잘못된 값일 때 return으로 함수를 빠르게 종료시키기
	   }
	   
      int size = max >min ? max-min : min-max;
      int[] minTomax = new int[size];
   
      for (int i = 0; i < minTomax.length; ++i ) {
         minTomax[i] = i+min;
      }
      return minTomax;
   }
   
  // 3.최소값과 최대값과 증가값을 매개변수로 받으면 최소값에서 시작 하여 최대값까지 증가값만큼 증가하는 int배열을 생성하여 반환하는 range함수를만들어보세요 
  // (최소값 이상 , 최대값미만)
   public static int[] range(int min ,int max ,int inc) {
	   
      int len = (int)Math.ceil((max-min)/ (double)inc);
      
      int[] minTomax2 = new int[len];
      
      for (int i=0; i < minTomax2.length;  ++i) {
         minTomax2[i] = min;
         min += inc;
      }
      return minTomax2;
      
   }
  
   
   
   
   
   public static void main(String[] args) {
   
      
      //1번 문제 출력 
      System.out.println(Arrays.toString(range(5)));
      System.out.println(range(5)[4]);
      // 2번 문제 출력
      System.out.println(Arrays.toString(range(5,15)));
      // 3번 문제 출력
      System.out.println(Arrays.toString(range(50,56,5)));
   }

}