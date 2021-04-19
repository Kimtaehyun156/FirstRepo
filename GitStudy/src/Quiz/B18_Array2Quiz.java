package Quiz;

import java.util.Arrays;
import java.util.Random;

public class B18_Array2Quiz {

	public static void main(String[] args) {
 
		
		int[][] numArr = new int[][] {
			{1, 1, 1 ,1 },
			{1, 1, 1 ,1 , 1 , 1 ,1},
			{1, 1, 1 ,1 , 1 , 1},
			{1, 1 },
			{1, 1, 1, 1 , 1}
		};
		
		Random rand = new Random();
		// 1 . numArr의 모든 값을 0 ~ 100 사이의 랜덤 정수로 바꿔보세요 
		// 2.  numArr의 총합과 평균(소수점 둘쨰짜리 ) 을 구해서 출력 
		// 3. 각행의 합을 모두구해서 출력 해보세요 
		// 4. 각 열의 합을 모두구해서 출력해보세요
		int sum = 0;
		int count = 0;
		int line_sum = 0; //행
		int Heat_sum = 0; //열
		
		for(int i = 0 ; i < numArr.length; ++i) {
			for(int j = 0; j <numArr[i].length; ++j) {
				numArr[i][j] = rand.nextInt(101);
				//System.out.printf("numArr[%d][%d] : %d \n" ,i,j,numArr[i][j]);
			}
		}
		
		for(int i = 0 ; i < numArr.length; ++i) {
			for(int j = 0; j < numArr[i].length; ++j) {
				sum += numArr[i][j];
				count++;
			}
		}
		System.out.println("numArr의 총합은 : " + sum);
		System.out.printf("numArr의 평균은 : %.2f \n"  ,(sum/(double)count));
		System.out.println("=======================");

	 	int[] rowSum = new int[numArr.length];
	 	for(int i = 0; i< rowSum.length; ++i){
	 		for(int j = 0; j< numArr[i].length; ++j){	
	 			rowSum[i] += numArr[i][j];
	 		}
	 	}
	 	
	 	//Arrays.toString() : 배열 편하게 출력하기 
	 	System.out.println("행의합 :" + Arrays.toString(rowSum));
	
		
		for(int i = 0 ; i < numArr.length; ++i) {
			for(int j = 0; j <numArr[i].length; ++j) {
				line_sum += numArr[i][j];
			}
			System.out.printf("%2d번쨰 행의 합은 : %d \n",i , line_sum);
			line_sum = 0;
		}
		
		System.out.println("=======================");
		// ※ row : 행 
		// ※ column : 열
		// 제일 긴 배열찾기 
		int longest = 0;
		for( int i = 0; i < numArr.length; ++i) {
			longest = Math.max(longest, numArr[i].length);
		}
		
		int[] colSum = new int[longest];
		
		for(int i = 0 ; i < colSum.length; ++i) {
			for(int j = 0; j <numArr.length; ++j) {
				if( numArr[j].length > i) {
					colSum[i] += numArr[j][i];
				}
				
			}
		}
		
		System.out.println("열의 합:" + Arrays.toString(colSum));
	
	}

}
