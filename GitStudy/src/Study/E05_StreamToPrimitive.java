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
	 	
	 	- Reader /Writer�� Stream�� ���ڷ� �ս��� �ٷ�� ���� Ŭ�������ٸ� 
	 	- DataInputStream/ DataOutputStream �� �⺻�� Ÿ������ �ս��� �ٷ�� ���� Ŭ������ 
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
			
			dout.writeUTF("UTFŸ������ ���� ");
			dout.writeBoolean(false);
			
			// ����� ��Ʈ���� ���� �ֱٿ� ����� ���� ������� �ݾ�����Ѵ� 
			// �ڹ� �����������δ� dout�� �ݾƵ� fout�� �Բ� ������ 
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
			
			
			// writeInt�� �������� readInt�� �о���Ѵ� 
			// ���Ͽ� ���� ������� ������ �����͸� �ٽ� ���� �ü� �ִ� ( ���̺� ������ ��Ģ) 
			System.out.println("�Ʊ� �����ߴ� ù��° int :"+ din.readInt());
			System.out.println("�Ʊ� �����ߴ� �ι�° int :"+ din.readInt());
			System.out.println("�Ʊ� �����ߴ� ����° int :"+ din.readInt());
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
