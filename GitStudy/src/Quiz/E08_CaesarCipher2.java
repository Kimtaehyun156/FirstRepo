package Quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class E08_CaesarCipher2 {

	
	final static String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	final static String LOWER = "abcdefghijklmnopqrstuvwxyz";
	
	
	public static char encrypt_upper(char ch , int key) {
		return UPPER.charAt((UPPER.indexOf(ch)+key) % UPPER.length());
	}
	
	public static char encrypt_lower(char ch ,int key) {
		return LOWER.charAt((LOWER.indexOf(ch)+key) % LOWER.length());
	}
	
	
	public static void decryption(File file , int key) {
		try {
			FileReader fin2 = new FileReader(file);
			BufferedReader bin2 = new BufferedReader(fin2);
			
			String line = null;
			while((line = bin2.readLine()) != null) {
				for( int i=0 , len = line.length(); i< len; ++i) {
					char ch2 = line.charAt(i);
					
					if (Character.isAlphabetic(ch2)) {
						ch2 -= key;
						if( ch2 < (char)'a' ||  ch2 < (char)'A') {
							ch2 += 26;
						}
						System.out.print(ch2);
					}else {
						System.out.print(ch2);
					}
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		File frakenstein = new File("./data/text/frankenstein.txt");
		File frakenstein_encrypted = new File("./data/text/frakenstein_encrypted2.txt");
		int key = new Random().nextInt(25)+1;
		try (
				FileReader fin = new FileReader(frakenstein);
				BufferedReader bin = new BufferedReader(fin);
				
				FileWriter fout = new FileWriter(frakenstein_encrypted);
				BufferedWriter bout = new BufferedWriter(fout);
			){
			String line = null;
			while((line = bin.readLine()) != null) {
				for( int i=0 , len = line.length(); i< len; ++i) {
					char ch = line.charAt(i);
					
					//System.out.printf("Is '%c' Alphabetic? %b\n",ch ,Character.isAlphabetic(ch));
					
					switch(Character.getType(ch)) {
					case Character.UPPERCASE_LETTER:
						ch = encrypt_upper(ch,key);
						break;
					case Character.LOWERCASE_LETTER:
						ch =encrypt_lower(ch,key);
						break;
					}
					fout.append(ch);
				}
				fout.append('\n');
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 암호화된 파일을 해석하는 decryption(file)메서드를 만들어보세요 
		decryption(frakenstein_encrypted,key);
	
	}
}
