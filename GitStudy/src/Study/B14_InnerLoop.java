package Study;

public class B14_InnerLoop {

   public static void main(String[] args) {
    
      // # �ݺ��� ���ο� �ݺ��� ����ϱ� 
//      for (int i = 0; i <10; i++) {
//         System.out.printf("======�ٱ��� �ݺ��� %d \n",i);   
//         for(int j =0; j<8; j++) {
//            
//            System.out.printf("------���� �ݺ��� %d \n",j);
//            
//            for(int k =0; k < 3; k++) {
//               System.out.printf("���Ͼ��� �ݺ���%d \n",k);
//            }
//         }
//      }
      
      // ���� �ݺ������� �������� ����ϱ� 
//      
//      for(int i = 2; i < 10; ++i) {
//         for(int j=1; j <10; ++j) {
//            System.out.printf("%d X %d = %d \t" ,i,j, i*j);
//         }
//         System.out.println();
//      }
      
      for( int dan = 2; dan <=9; ++dan) {
         System.out.println("#####" + dan + "�� ####");
         
         for( int gop =1; gop <= 9; ++gop) {
            System.out.printf("%d x %d = %d \n",dan,gop,dan*gop);
         }
      }
   }

}