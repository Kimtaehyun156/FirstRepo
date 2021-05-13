package Quiz;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/*
                 ������ ���۵Ǹ� �������� 4�ڸ��� ���ڰ� �����ȴ�
                 
                 1. �÷��̾�� 8���� �õ��� �� �� �ִ�
                 
                 2. �� �õ����� 4�ڸ��� ���ڸ� �Է��ϸ� ������ ���� �˷��ش�
                         
                         ���ڿ� ��ġ�� �� ������� - Strike
                          ���ڸ� ������� - Ball
                          
                 ex: ������ 3456�϶�
                 
                         >> 5634                  4 Ball
                         >> 3789                1 Strike
                         >> 3654                1 Strike 3 Ball
                         
                 3. ���� �ð��� Ƚ���� ���� 1������ 30�������� ��ŷ�� ������ ���Ͽ� �����Ѵ� 
                 (Ƚ���� ���ٸ� �ð��� �� ���� �ɸ������ ������ŷ)
                 
                  4. ���ο� ������ �����Ҷ����� ��ŷ�� ������ش� 
                  
                  �� ���߰� ���� ������� ������� �˷��ְ� ��ũ���� �ݿ��̵ȴ� 
                 
        */

public class upgrade_quiz {

	static int count=0;
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String name;
		
		Random rand = new Random();
		int user_try = 0;
		
		// ������ ������ null�� �ʱ�ȭ�Ѵ�
		String answer="";
		
		for(int i = 0;i<4;i++){
			answer += rand.nextInt(9);
		}
		System.out.println("����� �̸� �Է�!");
		Scanner sc2 = new Scanner(System.in);
		name = sc2.next();
		while(true){
			System.out.println("���� 4�ڸ��� �Է� >>  ");
			Scanner sc = new Scanner(System.in);
			String input = sc.next();
			
			boolean numeric = true;
			
			int Strike = 0;
			int ball = 0;
			
			if (input.length() != 4) {
				System.out.println("4�ڸ��� �ƴմϴ� ");
				continue;
			}
			
			for (int k = 0; k < 4; ++k) {
				if (input.charAt(k) < '0' || input.charAt(k) > '9') {
					numeric = false;
					break;
				}
			}
			
			if (!numeric) {
				System.out.println("4�ڸ� ���ڸ� �Է����ּ��� !!!!");
			}
			
			if (numeric) {
				
				System.out.println(answer); // ���� üũ�뵵
				user_try++;
				
				for (int j = 0; j < 4; ++j) {
					if (input.charAt(j) == answer.charAt(j)) {
						Strike++;
					} else {
						for (int i = 0; i < 4; ++i) {
							if (input.charAt(i) == answer.charAt(j)) {
								ball++;
							}
						}
					}
				}
			}
			
			if (numeric == true) {
				
				System.out.printf(" %d���� �õ� Strike :%d  ball :%d ", user_try, Strike, ball);
				System.out.println();
				
				
				if (Strike == 4) {
					System.out.println("�����Դϴ�!!");
					break;
				}
			}
		}
		long end = System.currentTimeMillis();
		double gametime = ((end-start)/1000.0);
		System.out.println("�����ϴµ� �ɸ��ð� : " + gametime + "��");
		
		File file = new File("./data/quiz.txt");
		
		FileOutputStream fout;
		DataOutputStream dout;
		try {
			fout = new FileOutputStream(file,true);
			dout = new DataOutputStream(fout);
			
			dout.writeUTF(name);
			dout.writeInt(user_try);
			dout.writeDouble(gametime);
			dout.writeChar('w');
			
			dout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
			FileInputStream fin;
			DataInputStream din;
			try {
				fin = new FileInputStream(file);
				din = new DataInputStream(fin);

				
				System.out.print(String.format("�����(%s) �õ�Ƚ��(%d) �ɸ��ð�(%.2f)", din.readUTF() , din.readInt() ,din.readDouble()));
				System.out.println();

				
				din.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				FileInputStream fin2 = new FileInputStream(file);
				
				
				int _byte;
				while((_byte=fin2.read()) != -1) {
					if((char)_byte == 'w') {
						count++;
					}
				}
				
				fin2.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
				FileInputStream fin3;
				DataInputStream din3;
				try {
					fin3 = new FileInputStream(file);
					din3 = new DataInputStream(fin3);

					for(int i=0; i<=count; ++i) {
						System.out.print(String.format("�����(%s) �õ�Ƚ��(%d) �ɸ��ð�(%.2f) ", din3.readUTF() , din3.readInt() ,din3.readDouble()));
						System.out.println();
					}

					din3.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println();
				System.out.println("����� �������� >" + count);
			}
			
		

	}


