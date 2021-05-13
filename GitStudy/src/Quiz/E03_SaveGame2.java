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
		
		System.out.println("���� �̸��� �Է����ּ��� >");
		String userName = sc.nextLine();
		
		File save = new File("./data/"+userName +".hz");
		
		if(save.exists()) {
			System.out.println("�ҷ��� ���� ���� ");
			
			try {
				FileInputStream fin = new FileInputStream(save);
				
				win = fin.read();
				lose = fin.read();
				
				System.out.printf("�ҷ�������  - %d�� %d�� \n",win,lose);
				
				fin.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}else {
			System.out.println("�ҷ��� ���� ���� ");
		}
		
		while(true) {
			int answer = (int)(Math.random()*2) ;
			System.out.println("Ȧ(0) ,¦(1) >");
			int user = sc.nextInt();
			
			if(user != -1 && user != 0 && user != 1) {
				System.out.println("�ٽ� �ȹٷ� �Է����ּ���");
				continue;
			}
			
			if(user == -1) {
				System.out.println("�÷������ּż� �����մϴ� ");
				break;
			}
			
			if(user != answer) {
				System.out.println("Ʋ�Ƚ��ϴ�");
				lose++;
			}else {
				System.out.println("���ƽ��ϴ�");
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
