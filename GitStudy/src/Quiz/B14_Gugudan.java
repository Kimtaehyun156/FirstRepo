package Quiz;

public class B14_Gugudan {

   public static void main(String[] args) {
      
      /*
          1. 구구단을 다음과 같이 가로로 출력해보세요 
          
          2단 : 2x1=2 2x2=4
       */
      
      // 구구단 가로 출력 
      for(int i = 2; i < 10; ++i) {
           System.out.print( i +"단 :");
         for(int j=1; j <10; ++j) {
            System.out.printf("%d X %d = %d \t" ,i,j, i*j);
         }
         System.out.println();
      }
      // 구구단 세로 출력 
      for(int dan=2; dan <=9; ++dan) {
         System.out.print(dan+"단\t\t");
      }
      
      for(int i = 1; i < 10; ++i) {
         for(int j=2; j <10; ++j) {
            System.out.printf( "%d X %d = %d \t" ,j,i, j*i);
         }
         System.out.println();
      }
      
   }

}