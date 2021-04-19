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
		// 1 . numArr�� ��� ���� 0 ~ 100 ������ ���� ������ �ٲ㺸���� 
		// 2.  numArr�� ���հ� ���(�Ҽ��� �Ѥ�¥�� ) �� ���ؼ� ��� 
		// 3. ������ ���� ��α��ؼ� ��� �غ����� 
		// 4. �� ���� ���� ��α��ؼ� ����غ�����
		int sum = 0;
		int count = 0;
		int line_sum = 0; //��
		int Heat_sum = 0; //��
		
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
		System.out.println("numArr�� ������ : " + sum);
		System.out.printf("numArr�� ����� : %.2f \n"  ,(sum/(double)count));
		System.out.println("=======================");

	 	int[] rowSum = new int[numArr.length];
	 	for(int i = 0; i< rowSum.length; ++i){
	 		for(int j = 0; j< numArr[i].length; ++j){	
	 			rowSum[i] += numArr[i][j];
	 		}
	 	}
	 	
	 	//Arrays.toString() : �迭 ���ϰ� ����ϱ� 
	 	System.out.println("������ :" + Arrays.toString(rowSum));
	
		
		for(int i = 0 ; i < numArr.length; ++i) {
			for(int j = 0; j <numArr[i].length; ++j) {
				line_sum += numArr[i][j];
			}
			System.out.printf("%2d���� ���� ���� : %d \n",i , line_sum);
			line_sum = 0;
		}
		
		System.out.println("=======================");
		// �� row : �� 
		// �� column : ��
		// ���� �� �迭ã�� 
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
		
		System.out.println("���� ��:" + Arrays.toString(colSum));
	
	}

}
