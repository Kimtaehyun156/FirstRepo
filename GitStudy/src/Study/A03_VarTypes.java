package Study;

public class A03_VarTypes {

	public static void main(String[] args) {
		
		/*
		 		# ���� Ÿ�� 
		 		- byte	(1byte)
		 			1byte => 8bit 
		 			
		 			 0000 0000 (0) ~ 1111 1111 (255)
		 			
		 			 �� ù ���� bit�� ��ȣ ��Ʈ�� ���ȴ� 
		 			 
		 			 byte Ÿ���� ��� ���� 0000 0000 (0)  ~ 0111 1111 (127)
		 			 byte Ÿ���� ��� ���� 1000 0000(-128)~ 1111 1111 (-1)
		 			 
		 			 2 ^ 1 = 2����
		 			 2 ^ 2 = 4����
		 			 2 ^ 3 = 8����
		 			 2 ^ 4 = 16����
		 			 2 ^ 5 = 32����
		 			 2 ^ 6 = 64����
		 			 2 ^ 7 = 128����
		 			 2 ^ 8 = 256����
		 			 
		 		
		 		- short	(2byte)
		 			2byte -> 16bit 
		 			2 ^ 16 - 65536���� 
		 			
		 			short�� �������  0 ~ 32767
		 			short�� ��������  -32768 ~ -1
		 			
		 		- char	(2byte , unsigned)
		 			2byte -> 16bit 
		 			
		 			2 ^ 16 - 65536 ���� ������ 
		 			char�� ����� ��Ÿ���⶧����  0 ~ 65536 ��Ÿ���� Ÿ���̴�
		 			�ַ� ���� �ڵ带 �����ϴµ� ����Ѵ� (����Ÿ��)
		 		
		 		- int	(4byte)
		 			4byte => 32bit
		 			2 ^ 32 - 4,294,967,296���� 
		 			
		 			int�� ��������� 0 ~ 2,147,483,647
		 			int�� ���������� -2,147,483,648  ~ -1  
		 		 	
		 		- long	(8byte)
		 			8byte = 64bit 
		 			2 ^ 64 =  ...
		 			
		 			
		 		*/
				
				byte  min_Byte = -128;
				byte  max_Byte = 127;
				System.out.println("byte Ÿ�Կ��� �����Ҽ��ִ� ���� ū ���� :" + max_Byte +"�̰�" + " �������� ���� :"+ min_Byte +"�̴�");
				
				short min_Short = -32768;
				short max_Short = 32767;
				System.out.println("short Ÿ�Կ��� �����Ҽ��ִ� ���� ū ���� :" + max_Short +"�̰�" + " �������� ���� :"+ min_Short +"�̴�");
				
				char  min_char = 0;
				char  max_char = 65535;
				char ch =65;
				System.out.println("char Ÿ�Կ� ����� ���� �⺻������ ���ڷ� ����Ѵ� : "+ ch);
				System.out.println("char Ÿ�Կ� ����� �ڵ尪�� Ȯ���ϰ� ������(int)�� ���δ� :" + (int)ch);
				System.out.println("char Ÿ�Կ��� �����Ҽ��ִ� ���� ū ���� :" + (int)max_char +"�̰�" + " �������� ���� :"+ (int)min_char +"�̴�");
				
				// ���ڰ� ���� _(�����)�� ǥ�ð����ϴ�
				int   minInt = -2_147_483_648;
				int   maxInt = 2_147_483_647;
				System.out.println("int Ÿ�Կ��� �����Ҽ��ִ� ���� ū ���� :" + maxInt +"�̰�" + " �������� ���� :"+ minInt +"�̴�");
				
				// int�� ������ �Ѿ�� ���ڸ� ����� ���� L�� �ٿ����Ѵ�
				long  minLong = -18_446_744_073_709_551_62L;
				long  maxLong = 18_446_744_073_709_551_61L;
				
		
		
		 			
		 	/*	
		 		# �Ǽ� Ÿ��
		 			- float (4byte)  
		 			- Double (8byte)
		 		
		 			�Ǽ��� �ַ� �׷��� ��꿡 ���ȴ�.
		 			�ε� �Ҽ��� ����� ����Ѵ� 
		 	*/
				// �׳� �Ҽ��� ���°��� �⺻������ double Ÿ���̴�
				// float Ÿ�Կ� �����Ҷ��� �ڿ� f�� �ٿ��� �Ѵ� 
				float weight =65.66f;
				double height =177.77;
				
			/*
		 		# ��/���� Ÿ��
		 			���� ������ ǥ���ϴµ��� ���Ǵ� Ÿ�� 
		 			boolean ( true , false ) Ÿ�� 
		 	*/
				
				boolean hasfood = true;
				boolean is130cm = false;
				
				
		 /*
		 	# ������ Ÿ��(Ŭ����Ÿ��)
		 		������ Ÿ���� �⺻�� Ÿ�Ե���� �ٸ��� �빮�ڷ� �����Ѵ�.
		 		- String : ���ڿ� 
		 		- �׿� ��� Ŭ������ ..
		 		
		 */
		 String helloMessage = "Hello , My name is John Doe.";
		 String byeMessage = "Good bye.";
		 
		 System.out.println(helloMessage);    // ����
		 System.out.println("helloMessage");  // ���ڿ� 
		 
		 System.out.println(byeMessage  +  byeMessage  +  byeMessage );
		
	}

}

