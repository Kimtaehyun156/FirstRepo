package Study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class E08_Bufferd {

	public static void main(String[] args) {

		// frankenstein.txt 를 한글자씩 모두 읽고 걸린 시간을 측정해보세요

		File file = new File("./data/text/frankenstein.txt");
		
		// 한글자씩 읽어오기 첫번쨰방법 
		/*
		 * try { FileInputStream fin = new FileInputStream(file);
		 * 
		 * int _byte; while ((_byte = fin.read()) != -1) { System.out.print((char)
		 * _byte); } fin.close(); } catch (FileNotFoundException e) {
		 * e.printStackTrace(); } catch (IOException e) { e.printStackTrace(); }
		 */
		
		long startTime = System.currentTimeMillis();
		// 한글자씩 읽어오기 두번쨰방법(빌더)
		try {
			FileReader reader = new FileReader(file);
			StringBuilder sb = new StringBuilder();
			int ch= -1;
			while((ch= reader.read()) != -1) {
				sb.append((char)ch);
			}
			System.out.println(sb);
			
			reader.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		double Time = (endTime - startTime) / 1000.0;

		// 한글자씩 읽을때와 배열을 사용해서 (char[])해서 읽을때의 성능을 비교해보세요
		byte[] buffer = new byte[4096];
		FileInputStream fin2;
		long startTime2 = System.currentTimeMillis();
		try {
			fin2 = new FileInputStream(file);
			int len;
			try {
				while ((len = fin2.read(buffer)) != -1) {
					System.out.println(new String(buffer, 0, len));
				}

				fin2.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		long endTime2 = System.currentTimeMillis();
		double Time2 = (endTime2 - startTime2) / 1000.0;
		
		// 배열채로 출력  2번쨰 방법 
//		try {
//			FileReader in = new FileReader(file);
//			StringBuilder sb = new StringBuilder();
//			char[] buff = new char[1024];
//			int len = -1;
//			while((len= in.read(buff)) != -1) {
//				sb.append(new String(buff,0,len));
//			}
//			System.out.println(sb);
//			
//			in.close();
//		} catch (FileNotFoundException e1) {
//			e1.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
		
		// 한줄씩 읽어오기 
		long startTime3 = System.currentTimeMillis();
		try {
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		long endTime3 = System.currentTimeMillis();
		double Time3 = (endTime3 - startTime3) / 1000.0;
		

		// 버퍼를 사용해서 출력
		long startTime4 = System.currentTimeMillis();
		try(
				FileReader fin = new FileReader(file);
				BufferedReader bin = new BufferedReader(fin,4096);
			)
		{
			StringBuilder sb = new StringBuilder();
			String line = null;
			try {
				while((line = bin.readLine()) != null) {
					sb.append(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		long endTime4 = System.currentTimeMillis();
		double Time4 = (endTime4 - startTime4) / 1000.0;
		
		System.out.printf(" 한글자씩 걸린 총 걸린시간은 %.2f 초입니다 \n", Time);
		System.out.printf(" 배열사용 걸린 총 걸린시간은 %.2f 초입니다 \n", Time2);
		System.out.printf(" 한줄씩  걸린 총 걸린시간은 %.2f 초입니다  \n", Time3);
		System.out.printf(" 버퍼사용 출력  걸린 총 걸린시간은 %.2f 초입니다", Time4);
		
		try (BufferedWriter bout = new BufferedWriter(new FileWriter( new File("./data/text/abc.txt")));){
			bout.append("Hello, BufferedWriter!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
