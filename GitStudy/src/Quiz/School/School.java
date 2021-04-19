package Quiz.School;

abstract public class School {
	
	static String name;
	static int kor;
	static int eng;
	
	static String[] nameRand = new String[] {"ȫ�浿","�����", "��浿", "��ö��", "��¯��", "��ö��"};
	static int studentId = 0;
	static int scoreRand = (int)((Math.random()*100)+1); 
	
	/*
	 	 	1. ������ �ִ������� 30���̴�
	 	 	
	 	 	2-1. ���α׷��ֹ� �л��� ������ ���� ,����, ���� , ���α׷��־�� ������ �ִ� 
	 	 	
	 	 	2-2. ��Ʈ��ũ�� �л��� ������ ���� ,���� ,������ ,CCNA ������ �ִ� 
	 	 	
	 	 	2-3. �ӽŷ��� �� �л��� ������ ���� ,����, ����, �����, ���α׷��־�� ������ �ִ� 
	 	 	
	 	 	3. ��� �л��� ������ �̸��� �������� ���� 
	 	 	    �й��� �ߺ����� ���������� �����ȴ� . (�Ǵ� �ߺ����� ����) 
	 	 	 
	 	 	4. ����ǥ �޼��带 ���� �� �л���  �̸� / ���� / ��������� �����ִ�  
	 	 	
	 */
	
	public static void main(String[] args) {
		
		
		Programmingban pro = new Programmingban(kor,eng,
				(int)(Math.random()*99)+1,
				(int)(Math.random()*99)+1,
				studentId++
		);
		pro.info();
		
		System.out.println("==================================================================================================");
		
		Networkban net = new Networkban(kor,eng,
				(int)(Math.random()*99)+1,
				(int)(Math.random()*99)+1, 
				studentId++);
		net.info();
		
		System.out.println("==================================================================================================");
		
		Machiningban mac = new Machiningban(kor,eng,
				(int)(Math.random()*99)+1,
				(int)(Math.random()*99)+1,
				studentId++);
		mac.info();

		System.out.println("==================================================================================================");

		
		Machiningban mac2 = new Machiningban(kor,eng,
				(int)(Math.random()*99)+1,
				(int)(Math.random()*99)+1,
				studentId++);
		mac2.info();
		
	}
	
	abstract public void info();
	
}


