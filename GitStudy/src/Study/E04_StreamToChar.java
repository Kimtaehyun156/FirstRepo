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
	 		- InputStream과 OutputStream은 데이터를 바이트 단위로 읽고 쓴다 
	 		- 바이트단위로 데이터를 사용하기 떄문에 원하는 타입으로의 재구성이 필요하다 
	 		- Reader 와 Writer는 데이터를 문자 다누이로 읽고 쓰는 클래스들이다 
	 		- InputStream/OutputStream 을 Reader/Writer로 한번 더 감싸서 사용한다  
	 		
	 		
	 		# abstract class Reader 
	 			
	 		- BufferedReader , InputStreamReder , fileReader ... 등은 
	 		- 모두 Reader 클래스를 상속받아 구현한 클래스들이다 
	 		- Stream으로 읽은 데이터를 문자로 재구성하여 프로그래머가 사용하기 편하게 해준다 
	 		- 문자로 합치거나 byte로 변환할 때 사용할 인코딩 타입을 결정할 수 있다 
	 	
	 */
	
	public static void main(String[] args) {
		
		
		try {
			InputStreamReader in = new InputStreamReader(
					new FileInputStream(new File("./notes/Git사용설명서.txt"))
					,Charset.forName("MS949"));
			
			// ABCD -> encoding -> 65666768 -> decoding -> ABCD
			// 한글 -> encoding(UTF-8) -> code -> decoding(MS949) -> ??? 
			
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
