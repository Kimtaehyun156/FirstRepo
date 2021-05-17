package Quiz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E08_CaesarCipher {

	/*
	 	# ��ȣȭ 
	 	- ���� �˾ƺ��� ���� ����(��ȣ��)�� ��ȯ�ϴ°� 
	 	- ���� �������� ������ ���İ����� �˾� ���� ���� �ϴ°��� �����̴� 
	 	
	 	
	 	# ��ȣȭ
	 	- ��ȣȭ �� ��ȣ���� �ٽ� ������ �ǵ����°�  
	 	
	 	# Ű 
	 	- ��ȣȭ �Ǵ� ��ȣȭ�� ���Ǵ� ��
	 	
	 	# ���� ��ȣ 
	 	 "Hello, World!" ---- key:5 ----> "Mjqqt, btwqi!"
	 	 
	 	 ABCDEFGHIJKLMNOPQRSTUVWXYZ
	 	
	 	��ȣȭ : key��ŭ ���������� ���ڸ� �̵���Ŵ 
	 	��ȣȭ : key��ŭ �������� ���ڸ� �̵���Ŵ 
	 	
	 	���� 
	 	#  frankenstein.txt��  1 ~ 25 ������ ����Ű�� ��ȣȭ �� ���� 
	 	#  "frankenstein.encrypted.txt"�� �����غ����� 
		# �� ���ĺ��� ��ȣȭ�Ұ�
	 	
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
		
		//���� ����
		try (BufferedWriter bout = new BufferedWriter(new FileWriter( new File("./data/text/frankenstein2.txt")));){
			bout.append(sb);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}
