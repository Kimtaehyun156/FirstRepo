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
                 게임이 시작되면 랜덤으로 4자리의 숫자가 선정된다
                 
                 1. 플레이어는 8번의 시도를 할 수 있다
                 
                 2. 각 시도마다 4자리의 숫자를 입력하면 다음과 같이 알려준다
                         
                         숫자와 위치가 다 맞을경우 - Strike
                          숫자만 맞을경우 - Ball
                          
                 ex: 정답이 3456일때
                 
                         >> 5634                  4 Ball
                         >> 3789                1 Strike
                         >> 3654                1 Strike 3 Ball
                         
                 3. 맞춘 시관과 횟수를 통해 1위부터 30위까지의 래킹을 생성해 파일에 저장한다 
                 (횟수가 같다면 시간이 더 적게 걸린사람이 상위랭킹)
                 
                  4. 새로운 게임을 시작할때마다 랭킹을 출력해준다 
                  
                  ※ 맞추고 나면 몇번만에 맞췄는지 알려주고 랭크에도 반영이된다 
                 
        */

public class upgrade_quiz {

	static int count=0;
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String name;
		
		Random rand = new Random();
		int user_try = 0;
		
		// 참조형 변수는 null로 초기화한다
		String answer="";
		
		for(int i = 0;i<4;i++){
			answer += rand.nextInt(9);
		}
		System.out.println("사용자 이름 입력!");
		Scanner sc2 = new Scanner(System.in);
		name = sc2.next();
		while(true){
			System.out.println("숫자 4자리를 입력 >>  ");
			Scanner sc = new Scanner(System.in);
			String input = sc.next();
			
			boolean numeric = true;
			
			int Strike = 0;
			int ball = 0;
			
			if (input.length() != 4) {
				System.out.println("4자리가 아닙니다 ");
				continue;
			}
			
			for (int k = 0; k < 4; ++k) {
				if (input.charAt(k) < '0' || input.charAt(k) > '9') {
					numeric = false;
					break;
				}
			}
			
			if (!numeric) {
				System.out.println("4자리 숫자만 입력해주세요 !!!!");
			}
			
			if (numeric) {
				
				System.out.println(answer); // 정답 체크용도
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
				
				System.out.printf(" %d번쨰 시도 Strike :%d  ball :%d ", user_try, Strike, ball);
				System.out.println();
				
				
				if (Strike == 4) {
					System.out.println("정답입니다!!");
					break;
				}
			}
		}
		long end = System.currentTimeMillis();
		double gametime = ((end-start)/1000.0);
		System.out.println("게임하는데 걸린시간 : " + gametime + "초");
		
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

				
				System.out.print(String.format("사용자(%s) 시도횟수(%d) 걸린시간(%.2f)", din.readUTF() , din.readInt() ,din.readDouble()));
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
						System.out.print(String.format("사용자(%s) 시도횟수(%d) 걸린시간(%.2f) ", din3.readUTF() , din3.readInt() ,din3.readDouble()));
						System.out.println();
					}

					din3.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println();
				System.out.println("저장된 유저갯수 >" + count);
			}
			
		

	}


