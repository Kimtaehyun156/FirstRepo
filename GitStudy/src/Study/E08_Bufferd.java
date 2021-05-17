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

		// frankenstein.txt �� �ѱ��ھ� ��� �а� �ɸ� �ð��� �����غ�����

		File file = new File("./data/text/frankenstein.txt");
		
		// �ѱ��ھ� �о���� ù������� 
		/*
		 * try { FileInputStream fin = new FileInputStream(file);
		 * 
		 * int _byte; while ((_byte = fin.read()) != -1) { System.out.print((char)
		 * _byte); } fin.close(); } catch (FileNotFoundException e) {
		 * e.printStackTrace(); } catch (IOException e) { e.printStackTrace(); }
		 */
		
		long startTime = System.currentTimeMillis();
		// �ѱ��ھ� �о���� �ι������(����)
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

		// �ѱ��ھ� �������� �迭�� ����ؼ� (char[])�ؼ� �������� ������ ���غ�����
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
		
		// �迭ä�� ���  2���� ��� 
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
		
		// ���پ� �о���� 
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
		

		// ���۸� ����ؼ� ���
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
		
		System.out.printf(" �ѱ��ھ� �ɸ� �� �ɸ��ð��� %.2f ���Դϴ� \n", Time);
		System.out.printf(" �迭��� �ɸ� �� �ɸ��ð��� %.2f ���Դϴ� \n", Time2);
		System.out.printf(" ���پ�  �ɸ� �� �ɸ��ð��� %.2f ���Դϴ�  \n", Time3);
		System.out.printf(" ���ۻ�� ���  �ɸ� �� �ɸ��ð��� %.2f ���Դϴ�", Time4);
		
		try (BufferedWriter bout = new BufferedWriter(new FileWriter( new File("./data/text/abc.txt")));){
			bout.append("Hello, BufferedWriter!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
