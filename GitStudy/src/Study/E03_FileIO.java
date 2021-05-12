package Study;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E03_FileIO {
	
	/*
	 * 		# Stream
	 * 		- �����͵��� ������ ��� 
	 * 		- ���α׷����� ���� �� ����ϴ� ��θ� InputStream �̶�� �Ѵ� 
	 * 		- ���α׷����� ó������ ������ ����ϴ� ��θ� OutputStream �̶���Ѵ� 		
	 * 
	 * 		# InputStream ����޼���
	 * 		- read() : ��Ʈ������ ���� ������ �� ����Ʈ�� �о�´�  EOF�� �����ϸ� -1�� ��ȯ 
	 * 		- read(byte[]) : byte[]�� ���� �����ϸ� �ű⿡ ����ش� 
	 * 		- read(byte[] , off ,len )  : byte[]�� ���� ���ٶ�� ���ϴ� ��ŭ ���ϴ� ��ġ�� �д´� 
	 * 		- close() : �� ����� ��Ʈ���� �ݴ´� 
	 * 					���� ������ ��� �޸𸮸� �����ϰ� �ְԵȴ� 
	 * 
	 * 		# OutputStream ����޼���
	 * 		- write(int) : �� ���ھ� ���� 
	 * 		- write(byte[]) : byte[] ����� ������ �ѹ��� ���� 
	 * 		- flush() : write �� ��Ƴ��� ������� ��� �������� 
	 * 		- close() : �� ����� ��Ʈ���� �ݴ´�  
	 * 					���� ������ ��� �޸𸮸� �����ϰ� �ְԵȴ� 
	 * 					���� �����Ͱ� �ִٸ� flush()�Ѵ� 
	 * 
	 */
	
	public static void main(String[] args) {
		
		File git = new File("./note/Git��뼳��.txt");
		
		
		System.out.println(git.exists());
		System.out.println(git.isDirectory());
		System.out.println(git.isFile());
		
		try {
			FileInputStream fin = new FileInputStream(git);

			//byte[] buffer = new byte[2000];
			
			// �� ���ϴ� ����Ʈ�� �б� 
//			int len;
//			while((len= fin.read(buffer)) != -1) {
//				System.out.println(new String(buffer,0,len));
//			}

			
			
//			fin.read(buffer);
//			System.out.println(Arrays.toString(buffer));
//			System.out.println(new String(buffer));
			
			
//			// �� 1����Ʈ�� �б� 
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
			
			// 1. int�� ����ϴ� ���
			fout.write(65);
			fout.write(66);
			
			// 2. byte[]�� �̿��ϴ� ��� 
			fout.write("�ȳ��ϼ���! \n".getBytes());
			
		} catch (FileNotFoundException e) { //��ΰ� �߸��Ȱ�� �����ε� �ͼ����� �߻��Ѵ� 
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
