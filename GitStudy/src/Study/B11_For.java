package Study;

public class B11_For {
	
	public static void main(String[] args) {
		
		
		/*
		 		# �ݺ��� (Loop)
		 		- for , while , do-while(x ,�ȹ�� ) , forEach(���� ����)
		 		- �Ȱ��� �ڵ带 ������ �ݺ��ϰ� ���� �� ����Ѵ� 	
		 		
		 		
		 		for (�ʱⰪ; ����; ������){
		 			��� �ִ� ������ true�� ���� �ݺ��� ��ɾ���� ���� ��
		 		}
		 */
		
		// 1. ���� �⺻���� ������ for�� 
		// - ���ϴ� Ƚ����ŭ �ݺ��ϱ� ���� ���� ������ for��
		// - �ʱⰪ���� 0���ְ� ���ǿ��� �ݺ��ϰ� ���� Ƚ���� ������ �ȴ�
		// - ������ 1�� + �Ѵ� 
		for (int i = 0; i < 100; ++i) {
			System.out.println("hello, world! "+ i);
		}
		
		
		// 2. �ʱⰪ ,������, ������ ������� ������ �� �ִ� 
		for(int i = 70; i< 555; i+=10) {
			System.out.println(i);
		}
		
		for(int i = 9000; i >= 0; i-=100) {
			System.out.println("2���� �ݺ��� " + i);
		}
		
		// 3. �ʱⰪ�� �������� ��ġ�� ������� ������ �� �ִ�
		int x = 0;
		for(; x<10; ){
			System.out.println("3���� �ݺ���" + x++);
		}
		
		// ������ �ڽ��� ���� �߰�ȣ�� ����� �״´� (������ �����ֱ� ) 
		
		// 4. �ݺ��� ���ο� �ٸ� �����鵵 �����Ӱ� ����� �� �ִ�
		for(int month = 1; month <= 12; ++month) {
				
		    switch(month) {
	         case 3: case 4: case 5: 
	            System.out.println("���Դϴ�");
	            break;
	         case 6: case 7: case 8: 
	            System.out.println("�����Դϴ�");
	            break;
	         case 9: case 10: case 11: 
	            System.out.println("�����Դϴ�");
	            break;
	         case 12: case 1: case 2: 
	            System.out.println("�ܿ��Դϴ�");
	            break;
	         default:
	            System.out.println("1~12�� ���´� ���� �־��ּ���");
	            break;
	      }
	      
		}
		
		// 5. for���� ������ ���������[for(;;)] ���ѹݺ��Ѵ�
		// ������ �ؼ� break���� ����ؼ� Ż���Ҽ��ִ� 
		int count =0;
		
		for(;;) {
			System.out.println("hello" +  count++);
			if( count == 7) {
				break;
			}
		}
		
		// 6. �ݺ��� ���ο��� continue�� ������ �ٷ� ������ �ݺ����� �Ѿ�� 
		for(int i = 0; i <= 50; ++i) {
			System.out.printf("%2d ", i);
			
			if(i %10 != 0) {
				continue;
			}
			
			System.out.println(); //�ٹٲ� 
		}
		
		int count_check = 0; //ī��Ʈ�Ͽ� �ٹٲ� �ϱ����� ����!
		// �������� :continue�� �̿��Ͽ� 5õ���� 100���̿� �����ϴ� Ȧ���� ����ϱ� 
		for(int i=5000; i>=100; --i) {
			
			
			if(i%2 != 1){
				continue;	//¦���ϋ��� continue�� ������ ����� �����ʴ´� 
			}
			count_check++;
			System.out.print(i+" ");
			
			if(count_check %10 == 0) {
				System.out.println();
			}
			
		}
		
		/*
			7.�ݺ������� ���� ���ϱ�
			(1) �ݺ��� �ٱ��ʿ� ������ ������ �������ϳ� �����ϰ� 0���� �ʱ�ȭ�Ѵ� 
			(2) �ݺ����� �����ϸ� �ش纯���� ���� ������Ų�� 
			 
		*/
		// 80���� 333������ 3�ǹ���� ������ ���غ��� 
		int sum = 0;
		
		for(int i=80; i<=333; ++i) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		
		System.out.println("80���� 333������ 3�ǹ�� ���� : " + sum);
		
		
	}
}
