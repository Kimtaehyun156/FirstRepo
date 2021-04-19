package Quiz;

import java.util.Scanner;

public class AlligatorGame {
	
	/*
	 *  악어이빨 누르면 죽는게임 만들기 
	 */
	static int[] teethCheck = new int[21];
	
	
	public static void teethPrint() {
		
//		for(int i =1; i< teethCheck.length; ++i) {
//			teethCheck[i] = i;
//		}
		System.out.println("=====================================================");
		System.out.printf ("  [%2d] [%2d] [%2d] [%2d] [%2d] [%2d] [%2d] [%2d] [%2d] [%2d] \n",
				teethCheck[1],teethCheck[2],teethCheck[3],teethCheck[4],teethCheck[5],
				teethCheck[6],teethCheck[7],teethCheck[8],teethCheck[9],teethCheck[10]);
		System.out.printf ("  [%2d] [%2d] [%2d] [%2d] [%2d] [%2d] [%2d] [%2d] [%2d] [%2d] \n",
				teethCheck[11],teethCheck[12],teethCheck[13],teethCheck[14],teethCheck[15],
				teethCheck[16],teethCheck[17],teethCheck[18],teethCheck[19],teethCheck[20]);
		System.out.println("=====================================================");
	}
	

	public static void main(String[] args) {
		
		for(int i =1; i< teethCheck.length; ++i) {
			teethCheck[i] = i;
		}
		
		int[] teeth = new int[21];
		
		
		teeth[(int)(Math.random()*teeth.length)] = 1;
				
//		for(int i=1; i< teeth.length; ++i) {
//			System.out.printf("teeth[%02d] 번쨰 :%2d \n",i,teeth[i]);
//		}
		
		System.out.println(" 악어 이빨 누르기 게임!! 시작합니다 !");
		teethPrint();
		int count=0;
		while(true) {
				
			System.out.println("몇번째 이빨을 선택하시겠습니다 ");
			Scanner sc = new Scanner(System.in);
			int select = sc.nextInt();
				
			if(teeth[select] == 1 ) {
				System.out.println("꾸엑");
				System.out.printf("시도하신횟수는 %d번입니다",count);
				break;
			}else {
				teethCheck[select] = 0;
				teethPrint();
				count++;
			}
			
		}
		
		
		
	}
	
}
