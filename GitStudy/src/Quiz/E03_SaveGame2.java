package Quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class E03_SaveGame2 {
	
	
	
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
	
		
		int win = 0; 
		int lose = 0;
		
		System.out.println("먼저 이름을 입력해주세요 >");
		String userName = sc.nextLine();
		
		File save = new File("./data/"+userName +".hz");
		
		if(save.exists()) {
			System.out.println("불러올 파일 있음 ");
			
			try {
				FileInputStream fin = new FileInputStream(save);
				
				win = fin.read();
				lose = fin.read();
				
				System.out.printf("불러온정보  - %d승 %d패 \n",win,lose);
				
				fin.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}else {
			System.out.println("불러올 파일 없음 ");
		}
		
		while(true) {
			int answer = (int)(Math.random()*2) ;
			System.out.println("홀(0) ,짝(1) >");
			int user = sc.nextInt();
			
			if(user != -1 && user != 0 && user != 1) {
				System.out.println("다시 똑바로 입력해주세요");
				continue;
			}
			
			if(user == -1) {
				System.out.println("플레이해주셔서 감사합니다 ");
				break;
			}
			
			if(user != answer) {
				System.out.println("틀렸습니다");
				lose++;
			}else {
				System.out.println("맞쳤습니다");
				win++;
			}
			
		}
		
		try {
			FileOutputStream fout = new FileOutputStream(save);
			
			fout.write(win);
			fout.write(lose);
			
			
			
			fout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
