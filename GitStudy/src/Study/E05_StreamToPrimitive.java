package Study;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E05_StreamToPrimitive {

	
	/*
	 	# DataInputStream / DataOutputStream 
	 	
	 	- Reader /Writer는 Stream을 문자로 손쉽게 다루기 위한 클래스였다면 
	 	- DataInputStream/ DataOutputStream 은 기본형 타입으로 손쉽게 다루기 위한 클래스다 
	 */
	
	public static void main(String[] args) {
		
		
		File file = new File("./data/myData.data");
		
		try {
			FileOutputStream fout = new FileOutputStream(file);
			DataOutputStream dout = new DataOutputStream(fout);
			
			dout.writeInt(9990);
			dout.writeInt(3000);
			dout.writeInt(850);
			
			dout.writeFloat(123.123F);
			dout.writeDouble(345.3456789F);
			
			dout.writeUTF("UTF타입으로 쓰기 ");
			dout.writeBoolean(false);
			
			// 사용한 스트림은 가장 최근에 만든것 부터 차레대로 닫아줘야한다 
			// 자바 버전기준으로는 dout만 닫아도 fout이 함께 닫힌다 
			dout.close();
			fout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		FileInputStream fin;
		try {
			fin = new FileInputStream(file);
			DataInputStream din = new DataInputStream(fin);
			
			
			// writeInt로 썻던것은 readInt로 읽어야한다 
			// 파일에 썻던 순서대로 읽으면 데이터를 다시 가져 올수 있다 ( 세이브 파일의 규칙) 
			System.out.println("아까 저장했던 첫번째 int :"+ din.readInt());
			System.out.println("아까 저장했던 두번째 int :"+ din.readInt());
			System.out.println("아까 저장했던 세번째 int :"+ din.readInt());
			System.out.println("float :"+ din.readFloat());
			System.out.println("double :"+ din.readDouble());
			System.out.println("UTF : " + din.readUTF());
			System.out.println("boolean :"+ din.readBoolean());
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
