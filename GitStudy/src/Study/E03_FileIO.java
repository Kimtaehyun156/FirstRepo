package Study;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E03_FileIO {
	
	/*
	 * 		# Stream
	 * 		- 데이터들이 오가는 통로 
	 * 		- 프로그램으로 들어올 때 사용하는 통로를 InputStream 이라고 한다 
	 * 		- 프로그램에서 처리된후 나갈때 사용하는 통로를 OutputStream 이라고한다 		
	 * 
	 * 		# InputStream 공통메서드
	 * 		- read() : 스트림으로 부터 다음의 한 바이트를 읽어온다  EOF에 도달하면 -1을 반환 
	 * 		- read(byte[]) : byte[]을 만들어서 전달하면 거기에 담아준다 
	 * 		- read(byte[] , off ,len )  : byte[]을 만들어서 전다라되 원하는 만큼 원하는 위치에 읽는다 
	 * 		- close() : 다 사용한 스트림을 닫는다 
	 * 					닫지 않으면 계속 메모리를 차지하고 있게된다 
	 * 
	 * 		# OutputStream 공통메서드
	 * 		- write(int) : 한 글자씩 쓴다 
	 * 		- write(byte[]) : byte[] 에담긴 내용을 한번에 쓴다 
	 * 		- flush() : write 로 모아놓은 내용들을 모두 내보낸다 
	 * 		- close() : 다 사용한 스트림을 닫는다  
	 * 					닫지 않으면 계속 메모리를 차지하고 있게된다 
	 * 					남은 데이터가 있다면 flush()한다 
	 * 
	 */
	
	public static void main(String[] args) {
		
		File git = new File("./note/Git사용설명서.txt");
		
		
		System.out.println(git.exists());
		System.out.println(git.isDirectory());
		System.out.println(git.isFile());
		
		try {
			FileInputStream fin = new FileInputStream(git);

			//byte[] buffer = new byte[2000];
			
			// ※ 원하는 바이트씩 읽기 
//			int len;
//			while((len= fin.read(buffer)) != -1) {
//				System.out.println(new String(buffer,0,len));
//			}

			
			
//			fin.read(buffer);
//			System.out.println(Arrays.toString(buffer));
//			System.out.println(new String(buffer));
			
			
//			// ※ 1바이트씩 읽기 
			int _byte;
			while((_byte=fin.read()) != -1) {
				System.out.print((char)_byte);
			}
			fin.close();
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File newFile = new File("./note/my first file output.txt");
		try {
			FileOutputStream fout = new FileOutputStream(newFile);
			
			// 1. int를 사용하는 방식
			fout.write(65);
			fout.write(66);
			
			// 2. byte[]를 이용하는 방식 
			fout.write("안녕하세요! \n".getBytes());
			
		} catch (FileNotFoundException e) { //경로가 잘못된경우 낫파인드 익셉션이 발생한다 
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
