package Study;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class E04_StreamToChar {

	
	/*
	 	# Reader / Writer
	 		- InputStream�� OutputStream�� �����͸� ����Ʈ ������ �а� ���� 
	 		- ����Ʈ������ �����͸� ����ϱ� ������ ���ϴ� Ÿ�������� �籸���� �ʿ��ϴ� 
	 		- Reader �� Writer�� �����͸� ���� �ٴ��̷� �а� ���� Ŭ�������̴� 
	 		- InputStream/OutputStream �� Reader/Writer�� �ѹ� �� ���μ� ����Ѵ�  
	 		
	 		
	 		# abstract class Reader 
	 			
	 		- BufferedReader , InputStreamReder , fileReader ... ���� 
	 		- ��� Reader Ŭ������ ��ӹ޾� ������ Ŭ�������̴� 
	 		- Stream���� ���� �����͸� ���ڷ� �籸���Ͽ� ���α׷��Ӱ� ����ϱ� ���ϰ� ���ش� 
	 		- ���ڷ� ��ġ�ų� byte�� ��ȯ�� �� ����� ���ڵ� Ÿ���� ������ �� �ִ� 
	 	
	 */
	
	public static void main(String[] args) {
		
		
		try {
			InputStreamReader in = new InputStreamReader(
					new FileInputStream(new File("./notes/Git��뼳��.txt"))
					,Charset.forName("MS949"));
			
			// ABCD -> encoding -> 65666768 -> decoding -> ABCD
			// �ѱ� -> encoding(UTF-8) -> code -> decoding(MS949) -> ??? 
			
			int ch ;
			while((ch =in.read()) != -1) {
				System.out.print((char)ch);
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			// 1.FileWriter
			FileWriter fw = new FileWriter( new File("./data/write by file writer2.py"),Charset.forName("UTF-8"));
			fw.append("hello word");
			
			fw.close();
			
			// 2.OutputStreamWriter
			OutputStreamWriter out = new OutputStreamWriter( 
					new FileOutputStream("./data/write by file writer.py"),Charset.forName("UTF-8"));
			out.append("print('hello,pyhon')\n");
			out.append("if True:\n");
			out.append("\tprint('that\\'s true')");
			
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
