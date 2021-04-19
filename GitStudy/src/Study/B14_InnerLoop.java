package Study;

public class B14_InnerLoop {

   public static void main(String[] args) {
    
      // # 반복문 내부에 반복문 사용하기 
//      for (int i = 0; i <10; i++) {
//         System.out.printf("======바깥쪽 반복문 %d \n",i);   
//         for(int j =0; j<8; j++) {
//            
//            System.out.printf("------안쪽 반복문 %d \n",j);
//            
//            for(int k =0; k < 3; k++) {
//               System.out.printf("제일안쪽 반복문%d \n",k);
//            }
//         }
//      }
      
      // 다중 반복문으로 구구단을 출력하기 
//      
//      for(int i = 2; i < 10; ++i) {
//         for(int j=1; j <10; ++j) {
//            System.out.printf("%d X %d = %d \t" ,i,j, i*j);
//         }
//         System.out.println();
//      }
      
      for( int dan = 2; dan <=9; ++dan) {
         System.out.println("#####" + dan + "단 ####");
         
         for( int gop =1; gop <= 9; ++gop) {
            System.out.printf("%d x %d = %d \n",dan,gop,dan*gop);
         }
      }
   }

}