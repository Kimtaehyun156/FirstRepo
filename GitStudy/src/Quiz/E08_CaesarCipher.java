package Quiz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E08_CaesarCipher {

	/*
	 	# 암호화 
	 	- 평문을 알아볼수 없는 형태(암호문)로 변환하는것 
	 	- 전달 과정에서 내용을 훔쳐가더라도 알아 볼수 없게 하는것이 목적이다 
	 	
	 	
	 	# 복호화
	 	- 암호화 된 암호문을 다시 평문으로 되돌리는것  
	 	
	 	# 키 
	 	- 암호화 또는 복호화에 사용되는 값
	 	
	 	# 시저 암호 
	 	 "Hello, World!" ---- key:5 ----> "Mjqqt, btwqi!"
	 	 
	 	 ABCDEFGHIJKLMNOPQRSTUVWXYZ
	 	
	 	암호화 : key만큼 오른쪽으로 문자를 이동시킴 
	 	복호화 : key만큼 왼쪽으로 문자를 이동시킴 
	 	
	 	과제 
	 	#  frankenstein.txt를  1 ~ 25 사이의 랜덤키로 암호화 한 파일 
	 	#  "frankenstein.encrypted.txt"를 생성해보세요 
		# 단 알파벳만 암호화할것
	 	
	 */
	public static void main(String[] args) {
		String upper ="abcdefghijklmnopqrstuvwxzy";
		String lower ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		File file = new File("./data/text/frankenstein.txt");
		StringBuilder sb = new StringBuilder();
		int key = 3;
		
		try(FileReader reader = new FileReader(file);) {
			int ch= -1;
			while((ch= reader.read()) != -1) {
				if(ch >= ((char)'a') && ch <= ((char)'z') ) {
					ch += key;
					sb.append((char)ch);
				}else if ( ch >= ((char)'A') && ch <= ((char)'Z')) {
					ch += key;
					sb.append((char)ch);
				}else {
					sb.append((char)ch);
				}
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		//파일 쓰기
		try (BufferedWriter bout = new BufferedWriter(new FileWriter( new File("./data/text/frankenstein2.txt")));){
			bout.append(sb);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}
