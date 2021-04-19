package Study;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class D05_Comparator {

	/*
	 * 			 # Comparator
	 * 			 - �����ϸ� �� ��ü�� ũ�⸦ ���Ҷ� ����ϴ� Ŭ������ �Ǵ� �������̽� 
	 * 			 - ��ü���� ũ�⸦ ���� �� ���ȴ� 
	 * 			 
	 * 
	 */
	public static void main(String[] args) {
		String str1 = "yes";
		String str2 = new String("yes");
		
		System.out.println(str1== str2);
		System.out.println(str1.equals(str2));
		
		
		Grape podo1 = new Grape().setGno("P0D01588");
		Grape podo2 = new Grape().setGno("P0D01588");
		
		System.out.println(podo1 == podo2);
		System.out.println(podo1.equals(podo2));
		
		
		LinkedList<Grape> grapes = new LinkedList<>();
		
		for(int i =0; i< 10; ++i) {
			grapes.addLast(new Grape()
					.setGno(String.format("Podo%04d",(int)(Math.random()*1000)))
					.setLocation((int)(Math.random()*Grape.LOCATIONS))
					.setFruit((int)(Math.random()*11+30)));
			
			System.out.println(grapes.getLast());
		}
		
		//������ ������ �������� �������ٱ� 
		Collections.sort(grapes, new �����з���_�����˸���_��������());
		
		System.out.println("�˸��� �������� ������ ");
		
		for( Grape grape : grapes) {
			System.out.println(grape);
		}
		
		
		// ���� 1: ���� �˸��� ���� �������� �����غ���
		Collections.sort(grapes, new �����з���_�����˸���_��������());
		
		System.out.println("�˸��� �������� ������ ");
		
		for( Grape grape : grapes) {
			System.out.println(grape);
		}
		
		// ���� 2: ���� gno ���� �������� �����غ��� 
		System.out.println(" ���� gno ���� �������� ������ ");
		Collections.sort(grapes, new �����з���_gno����_��������());
		for( Grape grape : grapes) {
			System.out.println(grape);	
		}
		
		// �����  �����з���_GNO����_��������
		System.out.println(" �����  �����з���_GNO����_��������");
		Collections.sort(grapes, new �����з���_GNO����_��������());
		for( Grape grape : grapes) {
			System.out.println(grape);	
		}
	}
	
	
}

class �����з���_gno����_�������� implements Comparator<Grape>{
	@Override
	public int compare(Grape o1, Grape o2) {
		int resultO1 = 0 ;
		int resultO2 = 0 ;
		
		for(int i =4; i < o1.gno.length(); ++i) {
			if(i == 5) {
				resultO1 += o1.gno.charAt(i)*1000;
			}else if( i == 6) {
				resultO1 += o1.gno.charAt(i)*100;
			}else if( i == 7) {
				resultO1 += o1.gno.charAt(i)*10;
			}else {
				resultO1 += o1.gno.charAt(i);
			}
		}
		for(int i =4; i < o2.gno.length(); ++i) {
			if(i == 5) {
				resultO2 += o2.gno.charAt(i)*1000;
			}else if( i == 6) {
				resultO2 += o2.gno.charAt(i)*100;
			}else if( i == 7) {
				resultO2 += o2.gno.charAt(i)*10;
			}else {
				resultO2 += o2.gno.charAt(i);
			}
		}
		// ���ڿ��� ���ĺ������񱳴� �̹� String Ŭ���� compareTo�޼��忡 ������ �Ǿ��ִ� 
		// return o1.gno.compareTo(02.gno)* -1;
//		if(o1.gno.compareTo(o2.gno) > o2.gno.compareTo(o1.gno)) {
//		if(o1.gno.charAt(o1.gno.length())  > o2.gno.charAt(o2.gno.length()) ) {
		if(resultO1> resultO2) {	
			return -1;
		}else if(o1.gno.equals(o2.gno)){
			return 0;			
		}else {
			return 1;
		}
	}
}

class �����з���_GNO����_�������� implements Comparator<Grape>{
	@Override
	public int compare(Grape o1, Grape o2) {
		String gno1 =o1.gno;
		String gno2 =o2.gno;
		
		int min_len = Math.min(gno1.length(), gno2.length());
		
		for(int i=0; i< o1.gno.length(); ++i) {
			if(gno1.charAt(i) > gno2.charAt(i)) {
				return -1;
			}else if(gno1.charAt(i)< gno2.charAt(i)) {
				return 1;
			}
		}
		if(gno1.length() == gno2.length()) {
			return 0;
		}else if(gno1.length() > gno2.length()) {
			return -1;
		}else {
			return 1;
		}
	}
}

class �����з���_�����˸���_�������� implements Comparator<Grape>{
	@Override
	/*	
	 * 		# comparator�� ��Ģ 
	 *  	- compare �޼����� ���ϰ��� 1�̸� o1�� o2�� ������ �ٲ۴�
	 *  	- compare �޼����� ���ϰ��� 0�̸� ���� ũ��� ����Ѵ� 
	 *  	- compare �޼����� ���ϰ��� -1�̸� o1�� o2�� ������ �״�� �����Ѵ�  
	 */
	
	public int compare(Grape o1, Grape o2) {
		if(o1.fruit <o2.fruit) {
			return -1;
		}else if( o1.fruit == o2.fruit) {
			return 0;
		}else {
			return 1;
		}
		
	}
}

class �����з���_�����˸���_�������� implements Comparator<Grape>{
	@Override
	/*	
	 * 		# comparator�� ��Ģ 
	 *  	- compare �޼����� ���ϰ��� 1�̸� o1�� o2�� ������ �ٲ۴�
	 *  	- compare �޼����� ���ϰ��� 0�̸� ���� ũ��� ����Ѵ� 
	 *  	- compare �޼����� ���ϰ��� -1�̸� o1�� o2�� ������ �״�� �����Ѵ�  
	 */
	
	public int compare(Grape o1, Grape o2) {
		if(o1.fruit <o2.fruit) {
			return 1;
		}else if( o1.fruit == o2.fruit) {
			return 0;
		}else {
			return -1;
		}
		
	}
}


class Grape{
	private static String[] locationNames ={"�����̽þ�", "ĥ��","�̰�����","�����","ȣ��"};
	public static int LOCATIONS = locationNames.length;
	
	
	String gno;
	int location;
	int fruit;
	
	
	Grape setGno(String gno) {
		this.gno = gno;
		return this;
	}
	
	Grape setLocation(int location_id) {
		location = location_id;
		return this;
	}
	
	Grape setFruit(int fruit) {
		this.fruit = fruit;
		return this;
	}
	/*
	 *		# equals()
	 *		- Object �޼���
	 *		- ���� ��ü���� ���Ҷ� � �������� �����ؾ� �ϴ����� �����س��� �޼��� 
	 *		- ���� �⺻������ �ּҰ� �񱳿��� 
	 * */
	@Override
	public boolean equals(Object obj) {
		return this.gno == ((Grape)obj).gno;
	}
	
	public boolean equals(Grape grape) {
		return this.gno == grape.gno;
	}

	/*		#toString()
	 *		��� ��ü�� ���ԵǾ��ִ� �޼��� (Object�޼���)
	 *		- �� �ν��Ͻ��� ���ڿ��� ǥ���Ѵٸ�?�� ������ �޼����̴� 
	 *		- System.out.println()�� ��� ������ �ν��Ͻ��� toString()�޼��带 ȣ���ϴ� �޼����̴�
	 *		  �޼����� ����� �ֿܼ� ����ϴ� �޼����̴�  
	 *		- Object Ŭ������ toString() �⺻������ "Ŭ������@�ּҰ�" �̴�
	 */
	
	@Override
	public String toString() {
		return this.gno + "/" + this.fruit + "/" + locationNames[location] +"(" +location+ ")" ;
	}
	
}